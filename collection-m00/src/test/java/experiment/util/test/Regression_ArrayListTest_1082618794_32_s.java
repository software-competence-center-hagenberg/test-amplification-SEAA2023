package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_ArrayListTest_1082618794_32_s {

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
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test001");
        experiment.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test002");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test003");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        int int3 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test004");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) 0.0d);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = arrayListTestDriver0.add(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test005");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test006");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test007");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean4 = arrayListTestDriver0.equals_CUT((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass5 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test008");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        int int3 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test009");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) 0.0d);
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test010");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) 0.0d);
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test011");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean4 = arrayListTestDriver0.equals_CUT((java.lang.Object) 100L);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test012");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        boolean boolean10 = arrayListTestDriver5.remove((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver5.set((int) (short) 100, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test013");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver5.set((int) (byte) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test014");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test015");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) '4');
        boolean boolean12 = arrayListTestDriver9.isEmpty();
        int int13 = arrayListTestDriver9.size();
        boolean boolean14 = arrayListTestDriver0.contains((java.lang.Object) int13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test016");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) '4');
        boolean boolean12 = arrayListTestDriver9.isEmpty();
        int int13 = arrayListTestDriver9.size();
        boolean boolean14 = arrayListTestDriver0.contains((java.lang.Object) int13);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) '4');
        boolean boolean19 = arrayListTestDriver16.isEmpty();
        boolean boolean21 = arrayListTestDriver16.remove((java.lang.Object) 100);
        boolean boolean23 = arrayListTestDriver16.add((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = arrayListTestDriver0.set((int) (byte) 10, (java.lang.Object) arrayListTestDriver16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test017");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test018");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) 0.0d);
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test019");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test020");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        int int4 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.set(0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test021");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean4 = arrayListTestDriver0.equals_CUT((java.lang.Object) 100L);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = iterator6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test022");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) 0.0d);
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver0.size();
        java.lang.Object[] objArray9 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test023");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test024");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        int int4 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test025");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        int int3 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set((int) (short) 0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test026");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test027");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test028");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.remove((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.set((int) '#', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test029");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) '4');
        boolean boolean12 = arrayListTestDriver9.isEmpty();
        int int13 = arrayListTestDriver9.size();
        boolean boolean14 = arrayListTestDriver0.contains((java.lang.Object) int13);
        experiment.util.ListIterator listIterator16 = arrayListTestDriver0.listIterator((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = listIterator16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(listIterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test030");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test031");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1082618794_1024_0.test032");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) '4');
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) '4');
        boolean boolean12 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) (short) 10);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = arrayListTestDriver0.contains(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

}
