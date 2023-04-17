package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_1082618794_128_s {

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
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test002");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver2.contains((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test003");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test004");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test006");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test007");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test008");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test009");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Comparator comparator11 = treeSetTestDriver9.comparator();
        boolean boolean13 = treeSetTestDriver9.add((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeSetTestDriver0.getMatch((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test010");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test011");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test012");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test013");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass4 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test014");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test016");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test017");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.getMatch((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test018");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object obj7 = treeSetTestDriver0.getMatch((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator11 = treeSetTestDriver8.comparator();
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator14 = treeSetTestDriver8.iterator();
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeSetTestDriver0.contains((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test019");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 0);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test020");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test021");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        int int13 = treeSetTestDriver11.size();
        treeSetTestDriver11.clear();
        treeSetTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test022");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 0);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = treeSetTestDriver7.iterator();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean12 = treeSetTestDriver7.add((java.lang.Object) (short) -1);
        experiment.util.Iterator iterator13 = treeSetTestDriver7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test023");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(comparator2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test024");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver6.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        treeSetTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(comparator9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test025");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        experiment.util.Comparator comparator5 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver6.isEmpty();
        experiment.util.Iterator iterator8 = treeSetTestDriver6.iterator();
        boolean boolean9 = treeSetTestDriver6.isEmpty();
        boolean boolean10 = treeSetTestDriver3.remove((java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test026");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        int int13 = treeSetTestDriver11.size();
        treeSetTestDriver11.clear();
        treeSetTestDriver11.clear();
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        int int19 = treeSetTestDriver17.size();
        boolean boolean21 = treeSetTestDriver17.remove((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator22 = treeSetTestDriver17.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = treeSetTestDriver11.remove((java.lang.Object) comparator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(comparator22);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test027");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = treeSetTestDriver8.iterator();
        boolean boolean11 = treeSetTestDriver8.isEmpty();
        boolean boolean12 = treeSetTestDriver8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeSetTestDriver0.remove((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test028");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator9 = treeSetTestDriver0.iterator();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test029");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        boolean boolean14 = treeSetTestDriver12.contains((java.lang.Object) 0);
        boolean boolean15 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean14);
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeSetTestDriver0.contains(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test030");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver3.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        boolean boolean8 = treeSetTestDriver3.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator9 = treeSetTestDriver3.iterator();
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        boolean boolean12 = treeSetTestDriver3.add((java.lang.Object) 1.0d);
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver13.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator16 = treeSetTestDriver13.comparator();
        boolean boolean18 = treeSetTestDriver13.remove((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = treeSetTestDriver3.contains((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test031");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.TreeSetTestDriver treeSetTestDriver1 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver1.isEmpty();
        java.lang.Object[] objArray3 = treeSetTestDriver1.toArray();
        boolean boolean4 = treeSetTestDriver1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test032");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.isEmpty();
        boolean boolean10 = treeSetTestDriver5.add((java.lang.Object) (short) -1);
        boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = treeSetTestDriver5.contains((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test033");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test034");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver6.isEmpty();
        experiment.util.Iterator iterator8 = treeSetTestDriver6.iterator();
        experiment.util.Iterator iterator9 = treeSetTestDriver6.iterator();
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) iterator9);
        java.lang.Object obj12 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 1);
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator14 = treeSetTestDriver13.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) comparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(comparator14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test035");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        int int11 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        boolean boolean14 = treeSetTestDriver12.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator15 = treeSetTestDriver12.comparator();
        boolean boolean17 = treeSetTestDriver12.remove((java.lang.Object) '4');
        boolean boolean19 = treeSetTestDriver12.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = treeSetTestDriver12.iterator();
        experiment.util.Iterator iterator21 = treeSetTestDriver12.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test036");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeSetTestDriver0.equals_CUT(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test037");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver4.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator7 = treeSetTestDriver4.comparator();
        treeSetTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test038");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator6 = treeSetTestDriver5.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) comparator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test039");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        java.lang.Object[] objArray6 = treeSetTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test040");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.add((java.lang.Object) 10);
        java.lang.Object[] objArray5 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver6.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        boolean boolean11 = treeSetTestDriver6.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator12 = treeSetTestDriver6.iterator();
        java.lang.Object[] objArray13 = treeSetTestDriver6.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test041");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver8.isEmpty();
        int int10 = treeSetTestDriver8.size();
        treeSetTestDriver8.clear();
        treeSetTestDriver8.clear();
        java.lang.Class<?> wildcardClass13 = treeSetTestDriver8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test043");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = comparator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test044");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test045");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        experiment.util.Comparator comparator6 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator13 = treeSetTestDriver7.iterator();
        boolean boolean14 = treeSetTestDriver4.equals_CUT((java.lang.Object) treeSetTestDriver7);
        boolean boolean15 = treeSetTestDriver0.contains((java.lang.Object) boolean14);
        java.lang.Object[] objArray16 = treeSetTestDriver0.toArray();
        java.lang.Object obj17 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeSetTestDriver0.getMatch(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test046");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = treeSetTestDriver0.remove(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test047");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver6.isEmpty();
        experiment.util.Iterator iterator8 = treeSetTestDriver6.iterator();
        experiment.util.Iterator iterator9 = treeSetTestDriver6.iterator();
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) iterator9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        int int13 = treeSetTestDriver11.size();
        treeSetTestDriver11.clear();
        treeSetTestDriver11.clear();
        java.lang.Class<?> wildcardClass16 = treeSetTestDriver11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test048");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test049");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator5 = treeSetTestDriver4.iterator();
        boolean boolean7 = treeSetTestDriver4.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = treeSetTestDriver4.getMatch((java.lang.Object) (short) 0);
        boolean boolean10 = treeSetTestDriver4.isEmpty();
        java.lang.Object[] objArray11 = treeSetTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test050");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object obj7 = treeSetTestDriver0.getMatch((java.lang.Object) (-1L));
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test051");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        java.lang.Class<?> wildcardClass6 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test052");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = treeSetTestDriver0.contains(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test053");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray5 = treeSetTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeSetTestDriver0.getMatch((java.lang.Object) objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test054");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.Iterator iterator11 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        boolean boolean14 = treeSetTestDriver12.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator15 = treeSetTestDriver12.comparator();
        experiment.util.Iterator iterator16 = treeSetTestDriver12.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeSetTestDriver0.contains((java.lang.Object) iterator16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test055");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        experiment.util.Iterator iterator5 = treeSetTestDriver3.iterator();
        experiment.util.Iterator iterator6 = treeSetTestDriver3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test056");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean13 = treeSetTestDriver11.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator14 = treeSetTestDriver11.comparator();
        boolean boolean16 = treeSetTestDriver11.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator17 = treeSetTestDriver11.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver18.contains((java.lang.Object) 0);
        boolean boolean21 = treeSetTestDriver11.equals_CUT((java.lang.Object) boolean20);
        boolean boolean22 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test057");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator1 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator3 = treeSetTestDriver2.iterator();
        boolean boolean5 = treeSetTestDriver2.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = treeSetTestDriver2.getMatch((java.lang.Object) (short) 0);
        boolean boolean8 = treeSetTestDriver2.isEmpty();
        java.lang.Object[] objArray9 = treeSetTestDriver2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(comparator1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test058");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Comparator comparator8 = treeSetTestDriver0.comparator();
        int int9 = treeSetTestDriver0.size();
        java.lang.Object[] objArray10 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Comparator comparator13 = treeSetTestDriver11.comparator();
        boolean boolean15 = treeSetTestDriver11.add((java.lang.Object) 10);
        java.lang.Object[] objArray16 = treeSetTestDriver11.toArray();
        boolean boolean17 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        java.lang.Object[] objArray18 = treeSetTestDriver11.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        boolean boolean21 = treeSetTestDriver19.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator22 = treeSetTestDriver19.comparator();
        boolean boolean24 = treeSetTestDriver19.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator25 = treeSetTestDriver19.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        boolean boolean28 = treeSetTestDriver26.contains((java.lang.Object) 0);
        boolean boolean29 = treeSetTestDriver19.equals_CUT((java.lang.Object) boolean28);
        experiment.util.TreeSetTestDriver treeSetTestDriver30 = new experiment.util.TreeSetTestDriver();
        boolean boolean31 = treeSetTestDriver30.isEmpty();
        experiment.util.Comparator comparator32 = treeSetTestDriver30.comparator();
        int int33 = treeSetTestDriver30.size();
        boolean boolean34 = treeSetTestDriver19.equals_CUT((java.lang.Object) int33);
        experiment.util.Iterator iterator35 = treeSetTestDriver19.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = treeSetTestDriver11.remove((java.lang.Object) iterator35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(comparator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test059");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.contains((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test060");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object obj7 = treeSetTestDriver0.getMatch((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator11 = treeSetTestDriver8.comparator();
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator14 = treeSetTestDriver8.iterator();
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver16.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator19 = treeSetTestDriver16.comparator();
        treeSetTestDriver16.clear();
        java.lang.Object[] objArray21 = treeSetTestDriver16.toArray();
        boolean boolean22 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver16);
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver23.isEmpty();
        experiment.util.Comparator comparator25 = treeSetTestDriver23.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(comparator25);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test061");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = treeSetTestDriver0.equals_CUT((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test062");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        int int2 = treeSetTestDriver0.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray4 = treeSetTestDriver3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.Object; cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test063");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = treeSetTestDriver0.equals_CUT(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test064");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        treeSetTestDriver0.clear();
        boolean boolean6 = treeSetTestDriver0.remove((java.lang.Object) 10);
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test065");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(comparator4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test066");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        experiment.util.Comparator comparator6 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator13 = treeSetTestDriver7.iterator();
        boolean boolean14 = treeSetTestDriver4.equals_CUT((java.lang.Object) treeSetTestDriver7);
        boolean boolean15 = treeSetTestDriver0.contains((java.lang.Object) boolean14);
        java.lang.Object[] objArray16 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator17 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver18.isEmpty();
        experiment.util.Iterator iterator20 = treeSetTestDriver18.iterator();
        boolean boolean21 = treeSetTestDriver18.isEmpty();
        boolean boolean23 = treeSetTestDriver18.add((java.lang.Object) (short) -1);
        experiment.util.Iterator iterator24 = treeSetTestDriver18.iterator();
        int int25 = treeSetTestDriver18.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test067");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        boolean boolean4 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver5.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator8 = treeSetTestDriver5.comparator();
        treeSetTestDriver5.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator13 = treeSetTestDriver10.comparator();
        boolean boolean15 = treeSetTestDriver10.remove((java.lang.Object) (byte) 1);
        boolean boolean16 = treeSetTestDriver5.add((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test068");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test069");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        java.lang.Object[] objArray2 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        int int5 = treeSetTestDriver3.size();
        treeSetTestDriver3.clear();
        treeSetTestDriver3.clear();
        treeSetTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test070");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        java.lang.Object obj4 = treeSetTestDriver0.getMatch((java.lang.Object) (byte) 100);
        boolean boolean6 = treeSetTestDriver0.add((java.lang.Object) '#');
        experiment.util.Comparator comparator7 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test071");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.Comparator comparator5 = treeSetTestDriver0.comparator();
        java.lang.Object[] objArray6 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test072");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        int int2 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test073");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Comparator comparator13 = treeSetTestDriver11.comparator();
        int int14 = treeSetTestDriver11.size();
        boolean boolean15 = treeSetTestDriver0.equals_CUT((java.lang.Object) int14);
        treeSetTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test074");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) iterator6);
        experiment.util.Comparator comparator8 = treeSetTestDriver0.comparator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(comparator8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test075");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        boolean boolean4 = treeSetTestDriver0.add((java.lang.Object) 10);
        java.lang.Object[] objArray5 = treeSetTestDriver0.toArray();
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10]");
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test076");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver7.isEmpty();
        java.lang.Object[] objArray9 = treeSetTestDriver7.toArray();
        boolean boolean10 = treeSetTestDriver7.isEmpty();
        boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) boolean10);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        boolean boolean14 = treeSetTestDriver12.contains((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test077");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        int int13 = treeSetTestDriver11.size();
        treeSetTestDriver11.clear();
        treeSetTestDriver11.clear();
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        treeSetTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeSetTestDriver11.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test078");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.isEmpty();
        boolean boolean10 = treeSetTestDriver5.add((java.lang.Object) (short) -1);
        boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver5);
        experiment.util.Comparator comparator12 = treeSetTestDriver5.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean14 = treeSetTestDriver13.isEmpty();
        experiment.util.Iterator iterator15 = treeSetTestDriver13.iterator();
        boolean boolean16 = treeSetTestDriver13.isEmpty();
        boolean boolean18 = treeSetTestDriver13.add((java.lang.Object) (short) -1);
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver19.isEmpty();
        experiment.util.Iterator iterator21 = treeSetTestDriver19.iterator();
        experiment.util.Iterator iterator22 = treeSetTestDriver19.iterator();
        boolean boolean23 = treeSetTestDriver13.equals_CUT((java.lang.Object) iterator22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeSetTestDriver5.getMatch((java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test079");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator5 = treeSetTestDriver4.iterator();
        boolean boolean7 = treeSetTestDriver4.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = treeSetTestDriver4.getMatch((java.lang.Object) (short) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver4);
        treeSetTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test080");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        int int3 = treeSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test081");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = treeSetTestDriver0.last();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test082");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        experiment.util.Comparator comparator6 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator13 = treeSetTestDriver7.iterator();
        boolean boolean14 = treeSetTestDriver4.equals_CUT((java.lang.Object) treeSetTestDriver7);
        boolean boolean15 = treeSetTestDriver0.contains((java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test083");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver6.isEmpty();
        int int8 = treeSetTestDriver6.size();
        boolean boolean10 = treeSetTestDriver6.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = treeSetTestDriver11.iterator();
        boolean boolean14 = treeSetTestDriver11.isEmpty();
        boolean boolean16 = treeSetTestDriver11.add((java.lang.Object) (short) -1);
        boolean boolean17 = treeSetTestDriver6.remove((java.lang.Object) treeSetTestDriver11);
        experiment.util.Comparator comparator18 = treeSetTestDriver11.comparator();
        int int19 = treeSetTestDriver11.size();
        java.lang.Object obj20 = treeSetTestDriver11.first();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) -1 + "'", obj20, (short) -1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test084");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) (short) -1);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver6.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        boolean boolean11 = treeSetTestDriver6.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator12 = treeSetTestDriver6.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver13.contains((java.lang.Object) 0);
        boolean boolean16 = treeSetTestDriver6.equals_CUT((java.lang.Object) boolean15);
        int int17 = treeSetTestDriver6.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.contains((java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test085");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        int int8 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test086");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 0);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        java.lang.Object[] objArray8 = treeSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test087");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.isEmpty();
        boolean boolean10 = treeSetTestDriver5.add((java.lang.Object) (short) -1);
        boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver5);
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator13 = treeSetTestDriver12.iterator();
        experiment.util.Iterator iterator14 = treeSetTestDriver12.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = treeSetTestDriver5.contains((java.lang.Object) iterator14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test088");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        int int13 = treeSetTestDriver11.size();
        treeSetTestDriver11.clear();
        treeSetTestDriver11.clear();
        boolean boolean16 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        boolean boolean17 = treeSetTestDriver11.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test089");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Comparator comparator2 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver3.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator6 = treeSetTestDriver3.comparator();
        boolean boolean8 = treeSetTestDriver3.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator9 = treeSetTestDriver3.iterator();
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver3);
        java.lang.Object[] objArray11 = treeSetTestDriver3.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver12 = new experiment.util.TreeSetTestDriver();
        boolean boolean13 = treeSetTestDriver12.isEmpty();
        experiment.util.Iterator iterator14 = treeSetTestDriver12.iterator();
        boolean boolean15 = treeSetTestDriver12.isEmpty();
        treeSetTestDriver12.clear();
        boolean boolean18 = treeSetTestDriver12.remove((java.lang.Object) 10);
        experiment.util.Comparator comparator19 = treeSetTestDriver12.comparator();
        boolean boolean20 = treeSetTestDriver3.equals_CUT((java.lang.Object) treeSetTestDriver12);
        java.lang.Object obj22 = treeSetTestDriver3.getMatch((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = obj22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(comparator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test090");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator11 = treeSetTestDriver8.comparator();
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) '4');
        boolean boolean15 = treeSetTestDriver8.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator16 = treeSetTestDriver8.iterator();
        boolean boolean17 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver8);
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver18.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator21 = treeSetTestDriver18.comparator();
        boolean boolean23 = treeSetTestDriver18.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator24 = treeSetTestDriver18.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver25 = new experiment.util.TreeSetTestDriver();
        boolean boolean27 = treeSetTestDriver25.contains((java.lang.Object) 0);
        boolean boolean28 = treeSetTestDriver18.equals_CUT((java.lang.Object) boolean27);
        experiment.util.Comparator comparator29 = treeSetTestDriver18.comparator();
        experiment.util.Comparator comparator30 = treeSetTestDriver18.comparator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = treeSetTestDriver8.remove((java.lang.Object) comparator30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(comparator29);
        org.junit.Assert.assertNull(comparator30);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test091");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator5 = treeSetTestDriver4.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) iterator5);
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator11 = treeSetTestDriver8.comparator();
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) '4');
        boolean boolean15 = treeSetTestDriver8.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator16 = treeSetTestDriver8.iterator();
        experiment.util.Iterator iterator17 = treeSetTestDriver8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = treeSetTestDriver0.contains((java.lang.Object) iterator17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test092");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test093");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        experiment.util.Comparator comparator6 = treeSetTestDriver4.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator10 = treeSetTestDriver7.comparator();
        boolean boolean12 = treeSetTestDriver7.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator13 = treeSetTestDriver7.iterator();
        boolean boolean14 = treeSetTestDriver4.equals_CUT((java.lang.Object) treeSetTestDriver7);
        boolean boolean15 = treeSetTestDriver0.contains((java.lang.Object) boolean14);
        java.lang.Object[] objArray16 = treeSetTestDriver0.toArray();
        experiment.util.Comparator comparator17 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(comparator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(comparator17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test094");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test095");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 0);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        boolean boolean9 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10L);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.remove(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test096");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray4 = treeSetTestDriver3.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) objArray4);
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test097");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver2 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver2.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator5 = treeSetTestDriver2.comparator();
        boolean boolean7 = treeSetTestDriver2.remove((java.lang.Object) '4');
        boolean boolean9 = treeSetTestDriver2.add((java.lang.Object) (byte) 1);
        experiment.util.Comparator comparator10 = treeSetTestDriver2.comparator();
        int int11 = treeSetTestDriver2.size();
        java.lang.Object[] objArray12 = treeSetTestDriver2.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean14 = treeSetTestDriver13.isEmpty();
        experiment.util.Comparator comparator15 = treeSetTestDriver13.comparator();
        boolean boolean17 = treeSetTestDriver13.add((java.lang.Object) 10);
        java.lang.Object[] objArray18 = treeSetTestDriver13.toArray();
        boolean boolean19 = treeSetTestDriver2.equals_CUT((java.lang.Object) treeSetTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test098");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test099");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Comparator comparator8 = treeSetTestDriver0.comparator();
        int int9 = treeSetTestDriver0.size();
        java.lang.Object[] objArray10 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Comparator comparator13 = treeSetTestDriver11.comparator();
        boolean boolean15 = treeSetTestDriver11.add((java.lang.Object) 10);
        java.lang.Object[] objArray16 = treeSetTestDriver11.toArray();
        boolean boolean17 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver18.isEmpty();
        int int20 = treeSetTestDriver18.size();
        boolean boolean22 = treeSetTestDriver18.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver23.isEmpty();
        experiment.util.Iterator iterator25 = treeSetTestDriver23.iterator();
        boolean boolean26 = treeSetTestDriver23.isEmpty();
        boolean boolean28 = treeSetTestDriver23.add((java.lang.Object) (short) -1);
        boolean boolean29 = treeSetTestDriver18.remove((java.lang.Object) treeSetTestDriver23);
        experiment.util.Comparator comparator30 = treeSetTestDriver23.comparator();
        boolean boolean31 = treeSetTestDriver11.equals_CUT((java.lang.Object) treeSetTestDriver23);
        treeSetTestDriver11.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(comparator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test100");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.isEmpty();
        boolean boolean10 = treeSetTestDriver5.add((java.lang.Object) (short) -1);
        boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver5);
        experiment.util.Comparator comparator12 = treeSetTestDriver5.comparator();
        int int13 = treeSetTestDriver5.size();
        java.lang.Object obj14 = treeSetTestDriver5.first();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        boolean boolean17 = treeSetTestDriver15.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator18 = treeSetTestDriver15.comparator();
        boolean boolean20 = treeSetTestDriver15.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator21 = treeSetTestDriver15.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver22.contains((java.lang.Object) 0);
        boolean boolean25 = treeSetTestDriver15.equals_CUT((java.lang.Object) boolean24);
        experiment.util.TreeSetTestDriver treeSetTestDriver26 = new experiment.util.TreeSetTestDriver();
        boolean boolean27 = treeSetTestDriver26.isEmpty();
        experiment.util.Comparator comparator28 = treeSetTestDriver26.comparator();
        int int29 = treeSetTestDriver26.size();
        boolean boolean30 = treeSetTestDriver15.equals_CUT((java.lang.Object) int29);
        experiment.util.Iterator iterator31 = treeSetTestDriver15.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = treeSetTestDriver5.getMatch((java.lang.Object) iterator31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSet$TreeSetIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(comparator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test101");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Comparator comparator7 = treeSetTestDriver5.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator11 = treeSetTestDriver8.comparator();
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator14 = treeSetTestDriver8.iterator();
        boolean boolean15 = treeSetTestDriver5.equals_CUT((java.lang.Object) treeSetTestDriver8);
        java.lang.Object[] objArray16 = treeSetTestDriver8.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver17 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver17.isEmpty();
        experiment.util.Comparator comparator19 = treeSetTestDriver17.comparator();
        boolean boolean21 = treeSetTestDriver17.add((java.lang.Object) 10);
        java.lang.Object[] objArray22 = treeSetTestDriver17.toArray();
        boolean boolean23 = treeSetTestDriver8.remove((java.lang.Object) treeSetTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(comparator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test102");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test103");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray4 = treeSetTestDriver3.toArray();
        boolean boolean5 = treeSetTestDriver0.add((java.lang.Object) objArray4);
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver6.isEmpty();
        experiment.util.Comparator comparator8 = treeSetTestDriver6.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean11 = treeSetTestDriver9.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator12 = treeSetTestDriver9.comparator();
        boolean boolean14 = treeSetTestDriver9.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator15 = treeSetTestDriver9.iterator();
        boolean boolean16 = treeSetTestDriver6.equals_CUT((java.lang.Object) treeSetTestDriver9);
        java.lang.Object[] objArray17 = treeSetTestDriver9.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver18.isEmpty();
        experiment.util.Iterator iterator20 = treeSetTestDriver18.iterator();
        boolean boolean21 = treeSetTestDriver18.isEmpty();
        treeSetTestDriver18.clear();
        boolean boolean24 = treeSetTestDriver18.remove((java.lang.Object) 10);
        experiment.util.Comparator comparator25 = treeSetTestDriver18.comparator();
        boolean boolean26 = treeSetTestDriver9.equals_CUT((java.lang.Object) treeSetTestDriver18);
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator28 = treeSetTestDriver27.iterator();
        experiment.util.Iterator iterator29 = treeSetTestDriver27.iterator();
        boolean boolean30 = treeSetTestDriver9.equals_CUT((java.lang.Object) treeSetTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(comparator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test104");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        treeSetTestDriver0.clear();
        int int9 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test105");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object obj7 = treeSetTestDriver0.getMatch((java.lang.Object) (-1L));
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator11 = treeSetTestDriver8.comparator();
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator14 = treeSetTestDriver8.iterator();
        boolean boolean15 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver8);
        int int16 = treeSetTestDriver8.size();
        experiment.util.Comparator comparator17 = treeSetTestDriver8.comparator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(comparator17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test106");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Comparator comparator8 = treeSetTestDriver0.comparator();
        int int9 = treeSetTestDriver0.size();
        java.lang.Object[] objArray10 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver11.isEmpty();
        experiment.util.Comparator comparator13 = treeSetTestDriver11.comparator();
        boolean boolean15 = treeSetTestDriver11.add((java.lang.Object) 10);
        java.lang.Object[] objArray16 = treeSetTestDriver11.toArray();
        boolean boolean17 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver11);
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean19 = treeSetTestDriver18.isEmpty();
        experiment.util.Iterator iterator20 = treeSetTestDriver18.iterator();
        experiment.util.Iterator iterator21 = treeSetTestDriver18.iterator();
        treeSetTestDriver18.clear();
        experiment.util.TreeSetTestDriver treeSetTestDriver23 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver23.isEmpty();
        experiment.util.Iterator iterator25 = treeSetTestDriver23.iterator();
        boolean boolean26 = treeSetTestDriver23.isEmpty();
        boolean boolean27 = treeSetTestDriver23.isEmpty();
        boolean boolean28 = treeSetTestDriver18.remove((java.lang.Object) treeSetTestDriver23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = treeSetTestDriver11.getMatch((java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test107");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeSetTestDriver0.contains((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Character");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test108");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) iterator6);
        java.lang.Object[] objArray8 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = treeSetTestDriver9.iterator();
        boolean boolean12 = treeSetTestDriver9.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean14 = treeSetTestDriver13.isEmpty();
        experiment.util.Comparator comparator15 = treeSetTestDriver13.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver16 = new experiment.util.TreeSetTestDriver();
        boolean boolean18 = treeSetTestDriver16.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator19 = treeSetTestDriver16.comparator();
        boolean boolean21 = treeSetTestDriver16.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator22 = treeSetTestDriver16.iterator();
        boolean boolean23 = treeSetTestDriver13.equals_CUT((java.lang.Object) treeSetTestDriver16);
        boolean boolean24 = treeSetTestDriver9.contains((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = treeSetTestDriver9.toArray();
        experiment.util.Comparator comparator26 = treeSetTestDriver9.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver27 = new experiment.util.TreeSetTestDriver();
        experiment.util.Comparator comparator28 = treeSetTestDriver27.comparator();
        boolean boolean29 = treeSetTestDriver9.remove((java.lang.Object) treeSetTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = treeSetTestDriver0.getMatch((java.lang.Object) treeSetTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(comparator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(comparator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertNull(comparator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test109");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        experiment.util.Iterator iterator9 = treeSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test110");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver8 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver8.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator11 = treeSetTestDriver8.comparator();
        boolean boolean13 = treeSetTestDriver8.remove((java.lang.Object) '4');
        boolean boolean15 = treeSetTestDriver8.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator16 = treeSetTestDriver8.iterator();
        boolean boolean17 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver8);
        boolean boolean18 = treeSetTestDriver8.isEmpty();
        experiment.util.TreeSetTestDriver treeSetTestDriver19 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver19.isEmpty();
        experiment.util.Comparator comparator21 = treeSetTestDriver19.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean24 = treeSetTestDriver22.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator25 = treeSetTestDriver22.comparator();
        boolean boolean27 = treeSetTestDriver22.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator28 = treeSetTestDriver22.iterator();
        boolean boolean29 = treeSetTestDriver19.equals_CUT((java.lang.Object) treeSetTestDriver22);
        java.lang.Object[] objArray30 = treeSetTestDriver22.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver31 = new experiment.util.TreeSetTestDriver();
        boolean boolean32 = treeSetTestDriver31.isEmpty();
        experiment.util.Comparator comparator33 = treeSetTestDriver31.comparator();
        boolean boolean35 = treeSetTestDriver31.add((java.lang.Object) 10);
        java.lang.Object[] objArray36 = treeSetTestDriver31.toArray();
        boolean boolean37 = treeSetTestDriver22.remove((java.lang.Object) treeSetTestDriver31);
        experiment.util.TreeSetTestDriver treeSetTestDriver38 = new experiment.util.TreeSetTestDriver();
        boolean boolean39 = treeSetTestDriver38.isEmpty();
        experiment.util.Iterator iterator40 = treeSetTestDriver38.iterator();
        experiment.util.Iterator iterator41 = treeSetTestDriver38.iterator();
        treeSetTestDriver38.clear();
        java.lang.Object[] objArray43 = treeSetTestDriver38.toArray();
        boolean boolean44 = treeSetTestDriver31.equals_CUT((java.lang.Object) treeSetTestDriver38);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = treeSetTestDriver8.add((java.lang.Object) treeSetTestDriver38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(comparator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(comparator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test111");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.Iterator iterator4 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        int int7 = treeSetTestDriver5.size();
        treeSetTestDriver5.clear();
        treeSetTestDriver5.clear();
        boolean boolean10 = treeSetTestDriver0.add((java.lang.Object) treeSetTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeSetTestDriver5.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test112");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.isEmpty();
        boolean boolean10 = treeSetTestDriver5.add((java.lang.Object) (short) -1);
        boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver5);
        experiment.util.Comparator comparator12 = treeSetTestDriver0.comparator();
        java.lang.Object obj14 = treeSetTestDriver0.getMatch((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test113");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.Comparator comparator4 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator6 = treeSetTestDriver5.iterator();
        boolean boolean7 = treeSetTestDriver0.remove((java.lang.Object) iterator6);
        java.lang.Object[] objArray8 = treeSetTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNull(comparator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test114");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        java.lang.Object[] objArray1 = treeSetTestDriver0.toArray();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        java.lang.Object[] objArray3 = treeSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test115");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = treeSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test116");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Comparator comparator8 = treeSetTestDriver0.comparator();
        int int9 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = treeSetTestDriver0.contains((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test117");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.TreeSetTestDriver treeSetTestDriver5 = new experiment.util.TreeSetTestDriver();
        boolean boolean6 = treeSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = treeSetTestDriver5.iterator();
        boolean boolean8 = treeSetTestDriver5.isEmpty();
        boolean boolean10 = treeSetTestDriver5.add((java.lang.Object) (short) -1);
        boolean boolean11 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver5);
        experiment.util.Comparator comparator12 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(comparator12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test118");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        boolean boolean7 = treeSetTestDriver0.add((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator8 = treeSetTestDriver0.iterator();
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator11 = treeSetTestDriver0.iterator();
        experiment.util.Comparator comparator12 = treeSetTestDriver0.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver13 = new experiment.util.TreeSetTestDriver();
        boolean boolean15 = treeSetTestDriver13.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator16 = treeSetTestDriver13.comparator();
        boolean boolean18 = treeSetTestDriver13.remove((java.lang.Object) '4');
        boolean boolean20 = treeSetTestDriver13.add((java.lang.Object) (byte) 1);
        experiment.util.Comparator comparator21 = treeSetTestDriver13.comparator();
        int int22 = treeSetTestDriver13.size();
        java.lang.Object[] objArray23 = treeSetTestDriver13.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver24 = new experiment.util.TreeSetTestDriver();
        boolean boolean25 = treeSetTestDriver24.isEmpty();
        experiment.util.Comparator comparator26 = treeSetTestDriver24.comparator();
        boolean boolean28 = treeSetTestDriver24.add((java.lang.Object) 10);
        java.lang.Object[] objArray29 = treeSetTestDriver24.toArray();
        boolean boolean30 = treeSetTestDriver13.equals_CUT((java.lang.Object) treeSetTestDriver24);
        java.lang.Object[] objArray31 = treeSetTestDriver24.toArray();
        java.lang.Class<?> wildcardClass32 = objArray31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = treeSetTestDriver0.remove((java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(comparator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(comparator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(comparator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(comparator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test119");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        int int2 = treeSetTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test120");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        experiment.util.Iterator iterator1 = treeSetTestDriver0.iterator();
        boolean boolean3 = treeSetTestDriver0.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj5 = treeSetTestDriver0.getMatch((java.lang.Object) (short) 0);
        boolean boolean6 = treeSetTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = treeSetTestDriver0.toArray();
        java.lang.Object[] objArray8 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver9 = new experiment.util.TreeSetTestDriver();
        boolean boolean10 = treeSetTestDriver9.isEmpty();
        int int11 = treeSetTestDriver9.size();
        experiment.util.Iterator iterator12 = treeSetTestDriver9.iterator();
        int int13 = treeSetTestDriver9.size();
        experiment.util.TreeSetTestDriver treeSetTestDriver14 = new experiment.util.TreeSetTestDriver();
        boolean boolean16 = treeSetTestDriver14.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator17 = treeSetTestDriver14.comparator();
        boolean boolean19 = treeSetTestDriver14.remove((java.lang.Object) '4');
        boolean boolean21 = treeSetTestDriver14.add((java.lang.Object) (byte) 1);
        experiment.util.Comparator comparator22 = treeSetTestDriver14.comparator();
        int int23 = treeSetTestDriver14.size();
        boolean boolean24 = treeSetTestDriver9.add((java.lang.Object) treeSetTestDriver14);
        java.lang.Object obj25 = treeSetTestDriver9.last();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(comparator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test121");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.Comparator comparator11 = treeSetTestDriver0.comparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeSetTestDriver0.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(comparator11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test122");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        treeSetTestDriver0.clear();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray5 = treeSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test123");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        treeSetTestDriver0.clear();
        java.lang.Object[] objArray5 = treeSetTestDriver0.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean7 = treeSetTestDriver6.isEmpty();
        int int8 = treeSetTestDriver6.size();
        treeSetTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = treeSetTestDriver0.contains((java.lang.Object) treeSetTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test124");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        experiment.util.Iterator iterator3 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver4 = new experiment.util.TreeSetTestDriver();
        boolean boolean5 = treeSetTestDriver4.isEmpty();
        experiment.util.Iterator iterator6 = treeSetTestDriver4.iterator();
        boolean boolean7 = treeSetTestDriver4.isEmpty();
        boolean boolean8 = treeSetTestDriver4.isEmpty();
        boolean boolean9 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver4);
        experiment.util.TreeSetTestDriver treeSetTestDriver10 = new experiment.util.TreeSetTestDriver();
        boolean boolean12 = treeSetTestDriver10.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator13 = treeSetTestDriver10.comparator();
        experiment.util.Iterator iterator14 = treeSetTestDriver10.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        boolean boolean16 = treeSetTestDriver15.isEmpty();
        int int17 = treeSetTestDriver15.size();
        treeSetTestDriver15.clear();
        treeSetTestDriver15.clear();
        boolean boolean20 = treeSetTestDriver10.add((java.lang.Object) treeSetTestDriver15);
        treeSetTestDriver10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = treeSetTestDriver4.getMatch((java.lang.Object) treeSetTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeSetTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(comparator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test125");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        boolean boolean5 = treeSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator6 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver7 = new experiment.util.TreeSetTestDriver();
        boolean boolean9 = treeSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean10 = treeSetTestDriver0.equals_CUT((java.lang.Object) boolean9);
        experiment.util.TreeSetTestDriver treeSetTestDriver11 = new experiment.util.TreeSetTestDriver();
        boolean boolean13 = treeSetTestDriver11.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator14 = treeSetTestDriver11.comparator();
        boolean boolean16 = treeSetTestDriver11.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator17 = treeSetTestDriver11.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver18 = new experiment.util.TreeSetTestDriver();
        boolean boolean20 = treeSetTestDriver18.contains((java.lang.Object) 0);
        boolean boolean21 = treeSetTestDriver11.equals_CUT((java.lang.Object) boolean20);
        boolean boolean22 = treeSetTestDriver0.remove((java.lang.Object) treeSetTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(comparator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test126");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = treeSetTestDriver0.iterator();
        experiment.util.TreeSetTestDriver treeSetTestDriver3 = new experiment.util.TreeSetTestDriver();
        boolean boolean4 = treeSetTestDriver3.isEmpty();
        experiment.util.Comparator comparator5 = treeSetTestDriver3.comparator();
        experiment.util.TreeSetTestDriver treeSetTestDriver6 = new experiment.util.TreeSetTestDriver();
        boolean boolean8 = treeSetTestDriver6.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator9 = treeSetTestDriver6.comparator();
        boolean boolean11 = treeSetTestDriver6.remove((java.lang.Object) '4');
        experiment.util.Iterator iterator12 = treeSetTestDriver6.iterator();
        boolean boolean13 = treeSetTestDriver3.equals_CUT((java.lang.Object) treeSetTestDriver6);
        java.lang.Object[] objArray14 = treeSetTestDriver6.toArray();
        experiment.util.TreeSetTestDriver treeSetTestDriver15 = new experiment.util.TreeSetTestDriver();
        boolean boolean16 = treeSetTestDriver15.isEmpty();
        experiment.util.Comparator comparator17 = treeSetTestDriver15.comparator();
        boolean boolean19 = treeSetTestDriver15.add((java.lang.Object) 10);
        java.lang.Object[] objArray20 = treeSetTestDriver15.toArray();
        boolean boolean21 = treeSetTestDriver6.remove((java.lang.Object) treeSetTestDriver15);
        experiment.util.TreeSetTestDriver treeSetTestDriver22 = new experiment.util.TreeSetTestDriver();
        boolean boolean23 = treeSetTestDriver22.isEmpty();
        experiment.util.Iterator iterator24 = treeSetTestDriver22.iterator();
        experiment.util.Iterator iterator25 = treeSetTestDriver22.iterator();
        treeSetTestDriver22.clear();
        java.lang.Object[] objArray27 = treeSetTestDriver22.toArray();
        boolean boolean28 = treeSetTestDriver15.equals_CUT((java.lang.Object) treeSetTestDriver22);
        boolean boolean29 = treeSetTestDriver0.equals_CUT((java.lang.Object) treeSetTestDriver22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = treeSetTestDriver22.last();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comparator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(comparator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(comparator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test127");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean2 = treeSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.Comparator comparator3 = treeSetTestDriver0.comparator();
        experiment.util.Iterator iterator4 = treeSetTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeSetTestDriver0.first();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(comparator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeSetTest_1082618794_1024_0.test128");
        experiment.util.TreeSetTestDriver treeSetTestDriver0 = new experiment.util.TreeSetTestDriver();
        boolean boolean1 = treeSetTestDriver0.isEmpty();
        int int2 = treeSetTestDriver0.size();
        boolean boolean4 = treeSetTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.Iterator iterator5 = treeSetTestDriver0.iterator();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = treeSetTestDriver0.add(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

}
