package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_ArrayListTest_1256357748_256_s {

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
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test002");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test003");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set(10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test004");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test005");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test006");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.set((int) (byte) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test007");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test008");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator3 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test009");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test010");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test011");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test012");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass4 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test013");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test014");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (byte) 10);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator7 = arrayListTestDriver2.iterator();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver2.listIterator(1);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) listIterator9);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test015");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test016");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = arrayListTestDriver0.set((int) (byte) 10, (java.lang.Object) arrayListTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test017");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test018");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (byte) 10);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator7 = arrayListTestDriver2.iterator();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver2.listIterator(1);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) listIterator9);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = arrayListTestDriver0.contains(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test019");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test020");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = arrayListTestDriver0.contains(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test021");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test022");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test023");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (byte) 10);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator7 = arrayListTestDriver2.iterator();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver2.listIterator(1);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) listIterator9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test024");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver7.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test025");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = arrayListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test026");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.set((int) (byte) 1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test027");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test028");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator26 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test029");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (short) 10);
        int int3 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set((int) (short) 10, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test030");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test031");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test032");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = arrayListTestDriver0.equals_CUT(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test033");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test034");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (byte) 10);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator7 = arrayListTestDriver2.iterator();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver2.listIterator(1);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) listIterator9);
        java.lang.Class<?> wildcardClass11 = listIterator9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test035");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        java.lang.Object obj27 = arrayListTestDriver0.set(0, (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = arrayListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0d) + "'", obj27, (-1.0d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test036");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test037");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test038");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test039");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray7 = arrayListTestDriver6.toArray();
        arrayListTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.set(0, (java.lang.Object) arrayListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test040");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test041");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test042");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass12 = arrayListTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.set(1, (java.lang.Object) arrayListTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test043");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = arrayListTestDriver0.equals_CUT(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test044");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.remove((java.lang.Object) (short) 1);
        boolean boolean20 = arrayListTestDriver14.add((java.lang.Object) "hi!");
        boolean boolean21 = arrayListTestDriver14.isEmpty();
        experiment.util.Iterator iterator22 = arrayListTestDriver14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = arrayListTestDriver0.set((int) 'a', (java.lang.Object) iterator22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test045");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test046");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray20 = arrayListTestDriver19.toArray();
        java.lang.Object[] objArray21 = arrayListTestDriver19.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver22.iterator();
        experiment.util.ListIterator listIterator29 = arrayListTestDriver22.listIterator(1);
        boolean boolean30 = arrayListTestDriver19.contains((java.lang.Object) listIterator29);
        boolean boolean31 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = arrayListTestDriver19.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test047");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = arrayListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test048");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test049");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test050");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        int int13 = arrayListTestDriver0.size();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = arrayListTestDriver0.add(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test051");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator8 = arrayListTestDriver3.iterator();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver3.listIterator(1);
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) listIterator10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test052");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator26 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass27 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test053");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        int int13 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = arrayListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test054");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass3 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test055");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator8 = arrayListTestDriver3.iterator();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver3.listIterator(1);
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) listIterator10);
        java.lang.Class<?> wildcardClass12 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test056");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        java.lang.Class<?> wildcardClass12 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test057");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        int int3 = arrayListTestDriver2.size();
        int int4 = arrayListTestDriver2.size();
        boolean boolean5 = arrayListTestDriver2.isEmpty();
        int int6 = arrayListTestDriver2.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.set(10, (java.lang.Object) arrayListTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test058");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test059");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test060");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test061");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        int int12 = arrayListTestDriver11.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = arrayListTestDriver13.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator18 = arrayListTestDriver13.iterator();
        experiment.util.ListIterator listIterator20 = arrayListTestDriver13.listIterator(1);
        boolean boolean21 = arrayListTestDriver11.add((java.lang.Object) listIterator20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = arrayListTestDriver0.set((int) (short) 1, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(listIterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test062");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = arrayListTestDriver0.equals_CUT(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test063");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = iterator6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test064");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.set(10, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test065");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        int int11 = arrayListTestDriver10.size();
        int int12 = arrayListTestDriver10.size();
        experiment.util.Iterator iterator13 = arrayListTestDriver10.iterator();
        boolean boolean14 = arrayListTestDriver0.remove((java.lang.Object) iterator13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test066");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test067");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        boolean boolean26 = arrayListTestDriver19.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = arrayListTestDriver27.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator32 = arrayListTestDriver27.iterator();
        boolean boolean33 = arrayListTestDriver19.equals_CUT((java.lang.Object) iterator32);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray35 = arrayListTestDriver34.toArray();
        boolean boolean36 = arrayListTestDriver19.contains((java.lang.Object) objArray35);
        arrayListTestDriver19.clear();
        arrayListTestDriver19.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        boolean boolean44 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver39);
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        boolean boolean47 = arrayListTestDriver45.remove((java.lang.Object) (byte) 10);
        boolean boolean49 = arrayListTestDriver45.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator50 = arrayListTestDriver45.iterator();
        experiment.util.ListIterator listIterator52 = arrayListTestDriver45.listIterator(1);
        boolean boolean53 = arrayListTestDriver39.equals_CUT((java.lang.Object) listIterator52);
        boolean boolean54 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean53);
        experiment.util.ArrayListTestDriver arrayListTestDriver56 = new experiment.util.ArrayListTestDriver();
        int int57 = arrayListTestDriver56.size();
        int int58 = arrayListTestDriver56.size();
        boolean boolean59 = arrayListTestDriver56.isEmpty();
        int int60 = arrayListTestDriver56.size();
        int int61 = arrayListTestDriver56.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = arrayListTestDriver0.set((int) 'a', (java.lang.Object) arrayListTestDriver56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test068");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test069");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) (-1.0d));
        boolean boolean24 = arrayListTestDriver18.contains((java.lang.Object) (short) 10);
        boolean boolean26 = arrayListTestDriver18.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator28 = arrayListTestDriver18.listIterator((int) (byte) 0);
        boolean boolean29 = arrayListTestDriver18.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean32 = arrayListTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = arrayListTestDriver30.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator35 = arrayListTestDriver30.iterator();
        experiment.util.Iterator iterator36 = arrayListTestDriver30.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver37 = new experiment.util.ArrayListTestDriver();
        boolean boolean39 = arrayListTestDriver37.remove((java.lang.Object) (byte) 10);
        boolean boolean41 = arrayListTestDriver37.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator42 = arrayListTestDriver37.iterator();
        int int43 = arrayListTestDriver37.size();
        java.lang.Object[] objArray44 = arrayListTestDriver37.toArray();
        boolean boolean45 = arrayListTestDriver30.equals_CUT((java.lang.Object) arrayListTestDriver37);
        boolean boolean46 = arrayListTestDriver18.remove((java.lang.Object) arrayListTestDriver30);
        boolean boolean47 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = arrayListTestDriver18.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(listIterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test070");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test071");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator8 = arrayListTestDriver3.iterator();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver3.listIterator(1);
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) listIterator10);
        java.lang.Object[] objArray12 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass13 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test072");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(listIterator10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test073");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray9 = arrayListTestDriver8.toArray();
        boolean boolean11 = arrayListTestDriver8.equals_CUT((java.lang.Object) 10);
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver8);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean18 = arrayListTestDriver14.isEmpty();
        boolean boolean19 = arrayListTestDriver8.contains((java.lang.Object) arrayListTestDriver14);
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator26 = arrayListTestDriver21.iterator();
        experiment.util.Iterator iterator27 = arrayListTestDriver21.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = arrayListTestDriver28.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator33 = arrayListTestDriver28.iterator();
        experiment.util.ListIterator listIterator35 = arrayListTestDriver28.listIterator(1);
        java.lang.Class<?> wildcardClass36 = listIterator35.getClass();
        boolean boolean37 = arrayListTestDriver21.contains((java.lang.Object) wildcardClass36);
        arrayListTestDriver21.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = arrayListTestDriver14.set((int) '#', (java.lang.Object) arrayListTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(listIterator35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test074");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.Iterator iterator17 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test075");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test076");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test077");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator11 = arrayListTestDriver6.iterator();
        experiment.util.Iterator iterator12 = arrayListTestDriver6.iterator();
        java.lang.Object obj14 = arrayListTestDriver6.get((int) (short) 0);
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver6);
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = arrayListTestDriver0.add(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test078");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray10 = arrayListTestDriver7.toArray();
        arrayListTestDriver7.clear();
        java.lang.Object[] objArray12 = arrayListTestDriver7.toArray();
        int int13 = arrayListTestDriver7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver0.set((int) (byte) -1, (java.lang.Object) arrayListTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test079");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) true);
        int int6 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        boolean boolean14 = arrayListTestDriver7.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean17 = arrayListTestDriver15.remove((java.lang.Object) (byte) 10);
        boolean boolean19 = arrayListTestDriver15.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator20 = arrayListTestDriver15.iterator();
        boolean boolean21 = arrayListTestDriver7.equals_CUT((java.lang.Object) iterator20);
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray23 = arrayListTestDriver22.toArray();
        boolean boolean24 = arrayListTestDriver7.contains((java.lang.Object) objArray23);
        arrayListTestDriver7.clear();
        arrayListTestDriver7.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = arrayListTestDriver27.add((java.lang.Object) (-1.0d));
        boolean boolean32 = arrayListTestDriver7.equals_CUT((java.lang.Object) arrayListTestDriver27);
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        boolean boolean35 = arrayListTestDriver33.remove((java.lang.Object) (byte) 10);
        boolean boolean37 = arrayListTestDriver33.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator38 = arrayListTestDriver33.iterator();
        experiment.util.ListIterator listIterator40 = arrayListTestDriver33.listIterator(1);
        boolean boolean41 = arrayListTestDriver27.equals_CUT((java.lang.Object) listIterator40);
        boolean boolean42 = arrayListTestDriver0.add((java.lang.Object) listIterator40);
        java.lang.Class<?> wildcardClass43 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(listIterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test080");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (byte) 10);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator7 = arrayListTestDriver2.iterator();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver2.listIterator(1);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) listIterator9);
        java.lang.Object obj12 = arrayListTestDriver0.get(0);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        int int15 = arrayListTestDriver14.size();
        int int16 = arrayListTestDriver14.size();
        boolean boolean18 = arrayListTestDriver14.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.add((java.lang.Object) (short) 10);
        int int22 = arrayListTestDriver19.size();
        boolean boolean23 = arrayListTestDriver14.remove((java.lang.Object) arrayListTestDriver19);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.remove((java.lang.Object) (byte) 10);
        boolean boolean28 = arrayListTestDriver24.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator29 = arrayListTestDriver24.iterator();
        experiment.util.Iterator iterator30 = arrayListTestDriver24.iterator();
        boolean boolean31 = arrayListTestDriver19.contains((java.lang.Object) iterator30);
        experiment.util.Iterator iterator32 = arrayListTestDriver19.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = arrayListTestDriver0.set((int) (short) 1, (java.lang.Object) arrayListTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test081");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test082");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator(1);
        java.lang.Class<?> wildcardClass15 = listIterator14.getClass();
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass15);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass19 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test083");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator26 = arrayListTestDriver0.iterator();
        int int27 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = arrayListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test084");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator11 = arrayListTestDriver6.iterator();
        experiment.util.Iterator iterator12 = arrayListTestDriver6.iterator();
        java.lang.Object obj14 = arrayListTestDriver6.get((int) (short) 0);
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver6);
        java.lang.Object obj17 = arrayListTestDriver0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test085");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator26 = arrayListTestDriver0.iterator();
        int int27 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = arrayListTestDriver28.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator33 = arrayListTestDriver28.iterator();
        boolean boolean35 = arrayListTestDriver28.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        boolean boolean38 = arrayListTestDriver36.remove((java.lang.Object) (byte) 10);
        boolean boolean40 = arrayListTestDriver36.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator41 = arrayListTestDriver36.iterator();
        boolean boolean42 = arrayListTestDriver28.equals_CUT((java.lang.Object) iterator41);
        experiment.util.ArrayListTestDriver arrayListTestDriver43 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray44 = arrayListTestDriver43.toArray();
        boolean boolean45 = arrayListTestDriver28.contains((java.lang.Object) objArray44);
        experiment.util.ArrayListTestDriver arrayListTestDriver46 = new experiment.util.ArrayListTestDriver();
        boolean boolean48 = arrayListTestDriver46.remove((java.lang.Object) (byte) 10);
        boolean boolean50 = arrayListTestDriver46.add((java.lang.Object) (-1.0d));
        boolean boolean52 = arrayListTestDriver46.contains((java.lang.Object) (short) 10);
        boolean boolean54 = arrayListTestDriver46.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator56 = arrayListTestDriver46.listIterator((int) (byte) 0);
        boolean boolean57 = arrayListTestDriver46.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver58 = new experiment.util.ArrayListTestDriver();
        boolean boolean60 = arrayListTestDriver58.remove((java.lang.Object) (byte) 10);
        boolean boolean62 = arrayListTestDriver58.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator63 = arrayListTestDriver58.iterator();
        experiment.util.Iterator iterator64 = arrayListTestDriver58.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver65 = new experiment.util.ArrayListTestDriver();
        boolean boolean67 = arrayListTestDriver65.remove((java.lang.Object) (byte) 10);
        boolean boolean69 = arrayListTestDriver65.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator70 = arrayListTestDriver65.iterator();
        int int71 = arrayListTestDriver65.size();
        java.lang.Object[] objArray72 = arrayListTestDriver65.toArray();
        boolean boolean73 = arrayListTestDriver58.equals_CUT((java.lang.Object) arrayListTestDriver65);
        boolean boolean74 = arrayListTestDriver46.remove((java.lang.Object) arrayListTestDriver58);
        boolean boolean75 = arrayListTestDriver28.contains((java.lang.Object) arrayListTestDriver46);
        boolean boolean76 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = arrayListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(listIterator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test086");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test087");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        int int4 = arrayListTestDriver0.size();
        int int5 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test088");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) (byte) 10);
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator14 = arrayListTestDriver9.iterator();
        experiment.util.Iterator iterator15 = arrayListTestDriver9.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = arrayListTestDriver16.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator21 = arrayListTestDriver16.iterator();
        int int22 = arrayListTestDriver16.size();
        java.lang.Object[] objArray23 = arrayListTestDriver16.toArray();
        boolean boolean24 = arrayListTestDriver9.equals_CUT((java.lang.Object) arrayListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = arrayListTestDriver0.set((int) (short) 1, (java.lang.Object) arrayListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test089");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        java.lang.Object[] objArray18 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray21 = arrayListTestDriver20.toArray();
        arrayListTestDriver20.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = arrayListTestDriver0.set((int) (short) 0, (java.lang.Object) arrayListTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test090");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test091");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test092");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.remove((java.lang.Object) (short) 1);
        boolean boolean13 = arrayListTestDriver7.add((java.lang.Object) "hi!");
        boolean boolean14 = arrayListTestDriver7.isEmpty();
        experiment.util.Iterator iterator15 = arrayListTestDriver7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver0.set(0, (java.lang.Object) iterator15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test093");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        int int11 = arrayListTestDriver7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver7.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test094");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = arrayListTestDriver3.remove((java.lang.Object) (short) 1);
        int int8 = arrayListTestDriver3.size();
        boolean boolean9 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test095");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) true);
        int int6 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test096");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        int int8 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test097");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        int int13 = arrayListTestDriver7.size();
        java.lang.Object[] objArray14 = arrayListTestDriver7.toArray();
        boolean boolean15 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver7);
        java.lang.Class<?> wildcardClass16 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test098");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test099");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = arrayListTestDriver10.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator15 = arrayListTestDriver10.iterator();
        experiment.util.Iterator iterator16 = arrayListTestDriver10.iterator();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) iterator16);
        experiment.util.Iterator iterator18 = arrayListTestDriver5.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        int int20 = arrayListTestDriver19.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator26 = arrayListTestDriver21.iterator();
        experiment.util.ListIterator listIterator28 = arrayListTestDriver21.listIterator(1);
        boolean boolean29 = arrayListTestDriver19.add((java.lang.Object) listIterator28);
        java.lang.Object obj31 = arrayListTestDriver19.get(0);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        boolean boolean33 = arrayListTestDriver5.equals_CUT((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(listIterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test100");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test101");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) 100);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray10 = arrayListTestDriver9.toArray();
        java.lang.Object[] objArray11 = arrayListTestDriver9.toArray();
        java.lang.Object[] objArray12 = arrayListTestDriver9.toArray();
        boolean boolean13 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test102");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray17 = arrayListTestDriver16.toArray();
        boolean boolean19 = arrayListTestDriver16.equals_CUT((java.lang.Object) 10);
        boolean boolean20 = arrayListTestDriver16.isEmpty();
        boolean boolean21 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver16);
        boolean boolean22 = arrayListTestDriver16.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test103");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        java.lang.Object[] objArray8 = arrayListTestDriver5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.set((int) (byte) 100, (java.lang.Object) arrayListTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test104");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        java.lang.Object obj8 = arrayListTestDriver0.get((int) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray10 = arrayListTestDriver9.toArray();
        java.lang.Object[] objArray11 = arrayListTestDriver9.toArray();
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean19 = arrayListTestDriver14.contains((java.lang.Object) true);
        boolean boolean20 = arrayListTestDriver9.equals_CUT((java.lang.Object) arrayListTestDriver14);
        experiment.util.ListIterator listIterator22 = arrayListTestDriver9.listIterator(0);
        boolean boolean23 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver9);
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test105");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = arrayListTestDriver3.remove((java.lang.Object) (short) 1);
        int int8 = arrayListTestDriver3.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray10 = arrayListTestDriver9.toArray();
        java.lang.Object[] objArray11 = arrayListTestDriver9.toArray();
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean19 = arrayListTestDriver14.contains((java.lang.Object) true);
        boolean boolean20 = arrayListTestDriver9.equals_CUT((java.lang.Object) arrayListTestDriver14);
        boolean boolean21 = arrayListTestDriver3.add((java.lang.Object) arrayListTestDriver9);
        boolean boolean22 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver9);
        java.lang.Class<?> wildcardClass23 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test106");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator(1);
        java.lang.Class<?> wildcardClass15 = listIterator14.getClass();
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass15);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator19 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass20 = iterator19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test107");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test108");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) true);
        int int6 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        int int8 = arrayListTestDriver7.size();
        int int9 = arrayListTestDriver7.size();
        boolean boolean10 = arrayListTestDriver7.isEmpty();
        boolean boolean11 = arrayListTestDriver7.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        int int25 = arrayListTestDriver19.size();
        java.lang.Object[] objArray26 = arrayListTestDriver19.toArray();
        boolean boolean27 = arrayListTestDriver12.equals_CUT((java.lang.Object) arrayListTestDriver19);
        boolean boolean28 = arrayListTestDriver7.add((java.lang.Object) arrayListTestDriver19);
        boolean boolean29 = arrayListTestDriver0.remove((java.lang.Object) boolean28);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test109");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator9 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = arrayListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test110");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator7 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test111");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = arrayListTestDriver0.equals_CUT(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test112");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        java.lang.Object obj8 = arrayListTestDriver0.get((int) (short) 0);
        int int9 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test113");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) 100);
        arrayListTestDriver0.clear();
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test114");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray20 = arrayListTestDriver19.toArray();
        java.lang.Object[] objArray21 = arrayListTestDriver19.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver22.iterator();
        experiment.util.ListIterator listIterator29 = arrayListTestDriver22.listIterator(1);
        boolean boolean30 = arrayListTestDriver19.contains((java.lang.Object) listIterator29);
        boolean boolean31 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver19);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        int int35 = arrayListTestDriver34.size();
        int int36 = arrayListTestDriver34.size();
        boolean boolean37 = arrayListTestDriver34.isEmpty();
        int int38 = arrayListTestDriver34.size();
        int int39 = arrayListTestDriver34.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = arrayListTestDriver0.set((int) '#', (java.lang.Object) arrayListTestDriver34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test115");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test116");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver4.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test117");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = arrayListTestDriver16.remove((java.lang.Object) (short) 1);
        boolean boolean22 = arrayListTestDriver16.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray24 = arrayListTestDriver23.toArray();
        java.lang.Object[] objArray25 = arrayListTestDriver23.toArray();
        boolean boolean26 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver23);
        arrayListTestDriver23.clear();
        boolean boolean28 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = arrayListTestDriver23.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test118");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray13 = arrayListTestDriver12.toArray();
        boolean boolean15 = arrayListTestDriver12.equals_CUT((java.lang.Object) 10);
        boolean boolean17 = arrayListTestDriver12.contains((java.lang.Object) true);
        int int18 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        boolean boolean26 = arrayListTestDriver19.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = arrayListTestDriver27.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator32 = arrayListTestDriver27.iterator();
        boolean boolean33 = arrayListTestDriver19.equals_CUT((java.lang.Object) iterator32);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray35 = arrayListTestDriver34.toArray();
        boolean boolean36 = arrayListTestDriver19.contains((java.lang.Object) objArray35);
        arrayListTestDriver19.clear();
        arrayListTestDriver19.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        boolean boolean44 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver39);
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        boolean boolean47 = arrayListTestDriver45.remove((java.lang.Object) (byte) 10);
        boolean boolean49 = arrayListTestDriver45.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator50 = arrayListTestDriver45.iterator();
        experiment.util.ListIterator listIterator52 = arrayListTestDriver45.listIterator(1);
        boolean boolean53 = arrayListTestDriver39.equals_CUT((java.lang.Object) listIterator52);
        boolean boolean54 = arrayListTestDriver12.add((java.lang.Object) listIterator52);
        boolean boolean55 = arrayListTestDriver5.contains((java.lang.Object) boolean54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = arrayListTestDriver5.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test119");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test120");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        boolean boolean8 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test121");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver0.remove(obj7);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) (-1.0d));
        boolean boolean16 = arrayListTestDriver10.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.remove((java.lang.Object) (byte) 10);
        boolean boolean21 = arrayListTestDriver17.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator22 = arrayListTestDriver17.iterator();
        experiment.util.Iterator iterator23 = arrayListTestDriver17.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.remove((java.lang.Object) (byte) 10);
        boolean boolean28 = arrayListTestDriver24.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator29 = arrayListTestDriver24.iterator();
        experiment.util.ListIterator listIterator31 = arrayListTestDriver24.listIterator(1);
        java.lang.Class<?> wildcardClass32 = listIterator31.getClass();
        boolean boolean33 = arrayListTestDriver17.contains((java.lang.Object) wildcardClass32);
        boolean boolean34 = arrayListTestDriver10.remove((java.lang.Object) boolean33);
        experiment.util.Iterator iterator35 = arrayListTestDriver10.iterator();
        boolean boolean36 = arrayListTestDriver10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = arrayListTestDriver0.set((int) (short) -1, (java.lang.Object) arrayListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(listIterator31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test122");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = arrayListTestDriver5.remove((java.lang.Object) (short) 1);
        boolean boolean11 = arrayListTestDriver5.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray13 = arrayListTestDriver12.toArray();
        java.lang.Object[] objArray14 = arrayListTestDriver12.toArray();
        boolean boolean15 = arrayListTestDriver5.remove((java.lang.Object) arrayListTestDriver12);
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver0.set((int) 'a', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test123");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        int int3 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test124");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test125");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (short) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = arrayListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test126");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = arrayListTestDriver10.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator15 = arrayListTestDriver10.iterator();
        experiment.util.Iterator iterator16 = arrayListTestDriver10.iterator();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) iterator16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = arrayListTestDriver18.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator23 = arrayListTestDriver18.iterator();
        boolean boolean25 = arrayListTestDriver18.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = arrayListTestDriver26.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator31 = arrayListTestDriver26.iterator();
        boolean boolean32 = arrayListTestDriver18.equals_CUT((java.lang.Object) iterator31);
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray34 = arrayListTestDriver33.toArray();
        boolean boolean35 = arrayListTestDriver18.contains((java.lang.Object) objArray34);
        arrayListTestDriver18.clear();
        arrayListTestDriver18.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        boolean boolean40 = arrayListTestDriver38.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = arrayListTestDriver38.add((java.lang.Object) (-1.0d));
        boolean boolean43 = arrayListTestDriver18.equals_CUT((java.lang.Object) arrayListTestDriver38);
        experiment.util.ArrayListTestDriver arrayListTestDriver44 = new experiment.util.ArrayListTestDriver();
        boolean boolean46 = arrayListTestDriver44.remove((java.lang.Object) (byte) 10);
        boolean boolean48 = arrayListTestDriver44.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator49 = arrayListTestDriver44.iterator();
        experiment.util.ListIterator listIterator51 = arrayListTestDriver44.listIterator(1);
        boolean boolean52 = arrayListTestDriver38.equals_CUT((java.lang.Object) listIterator51);
        boolean boolean53 = arrayListTestDriver5.remove((java.lang.Object) boolean52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(listIterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test127");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray17 = arrayListTestDriver16.toArray();
        boolean boolean19 = arrayListTestDriver16.equals_CUT((java.lang.Object) 10);
        boolean boolean20 = arrayListTestDriver16.isEmpty();
        boolean boolean21 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver16);
        java.lang.Class<?> wildcardClass22 = arrayListTestDriver16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test128");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray12 = arrayListTestDriver11.toArray();
        boolean boolean14 = arrayListTestDriver11.equals_CUT((java.lang.Object) 10);
        boolean boolean15 = arrayListTestDriver11.isEmpty();
        boolean boolean16 = arrayListTestDriver0.remove((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test129");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        int int3 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test130");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test131");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        int int13 = arrayListTestDriver12.size();
        int int14 = arrayListTestDriver12.size();
        experiment.util.Iterator iterator15 = arrayListTestDriver12.iterator();
        boolean boolean16 = arrayListTestDriver5.contains((java.lang.Object) iterator15);
        java.lang.Class<?> wildcardClass17 = arrayListTestDriver5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test132");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = arrayListTestDriver16.remove((java.lang.Object) (short) 1);
        boolean boolean22 = arrayListTestDriver16.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray24 = arrayListTestDriver23.toArray();
        java.lang.Object[] objArray25 = arrayListTestDriver23.toArray();
        boolean boolean26 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver23);
        arrayListTestDriver23.clear();
        boolean boolean28 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver23);
        experiment.util.ListIterator listIterator30 = arrayListTestDriver0.listIterator((int) (short) 0);
        java.lang.Class<?> wildcardClass31 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(listIterator30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test133");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray8 = arrayListTestDriver3.toArray();
        boolean boolean9 = arrayListTestDriver0.contains((java.lang.Object) objArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test134");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass26 = objArray25.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test135");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test136");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        int int13 = arrayListTestDriver12.size();
        int int14 = arrayListTestDriver12.size();
        experiment.util.Iterator iterator15 = arrayListTestDriver12.iterator();
        boolean boolean16 = arrayListTestDriver5.contains((java.lang.Object) iterator15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver5.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test137");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver0.remove(obj7);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        int int12 = arrayListTestDriver11.size();
        int int13 = arrayListTestDriver11.size();
        boolean boolean14 = arrayListTestDriver11.isEmpty();
        boolean boolean15 = arrayListTestDriver11.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = arrayListTestDriver16.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator21 = arrayListTestDriver16.iterator();
        experiment.util.Iterator iterator22 = arrayListTestDriver16.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        boolean boolean25 = arrayListTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean27 = arrayListTestDriver23.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator28 = arrayListTestDriver23.iterator();
        int int29 = arrayListTestDriver23.size();
        java.lang.Object[] objArray30 = arrayListTestDriver23.toArray();
        boolean boolean31 = arrayListTestDriver16.equals_CUT((java.lang.Object) arrayListTestDriver23);
        boolean boolean32 = arrayListTestDriver11.add((java.lang.Object) arrayListTestDriver23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = arrayListTestDriver0.set((int) 'a', (java.lang.Object) boolean32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test138");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray7 = arrayListTestDriver6.toArray();
        java.lang.Object[] objArray8 = arrayListTestDriver6.toArray();
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray12 = arrayListTestDriver11.toArray();
        boolean boolean14 = arrayListTestDriver11.equals_CUT((java.lang.Object) 10);
        boolean boolean16 = arrayListTestDriver11.contains((java.lang.Object) true);
        boolean boolean17 = arrayListTestDriver6.equals_CUT((java.lang.Object) arrayListTestDriver11);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver6);
        java.lang.Object[] objArray19 = arrayListTestDriver6.toArray();
        arrayListTestDriver6.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[#]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test139");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        int int4 = arrayListTestDriver0.size();
        experiment.util.ListIterator listIterator6 = arrayListTestDriver0.listIterator(0);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test140");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = arrayListTestDriver11.toArray();
        arrayListTestDriver11.clear();
        java.lang.Object obj16 = arrayListTestDriver5.set((int) (byte) 0, (java.lang.Object) arrayListTestDriver11);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        experiment.util.ListIterator listIterator26 = arrayListTestDriver19.listIterator(1);
        boolean boolean27 = arrayListTestDriver17.add((java.lang.Object) listIterator26);
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver28.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray31 = arrayListTestDriver28.toArray();
        arrayListTestDriver28.clear();
        java.lang.Object[] objArray33 = arrayListTestDriver28.toArray();
        boolean boolean34 = arrayListTestDriver17.add((java.lang.Object) arrayListTestDriver28);
        java.lang.Object[] objArray35 = arrayListTestDriver17.toArray();
        boolean boolean36 = arrayListTestDriver11.add((java.lang.Object) objArray35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 10 + "'", obj16, (short) 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test141");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        boolean boolean10 = arrayListTestDriver5.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test142");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator9 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray11 = arrayListTestDriver10.toArray();
        java.lang.Object[] objArray12 = arrayListTestDriver10.toArray();
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean18 = arrayListTestDriver15.equals_CUT((java.lang.Object) 10);
        boolean boolean20 = arrayListTestDriver15.contains((java.lang.Object) true);
        boolean boolean21 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver15);
        experiment.util.ListIterator listIterator23 = arrayListTestDriver10.listIterator(0);
        boolean boolean25 = arrayListTestDriver10.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray27 = arrayListTestDriver26.toArray();
        boolean boolean29 = arrayListTestDriver26.equals_CUT((java.lang.Object) 10);
        boolean boolean30 = arrayListTestDriver26.isEmpty();
        boolean boolean31 = arrayListTestDriver10.contains((java.lang.Object) arrayListTestDriver26);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean34 = arrayListTestDriver32.remove((java.lang.Object) (byte) 10);
        boolean boolean36 = arrayListTestDriver32.remove((java.lang.Object) (short) 1);
        boolean boolean38 = arrayListTestDriver32.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray40 = arrayListTestDriver39.toArray();
        java.lang.Object[] objArray41 = arrayListTestDriver39.toArray();
        boolean boolean42 = arrayListTestDriver32.remove((java.lang.Object) arrayListTestDriver39);
        boolean boolean44 = arrayListTestDriver32.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver32.clear();
        java.lang.Object[] objArray46 = arrayListTestDriver32.toArray();
        boolean boolean47 = arrayListTestDriver26.add((java.lang.Object) objArray46);
        boolean boolean48 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator50 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test143");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (byte) 10);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator7 = arrayListTestDriver2.iterator();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver2.listIterator(1);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) listIterator9);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = arrayListTestDriver13.remove((java.lang.Object) (short) 1);
        boolean boolean19 = arrayListTestDriver13.add((java.lang.Object) "hi!");
        boolean boolean20 = arrayListTestDriver13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = arrayListTestDriver0.set((int) ' ', (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test144");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver0.remove(obj7);
        java.lang.Object[] objArray9 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test145");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        boolean boolean26 = arrayListTestDriver19.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = arrayListTestDriver27.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator32 = arrayListTestDriver27.iterator();
        boolean boolean33 = arrayListTestDriver19.equals_CUT((java.lang.Object) iterator32);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray35 = arrayListTestDriver34.toArray();
        boolean boolean36 = arrayListTestDriver19.contains((java.lang.Object) objArray35);
        arrayListTestDriver19.clear();
        arrayListTestDriver19.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        boolean boolean44 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver39);
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        boolean boolean47 = arrayListTestDriver45.remove((java.lang.Object) (byte) 10);
        boolean boolean49 = arrayListTestDriver45.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator50 = arrayListTestDriver45.iterator();
        experiment.util.ListIterator listIterator52 = arrayListTestDriver45.listIterator(1);
        boolean boolean53 = arrayListTestDriver39.equals_CUT((java.lang.Object) listIterator52);
        boolean boolean54 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean53);
        experiment.util.ArrayListTestDriver arrayListTestDriver55 = new experiment.util.ArrayListTestDriver();
        boolean boolean57 = arrayListTestDriver55.remove((java.lang.Object) (byte) 10);
        boolean boolean59 = arrayListTestDriver55.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator60 = arrayListTestDriver55.iterator();
        int int61 = arrayListTestDriver55.size();
        java.lang.Object[] objArray62 = arrayListTestDriver55.toArray();
        boolean boolean63 = arrayListTestDriver0.remove((java.lang.Object) objArray62);
        experiment.util.ArrayListTestDriver arrayListTestDriver64 = new experiment.util.ArrayListTestDriver();
        boolean boolean66 = arrayListTestDriver64.remove((java.lang.Object) (byte) 10);
        boolean boolean68 = arrayListTestDriver64.add((java.lang.Object) (-1.0d));
        boolean boolean70 = arrayListTestDriver64.contains((java.lang.Object) (short) 10);
        boolean boolean72 = arrayListTestDriver64.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator74 = arrayListTestDriver64.listIterator((int) (byte) 0);
        boolean boolean75 = arrayListTestDriver64.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver76 = new experiment.util.ArrayListTestDriver();
        boolean boolean78 = arrayListTestDriver76.remove((java.lang.Object) (byte) 10);
        boolean boolean80 = arrayListTestDriver76.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator81 = arrayListTestDriver76.iterator();
        experiment.util.Iterator iterator82 = arrayListTestDriver76.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver83 = new experiment.util.ArrayListTestDriver();
        boolean boolean85 = arrayListTestDriver83.remove((java.lang.Object) (byte) 10);
        boolean boolean87 = arrayListTestDriver83.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator88 = arrayListTestDriver83.iterator();
        int int89 = arrayListTestDriver83.size();
        java.lang.Object[] objArray90 = arrayListTestDriver83.toArray();
        boolean boolean91 = arrayListTestDriver76.equals_CUT((java.lang.Object) arrayListTestDriver83);
        boolean boolean92 = arrayListTestDriver64.remove((java.lang.Object) arrayListTestDriver76);
        boolean boolean93 = arrayListTestDriver0.remove((java.lang.Object) boolean92);
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(listIterator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(iterator88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test146");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        boolean boolean12 = arrayListTestDriver4.contains((java.lang.Object) (short) 100);
        arrayListTestDriver4.clear();
        java.lang.Object[] objArray14 = arrayListTestDriver4.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test147");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object[] objArray16 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[#]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test148");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver0.remove(obj7);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        int int11 = arrayListTestDriver10.size();
        int int12 = arrayListTestDriver10.size();
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        int int14 = arrayListTestDriver10.size();
        java.lang.Object[] objArray15 = arrayListTestDriver10.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver0.set((int) (short) 10, (java.lang.Object) objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test149");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator9 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray11 = arrayListTestDriver10.toArray();
        java.lang.Object[] objArray12 = arrayListTestDriver10.toArray();
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean18 = arrayListTestDriver15.equals_CUT((java.lang.Object) 10);
        boolean boolean20 = arrayListTestDriver15.contains((java.lang.Object) true);
        boolean boolean21 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver15);
        experiment.util.ListIterator listIterator23 = arrayListTestDriver10.listIterator(0);
        boolean boolean25 = arrayListTestDriver10.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray27 = arrayListTestDriver26.toArray();
        boolean boolean29 = arrayListTestDriver26.equals_CUT((java.lang.Object) 10);
        boolean boolean30 = arrayListTestDriver26.isEmpty();
        boolean boolean31 = arrayListTestDriver10.contains((java.lang.Object) arrayListTestDriver26);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean34 = arrayListTestDriver32.remove((java.lang.Object) (byte) 10);
        boolean boolean36 = arrayListTestDriver32.remove((java.lang.Object) (short) 1);
        boolean boolean38 = arrayListTestDriver32.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray40 = arrayListTestDriver39.toArray();
        java.lang.Object[] objArray41 = arrayListTestDriver39.toArray();
        boolean boolean42 = arrayListTestDriver32.remove((java.lang.Object) arrayListTestDriver39);
        boolean boolean44 = arrayListTestDriver32.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver32.clear();
        java.lang.Object[] objArray46 = arrayListTestDriver32.toArray();
        boolean boolean47 = arrayListTestDriver26.add((java.lang.Object) objArray46);
        boolean boolean48 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver26);
        experiment.util.ArrayListTestDriver arrayListTestDriver49 = new experiment.util.ArrayListTestDriver();
        boolean boolean51 = arrayListTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean53 = arrayListTestDriver49.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator54 = arrayListTestDriver49.iterator();
        experiment.util.Iterator iterator55 = arrayListTestDriver49.iterator();
        boolean boolean57 = arrayListTestDriver49.remove((java.lang.Object) (short) 1);
        boolean boolean58 = arrayListTestDriver49.isEmpty();
        int int59 = arrayListTestDriver49.size();
        boolean boolean60 = arrayListTestDriver26.equals_CUT((java.lang.Object) int59);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator62 = arrayListTestDriver26.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test150");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        int int6 = arrayListTestDriver0.size();
        int int7 = arrayListTestDriver0.size();
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test151");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(listIterator10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test152");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = arrayListTestDriver4.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        boolean boolean11 = arrayListTestDriver4.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        boolean boolean18 = arrayListTestDriver4.equals_CUT((java.lang.Object) iterator17);
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray20 = arrayListTestDriver19.toArray();
        boolean boolean21 = arrayListTestDriver4.contains((java.lang.Object) objArray20);
        arrayListTestDriver4.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        boolean boolean25 = arrayListTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean27 = arrayListTestDriver23.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator28 = arrayListTestDriver23.iterator();
        boolean boolean30 = arrayListTestDriver23.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        boolean boolean33 = arrayListTestDriver31.remove((java.lang.Object) (byte) 10);
        boolean boolean35 = arrayListTestDriver31.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator36 = arrayListTestDriver31.iterator();
        boolean boolean37 = arrayListTestDriver23.equals_CUT((java.lang.Object) iterator36);
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray39 = arrayListTestDriver38.toArray();
        boolean boolean40 = arrayListTestDriver23.contains((java.lang.Object) objArray39);
        arrayListTestDriver23.clear();
        arrayListTestDriver23.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver43 = new experiment.util.ArrayListTestDriver();
        boolean boolean45 = arrayListTestDriver43.remove((java.lang.Object) (byte) 10);
        boolean boolean47 = arrayListTestDriver43.add((java.lang.Object) (-1.0d));
        boolean boolean48 = arrayListTestDriver23.equals_CUT((java.lang.Object) arrayListTestDriver43);
        experiment.util.ArrayListTestDriver arrayListTestDriver49 = new experiment.util.ArrayListTestDriver();
        boolean boolean51 = arrayListTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean53 = arrayListTestDriver49.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator54 = arrayListTestDriver49.iterator();
        experiment.util.ListIterator listIterator56 = arrayListTestDriver49.listIterator(1);
        boolean boolean57 = arrayListTestDriver43.equals_CUT((java.lang.Object) listIterator56);
        boolean boolean58 = arrayListTestDriver4.equals_CUT((java.lang.Object) boolean57);
        experiment.util.ArrayListTestDriver arrayListTestDriver59 = new experiment.util.ArrayListTestDriver();
        boolean boolean61 = arrayListTestDriver59.remove((java.lang.Object) (byte) 10);
        boolean boolean63 = arrayListTestDriver59.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator64 = arrayListTestDriver59.iterator();
        int int65 = arrayListTestDriver59.size();
        java.lang.Object[] objArray66 = arrayListTestDriver59.toArray();
        boolean boolean67 = arrayListTestDriver4.remove((java.lang.Object) objArray66);
        boolean boolean68 = arrayListTestDriver0.add((java.lang.Object) boolean67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(listIterator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test153");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) true);
        int int6 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test154");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test155");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = arrayListTestDriver11.toArray();
        arrayListTestDriver11.clear();
        java.lang.Object obj16 = arrayListTestDriver5.set((int) (byte) 0, (java.lang.Object) arrayListTestDriver11);
        java.lang.Object[] objArray17 = arrayListTestDriver11.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 10 + "'", obj16, (short) 10);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test156");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        boolean boolean19 = arrayListTestDriver12.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = arrayListTestDriver20.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator25 = arrayListTestDriver20.iterator();
        boolean boolean26 = arrayListTestDriver12.equals_CUT((java.lang.Object) iterator25);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray28 = arrayListTestDriver27.toArray();
        boolean boolean29 = arrayListTestDriver12.contains((java.lang.Object) objArray28);
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        boolean boolean33 = arrayListTestDriver31.remove((java.lang.Object) (byte) 10);
        boolean boolean35 = arrayListTestDriver31.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator36 = arrayListTestDriver31.iterator();
        boolean boolean38 = arrayListTestDriver31.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator44 = arrayListTestDriver39.iterator();
        boolean boolean45 = arrayListTestDriver31.equals_CUT((java.lang.Object) iterator44);
        experiment.util.ArrayListTestDriver arrayListTestDriver46 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray47 = arrayListTestDriver46.toArray();
        boolean boolean48 = arrayListTestDriver31.contains((java.lang.Object) objArray47);
        arrayListTestDriver31.clear();
        arrayListTestDriver31.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver51 = new experiment.util.ArrayListTestDriver();
        boolean boolean53 = arrayListTestDriver51.remove((java.lang.Object) (byte) 10);
        boolean boolean55 = arrayListTestDriver51.add((java.lang.Object) (-1.0d));
        boolean boolean56 = arrayListTestDriver31.equals_CUT((java.lang.Object) arrayListTestDriver51);
        experiment.util.ArrayListTestDriver arrayListTestDriver57 = new experiment.util.ArrayListTestDriver();
        boolean boolean59 = arrayListTestDriver57.remove((java.lang.Object) (byte) 10);
        boolean boolean61 = arrayListTestDriver57.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator62 = arrayListTestDriver57.iterator();
        experiment.util.ListIterator listIterator64 = arrayListTestDriver57.listIterator(1);
        boolean boolean65 = arrayListTestDriver51.equals_CUT((java.lang.Object) listIterator64);
        boolean boolean66 = arrayListTestDriver12.equals_CUT((java.lang.Object) boolean65);
        boolean boolean67 = arrayListTestDriver0.remove((java.lang.Object) boolean66);
        java.lang.Object obj69 = arrayListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator71 = arrayListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(listIterator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + '#' + "'", obj69, '#');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test157");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test158");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test159");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray13 = arrayListTestDriver12.toArray();
        boolean boolean15 = arrayListTestDriver12.equals_CUT((java.lang.Object) 10);
        boolean boolean17 = arrayListTestDriver12.contains((java.lang.Object) true);
        int int18 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        boolean boolean26 = arrayListTestDriver19.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = arrayListTestDriver27.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator32 = arrayListTestDriver27.iterator();
        boolean boolean33 = arrayListTestDriver19.equals_CUT((java.lang.Object) iterator32);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray35 = arrayListTestDriver34.toArray();
        boolean boolean36 = arrayListTestDriver19.contains((java.lang.Object) objArray35);
        arrayListTestDriver19.clear();
        arrayListTestDriver19.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        boolean boolean44 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver39);
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        boolean boolean47 = arrayListTestDriver45.remove((java.lang.Object) (byte) 10);
        boolean boolean49 = arrayListTestDriver45.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator50 = arrayListTestDriver45.iterator();
        experiment.util.ListIterator listIterator52 = arrayListTestDriver45.listIterator(1);
        boolean boolean53 = arrayListTestDriver39.equals_CUT((java.lang.Object) listIterator52);
        boolean boolean54 = arrayListTestDriver12.add((java.lang.Object) listIterator52);
        boolean boolean55 = arrayListTestDriver5.contains((java.lang.Object) boolean54);
        boolean boolean56 = arrayListTestDriver5.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test160");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver8);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = arrayListTestDriver0.equals_CUT(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test161");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator9 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray11 = arrayListTestDriver10.toArray();
        java.lang.Object[] objArray12 = arrayListTestDriver10.toArray();
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean18 = arrayListTestDriver15.equals_CUT((java.lang.Object) 10);
        boolean boolean20 = arrayListTestDriver15.contains((java.lang.Object) true);
        boolean boolean21 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver15);
        experiment.util.ListIterator listIterator23 = arrayListTestDriver10.listIterator(0);
        boolean boolean25 = arrayListTestDriver10.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray27 = arrayListTestDriver26.toArray();
        boolean boolean29 = arrayListTestDriver26.equals_CUT((java.lang.Object) 10);
        boolean boolean30 = arrayListTestDriver26.isEmpty();
        boolean boolean31 = arrayListTestDriver10.contains((java.lang.Object) arrayListTestDriver26);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean34 = arrayListTestDriver32.remove((java.lang.Object) (byte) 10);
        boolean boolean36 = arrayListTestDriver32.remove((java.lang.Object) (short) 1);
        boolean boolean38 = arrayListTestDriver32.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray40 = arrayListTestDriver39.toArray();
        java.lang.Object[] objArray41 = arrayListTestDriver39.toArray();
        boolean boolean42 = arrayListTestDriver32.remove((java.lang.Object) arrayListTestDriver39);
        boolean boolean44 = arrayListTestDriver32.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver32.clear();
        java.lang.Object[] objArray46 = arrayListTestDriver32.toArray();
        boolean boolean47 = arrayListTestDriver26.add((java.lang.Object) objArray46);
        boolean boolean48 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver26);
        int int49 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator51 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test162");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean8 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test163");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator11 = arrayListTestDriver6.iterator();
        experiment.util.Iterator iterator12 = arrayListTestDriver6.iterator();
        java.lang.Object obj14 = arrayListTestDriver6.get((int) (short) 0);
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver6);
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test164");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray9 = arrayListTestDriver8.toArray();
        boolean boolean11 = arrayListTestDriver8.equals_CUT((java.lang.Object) 10);
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver8);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean18 = arrayListTestDriver14.isEmpty();
        boolean boolean19 = arrayListTestDriver8.contains((java.lang.Object) arrayListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = arrayListTestDriver14.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test165");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        boolean boolean19 = arrayListTestDriver12.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = arrayListTestDriver20.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator25 = arrayListTestDriver20.iterator();
        boolean boolean26 = arrayListTestDriver12.equals_CUT((java.lang.Object) iterator25);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray28 = arrayListTestDriver27.toArray();
        boolean boolean29 = arrayListTestDriver12.contains((java.lang.Object) objArray28);
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        boolean boolean33 = arrayListTestDriver31.remove((java.lang.Object) (byte) 10);
        boolean boolean35 = arrayListTestDriver31.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator36 = arrayListTestDriver31.iterator();
        boolean boolean38 = arrayListTestDriver31.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator44 = arrayListTestDriver39.iterator();
        boolean boolean45 = arrayListTestDriver31.equals_CUT((java.lang.Object) iterator44);
        experiment.util.ArrayListTestDriver arrayListTestDriver46 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray47 = arrayListTestDriver46.toArray();
        boolean boolean48 = arrayListTestDriver31.contains((java.lang.Object) objArray47);
        arrayListTestDriver31.clear();
        arrayListTestDriver31.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver51 = new experiment.util.ArrayListTestDriver();
        boolean boolean53 = arrayListTestDriver51.remove((java.lang.Object) (byte) 10);
        boolean boolean55 = arrayListTestDriver51.add((java.lang.Object) (-1.0d));
        boolean boolean56 = arrayListTestDriver31.equals_CUT((java.lang.Object) arrayListTestDriver51);
        experiment.util.ArrayListTestDriver arrayListTestDriver57 = new experiment.util.ArrayListTestDriver();
        boolean boolean59 = arrayListTestDriver57.remove((java.lang.Object) (byte) 10);
        boolean boolean61 = arrayListTestDriver57.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator62 = arrayListTestDriver57.iterator();
        experiment.util.ListIterator listIterator64 = arrayListTestDriver57.listIterator(1);
        boolean boolean65 = arrayListTestDriver51.equals_CUT((java.lang.Object) listIterator64);
        boolean boolean66 = arrayListTestDriver12.equals_CUT((java.lang.Object) boolean65);
        boolean boolean67 = arrayListTestDriver0.remove((java.lang.Object) boolean66);
        java.lang.Object obj69 = arrayListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator71 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNotNull(listIterator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + '#' + "'", obj69, '#');
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test166");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (short) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 10);
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test167");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        boolean boolean25 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = arrayListTestDriver26.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator31 = arrayListTestDriver26.iterator();
        boolean boolean33 = arrayListTestDriver26.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray35 = arrayListTestDriver34.toArray();
        boolean boolean37 = arrayListTestDriver34.equals_CUT((java.lang.Object) 10);
        boolean boolean38 = arrayListTestDriver34.isEmpty();
        boolean boolean39 = arrayListTestDriver26.remove((java.lang.Object) arrayListTestDriver34);
        java.lang.Class<?> wildcardClass40 = arrayListTestDriver34.getClass();
        boolean boolean41 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test168");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = arrayListTestDriver0.contains(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test169");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = arrayListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test170");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean11 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        int int25 = arrayListTestDriver19.size();
        java.lang.Object[] objArray26 = arrayListTestDriver19.toArray();
        boolean boolean27 = arrayListTestDriver12.equals_CUT((java.lang.Object) arrayListTestDriver19);
        boolean boolean28 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver12);
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean32 = arrayListTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = arrayListTestDriver30.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator35 = arrayListTestDriver30.iterator();
        experiment.util.Iterator iterator36 = arrayListTestDriver30.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver37 = new experiment.util.ArrayListTestDriver();
        boolean boolean39 = arrayListTestDriver37.remove((java.lang.Object) (byte) 10);
        boolean boolean41 = arrayListTestDriver37.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator42 = arrayListTestDriver37.iterator();
        experiment.util.ListIterator listIterator44 = arrayListTestDriver37.listIterator(1);
        java.lang.Class<?> wildcardClass45 = listIterator44.getClass();
        boolean boolean46 = arrayListTestDriver30.contains((java.lang.Object) wildcardClass45);
        experiment.util.Iterator iterator47 = arrayListTestDriver30.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = arrayListTestDriver12.set(1, (java.lang.Object) arrayListTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(listIterator44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test171");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = arrayListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test172");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        java.lang.Object[] objArray18 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = arrayListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test173");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        int int4 = arrayListTestDriver0.size();
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test174");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        java.lang.Object obj8 = arrayListTestDriver0.get((int) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray10 = arrayListTestDriver9.toArray();
        java.lang.Object[] objArray11 = arrayListTestDriver9.toArray();
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean19 = arrayListTestDriver14.contains((java.lang.Object) true);
        boolean boolean20 = arrayListTestDriver9.equals_CUT((java.lang.Object) arrayListTestDriver14);
        experiment.util.ListIterator listIterator22 = arrayListTestDriver9.listIterator(0);
        boolean boolean23 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver9);
        int int24 = arrayListTestDriver9.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray26 = arrayListTestDriver25.toArray();
        java.lang.Object[] objArray27 = arrayListTestDriver25.toArray();
        boolean boolean29 = arrayListTestDriver25.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray31 = arrayListTestDriver30.toArray();
        boolean boolean33 = arrayListTestDriver30.equals_CUT((java.lang.Object) 10);
        boolean boolean35 = arrayListTestDriver30.contains((java.lang.Object) true);
        boolean boolean36 = arrayListTestDriver25.equals_CUT((java.lang.Object) arrayListTestDriver30);
        boolean boolean37 = arrayListTestDriver9.add((java.lang.Object) boolean36);
        experiment.util.Iterator iterator38 = arrayListTestDriver9.iterator();
        java.lang.Class<?> wildcardClass39 = iterator38.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test175");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.remove((java.lang.Object) (short) 1);
        boolean boolean12 = arrayListTestDriver0.add((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = arrayListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test176");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator26 = arrayListTestDriver0.iterator();
        boolean boolean28 = arrayListTestDriver0.equals_CUT((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray30 = arrayListTestDriver29.toArray();
        java.lang.Object[] objArray31 = arrayListTestDriver29.toArray();
        boolean boolean33 = arrayListTestDriver29.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray35 = arrayListTestDriver34.toArray();
        boolean boolean37 = arrayListTestDriver34.equals_CUT((java.lang.Object) 10);
        boolean boolean39 = arrayListTestDriver34.contains((java.lang.Object) true);
        boolean boolean40 = arrayListTestDriver29.equals_CUT((java.lang.Object) arrayListTestDriver34);
        experiment.util.ArrayListTestDriver arrayListTestDriver41 = new experiment.util.ArrayListTestDriver();
        boolean boolean43 = arrayListTestDriver41.remove((java.lang.Object) (byte) 10);
        boolean boolean45 = arrayListTestDriver41.add((java.lang.Object) (-1.0d));
        boolean boolean47 = arrayListTestDriver41.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver48 = new experiment.util.ArrayListTestDriver();
        boolean boolean50 = arrayListTestDriver48.remove((java.lang.Object) (byte) 10);
        boolean boolean52 = arrayListTestDriver48.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator53 = arrayListTestDriver48.iterator();
        experiment.util.Iterator iterator54 = arrayListTestDriver48.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver55 = new experiment.util.ArrayListTestDriver();
        boolean boolean57 = arrayListTestDriver55.remove((java.lang.Object) (byte) 10);
        boolean boolean59 = arrayListTestDriver55.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator60 = arrayListTestDriver55.iterator();
        experiment.util.ListIterator listIterator62 = arrayListTestDriver55.listIterator(1);
        java.lang.Class<?> wildcardClass63 = listIterator62.getClass();
        boolean boolean64 = arrayListTestDriver48.contains((java.lang.Object) wildcardClass63);
        boolean boolean65 = arrayListTestDriver41.remove((java.lang.Object) boolean64);
        java.lang.Object[] objArray66 = arrayListTestDriver41.toArray();
        boolean boolean67 = arrayListTestDriver29.contains((java.lang.Object) objArray66);
        boolean boolean68 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(listIterator62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test177");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        int int13 = arrayListTestDriver0.size();
        int int14 = arrayListTestDriver0.size();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = arrayListTestDriver0.equals_CUT(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test178");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver14.listIterator(1);
        java.lang.Class<?> wildcardClass22 = listIterator21.getClass();
        boolean boolean23 = arrayListTestDriver7.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator26 = arrayListTestDriver0.iterator();
        int int27 = arrayListTestDriver0.size();
        int int28 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test179");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test180");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test181");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        int int4 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test182");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        java.lang.Object[] objArray7 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test183");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator(1);
        java.lang.Class<?> wildcardClass15 = listIterator14.getClass();
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass15);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        boolean boolean20 = arrayListTestDriver17.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray26 = arrayListTestDriver21.toArray();
        boolean boolean27 = arrayListTestDriver17.equals_CUT((java.lang.Object) arrayListTestDriver21);
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = arrayListTestDriver28.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator33 = arrayListTestDriver28.iterator();
        boolean boolean34 = arrayListTestDriver17.add((java.lang.Object) iterator33);
        boolean boolean35 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver17);
        experiment.util.ListIterator listIterator37 = arrayListTestDriver0.listIterator((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = arrayListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(listIterator37);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test184");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator(1);
        java.lang.Class<?> wildcardClass15 = listIterator14.getClass();
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass15);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        boolean boolean20 = arrayListTestDriver17.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray26 = arrayListTestDriver21.toArray();
        boolean boolean27 = arrayListTestDriver17.equals_CUT((java.lang.Object) arrayListTestDriver21);
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = arrayListTestDriver28.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator33 = arrayListTestDriver28.iterator();
        boolean boolean34 = arrayListTestDriver17.add((java.lang.Object) iterator33);
        boolean boolean35 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver17);
        experiment.util.ListIterator listIterator37 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        boolean boolean40 = arrayListTestDriver38.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = arrayListTestDriver38.remove((java.lang.Object) (short) 1);
        boolean boolean44 = arrayListTestDriver38.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray46 = arrayListTestDriver45.toArray();
        java.lang.Object[] objArray47 = arrayListTestDriver45.toArray();
        boolean boolean48 = arrayListTestDriver38.remove((java.lang.Object) arrayListTestDriver45);
        arrayListTestDriver45.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver50 = new experiment.util.ArrayListTestDriver();
        boolean boolean52 = arrayListTestDriver50.remove((java.lang.Object) (byte) 10);
        boolean boolean54 = arrayListTestDriver50.remove((java.lang.Object) (short) 1);
        int int55 = arrayListTestDriver50.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver56 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray57 = arrayListTestDriver56.toArray();
        java.lang.Object[] objArray58 = arrayListTestDriver56.toArray();
        boolean boolean60 = arrayListTestDriver56.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver61 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray62 = arrayListTestDriver61.toArray();
        boolean boolean64 = arrayListTestDriver61.equals_CUT((java.lang.Object) 10);
        boolean boolean66 = arrayListTestDriver61.contains((java.lang.Object) true);
        boolean boolean67 = arrayListTestDriver56.equals_CUT((java.lang.Object) arrayListTestDriver61);
        boolean boolean68 = arrayListTestDriver50.add((java.lang.Object) arrayListTestDriver56);
        boolean boolean69 = arrayListTestDriver45.equals_CUT((java.lang.Object) arrayListTestDriver50);
        experiment.util.ListIterator listIterator71 = arrayListTestDriver45.listIterator(0);
        boolean boolean72 = arrayListTestDriver0.add((java.lang.Object) 0);
        boolean boolean73 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(listIterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(listIterator71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test185");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator(1);
        int int8 = arrayListTestDriver0.size();
        java.lang.Object[] objArray9 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray11 = arrayListTestDriver10.toArray();
        boolean boolean13 = arrayListTestDriver10.equals_CUT((java.lang.Object) 10);
        boolean boolean14 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        java.lang.Object[] objArray17 = arrayListTestDriver15.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator23 = arrayListTestDriver18.iterator();
        experiment.util.ListIterator listIterator25 = arrayListTestDriver18.listIterator(1);
        boolean boolean26 = arrayListTestDriver15.contains((java.lang.Object) listIterator25);
        java.lang.Class<?> wildcardClass27 = listIterator25.getClass();
        boolean boolean28 = arrayListTestDriver10.add((java.lang.Object) listIterator25);
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver29.remove((java.lang.Object) (byte) 10);
        boolean boolean33 = arrayListTestDriver29.remove((java.lang.Object) (short) 1);
        boolean boolean35 = arrayListTestDriver29.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray37 = arrayListTestDriver36.toArray();
        java.lang.Object[] objArray38 = arrayListTestDriver36.toArray();
        boolean boolean39 = arrayListTestDriver29.remove((java.lang.Object) arrayListTestDriver36);
        boolean boolean40 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver36);
        boolean boolean41 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test186");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean11 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.add((java.lang.Object) (short) 10);
        java.lang.Object[] objArray15 = arrayListTestDriver12.toArray();
        boolean boolean16 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test187");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.remove((java.lang.Object) (short) 1);
        boolean boolean14 = arrayListTestDriver8.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        java.lang.Object[] objArray17 = arrayListTestDriver15.toArray();
        boolean boolean18 = arrayListTestDriver8.remove((java.lang.Object) arrayListTestDriver15);
        arrayListTestDriver15.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = arrayListTestDriver20.remove((java.lang.Object) (short) 1);
        int int25 = arrayListTestDriver20.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray27 = arrayListTestDriver26.toArray();
        java.lang.Object[] objArray28 = arrayListTestDriver26.toArray();
        boolean boolean30 = arrayListTestDriver26.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray32 = arrayListTestDriver31.toArray();
        boolean boolean34 = arrayListTestDriver31.equals_CUT((java.lang.Object) 10);
        boolean boolean36 = arrayListTestDriver31.contains((java.lang.Object) true);
        boolean boolean37 = arrayListTestDriver26.equals_CUT((java.lang.Object) arrayListTestDriver31);
        boolean boolean38 = arrayListTestDriver20.add((java.lang.Object) arrayListTestDriver26);
        boolean boolean39 = arrayListTestDriver15.equals_CUT((java.lang.Object) arrayListTestDriver20);
        boolean boolean40 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver15);
        experiment.util.ArrayListTestDriver arrayListTestDriver41 = new experiment.util.ArrayListTestDriver();
        boolean boolean43 = arrayListTestDriver41.remove((java.lang.Object) (byte) 10);
        boolean boolean45 = arrayListTestDriver41.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator46 = arrayListTestDriver41.iterator();
        boolean boolean48 = arrayListTestDriver41.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver49 = new experiment.util.ArrayListTestDriver();
        boolean boolean51 = arrayListTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean53 = arrayListTestDriver49.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator54 = arrayListTestDriver49.iterator();
        boolean boolean55 = arrayListTestDriver41.equals_CUT((java.lang.Object) iterator54);
        experiment.util.ArrayListTestDriver arrayListTestDriver56 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray57 = arrayListTestDriver56.toArray();
        boolean boolean58 = arrayListTestDriver41.contains((java.lang.Object) objArray57);
        arrayListTestDriver41.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver60 = new experiment.util.ArrayListTestDriver();
        boolean boolean62 = arrayListTestDriver60.remove((java.lang.Object) (byte) 10);
        boolean boolean64 = arrayListTestDriver60.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator65 = arrayListTestDriver60.iterator();
        boolean boolean67 = arrayListTestDriver60.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver68 = new experiment.util.ArrayListTestDriver();
        boolean boolean70 = arrayListTestDriver68.remove((java.lang.Object) (byte) 10);
        boolean boolean72 = arrayListTestDriver68.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator73 = arrayListTestDriver68.iterator();
        boolean boolean74 = arrayListTestDriver60.equals_CUT((java.lang.Object) iterator73);
        experiment.util.ArrayListTestDriver arrayListTestDriver75 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray76 = arrayListTestDriver75.toArray();
        boolean boolean77 = arrayListTestDriver60.contains((java.lang.Object) objArray76);
        arrayListTestDriver60.clear();
        arrayListTestDriver60.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver80 = new experiment.util.ArrayListTestDriver();
        boolean boolean82 = arrayListTestDriver80.remove((java.lang.Object) (byte) 10);
        boolean boolean84 = arrayListTestDriver80.add((java.lang.Object) (-1.0d));
        boolean boolean85 = arrayListTestDriver60.equals_CUT((java.lang.Object) arrayListTestDriver80);
        experiment.util.ArrayListTestDriver arrayListTestDriver86 = new experiment.util.ArrayListTestDriver();
        boolean boolean88 = arrayListTestDriver86.remove((java.lang.Object) (byte) 10);
        boolean boolean90 = arrayListTestDriver86.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator91 = arrayListTestDriver86.iterator();
        experiment.util.ListIterator listIterator93 = arrayListTestDriver86.listIterator(1);
        boolean boolean94 = arrayListTestDriver80.equals_CUT((java.lang.Object) listIterator93);
        boolean boolean95 = arrayListTestDriver41.equals_CUT((java.lang.Object) boolean94);
        arrayListTestDriver41.clear();
        boolean boolean97 = arrayListTestDriver15.equals_CUT((java.lang.Object) arrayListTestDriver41);
        java.lang.Class<?> wildcardClass98 = arrayListTestDriver41.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(iterator91);
        org.junit.Assert.assertNotNull(listIterator93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test188");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = arrayListTestDriver10.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator15 = arrayListTestDriver10.iterator();
        experiment.util.Iterator iterator16 = arrayListTestDriver10.iterator();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) iterator16);
        experiment.util.ListIterator listIterator19 = arrayListTestDriver5.listIterator((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(listIterator19);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test189");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray9 = arrayListTestDriver8.toArray();
        boolean boolean11 = arrayListTestDriver8.equals_CUT((java.lang.Object) 10);
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver8);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean18 = arrayListTestDriver14.isEmpty();
        boolean boolean19 = arrayListTestDriver8.contains((java.lang.Object) arrayListTestDriver14);
        arrayListTestDriver14.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.remove((java.lang.Object) (short) 1);
        boolean boolean28 = arrayListTestDriver22.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray30 = arrayListTestDriver29.toArray();
        java.lang.Object[] objArray31 = arrayListTestDriver29.toArray();
        boolean boolean32 = arrayListTestDriver22.remove((java.lang.Object) arrayListTestDriver29);
        boolean boolean34 = arrayListTestDriver22.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver22.clear();
        java.lang.Object[] objArray36 = arrayListTestDriver22.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = arrayListTestDriver14.set((int) '4', (java.lang.Object) arrayListTestDriver22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test190");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = arrayListTestDriver5.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator10 = arrayListTestDriver5.iterator();
        experiment.util.ListIterator listIterator12 = arrayListTestDriver5.listIterator(1);
        boolean boolean13 = arrayListTestDriver0.contains((java.lang.Object) listIterator12);
        int int14 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test191");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (byte) 10);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator7 = arrayListTestDriver2.iterator();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver2.listIterator(1);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) listIterator9);
        java.lang.Object obj12 = arrayListTestDriver0.get(0);
        experiment.util.Iterator iterator13 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean17 = arrayListTestDriver15.remove((java.lang.Object) (byte) 10);
        boolean boolean19 = arrayListTestDriver15.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator20 = arrayListTestDriver15.iterator();
        experiment.util.Iterator iterator21 = arrayListTestDriver15.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver22.iterator();
        experiment.util.ListIterator listIterator29 = arrayListTestDriver22.listIterator(1);
        java.lang.Class<?> wildcardClass30 = listIterator29.getClass();
        boolean boolean31 = arrayListTestDriver15.contains((java.lang.Object) wildcardClass30);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        int int33 = arrayListTestDriver32.size();
        boolean boolean35 = arrayListTestDriver32.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        boolean boolean38 = arrayListTestDriver36.remove((java.lang.Object) (byte) 10);
        boolean boolean40 = arrayListTestDriver36.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray41 = arrayListTestDriver36.toArray();
        boolean boolean42 = arrayListTestDriver32.equals_CUT((java.lang.Object) arrayListTestDriver36);
        experiment.util.ArrayListTestDriver arrayListTestDriver43 = new experiment.util.ArrayListTestDriver();
        boolean boolean45 = arrayListTestDriver43.remove((java.lang.Object) (byte) 10);
        boolean boolean47 = arrayListTestDriver43.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator48 = arrayListTestDriver43.iterator();
        boolean boolean49 = arrayListTestDriver32.add((java.lang.Object) iterator48);
        boolean boolean50 = arrayListTestDriver15.contains((java.lang.Object) arrayListTestDriver32);
        experiment.util.ListIterator listIterator52 = arrayListTestDriver15.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver53 = new experiment.util.ArrayListTestDriver();
        boolean boolean55 = arrayListTestDriver53.remove((java.lang.Object) (byte) 10);
        boolean boolean57 = arrayListTestDriver53.remove((java.lang.Object) (short) 1);
        boolean boolean59 = arrayListTestDriver53.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver60 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray61 = arrayListTestDriver60.toArray();
        java.lang.Object[] objArray62 = arrayListTestDriver60.toArray();
        boolean boolean63 = arrayListTestDriver53.remove((java.lang.Object) arrayListTestDriver60);
        arrayListTestDriver60.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver65 = new experiment.util.ArrayListTestDriver();
        boolean boolean67 = arrayListTestDriver65.remove((java.lang.Object) (byte) 10);
        boolean boolean69 = arrayListTestDriver65.remove((java.lang.Object) (short) 1);
        int int70 = arrayListTestDriver65.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver71 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray72 = arrayListTestDriver71.toArray();
        java.lang.Object[] objArray73 = arrayListTestDriver71.toArray();
        boolean boolean75 = arrayListTestDriver71.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver76 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray77 = arrayListTestDriver76.toArray();
        boolean boolean79 = arrayListTestDriver76.equals_CUT((java.lang.Object) 10);
        boolean boolean81 = arrayListTestDriver76.contains((java.lang.Object) true);
        boolean boolean82 = arrayListTestDriver71.equals_CUT((java.lang.Object) arrayListTestDriver76);
        boolean boolean83 = arrayListTestDriver65.add((java.lang.Object) arrayListTestDriver71);
        boolean boolean84 = arrayListTestDriver60.equals_CUT((java.lang.Object) arrayListTestDriver65);
        experiment.util.ListIterator listIterator86 = arrayListTestDriver60.listIterator(0);
        boolean boolean87 = arrayListTestDriver15.add((java.lang.Object) 0);
        boolean boolean88 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver15);
        boolean boolean89 = arrayListTestDriver15.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(listIterator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test192");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = listIterator5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(listIterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test193");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = arrayListTestDriver5.remove((java.lang.Object) (short) 1);
        int int10 = arrayListTestDriver5.size();
        boolean boolean11 = arrayListTestDriver5.isEmpty();
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test194");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        int int16 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.remove((java.lang.Object) (byte) 10);
        boolean boolean21 = arrayListTestDriver17.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator22 = arrayListTestDriver17.iterator();
        boolean boolean23 = arrayListTestDriver17.isEmpty();
        boolean boolean24 = arrayListTestDriver17.isEmpty();
        boolean boolean25 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test195");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        int int4 = arrayListTestDriver0.size();
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray6 = arrayListTestDriver0.toArray();
        int int7 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = arrayListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test196");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        int int3 = arrayListTestDriver0.size();
        arrayListTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test197");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator(1);
        int int8 = arrayListTestDriver0.size();
        java.lang.Object[] objArray9 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test198");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray9 = arrayListTestDriver8.toArray();
        boolean boolean11 = arrayListTestDriver8.equals_CUT((java.lang.Object) 10);
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver8);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean18 = arrayListTestDriver14.isEmpty();
        boolean boolean19 = arrayListTestDriver8.contains((java.lang.Object) arrayListTestDriver14);
        int int20 = arrayListTestDriver14.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = arrayListTestDriver14.set(0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test199");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean15 = arrayListTestDriver11.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator16 = arrayListTestDriver11.iterator();
        experiment.util.ListIterator listIterator18 = arrayListTestDriver11.listIterator(1);
        java.lang.Class<?> wildcardClass19 = listIterator18.getClass();
        boolean boolean20 = arrayListTestDriver4.contains((java.lang.Object) wildcardClass19);
        boolean boolean22 = arrayListTestDriver4.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator23 = arrayListTestDriver4.iterator();
        boolean boolean24 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray26 = arrayListTestDriver25.toArray();
        java.lang.Object[] objArray27 = arrayListTestDriver25.toArray();
        boolean boolean29 = arrayListTestDriver25.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray31 = arrayListTestDriver30.toArray();
        boolean boolean33 = arrayListTestDriver30.equals_CUT((java.lang.Object) 10);
        boolean boolean35 = arrayListTestDriver30.contains((java.lang.Object) true);
        boolean boolean36 = arrayListTestDriver25.equals_CUT((java.lang.Object) arrayListTestDriver30);
        experiment.util.ListIterator listIterator38 = arrayListTestDriver25.listIterator(0);
        boolean boolean40 = arrayListTestDriver25.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver41 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray42 = arrayListTestDriver41.toArray();
        boolean boolean44 = arrayListTestDriver41.equals_CUT((java.lang.Object) 10);
        boolean boolean45 = arrayListTestDriver41.isEmpty();
        boolean boolean46 = arrayListTestDriver25.contains((java.lang.Object) arrayListTestDriver41);
        boolean boolean47 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = arrayListTestDriver4.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(listIterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(listIterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test200");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray20 = arrayListTestDriver19.toArray();
        java.lang.Object[] objArray21 = arrayListTestDriver19.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver22.iterator();
        experiment.util.ListIterator listIterator29 = arrayListTestDriver22.listIterator(1);
        boolean boolean30 = arrayListTestDriver19.contains((java.lang.Object) listIterator29);
        boolean boolean31 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver19);
        int int32 = arrayListTestDriver0.size();
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test201");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator11 = arrayListTestDriver6.iterator();
        experiment.util.Iterator iterator12 = arrayListTestDriver6.iterator();
        java.lang.Object obj14 = arrayListTestDriver6.get((int) (short) 0);
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver6);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray18 = arrayListTestDriver17.toArray();
        java.lang.Object[] objArray19 = arrayListTestDriver17.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = arrayListTestDriver20.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator25 = arrayListTestDriver20.iterator();
        experiment.util.ListIterator listIterator27 = arrayListTestDriver20.listIterator(1);
        boolean boolean28 = arrayListTestDriver17.contains((java.lang.Object) listIterator27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = arrayListTestDriver0.set((int) (byte) -1, (java.lang.Object) listIterator27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(listIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test202");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        arrayListTestDriver7.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        int int17 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray19 = arrayListTestDriver18.toArray();
        java.lang.Object[] objArray20 = arrayListTestDriver18.toArray();
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray24 = arrayListTestDriver23.toArray();
        boolean boolean26 = arrayListTestDriver23.equals_CUT((java.lang.Object) 10);
        boolean boolean28 = arrayListTestDriver23.contains((java.lang.Object) true);
        boolean boolean29 = arrayListTestDriver18.equals_CUT((java.lang.Object) arrayListTestDriver23);
        boolean boolean30 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver18);
        boolean boolean31 = arrayListTestDriver7.equals_CUT((java.lang.Object) arrayListTestDriver12);
        java.lang.Object[] objArray32 = arrayListTestDriver12.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test203");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        int int8 = arrayListTestDriver7.size();
        int int9 = arrayListTestDriver7.size();
        boolean boolean10 = arrayListTestDriver7.isEmpty();
        boolean boolean11 = arrayListTestDriver7.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        int int25 = arrayListTestDriver19.size();
        java.lang.Object[] objArray26 = arrayListTestDriver19.toArray();
        boolean boolean27 = arrayListTestDriver12.equals_CUT((java.lang.Object) arrayListTestDriver19);
        boolean boolean28 = arrayListTestDriver7.add((java.lang.Object) arrayListTestDriver19);
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver29.add((java.lang.Object) (short) 10);
        experiment.util.Iterator iterator32 = arrayListTestDriver29.iterator();
        boolean boolean33 = arrayListTestDriver29.isEmpty();
        boolean boolean34 = arrayListTestDriver7.add((java.lang.Object) arrayListTestDriver29);
        boolean boolean35 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test204");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray20 = arrayListTestDriver19.toArray();
        java.lang.Object[] objArray21 = arrayListTestDriver19.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver22.iterator();
        experiment.util.ListIterator listIterator29 = arrayListTestDriver22.listIterator(1);
        boolean boolean30 = arrayListTestDriver19.contains((java.lang.Object) listIterator29);
        boolean boolean31 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver19);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean34 = arrayListTestDriver32.remove((java.lang.Object) (byte) 10);
        boolean boolean36 = arrayListTestDriver32.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator37 = arrayListTestDriver32.iterator();
        experiment.util.Iterator iterator38 = arrayListTestDriver32.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator44 = arrayListTestDriver39.iterator();
        experiment.util.ListIterator listIterator46 = arrayListTestDriver39.listIterator(1);
        java.lang.Class<?> wildcardClass47 = listIterator46.getClass();
        boolean boolean48 = arrayListTestDriver32.contains((java.lang.Object) wildcardClass47);
        arrayListTestDriver32.clear();
        java.lang.Object[] objArray50 = arrayListTestDriver32.toArray();
        boolean boolean51 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray50);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator53 = arrayListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(listIterator46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test205");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (short) 10);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        int int4 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test206");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = arrayListTestDriver16.remove((java.lang.Object) (short) 1);
        boolean boolean22 = arrayListTestDriver16.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray24 = arrayListTestDriver23.toArray();
        java.lang.Object[] objArray25 = arrayListTestDriver23.toArray();
        boolean boolean26 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver23);
        arrayListTestDriver23.clear();
        boolean boolean28 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver23);
        java.lang.Object[] objArray29 = arrayListTestDriver23.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean32 = arrayListTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = arrayListTestDriver30.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator35 = arrayListTestDriver30.iterator();
        experiment.util.ListIterator listIterator37 = arrayListTestDriver30.listIterator(1);
        int int38 = arrayListTestDriver30.size();
        java.lang.Object[] objArray39 = arrayListTestDriver30.toArray();
        boolean boolean40 = arrayListTestDriver23.remove((java.lang.Object) objArray39);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(listIterator37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test207");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray14 = arrayListTestDriver11.toArray();
        arrayListTestDriver11.clear();
        java.lang.Object obj16 = arrayListTestDriver5.set((int) (byte) 0, (java.lang.Object) arrayListTestDriver11);
        boolean boolean18 = arrayListTestDriver11.add((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 10 + "'", obj16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test208");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean11 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        int int25 = arrayListTestDriver19.size();
        java.lang.Object[] objArray26 = arrayListTestDriver19.toArray();
        boolean boolean27 = arrayListTestDriver12.equals_CUT((java.lang.Object) arrayListTestDriver19);
        boolean boolean28 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver12);
        java.lang.Class<?> wildcardClass29 = arrayListTestDriver12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test209");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        int int9 = arrayListTestDriver8.size();
        int int10 = arrayListTestDriver8.size();
        java.lang.Class<?> wildcardClass11 = arrayListTestDriver8.getClass();
        boolean boolean12 = arrayListTestDriver0.add((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test210");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        java.lang.Object[] objArray7 = arrayListTestDriver5.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        experiment.util.ListIterator listIterator15 = arrayListTestDriver8.listIterator(1);
        boolean boolean16 = arrayListTestDriver5.contains((java.lang.Object) listIterator15);
        java.lang.Class<?> wildcardClass17 = listIterator15.getClass();
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) listIterator15);
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        boolean boolean25 = arrayListTestDriver19.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray27 = arrayListTestDriver26.toArray();
        java.lang.Object[] objArray28 = arrayListTestDriver26.toArray();
        boolean boolean29 = arrayListTestDriver19.remove((java.lang.Object) arrayListTestDriver26);
        boolean boolean30 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver26);
        java.lang.Object[] objArray31 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        int int34 = arrayListTestDriver33.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver35 = new experiment.util.ArrayListTestDriver();
        boolean boolean37 = arrayListTestDriver35.remove((java.lang.Object) (byte) 10);
        boolean boolean39 = arrayListTestDriver35.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator40 = arrayListTestDriver35.iterator();
        experiment.util.ListIterator listIterator42 = arrayListTestDriver35.listIterator(1);
        boolean boolean43 = arrayListTestDriver33.add((java.lang.Object) listIterator42);
        experiment.util.ArrayListTestDriver arrayListTestDriver44 = new experiment.util.ArrayListTestDriver();
        boolean boolean46 = arrayListTestDriver44.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray47 = arrayListTestDriver44.toArray();
        arrayListTestDriver44.clear();
        java.lang.Object[] objArray49 = arrayListTestDriver44.toArray();
        boolean boolean50 = arrayListTestDriver33.add((java.lang.Object) arrayListTestDriver44);
        java.lang.Object[] objArray51 = arrayListTestDriver33.toArray();
        experiment.util.Iterator iterator52 = arrayListTestDriver33.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = arrayListTestDriver0.set((int) 'a', (java.lang.Object) arrayListTestDriver33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(listIterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(iterator52);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test211");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray17 = arrayListTestDriver16.toArray();
        boolean boolean19 = arrayListTestDriver16.equals_CUT((java.lang.Object) 10);
        boolean boolean20 = arrayListTestDriver16.isEmpty();
        boolean boolean21 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.remove((java.lang.Object) (short) 1);
        boolean boolean28 = arrayListTestDriver22.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray30 = arrayListTestDriver29.toArray();
        java.lang.Object[] objArray31 = arrayListTestDriver29.toArray();
        boolean boolean32 = arrayListTestDriver22.remove((java.lang.Object) arrayListTestDriver29);
        boolean boolean34 = arrayListTestDriver22.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver22.clear();
        java.lang.Object[] objArray36 = arrayListTestDriver22.toArray();
        boolean boolean37 = arrayListTestDriver16.add((java.lang.Object) objArray36);
        boolean boolean38 = arrayListTestDriver16.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test212");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) (byte) 10);
        boolean boolean13 = arrayListTestDriver9.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator14 = arrayListTestDriver9.iterator();
        boolean boolean16 = arrayListTestDriver9.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.remove((java.lang.Object) (byte) 10);
        boolean boolean21 = arrayListTestDriver17.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator22 = arrayListTestDriver17.iterator();
        boolean boolean23 = arrayListTestDriver9.equals_CUT((java.lang.Object) iterator22);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray25 = arrayListTestDriver24.toArray();
        boolean boolean26 = arrayListTestDriver9.contains((java.lang.Object) objArray25);
        boolean boolean27 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray25);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator29 = arrayListTestDriver0.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test213");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        int int4 = arrayListTestDriver0.size();
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray6 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test214");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) 1);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = arrayListTestDriver10.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator15 = arrayListTestDriver10.iterator();
        boolean boolean17 = arrayListTestDriver10.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator23 = arrayListTestDriver18.iterator();
        boolean boolean24 = arrayListTestDriver10.equals_CUT((java.lang.Object) iterator23);
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray26 = arrayListTestDriver25.toArray();
        boolean boolean27 = arrayListTestDriver10.contains((java.lang.Object) objArray26);
        arrayListTestDriver10.clear();
        arrayListTestDriver10.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean32 = arrayListTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = arrayListTestDriver30.add((java.lang.Object) (-1.0d));
        boolean boolean35 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = arrayListTestDriver0.set(100, (java.lang.Object) arrayListTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test215");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        int int11 = arrayListTestDriver10.size();
        int int12 = arrayListTestDriver10.size();
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        experiment.util.Iterator iterator20 = arrayListTestDriver14.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator26 = arrayListTestDriver21.iterator();
        experiment.util.ListIterator listIterator28 = arrayListTestDriver21.listIterator(1);
        java.lang.Class<?> wildcardClass29 = listIterator28.getClass();
        boolean boolean30 = arrayListTestDriver14.contains((java.lang.Object) wildcardClass29);
        boolean boolean32 = arrayListTestDriver14.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator33 = arrayListTestDriver14.iterator();
        boolean boolean34 = arrayListTestDriver10.contains((java.lang.Object) arrayListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = arrayListTestDriver0.set((int) 'a', (java.lang.Object) arrayListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(listIterator28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test216");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test217");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test218");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        java.lang.Object obj8 = arrayListTestDriver0.get((int) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray10 = arrayListTestDriver9.toArray();
        java.lang.Object[] objArray11 = arrayListTestDriver9.toArray();
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean19 = arrayListTestDriver14.contains((java.lang.Object) true);
        boolean boolean20 = arrayListTestDriver9.equals_CUT((java.lang.Object) arrayListTestDriver14);
        experiment.util.ListIterator listIterator22 = arrayListTestDriver9.listIterator(0);
        boolean boolean23 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver9);
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        boolean boolean27 = arrayListTestDriver25.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = arrayListTestDriver25.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator30 = arrayListTestDriver25.iterator();
        boolean boolean32 = arrayListTestDriver25.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray34 = arrayListTestDriver33.toArray();
        boolean boolean36 = arrayListTestDriver33.equals_CUT((java.lang.Object) 10);
        boolean boolean37 = arrayListTestDriver33.isEmpty();
        boolean boolean38 = arrayListTestDriver25.remove((java.lang.Object) arrayListTestDriver33);
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray40 = arrayListTestDriver39.toArray();
        boolean boolean42 = arrayListTestDriver39.equals_CUT((java.lang.Object) 10);
        boolean boolean43 = arrayListTestDriver39.isEmpty();
        boolean boolean44 = arrayListTestDriver33.contains((java.lang.Object) arrayListTestDriver39);
        experiment.util.Iterator iterator45 = arrayListTestDriver39.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = arrayListTestDriver9.set((int) (short) 10, (java.lang.Object) iterator45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator45);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test219");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        java.lang.Object[] objArray14 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray15 = arrayListTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[#]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[#]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test220");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray17 = arrayListTestDriver16.toArray();
        boolean boolean19 = arrayListTestDriver16.equals_CUT((java.lang.Object) 10);
        boolean boolean20 = arrayListTestDriver16.isEmpty();
        boolean boolean21 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test221");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean15 = arrayListTestDriver11.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator16 = arrayListTestDriver11.iterator();
        experiment.util.ListIterator listIterator18 = arrayListTestDriver11.listIterator(1);
        java.lang.Class<?> wildcardClass19 = listIterator18.getClass();
        boolean boolean20 = arrayListTestDriver4.contains((java.lang.Object) wildcardClass19);
        boolean boolean22 = arrayListTestDriver4.equals_CUT((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator23 = arrayListTestDriver4.iterator();
        boolean boolean24 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray26 = arrayListTestDriver25.toArray();
        java.lang.Object[] objArray27 = arrayListTestDriver25.toArray();
        boolean boolean29 = arrayListTestDriver25.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray31 = arrayListTestDriver30.toArray();
        boolean boolean33 = arrayListTestDriver30.equals_CUT((java.lang.Object) 10);
        boolean boolean35 = arrayListTestDriver30.contains((java.lang.Object) true);
        boolean boolean36 = arrayListTestDriver25.equals_CUT((java.lang.Object) arrayListTestDriver30);
        experiment.util.ListIterator listIterator38 = arrayListTestDriver25.listIterator(0);
        boolean boolean40 = arrayListTestDriver25.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver41 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray42 = arrayListTestDriver41.toArray();
        boolean boolean44 = arrayListTestDriver41.equals_CUT((java.lang.Object) 10);
        boolean boolean45 = arrayListTestDriver41.isEmpty();
        boolean boolean46 = arrayListTestDriver25.contains((java.lang.Object) arrayListTestDriver41);
        boolean boolean47 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = arrayListTestDriver4.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(listIterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(listIterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test222");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        int int7 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test223");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) (-1.0d));
        boolean boolean24 = arrayListTestDriver18.contains((java.lang.Object) (short) 10);
        boolean boolean26 = arrayListTestDriver18.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator28 = arrayListTestDriver18.listIterator((int) (byte) 0);
        boolean boolean29 = arrayListTestDriver18.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean32 = arrayListTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = arrayListTestDriver30.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator35 = arrayListTestDriver30.iterator();
        experiment.util.Iterator iterator36 = arrayListTestDriver30.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver37 = new experiment.util.ArrayListTestDriver();
        boolean boolean39 = arrayListTestDriver37.remove((java.lang.Object) (byte) 10);
        boolean boolean41 = arrayListTestDriver37.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator42 = arrayListTestDriver37.iterator();
        int int43 = arrayListTestDriver37.size();
        java.lang.Object[] objArray44 = arrayListTestDriver37.toArray();
        boolean boolean45 = arrayListTestDriver30.equals_CUT((java.lang.Object) arrayListTestDriver37);
        boolean boolean46 = arrayListTestDriver18.remove((java.lang.Object) arrayListTestDriver30);
        boolean boolean47 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = arrayListTestDriver18.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(listIterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test224");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean11 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        int int25 = arrayListTestDriver19.size();
        java.lang.Object[] objArray26 = arrayListTestDriver19.toArray();
        boolean boolean27 = arrayListTestDriver12.equals_CUT((java.lang.Object) arrayListTestDriver19);
        boolean boolean28 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver12);
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver29.remove((java.lang.Object) (byte) 10);
        boolean boolean33 = arrayListTestDriver29.remove((java.lang.Object) (short) 1);
        int int34 = arrayListTestDriver29.size();
        boolean boolean36 = arrayListTestDriver29.contains((java.lang.Object) 100);
        arrayListTestDriver29.clear();
        java.lang.Object[] objArray38 = arrayListTestDriver29.toArray();
        boolean boolean39 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = arrayListTestDriver29.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test225");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = arrayListTestDriver20.add((java.lang.Object) (-1.0d));
        boolean boolean25 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver20);
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = arrayListTestDriver26.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator31 = arrayListTestDriver26.iterator();
        experiment.util.ListIterator listIterator33 = arrayListTestDriver26.listIterator(1);
        boolean boolean34 = arrayListTestDriver20.equals_CUT((java.lang.Object) listIterator33);
        experiment.util.Iterator iterator35 = arrayListTestDriver20.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(listIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test226");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = arrayListTestDriver5.remove((java.lang.Object) (short) 1);
        int int10 = arrayListTestDriver5.size();
        java.lang.Object[] objArray11 = arrayListTestDriver5.toArray();
        boolean boolean12 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test227");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        boolean boolean26 = arrayListTestDriver19.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = arrayListTestDriver27.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator32 = arrayListTestDriver27.iterator();
        boolean boolean33 = arrayListTestDriver19.equals_CUT((java.lang.Object) iterator32);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray35 = arrayListTestDriver34.toArray();
        boolean boolean36 = arrayListTestDriver19.contains((java.lang.Object) objArray35);
        arrayListTestDriver19.clear();
        arrayListTestDriver19.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        boolean boolean44 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver39);
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        boolean boolean47 = arrayListTestDriver45.remove((java.lang.Object) (byte) 10);
        boolean boolean49 = arrayListTestDriver45.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator50 = arrayListTestDriver45.iterator();
        experiment.util.ListIterator listIterator52 = arrayListTestDriver45.listIterator(1);
        boolean boolean53 = arrayListTestDriver39.equals_CUT((java.lang.Object) listIterator52);
        boolean boolean54 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean53);
        experiment.util.ArrayListTestDriver arrayListTestDriver55 = new experiment.util.ArrayListTestDriver();
        boolean boolean57 = arrayListTestDriver55.remove((java.lang.Object) (byte) 10);
        boolean boolean59 = arrayListTestDriver55.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator60 = arrayListTestDriver55.iterator();
        int int61 = arrayListTestDriver55.size();
        java.lang.Object[] objArray62 = arrayListTestDriver55.toArray();
        boolean boolean63 = arrayListTestDriver0.remove((java.lang.Object) objArray62);
        experiment.util.ArrayListTestDriver arrayListTestDriver64 = new experiment.util.ArrayListTestDriver();
        boolean boolean66 = arrayListTestDriver64.remove((java.lang.Object) (byte) 10);
        boolean boolean68 = arrayListTestDriver64.add((java.lang.Object) (-1.0d));
        boolean boolean70 = arrayListTestDriver64.contains((java.lang.Object) (short) 10);
        boolean boolean72 = arrayListTestDriver64.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator74 = arrayListTestDriver64.listIterator((int) (byte) 0);
        boolean boolean75 = arrayListTestDriver64.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver76 = new experiment.util.ArrayListTestDriver();
        boolean boolean78 = arrayListTestDriver76.remove((java.lang.Object) (byte) 10);
        boolean boolean80 = arrayListTestDriver76.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator81 = arrayListTestDriver76.iterator();
        experiment.util.Iterator iterator82 = arrayListTestDriver76.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver83 = new experiment.util.ArrayListTestDriver();
        boolean boolean85 = arrayListTestDriver83.remove((java.lang.Object) (byte) 10);
        boolean boolean87 = arrayListTestDriver83.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator88 = arrayListTestDriver83.iterator();
        int int89 = arrayListTestDriver83.size();
        java.lang.Object[] objArray90 = arrayListTestDriver83.toArray();
        boolean boolean91 = arrayListTestDriver76.equals_CUT((java.lang.Object) arrayListTestDriver83);
        boolean boolean92 = arrayListTestDriver64.remove((java.lang.Object) arrayListTestDriver76);
        boolean boolean93 = arrayListTestDriver0.remove((java.lang.Object) boolean92);
        boolean boolean94 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(listIterator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(iterator88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test228");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray6 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test229");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator8 = arrayListTestDriver3.iterator();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver3.listIterator(1);
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) listIterator10);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        boolean boolean18 = arrayListTestDriver12.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray20 = arrayListTestDriver19.toArray();
        java.lang.Object[] objArray21 = arrayListTestDriver19.toArray();
        boolean boolean22 = arrayListTestDriver12.remove((java.lang.Object) arrayListTestDriver19);
        int int23 = arrayListTestDriver19.size();
        boolean boolean24 = arrayListTestDriver0.remove((java.lang.Object) int23);
        java.lang.Class<?> wildcardClass25 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test230");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator(1);
        java.lang.Class<?> wildcardClass15 = listIterator14.getClass();
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass15);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        boolean boolean20 = arrayListTestDriver17.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray26 = arrayListTestDriver21.toArray();
        boolean boolean27 = arrayListTestDriver17.equals_CUT((java.lang.Object) arrayListTestDriver21);
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = arrayListTestDriver28.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator33 = arrayListTestDriver28.iterator();
        boolean boolean34 = arrayListTestDriver17.add((java.lang.Object) iterator33);
        boolean boolean35 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver17);
        experiment.util.ListIterator listIterator37 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        boolean boolean40 = arrayListTestDriver38.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = arrayListTestDriver38.remove((java.lang.Object) (short) 1);
        boolean boolean44 = arrayListTestDriver38.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray46 = arrayListTestDriver45.toArray();
        java.lang.Object[] objArray47 = arrayListTestDriver45.toArray();
        boolean boolean48 = arrayListTestDriver38.remove((java.lang.Object) arrayListTestDriver45);
        arrayListTestDriver45.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver50 = new experiment.util.ArrayListTestDriver();
        boolean boolean52 = arrayListTestDriver50.remove((java.lang.Object) (byte) 10);
        boolean boolean54 = arrayListTestDriver50.remove((java.lang.Object) (short) 1);
        int int55 = arrayListTestDriver50.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver56 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray57 = arrayListTestDriver56.toArray();
        java.lang.Object[] objArray58 = arrayListTestDriver56.toArray();
        boolean boolean60 = arrayListTestDriver56.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver61 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray62 = arrayListTestDriver61.toArray();
        boolean boolean64 = arrayListTestDriver61.equals_CUT((java.lang.Object) 10);
        boolean boolean66 = arrayListTestDriver61.contains((java.lang.Object) true);
        boolean boolean67 = arrayListTestDriver56.equals_CUT((java.lang.Object) arrayListTestDriver61);
        boolean boolean68 = arrayListTestDriver50.add((java.lang.Object) arrayListTestDriver56);
        boolean boolean69 = arrayListTestDriver45.equals_CUT((java.lang.Object) arrayListTestDriver50);
        experiment.util.ListIterator listIterator71 = arrayListTestDriver45.listIterator(0);
        boolean boolean72 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver74 = new experiment.util.ArrayListTestDriver();
        boolean boolean76 = arrayListTestDriver74.remove((java.lang.Object) (byte) 10);
        boolean boolean78 = arrayListTestDriver74.remove((java.lang.Object) (short) 1);
        int int79 = arrayListTestDriver74.size();
        boolean boolean81 = arrayListTestDriver74.contains((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj82 = arrayListTestDriver0.set((-1), (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(listIterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(listIterator71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test231");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean11 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        int int25 = arrayListTestDriver19.size();
        java.lang.Object[] objArray26 = arrayListTestDriver19.toArray();
        boolean boolean27 = arrayListTestDriver12.equals_CUT((java.lang.Object) arrayListTestDriver19);
        boolean boolean28 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = arrayListTestDriver12.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test232");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator(1);
        int int8 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test233");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        java.lang.Object[] objArray6 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test234");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (short) 10);
        int int8 = arrayListTestDriver5.size();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = arrayListTestDriver10.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator15 = arrayListTestDriver10.iterator();
        experiment.util.Iterator iterator16 = arrayListTestDriver10.iterator();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) iterator16);
        experiment.util.Iterator iterator18 = arrayListTestDriver5.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray22 = arrayListTestDriver19.toArray();
        arrayListTestDriver19.clear();
        java.lang.Object[] objArray24 = arrayListTestDriver19.toArray();
        boolean boolean25 = arrayListTestDriver5.remove((java.lang.Object) objArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = arrayListTestDriver5.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test235");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        boolean boolean8 = arrayListTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean10 = arrayListTestDriver5.contains((java.lang.Object) true);
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator(0);
        boolean boolean15 = arrayListTestDriver0.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = arrayListTestDriver16.remove((java.lang.Object) (short) 1);
        boolean boolean22 = arrayListTestDriver16.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray24 = arrayListTestDriver23.toArray();
        java.lang.Object[] objArray25 = arrayListTestDriver23.toArray();
        boolean boolean26 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver23);
        arrayListTestDriver23.clear();
        boolean boolean28 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver23);
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver29.remove((java.lang.Object) (byte) 10);
        boolean boolean33 = arrayListTestDriver29.remove((java.lang.Object) (short) 1);
        boolean boolean35 = arrayListTestDriver29.add((java.lang.Object) "hi!");
        boolean boolean36 = arrayListTestDriver29.isEmpty();
        experiment.util.Iterator iterator37 = arrayListTestDriver29.iterator();
        experiment.util.Iterator iterator38 = arrayListTestDriver29.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray40 = arrayListTestDriver39.toArray();
        java.lang.Object[] objArray41 = arrayListTestDriver39.toArray();
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver44 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray45 = arrayListTestDriver44.toArray();
        boolean boolean47 = arrayListTestDriver44.equals_CUT((java.lang.Object) 10);
        boolean boolean49 = arrayListTestDriver44.contains((java.lang.Object) true);
        boolean boolean50 = arrayListTestDriver39.equals_CUT((java.lang.Object) arrayListTestDriver44);
        experiment.util.ListIterator listIterator52 = arrayListTestDriver39.listIterator(0);
        boolean boolean54 = arrayListTestDriver39.remove((java.lang.Object) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver55 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray56 = arrayListTestDriver55.toArray();
        boolean boolean58 = arrayListTestDriver55.equals_CUT((java.lang.Object) 10);
        boolean boolean59 = arrayListTestDriver55.isEmpty();
        boolean boolean60 = arrayListTestDriver39.contains((java.lang.Object) arrayListTestDriver55);
        experiment.util.ArrayListTestDriver arrayListTestDriver61 = new experiment.util.ArrayListTestDriver();
        boolean boolean63 = arrayListTestDriver61.remove((java.lang.Object) (byte) 10);
        boolean boolean65 = arrayListTestDriver61.remove((java.lang.Object) (short) 1);
        boolean boolean67 = arrayListTestDriver61.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver68 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray69 = arrayListTestDriver68.toArray();
        java.lang.Object[] objArray70 = arrayListTestDriver68.toArray();
        boolean boolean71 = arrayListTestDriver61.remove((java.lang.Object) arrayListTestDriver68);
        boolean boolean73 = arrayListTestDriver61.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver61.clear();
        java.lang.Object[] objArray75 = arrayListTestDriver61.toArray();
        boolean boolean76 = arrayListTestDriver55.add((java.lang.Object) objArray75);
        boolean boolean77 = arrayListTestDriver29.contains((java.lang.Object) arrayListTestDriver55);
        experiment.util.ArrayListTestDriver arrayListTestDriver78 = new experiment.util.ArrayListTestDriver();
        boolean boolean80 = arrayListTestDriver78.remove((java.lang.Object) (byte) 10);
        boolean boolean82 = arrayListTestDriver78.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator83 = arrayListTestDriver78.iterator();
        experiment.util.Iterator iterator84 = arrayListTestDriver78.iterator();
        boolean boolean86 = arrayListTestDriver78.remove((java.lang.Object) (short) 1);
        boolean boolean87 = arrayListTestDriver78.isEmpty();
        int int88 = arrayListTestDriver78.size();
        boolean boolean89 = arrayListTestDriver55.equals_CUT((java.lang.Object) int88);
        boolean boolean90 = arrayListTestDriver23.add((java.lang.Object) boolean89);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertNotNull(iterator84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test236");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray20 = arrayListTestDriver19.toArray();
        java.lang.Object[] objArray21 = arrayListTestDriver19.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver22.iterator();
        experiment.util.ListIterator listIterator29 = arrayListTestDriver22.listIterator(1);
        boolean boolean30 = arrayListTestDriver19.contains((java.lang.Object) listIterator29);
        boolean boolean31 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver19);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean34 = arrayListTestDriver32.remove((java.lang.Object) (byte) 10);
        boolean boolean36 = arrayListTestDriver32.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator37 = arrayListTestDriver32.iterator();
        experiment.util.Iterator iterator38 = arrayListTestDriver32.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator44 = arrayListTestDriver39.iterator();
        experiment.util.ListIterator listIterator46 = arrayListTestDriver39.listIterator(1);
        java.lang.Class<?> wildcardClass47 = listIterator46.getClass();
        boolean boolean48 = arrayListTestDriver32.contains((java.lang.Object) wildcardClass47);
        arrayListTestDriver32.clear();
        java.lang.Object[] objArray50 = arrayListTestDriver32.toArray();
        boolean boolean51 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray50);
        experiment.util.ArrayListTestDriver arrayListTestDriver52 = new experiment.util.ArrayListTestDriver();
        boolean boolean54 = arrayListTestDriver52.remove((java.lang.Object) (byte) 10);
        boolean boolean56 = arrayListTestDriver52.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray57 = arrayListTestDriver52.toArray();
        boolean boolean58 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver52);
        experiment.util.ArrayListTestDriver arrayListTestDriver59 = new experiment.util.ArrayListTestDriver();
        boolean boolean61 = arrayListTestDriver59.remove((java.lang.Object) (byte) 10);
        boolean boolean63 = arrayListTestDriver59.add((java.lang.Object) (-1.0d));
        boolean boolean65 = arrayListTestDriver59.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver66 = new experiment.util.ArrayListTestDriver();
        boolean boolean68 = arrayListTestDriver66.remove((java.lang.Object) (byte) 10);
        boolean boolean70 = arrayListTestDriver66.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator71 = arrayListTestDriver66.iterator();
        experiment.util.Iterator iterator72 = arrayListTestDriver66.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver73 = new experiment.util.ArrayListTestDriver();
        boolean boolean75 = arrayListTestDriver73.remove((java.lang.Object) (byte) 10);
        boolean boolean77 = arrayListTestDriver73.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator78 = arrayListTestDriver73.iterator();
        experiment.util.ListIterator listIterator80 = arrayListTestDriver73.listIterator(1);
        java.lang.Class<?> wildcardClass81 = listIterator80.getClass();
        boolean boolean82 = arrayListTestDriver66.contains((java.lang.Object) wildcardClass81);
        boolean boolean83 = arrayListTestDriver59.remove((java.lang.Object) boolean82);
        boolean boolean84 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver59);
        java.lang.Class<?> wildcardClass85 = arrayListTestDriver59.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(listIterator46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNotNull(listIterator80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test237");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        int int9 = arrayListTestDriver8.size();
        int int10 = arrayListTestDriver8.size();
        boolean boolean11 = arrayListTestDriver8.isEmpty();
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = arrayListTestDriver13.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator18 = arrayListTestDriver13.iterator();
        experiment.util.Iterator iterator19 = arrayListTestDriver13.iterator();
        boolean boolean20 = arrayListTestDriver8.remove((java.lang.Object) iterator19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = arrayListTestDriver0.set((int) '#', (java.lang.Object) iterator19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test238");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = arrayListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test239");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        int int6 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray13 = arrayListTestDriver12.toArray();
        boolean boolean15 = arrayListTestDriver12.equals_CUT((java.lang.Object) 10);
        boolean boolean17 = arrayListTestDriver12.contains((java.lang.Object) true);
        boolean boolean18 = arrayListTestDriver7.equals_CUT((java.lang.Object) arrayListTestDriver12);
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.add((java.lang.Object) (-1.0d));
        boolean boolean25 = arrayListTestDriver19.contains((java.lang.Object) (short) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = arrayListTestDriver26.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator31 = arrayListTestDriver26.iterator();
        experiment.util.Iterator iterator32 = arrayListTestDriver26.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        boolean boolean35 = arrayListTestDriver33.remove((java.lang.Object) (byte) 10);
        boolean boolean37 = arrayListTestDriver33.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator38 = arrayListTestDriver33.iterator();
        experiment.util.ListIterator listIterator40 = arrayListTestDriver33.listIterator(1);
        java.lang.Class<?> wildcardClass41 = listIterator40.getClass();
        boolean boolean42 = arrayListTestDriver26.contains((java.lang.Object) wildcardClass41);
        boolean boolean43 = arrayListTestDriver19.remove((java.lang.Object) boolean42);
        java.lang.Object[] objArray44 = arrayListTestDriver19.toArray();
        boolean boolean45 = arrayListTestDriver12.contains((java.lang.Object) objArray44);
        boolean boolean46 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver12);
        java.lang.Object[] objArray47 = arrayListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(listIterator40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test240");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray7 = arrayListTestDriver6.toArray();
        java.lang.Object[] objArray8 = arrayListTestDriver6.toArray();
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray12 = arrayListTestDriver11.toArray();
        boolean boolean14 = arrayListTestDriver11.equals_CUT((java.lang.Object) 10);
        boolean boolean16 = arrayListTestDriver11.contains((java.lang.Object) true);
        boolean boolean17 = arrayListTestDriver6.equals_CUT((java.lang.Object) arrayListTestDriver11);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver6);
        experiment.util.ListIterator listIterator20 = arrayListTestDriver6.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = arrayListTestDriver6.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(listIterator20);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test241");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        arrayListTestDriver7.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        int int17 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray19 = arrayListTestDriver18.toArray();
        java.lang.Object[] objArray20 = arrayListTestDriver18.toArray();
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray24 = arrayListTestDriver23.toArray();
        boolean boolean26 = arrayListTestDriver23.equals_CUT((java.lang.Object) 10);
        boolean boolean28 = arrayListTestDriver23.contains((java.lang.Object) true);
        boolean boolean29 = arrayListTestDriver18.equals_CUT((java.lang.Object) arrayListTestDriver23);
        boolean boolean30 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver18);
        boolean boolean31 = arrayListTestDriver7.equals_CUT((java.lang.Object) arrayListTestDriver12);
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        int int34 = arrayListTestDriver33.size();
        int int35 = arrayListTestDriver33.size();
        boolean boolean37 = arrayListTestDriver33.contains((java.lang.Object) true);
        int int38 = arrayListTestDriver33.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = arrayListTestDriver7.set(10, (java.lang.Object) int38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test242");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test243");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (byte) 10);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator7 = arrayListTestDriver2.iterator();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver2.listIterator(1);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) listIterator9);
        java.lang.Object obj12 = arrayListTestDriver0.get(0);
        experiment.util.Iterator iterator13 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean17 = arrayListTestDriver15.remove((java.lang.Object) (byte) 10);
        boolean boolean19 = arrayListTestDriver15.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator20 = arrayListTestDriver15.iterator();
        experiment.util.Iterator iterator21 = arrayListTestDriver15.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver22.iterator();
        experiment.util.ListIterator listIterator29 = arrayListTestDriver22.listIterator(1);
        java.lang.Class<?> wildcardClass30 = listIterator29.getClass();
        boolean boolean31 = arrayListTestDriver15.contains((java.lang.Object) wildcardClass30);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        int int33 = arrayListTestDriver32.size();
        boolean boolean35 = arrayListTestDriver32.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        boolean boolean38 = arrayListTestDriver36.remove((java.lang.Object) (byte) 10);
        boolean boolean40 = arrayListTestDriver36.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray41 = arrayListTestDriver36.toArray();
        boolean boolean42 = arrayListTestDriver32.equals_CUT((java.lang.Object) arrayListTestDriver36);
        experiment.util.ArrayListTestDriver arrayListTestDriver43 = new experiment.util.ArrayListTestDriver();
        boolean boolean45 = arrayListTestDriver43.remove((java.lang.Object) (byte) 10);
        boolean boolean47 = arrayListTestDriver43.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator48 = arrayListTestDriver43.iterator();
        boolean boolean49 = arrayListTestDriver32.add((java.lang.Object) iterator48);
        boolean boolean50 = arrayListTestDriver15.contains((java.lang.Object) arrayListTestDriver32);
        experiment.util.ListIterator listIterator52 = arrayListTestDriver15.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver53 = new experiment.util.ArrayListTestDriver();
        boolean boolean55 = arrayListTestDriver53.remove((java.lang.Object) (byte) 10);
        boolean boolean57 = arrayListTestDriver53.remove((java.lang.Object) (short) 1);
        boolean boolean59 = arrayListTestDriver53.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver60 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray61 = arrayListTestDriver60.toArray();
        java.lang.Object[] objArray62 = arrayListTestDriver60.toArray();
        boolean boolean63 = arrayListTestDriver53.remove((java.lang.Object) arrayListTestDriver60);
        arrayListTestDriver60.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver65 = new experiment.util.ArrayListTestDriver();
        boolean boolean67 = arrayListTestDriver65.remove((java.lang.Object) (byte) 10);
        boolean boolean69 = arrayListTestDriver65.remove((java.lang.Object) (short) 1);
        int int70 = arrayListTestDriver65.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver71 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray72 = arrayListTestDriver71.toArray();
        java.lang.Object[] objArray73 = arrayListTestDriver71.toArray();
        boolean boolean75 = arrayListTestDriver71.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver76 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray77 = arrayListTestDriver76.toArray();
        boolean boolean79 = arrayListTestDriver76.equals_CUT((java.lang.Object) 10);
        boolean boolean81 = arrayListTestDriver76.contains((java.lang.Object) true);
        boolean boolean82 = arrayListTestDriver71.equals_CUT((java.lang.Object) arrayListTestDriver76);
        boolean boolean83 = arrayListTestDriver65.add((java.lang.Object) arrayListTestDriver71);
        boolean boolean84 = arrayListTestDriver60.equals_CUT((java.lang.Object) arrayListTestDriver65);
        experiment.util.ListIterator listIterator86 = arrayListTestDriver60.listIterator(0);
        boolean boolean87 = arrayListTestDriver15.add((java.lang.Object) 0);
        boolean boolean88 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver15);
        java.lang.Object[] objArray89 = arrayListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(listIterator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test244");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator14 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test245");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        int int5 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray7 = arrayListTestDriver6.toArray();
        java.lang.Object[] objArray8 = arrayListTestDriver6.toArray();
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray12 = arrayListTestDriver11.toArray();
        boolean boolean14 = arrayListTestDriver11.equals_CUT((java.lang.Object) 10);
        boolean boolean16 = arrayListTestDriver11.contains((java.lang.Object) true);
        boolean boolean17 = arrayListTestDriver6.equals_CUT((java.lang.Object) arrayListTestDriver11);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver6);
        boolean boolean19 = arrayListTestDriver6.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test246");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray8 = arrayListTestDriver7.toArray();
        java.lang.Object[] objArray9 = arrayListTestDriver7.toArray();
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver7);
        arrayListTestDriver7.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        int int17 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray19 = arrayListTestDriver18.toArray();
        java.lang.Object[] objArray20 = arrayListTestDriver18.toArray();
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray24 = arrayListTestDriver23.toArray();
        boolean boolean26 = arrayListTestDriver23.equals_CUT((java.lang.Object) 10);
        boolean boolean28 = arrayListTestDriver23.contains((java.lang.Object) true);
        boolean boolean29 = arrayListTestDriver18.equals_CUT((java.lang.Object) arrayListTestDriver23);
        boolean boolean30 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver18);
        boolean boolean31 = arrayListTestDriver7.equals_CUT((java.lang.Object) arrayListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = arrayListTestDriver7.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test247");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray6 = arrayListTestDriver5.toArray();
        java.lang.Object[] objArray7 = arrayListTestDriver5.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        experiment.util.ListIterator listIterator15 = arrayListTestDriver8.listIterator(1);
        boolean boolean16 = arrayListTestDriver5.contains((java.lang.Object) listIterator15);
        java.lang.Class<?> wildcardClass17 = listIterator15.getClass();
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) listIterator15);
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        boolean boolean25 = arrayListTestDriver19.add((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray27 = arrayListTestDriver26.toArray();
        java.lang.Object[] objArray28 = arrayListTestDriver26.toArray();
        boolean boolean29 = arrayListTestDriver19.remove((java.lang.Object) arrayListTestDriver26);
        boolean boolean30 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver26);
        int int31 = arrayListTestDriver0.size();
        java.lang.Class<?> wildcardClass32 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test248");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray8 = arrayListTestDriver3.toArray();
        boolean boolean9 = arrayListTestDriver0.contains((java.lang.Object) objArray8);
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        int int17 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray19 = arrayListTestDriver18.toArray();
        java.lang.Object[] objArray20 = arrayListTestDriver18.toArray();
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray24 = arrayListTestDriver23.toArray();
        boolean boolean26 = arrayListTestDriver23.equals_CUT((java.lang.Object) 10);
        boolean boolean28 = arrayListTestDriver23.contains((java.lang.Object) true);
        boolean boolean29 = arrayListTestDriver18.equals_CUT((java.lang.Object) arrayListTestDriver23);
        boolean boolean30 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver18);
        boolean boolean31 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver12);
        java.lang.Class<?> wildcardClass32 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test249");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        int int9 = arrayListTestDriver8.size();
        int int10 = arrayListTestDriver8.size();
        boolean boolean11 = arrayListTestDriver8.isEmpty();
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = arrayListTestDriver13.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator18 = arrayListTestDriver13.iterator();
        experiment.util.Iterator iterator19 = arrayListTestDriver13.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = arrayListTestDriver20.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator25 = arrayListTestDriver20.iterator();
        int int26 = arrayListTestDriver20.size();
        java.lang.Object[] objArray27 = arrayListTestDriver20.toArray();
        boolean boolean28 = arrayListTestDriver13.equals_CUT((java.lang.Object) arrayListTestDriver20);
        boolean boolean29 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver20);
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean32 = arrayListTestDriver30.add((java.lang.Object) (short) 10);
        experiment.util.Iterator iterator33 = arrayListTestDriver30.iterator();
        boolean boolean34 = arrayListTestDriver30.isEmpty();
        boolean boolean35 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver30);
        boolean boolean36 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver30);
        int int37 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test250");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray1 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray2 = arrayListTestDriver0.toArray();
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = arrayListTestDriver5.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator10 = arrayListTestDriver5.iterator();
        int int11 = arrayListTestDriver5.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        boolean boolean19 = arrayListTestDriver12.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray21 = arrayListTestDriver20.toArray();
        boolean boolean23 = arrayListTestDriver20.equals_CUT((java.lang.Object) 10);
        boolean boolean24 = arrayListTestDriver20.isEmpty();
        boolean boolean25 = arrayListTestDriver12.remove((java.lang.Object) arrayListTestDriver20);
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray27 = arrayListTestDriver26.toArray();
        boolean boolean29 = arrayListTestDriver26.equals_CUT((java.lang.Object) 10);
        boolean boolean30 = arrayListTestDriver26.isEmpty();
        boolean boolean31 = arrayListTestDriver20.contains((java.lang.Object) arrayListTestDriver26);
        experiment.util.Iterator iterator32 = arrayListTestDriver26.iterator();
        boolean boolean33 = arrayListTestDriver5.equals_CUT((java.lang.Object) arrayListTestDriver26);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        boolean boolean36 = arrayListTestDriver34.remove((java.lang.Object) (byte) 10);
        boolean boolean38 = arrayListTestDriver34.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray39 = arrayListTestDriver34.toArray();
        boolean boolean40 = arrayListTestDriver5.remove((java.lang.Object) arrayListTestDriver34);
        boolean boolean41 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver34);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test251");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        boolean boolean26 = arrayListTestDriver19.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = arrayListTestDriver27.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator32 = arrayListTestDriver27.iterator();
        boolean boolean33 = arrayListTestDriver19.equals_CUT((java.lang.Object) iterator32);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray35 = arrayListTestDriver34.toArray();
        boolean boolean36 = arrayListTestDriver19.contains((java.lang.Object) objArray35);
        arrayListTestDriver19.clear();
        arrayListTestDriver19.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver39 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = arrayListTestDriver39.add((java.lang.Object) (-1.0d));
        boolean boolean44 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver39);
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        boolean boolean47 = arrayListTestDriver45.remove((java.lang.Object) (byte) 10);
        boolean boolean49 = arrayListTestDriver45.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator50 = arrayListTestDriver45.iterator();
        experiment.util.ListIterator listIterator52 = arrayListTestDriver45.listIterator(1);
        boolean boolean53 = arrayListTestDriver39.equals_CUT((java.lang.Object) listIterator52);
        boolean boolean54 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = arrayListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test252");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean11 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver12.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = arrayListTestDriver19.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator24 = arrayListTestDriver19.iterator();
        int int25 = arrayListTestDriver19.size();
        java.lang.Object[] objArray26 = arrayListTestDriver19.toArray();
        boolean boolean27 = arrayListTestDriver12.equals_CUT((java.lang.Object) arrayListTestDriver19);
        boolean boolean28 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver12);
        int int29 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test253");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        java.lang.Object[] objArray15 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = arrayListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test254");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray9 = arrayListTestDriver8.toArray();
        boolean boolean11 = arrayListTestDriver8.equals_CUT((java.lang.Object) 10);
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver8);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray15 = arrayListTestDriver14.toArray();
        boolean boolean17 = arrayListTestDriver14.equals_CUT((java.lang.Object) 10);
        boolean boolean18 = arrayListTestDriver14.isEmpty();
        boolean boolean19 = arrayListTestDriver8.contains((java.lang.Object) arrayListTestDriver14);
        int int20 = arrayListTestDriver14.size();
        boolean boolean21 = arrayListTestDriver14.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test255");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        boolean boolean12 = arrayListTestDriver4.contains((java.lang.Object) (short) 100);
        arrayListTestDriver4.clear();
        experiment.util.Iterator iterator14 = arrayListTestDriver4.iterator();
        int int15 = arrayListTestDriver4.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1256357748_1024_0.test256");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray16 = arrayListTestDriver15.toArray();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) objArray16);
        arrayListTestDriver0.clear();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = arrayListTestDriver20.add((java.lang.Object) (-1.0d));
        boolean boolean25 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver20);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = arrayListTestDriver27.remove((java.lang.Object) (short) 1);
        int int32 = arrayListTestDriver27.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray34 = arrayListTestDriver33.toArray();
        java.lang.Object[] objArray35 = arrayListTestDriver33.toArray();
        boolean boolean37 = arrayListTestDriver33.add((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        java.lang.Object[] objArray39 = arrayListTestDriver38.toArray();
        boolean boolean41 = arrayListTestDriver38.equals_CUT((java.lang.Object) 10);
        boolean boolean43 = arrayListTestDriver38.contains((java.lang.Object) true);
        boolean boolean44 = arrayListTestDriver33.equals_CUT((java.lang.Object) arrayListTestDriver38);
        boolean boolean45 = arrayListTestDriver27.add((java.lang.Object) arrayListTestDriver33);
        experiment.util.Iterator iterator46 = arrayListTestDriver33.iterator();
        boolean boolean47 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

}
