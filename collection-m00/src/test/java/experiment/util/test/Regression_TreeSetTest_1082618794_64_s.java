package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeSetTest_1082618794_64_s {

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

}
