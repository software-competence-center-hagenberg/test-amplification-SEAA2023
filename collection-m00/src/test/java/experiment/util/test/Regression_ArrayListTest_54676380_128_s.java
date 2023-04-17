package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_ArrayListTest_54676380_128_s {

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
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test002");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set(10, (java.lang.Object) arrayListTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test003");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        int int2 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test004");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        int int2 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test005");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.contains((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set(100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test006");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean6 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrayListTestDriver4.contains(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test007");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean6 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test008");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrayListTestDriver4.add(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test009");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        int int2 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test010");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test011");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.set(0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test012");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test013");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test014");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver4.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test015");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.set((int) (byte) 10, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test016");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.contains((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test017");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test018");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) false);
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver6.isEmpty();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = arrayListTestDriver6.contains(obj8);
        boolean boolean10 = arrayListTestDriver0.remove((java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test019");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver4.iterator();
        java.lang.Class<?> wildcardClass13 = iterator12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test020");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (short) -1);
        boolean boolean5 = arrayListTestDriver2.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver6);
        boolean boolean9 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean8);
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test021");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.set((int) (short) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test022");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test023");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = arrayListTestDriver0.contains(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test024");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver6.isEmpty();
        boolean boolean10 = arrayListTestDriver6.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver11.isEmpty();
        boolean boolean14 = arrayListTestDriver11.contains((java.lang.Object) (byte) -1);
        boolean boolean15 = arrayListTestDriver11.isEmpty();
        boolean boolean16 = arrayListTestDriver6.contains((java.lang.Object) arrayListTestDriver11);
        boolean boolean17 = arrayListTestDriver0.add((java.lang.Object) boolean16);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = arrayListTestDriver0.equals_CUT(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test025");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test026");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test027");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver4.iterator();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = arrayListTestDriver4.contains((java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = arrayListTestDriver4.add(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test028");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test029");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test030");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test031");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver4.set((int) (short) 100, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test032");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) ' ');
        arrayListTestDriver0.clear();
        java.lang.Class<?> wildcardClass12 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test033");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test034");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean6 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (short) -1);
        boolean boolean11 = arrayListTestDriver8.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass15 = arrayListTestDriver12.getClass();
        boolean boolean16 = arrayListTestDriver8.contains((java.lang.Object) wildcardClass15);
        boolean boolean18 = arrayListTestDriver8.add((java.lang.Object) ' ');
        arrayListTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver4.set((int) (short) 10, (java.lang.Object) arrayListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test035");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (byte) -1);
        boolean boolean8 = arrayListTestDriver4.isEmpty();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver4.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test036");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (short) -1);
        boolean boolean5 = arrayListTestDriver2.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver6);
        boolean boolean9 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean8);
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray11 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test037");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        int int14 = arrayListTestDriver13.size();
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) int14);
        experiment.util.ListIterator listIterator17 = arrayListTestDriver0.listIterator((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(listIterator17);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test038");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        int int13 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (short) -1);
        boolean boolean17 = arrayListTestDriver14.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        int int19 = arrayListTestDriver18.size();
        boolean boolean20 = arrayListTestDriver14.equals_CUT((java.lang.Object) arrayListTestDriver18);
        boolean boolean21 = arrayListTestDriver12.equals_CUT((java.lang.Object) boolean20);
        java.lang.Object[] objArray22 = arrayListTestDriver12.toArray();
        boolean boolean23 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver12);
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        boolean boolean27 = arrayListTestDriver25.remove((java.lang.Object) (short) -1);
        boolean boolean28 = arrayListTestDriver25.isEmpty();
        experiment.util.Iterator iterator29 = arrayListTestDriver25.iterator();
        arrayListTestDriver25.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        boolean boolean33 = arrayListTestDriver31.remove((java.lang.Object) (short) -1);
        boolean boolean34 = arrayListTestDriver31.isEmpty();
        boolean boolean35 = arrayListTestDriver31.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        boolean boolean37 = arrayListTestDriver36.isEmpty();
        boolean boolean39 = arrayListTestDriver36.contains((java.lang.Object) (byte) -1);
        boolean boolean40 = arrayListTestDriver36.isEmpty();
        boolean boolean41 = arrayListTestDriver31.contains((java.lang.Object) arrayListTestDriver36);
        boolean boolean42 = arrayListTestDriver25.add((java.lang.Object) boolean41);
        experiment.util.ListIterator listIterator44 = arrayListTestDriver25.listIterator((int) (short) 1);
        experiment.util.Iterator iterator45 = arrayListTestDriver25.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = arrayListTestDriver4.set((int) (short) 0, (java.lang.Object) iterator45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(listIterator44);
        org.junit.Assert.assertNotNull(iterator45);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test039");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        int int13 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (short) -1);
        boolean boolean17 = arrayListTestDriver14.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        int int19 = arrayListTestDriver18.size();
        boolean boolean20 = arrayListTestDriver14.equals_CUT((java.lang.Object) arrayListTestDriver18);
        boolean boolean21 = arrayListTestDriver12.equals_CUT((java.lang.Object) boolean20);
        java.lang.Object[] objArray22 = arrayListTestDriver12.toArray();
        boolean boolean23 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver12);
        boolean boolean25 = arrayListTestDriver12.contains((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass26 = arrayListTestDriver12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test040");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        boolean boolean15 = arrayListTestDriver12.isEmpty();
        boolean boolean16 = arrayListTestDriver12.isEmpty();
        boolean boolean17 = arrayListTestDriver4.remove((java.lang.Object) boolean16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) (short) -1);
        int int21 = arrayListTestDriver18.size();
        boolean boolean22 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver18);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.remove((java.lang.Object) (short) -1);
        arrayListTestDriver24.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver28.remove((java.lang.Object) (short) -1);
        boolean boolean31 = arrayListTestDriver28.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean33 = arrayListTestDriver32.isEmpty();
        boolean boolean34 = arrayListTestDriver28.remove((java.lang.Object) arrayListTestDriver32);
        boolean boolean35 = arrayListTestDriver24.add((java.lang.Object) arrayListTestDriver28);
        experiment.util.Iterator iterator36 = arrayListTestDriver28.iterator();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        boolean boolean39 = arrayListTestDriver28.contains((java.lang.Object) wildcardClass38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = arrayListTestDriver18.set((int) (byte) 1, (java.lang.Object) boolean39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test041");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver5.isEmpty();
        boolean boolean8 = arrayListTestDriver5.contains((java.lang.Object) (byte) -1);
        boolean boolean9 = arrayListTestDriver5.isEmpty();
        boolean boolean10 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver5);
        java.lang.Object[] objArray11 = arrayListTestDriver5.toArray();
        experiment.util.Iterator iterator12 = arrayListTestDriver5.iterator();
        int int13 = arrayListTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = arrayListTestDriver5.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test042");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver5.isEmpty();
        boolean boolean8 = arrayListTestDriver5.contains((java.lang.Object) (byte) -1);
        boolean boolean9 = arrayListTestDriver5.isEmpty();
        boolean boolean10 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        boolean boolean15 = arrayListTestDriver12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver5.set((int) (byte) -1, (java.lang.Object) arrayListTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test043");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        java.lang.Object[] objArray9 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test044");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test045");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (byte) -1);
        boolean boolean8 = arrayListTestDriver4.isEmpty();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver4.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test046");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test047");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.contains((java.lang.Object) (short) 0);
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test048");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (short) -1);
        boolean boolean5 = arrayListTestDriver2.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver6);
        boolean boolean9 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean8);
        java.lang.Class<?> wildcardClass10 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test049");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (short) -1);
        boolean boolean5 = arrayListTestDriver2.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver6);
        boolean boolean9 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test050");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        int int13 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (short) -1);
        boolean boolean17 = arrayListTestDriver14.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        int int19 = arrayListTestDriver18.size();
        boolean boolean20 = arrayListTestDriver14.equals_CUT((java.lang.Object) arrayListTestDriver18);
        boolean boolean21 = arrayListTestDriver12.equals_CUT((java.lang.Object) boolean20);
        java.lang.Object[] objArray22 = arrayListTestDriver12.toArray();
        boolean boolean23 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = arrayListTestDriver12.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test051");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test052");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) false);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (short) -1);
        boolean boolean10 = arrayListTestDriver7.isEmpty();
        boolean boolean11 = arrayListTestDriver7.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver12.isEmpty();
        boolean boolean15 = arrayListTestDriver12.contains((java.lang.Object) (byte) -1);
        boolean boolean16 = arrayListTestDriver12.isEmpty();
        boolean boolean17 = arrayListTestDriver7.contains((java.lang.Object) arrayListTestDriver12);
        experiment.util.Iterator iterator18 = arrayListTestDriver7.iterator();
        java.lang.Object[] objArray19 = arrayListTestDriver7.toArray();
        arrayListTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = arrayListTestDriver0.set((int) '#', (java.lang.Object) arrayListTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test053");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test054");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        arrayListTestDriver6.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver14.isEmpty();
        boolean boolean16 = arrayListTestDriver10.remove((java.lang.Object) arrayListTestDriver14);
        boolean boolean17 = arrayListTestDriver6.add((java.lang.Object) arrayListTestDriver10);
        arrayListTestDriver6.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (short) -1);
        boolean boolean22 = arrayListTestDriver19.isEmpty();
        boolean boolean23 = arrayListTestDriver19.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean25 = arrayListTestDriver24.isEmpty();
        boolean boolean27 = arrayListTestDriver24.contains((java.lang.Object) (byte) -1);
        boolean boolean28 = arrayListTestDriver24.isEmpty();
        boolean boolean29 = arrayListTestDriver19.contains((java.lang.Object) arrayListTestDriver24);
        boolean boolean30 = arrayListTestDriver6.contains((java.lang.Object) boolean29);
        int int31 = arrayListTestDriver6.size();
        boolean boolean32 = arrayListTestDriver0.equals_CUT((java.lang.Object) int31);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator34 = arrayListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test055");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) false);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test056");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) ' ');
        int int11 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) (short) -1);
        arrayListTestDriver13.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.remove((java.lang.Object) (short) -1);
        boolean boolean20 = arrayListTestDriver17.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver21.isEmpty();
        boolean boolean23 = arrayListTestDriver17.remove((java.lang.Object) arrayListTestDriver21);
        boolean boolean24 = arrayListTestDriver13.add((java.lang.Object) arrayListTestDriver17);
        experiment.util.Iterator iterator25 = arrayListTestDriver17.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = arrayListTestDriver0.set(100, (java.lang.Object) iterator25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test057");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (short) 0);
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) boolean7);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        int int10 = arrayListTestDriver9.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.remove((java.lang.Object) (short) -1);
        boolean boolean14 = arrayListTestDriver11.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        int int16 = arrayListTestDriver15.size();
        boolean boolean17 = arrayListTestDriver11.equals_CUT((java.lang.Object) arrayListTestDriver15);
        boolean boolean18 = arrayListTestDriver9.equals_CUT((java.lang.Object) boolean17);
        boolean boolean19 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean17);
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = arrayListTestDriver0.equals_CUT(obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test058");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver2.remove((java.lang.Object) (short) -1);
        boolean boolean5 = arrayListTestDriver2.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver6);
        boolean boolean9 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean8);
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.set((int) (byte) 10, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test059");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        boolean boolean9 = arrayListTestDriver0.remove((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test060");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver6.isEmpty();
        boolean boolean10 = arrayListTestDriver6.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver11.isEmpty();
        boolean boolean14 = arrayListTestDriver11.contains((java.lang.Object) (byte) -1);
        boolean boolean15 = arrayListTestDriver11.isEmpty();
        boolean boolean16 = arrayListTestDriver6.contains((java.lang.Object) arrayListTestDriver11);
        boolean boolean17 = arrayListTestDriver0.add((java.lang.Object) boolean16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver18.isEmpty();
        boolean boolean21 = arrayListTestDriver18.add((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator22 = arrayListTestDriver18.iterator();
        boolean boolean23 = arrayListTestDriver0.remove((java.lang.Object) iterator22);
        int int24 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test061");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver6.isEmpty();
        boolean boolean10 = arrayListTestDriver6.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver11.isEmpty();
        boolean boolean14 = arrayListTestDriver11.contains((java.lang.Object) (byte) -1);
        boolean boolean15 = arrayListTestDriver11.isEmpty();
        boolean boolean16 = arrayListTestDriver6.contains((java.lang.Object) arrayListTestDriver11);
        boolean boolean17 = arrayListTestDriver0.add((java.lang.Object) boolean16);
        experiment.util.ListIterator listIterator19 = arrayListTestDriver0.listIterator((int) (short) 1);
        experiment.util.Iterator iterator20 = arrayListTestDriver0.iterator();
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = arrayListTestDriver0.equals_CUT(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(listIterator19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test062");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (byte) -1);
        boolean boolean8 = arrayListTestDriver4.isEmpty();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        boolean boolean11 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (short) -1);
        boolean boolean19 = arrayListTestDriver16.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver20.isEmpty();
        boolean boolean22 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver20);
        boolean boolean23 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        int int25 = arrayListTestDriver24.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (short) -1);
        boolean boolean29 = arrayListTestDriver26.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        int int31 = arrayListTestDriver30.size();
        boolean boolean32 = arrayListTestDriver26.equals_CUT((java.lang.Object) arrayListTestDriver30);
        boolean boolean33 = arrayListTestDriver24.equals_CUT((java.lang.Object) boolean32);
        java.lang.Object[] objArray34 = arrayListTestDriver24.toArray();
        boolean boolean35 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver24);
        boolean boolean36 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver24);
        java.lang.Object obj37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = arrayListTestDriver24.add(obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test063");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (byte) -1);
        boolean boolean8 = arrayListTestDriver4.isEmpty();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test064");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver4.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test065");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (byte) -1);
        boolean boolean8 = arrayListTestDriver4.isEmpty();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        boolean boolean11 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (short) -1);
        boolean boolean19 = arrayListTestDriver16.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver20.isEmpty();
        boolean boolean22 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver20);
        boolean boolean23 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        int int25 = arrayListTestDriver24.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (short) -1);
        boolean boolean29 = arrayListTestDriver26.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        int int31 = arrayListTestDriver30.size();
        boolean boolean32 = arrayListTestDriver26.equals_CUT((java.lang.Object) arrayListTestDriver30);
        boolean boolean33 = arrayListTestDriver24.equals_CUT((java.lang.Object) boolean32);
        java.lang.Object[] objArray34 = arrayListTestDriver24.toArray();
        boolean boolean35 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver24);
        boolean boolean36 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver24);
        int int37 = arrayListTestDriver4.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test066");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (byte) -1);
        boolean boolean8 = arrayListTestDriver4.isEmpty();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        boolean boolean11 = arrayListTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = arrayListTestDriver4.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test067");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test068");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) 100.0d);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test069");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test070");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (short) -1);
        boolean boolean11 = arrayListTestDriver8.isEmpty();
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver13.isEmpty();
        boolean boolean16 = arrayListTestDriver13.contains((java.lang.Object) (byte) -1);
        boolean boolean17 = arrayListTestDriver13.isEmpty();
        boolean boolean18 = arrayListTestDriver8.contains((java.lang.Object) arrayListTestDriver13);
        java.lang.Object[] objArray19 = arrayListTestDriver13.toArray();
        experiment.util.Iterator iterator20 = arrayListTestDriver13.iterator();
        java.lang.Object[] objArray21 = arrayListTestDriver13.toArray();
        boolean boolean22 = arrayListTestDriver0.add((java.lang.Object) objArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = arrayListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test071");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.contains((java.lang.Object) (byte) -1);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        arrayListTestDriver4.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        boolean boolean14 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver15.isEmpty();
        boolean boolean18 = arrayListTestDriver15.contains((java.lang.Object) (byte) -1);
        boolean boolean19 = arrayListTestDriver15.isEmpty();
        boolean boolean20 = arrayListTestDriver10.contains((java.lang.Object) arrayListTestDriver15);
        boolean boolean21 = arrayListTestDriver4.add((java.lang.Object) boolean20);
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver22.isEmpty();
        boolean boolean25 = arrayListTestDriver22.add((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator26 = arrayListTestDriver22.iterator();
        boolean boolean27 = arrayListTestDriver4.remove((java.lang.Object) iterator26);
        java.lang.Object[] objArray28 = arrayListTestDriver4.toArray();
        boolean boolean29 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver4);
        boolean boolean30 = arrayListTestDriver4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test072");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (short) -1);
        boolean boolean8 = arrayListTestDriver5.isEmpty();
        boolean boolean9 = arrayListTestDriver5.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver10.isEmpty();
        boolean boolean13 = arrayListTestDriver10.contains((java.lang.Object) (byte) -1);
        boolean boolean14 = arrayListTestDriver10.isEmpty();
        boolean boolean15 = arrayListTestDriver5.contains((java.lang.Object) arrayListTestDriver10);
        boolean boolean16 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test073");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.contains((java.lang.Object) false);
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.contains((java.lang.Object) boolean8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test074");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test075");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean6 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver4.set((int) (short) 100, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test076");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver5.isEmpty();
        boolean boolean8 = arrayListTestDriver5.contains((java.lang.Object) (byte) -1);
        boolean boolean9 = arrayListTestDriver5.isEmpty();
        boolean boolean10 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver5);
        experiment.util.Iterator iterator11 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test077");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (short) -1);
        boolean boolean11 = arrayListTestDriver8.isEmpty();
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver13.isEmpty();
        boolean boolean16 = arrayListTestDriver13.contains((java.lang.Object) (byte) -1);
        boolean boolean17 = arrayListTestDriver13.isEmpty();
        boolean boolean18 = arrayListTestDriver8.contains((java.lang.Object) arrayListTestDriver13);
        java.lang.Object[] objArray19 = arrayListTestDriver13.toArray();
        experiment.util.Iterator iterator20 = arrayListTestDriver13.iterator();
        java.lang.Object[] objArray21 = arrayListTestDriver13.toArray();
        boolean boolean22 = arrayListTestDriver0.add((java.lang.Object) objArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = arrayListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test078");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        int int14 = arrayListTestDriver13.size();
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) int14);
        experiment.util.ListIterator listIterator17 = arrayListTestDriver0.listIterator((int) (short) 0);
        boolean boolean18 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = arrayListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test079");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test080");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        int int14 = arrayListTestDriver13.size();
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) int14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = arrayListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test081");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        int int13 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (short) -1);
        boolean boolean17 = arrayListTestDriver14.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        int int19 = arrayListTestDriver18.size();
        boolean boolean20 = arrayListTestDriver14.equals_CUT((java.lang.Object) arrayListTestDriver18);
        boolean boolean21 = arrayListTestDriver12.equals_CUT((java.lang.Object) boolean20);
        java.lang.Object[] objArray22 = arrayListTestDriver12.toArray();
        boolean boolean23 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver12);
        experiment.util.ListIterator listIterator25 = arrayListTestDriver12.listIterator((int) (short) 0);
        int int26 = arrayListTestDriver12.size();
        int int27 = arrayListTestDriver12.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator29 = arrayListTestDriver12.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test082");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.contains((java.lang.Object) (byte) -1);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        arrayListTestDriver4.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        boolean boolean14 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver15.isEmpty();
        boolean boolean18 = arrayListTestDriver15.contains((java.lang.Object) (byte) -1);
        boolean boolean19 = arrayListTestDriver15.isEmpty();
        boolean boolean20 = arrayListTestDriver10.contains((java.lang.Object) arrayListTestDriver15);
        boolean boolean21 = arrayListTestDriver4.add((java.lang.Object) boolean20);
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver22.isEmpty();
        boolean boolean25 = arrayListTestDriver22.add((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator26 = arrayListTestDriver22.iterator();
        boolean boolean27 = arrayListTestDriver4.remove((java.lang.Object) iterator26);
        java.lang.Object[] objArray28 = arrayListTestDriver4.toArray();
        boolean boolean29 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator30 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = arrayListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test083");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test084");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        int int13 = arrayListTestDriver12.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (short) -1);
        boolean boolean17 = arrayListTestDriver14.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        int int19 = arrayListTestDriver18.size();
        boolean boolean20 = arrayListTestDriver14.equals_CUT((java.lang.Object) arrayListTestDriver18);
        boolean boolean21 = arrayListTestDriver12.equals_CUT((java.lang.Object) boolean20);
        java.lang.Object[] objArray22 = arrayListTestDriver12.toArray();
        boolean boolean23 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = arrayListTestDriver4.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test085");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) (short) -1);
        java.lang.Object[] objArray16 = arrayListTestDriver13.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        boolean boolean20 = arrayListTestDriver17.equals_CUT((java.lang.Object) (byte) 0);
        boolean boolean21 = arrayListTestDriver13.contains((java.lang.Object) arrayListTestDriver17);
        boolean boolean22 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = arrayListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test086");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        int int14 = arrayListTestDriver13.size();
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) int14);
        experiment.util.ListIterator listIterator17 = arrayListTestDriver0.listIterator((int) (short) 0);
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator19 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator21 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test087");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator15 = arrayListTestDriver4.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test088");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test089");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        arrayListTestDriver6.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver14.isEmpty();
        boolean boolean16 = arrayListTestDriver10.remove((java.lang.Object) arrayListTestDriver14);
        boolean boolean17 = arrayListTestDriver6.add((java.lang.Object) arrayListTestDriver10);
        arrayListTestDriver6.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (short) -1);
        boolean boolean22 = arrayListTestDriver19.isEmpty();
        boolean boolean23 = arrayListTestDriver19.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean25 = arrayListTestDriver24.isEmpty();
        boolean boolean27 = arrayListTestDriver24.contains((java.lang.Object) (byte) -1);
        boolean boolean28 = arrayListTestDriver24.isEmpty();
        boolean boolean29 = arrayListTestDriver19.contains((java.lang.Object) arrayListTestDriver24);
        boolean boolean30 = arrayListTestDriver6.contains((java.lang.Object) boolean29);
        int int31 = arrayListTestDriver6.size();
        boolean boolean32 = arrayListTestDriver0.equals_CUT((java.lang.Object) int31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = arrayListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test090");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        int int2 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) (short) -1);
        arrayListTestDriver3.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) (short) -1);
        boolean boolean10 = arrayListTestDriver7.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver11.isEmpty();
        boolean boolean13 = arrayListTestDriver7.remove((java.lang.Object) arrayListTestDriver11);
        boolean boolean14 = arrayListTestDriver3.add((java.lang.Object) arrayListTestDriver7);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        int int16 = arrayListTestDriver15.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.remove((java.lang.Object) (short) -1);
        boolean boolean20 = arrayListTestDriver17.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        int int22 = arrayListTestDriver21.size();
        boolean boolean23 = arrayListTestDriver17.equals_CUT((java.lang.Object) arrayListTestDriver21);
        boolean boolean24 = arrayListTestDriver15.equals_CUT((java.lang.Object) boolean23);
        java.lang.Object[] objArray25 = arrayListTestDriver15.toArray();
        boolean boolean26 = arrayListTestDriver7.remove((java.lang.Object) arrayListTestDriver15);
        experiment.util.ListIterator listIterator28 = arrayListTestDriver15.listIterator((int) (short) 0);
        boolean boolean29 = arrayListTestDriver0.remove((java.lang.Object) listIterator28);
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        boolean boolean33 = arrayListTestDriver31.remove((java.lang.Object) (short) -1);
        boolean boolean34 = arrayListTestDriver31.isEmpty();
        boolean boolean35 = arrayListTestDriver31.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        boolean boolean37 = arrayListTestDriver36.isEmpty();
        boolean boolean39 = arrayListTestDriver36.contains((java.lang.Object) (byte) -1);
        boolean boolean40 = arrayListTestDriver36.isEmpty();
        boolean boolean41 = arrayListTestDriver31.contains((java.lang.Object) arrayListTestDriver36);
        java.lang.Object[] objArray42 = arrayListTestDriver36.toArray();
        experiment.util.Iterator iterator43 = arrayListTestDriver36.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = arrayListTestDriver0.set(1, (java.lang.Object) iterator43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(listIterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(iterator43);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test091");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (short) -1);
        boolean boolean8 = arrayListTestDriver5.isEmpty();
        boolean boolean9 = arrayListTestDriver5.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver10.isEmpty();
        boolean boolean13 = arrayListTestDriver10.contains((java.lang.Object) (byte) -1);
        boolean boolean14 = arrayListTestDriver10.isEmpty();
        boolean boolean15 = arrayListTestDriver5.contains((java.lang.Object) arrayListTestDriver10);
        boolean boolean16 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean15);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator18 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test092");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        boolean boolean10 = arrayListTestDriver0.add((java.lang.Object) ' ');
        int int11 = arrayListTestDriver0.size();
        int int12 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = arrayListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test093");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) (short) -1);
        java.lang.Object[] objArray16 = arrayListTestDriver13.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        boolean boolean20 = arrayListTestDriver17.equals_CUT((java.lang.Object) (byte) 0);
        boolean boolean21 = arrayListTestDriver13.contains((java.lang.Object) arrayListTestDriver17);
        boolean boolean22 = arrayListTestDriver4.equals_CUT((java.lang.Object) boolean21);
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = arrayListTestDriver4.remove(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test094");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        int int5 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test095");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test096");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver5.isEmpty();
        boolean boolean8 = arrayListTestDriver5.contains((java.lang.Object) (byte) -1);
        boolean boolean9 = arrayListTestDriver5.isEmpty();
        boolean boolean10 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver5);
        java.lang.Object[] objArray11 = arrayListTestDriver5.toArray();
        experiment.util.Iterator iterator12 = arrayListTestDriver5.iterator();
        java.lang.Class<?> wildcardClass13 = arrayListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test097");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        int int5 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver6.isEmpty();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = arrayListTestDriver6.contains(obj8);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver10.isEmpty();
        boolean boolean13 = arrayListTestDriver10.contains((java.lang.Object) (byte) -1);
        boolean boolean14 = arrayListTestDriver10.isEmpty();
        boolean boolean15 = arrayListTestDriver6.add((java.lang.Object) arrayListTestDriver10);
        experiment.util.Iterator iterator16 = arrayListTestDriver6.iterator();
        java.lang.Class<?> wildcardClass17 = arrayListTestDriver6.getClass();
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver6.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test098");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver5.isEmpty();
        boolean boolean8 = arrayListTestDriver5.contains((java.lang.Object) (byte) -1);
        boolean boolean9 = arrayListTestDriver5.isEmpty();
        boolean boolean10 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver5);
        experiment.util.Iterator iterator11 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver13.isEmpty();
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = arrayListTestDriver13.contains(obj15);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver17.isEmpty();
        boolean boolean20 = arrayListTestDriver17.add((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator21 = arrayListTestDriver17.iterator();
        boolean boolean22 = arrayListTestDriver13.equals_CUT((java.lang.Object) iterator21);
        boolean boolean23 = arrayListTestDriver12.equals_CUT((java.lang.Object) boolean22);
        boolean boolean24 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver12);
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver25.isEmpty();
        boolean boolean28 = arrayListTestDriver25.contains((java.lang.Object) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver29.isEmpty();
        boolean boolean32 = arrayListTestDriver29.contains((java.lang.Object) (short) 0);
        boolean boolean33 = arrayListTestDriver25.contains((java.lang.Object) boolean32);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        int int35 = arrayListTestDriver34.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        boolean boolean38 = arrayListTestDriver36.remove((java.lang.Object) (short) -1);
        boolean boolean39 = arrayListTestDriver36.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver40 = new experiment.util.ArrayListTestDriver();
        int int41 = arrayListTestDriver40.size();
        boolean boolean42 = arrayListTestDriver36.equals_CUT((java.lang.Object) arrayListTestDriver40);
        boolean boolean43 = arrayListTestDriver34.equals_CUT((java.lang.Object) boolean42);
        boolean boolean44 = arrayListTestDriver25.equals_CUT((java.lang.Object) boolean42);
        boolean boolean46 = arrayListTestDriver25.contains((java.lang.Object) 100.0f);
        boolean boolean47 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator49 = arrayListTestDriver25.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test099");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver14.isEmpty();
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = arrayListTestDriver14.contains(obj16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver18.isEmpty();
        boolean boolean21 = arrayListTestDriver18.add((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator22 = arrayListTestDriver18.iterator();
        boolean boolean23 = arrayListTestDriver14.equals_CUT((java.lang.Object) iterator22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = arrayListTestDriver4.set((int) (byte) 10, (java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test100");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test101");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) (short) -1);
        java.lang.Object[] objArray16 = arrayListTestDriver13.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        boolean boolean20 = arrayListTestDriver17.equals_CUT((java.lang.Object) (byte) 0);
        boolean boolean21 = arrayListTestDriver13.contains((java.lang.Object) arrayListTestDriver17);
        boolean boolean22 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver13);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.remove((java.lang.Object) (short) -1);
        arrayListTestDriver24.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean30 = arrayListTestDriver28.remove((java.lang.Object) (short) -1);
        boolean boolean31 = arrayListTestDriver28.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean33 = arrayListTestDriver32.isEmpty();
        boolean boolean34 = arrayListTestDriver28.remove((java.lang.Object) arrayListTestDriver32);
        boolean boolean35 = arrayListTestDriver24.add((java.lang.Object) arrayListTestDriver28);
        experiment.util.Iterator iterator36 = arrayListTestDriver28.iterator();
        experiment.util.Iterator iterator37 = arrayListTestDriver28.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = arrayListTestDriver0.set(100, (java.lang.Object) arrayListTestDriver28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(iterator37);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test102");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        int int15 = arrayListTestDriver14.size();
        boolean boolean16 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver14);
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver10);
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver19.isEmpty();
        boolean boolean22 = arrayListTestDriver19.add((java.lang.Object) 100.0d);
        boolean boolean24 = arrayListTestDriver19.remove((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = arrayListTestDriver10.set(100, (java.lang.Object) boolean24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test103");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (short) -1);
        boolean boolean11 = arrayListTestDriver8.isEmpty();
        boolean boolean12 = arrayListTestDriver8.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver13.isEmpty();
        boolean boolean16 = arrayListTestDriver13.contains((java.lang.Object) (byte) -1);
        boolean boolean17 = arrayListTestDriver13.isEmpty();
        boolean boolean18 = arrayListTestDriver8.contains((java.lang.Object) arrayListTestDriver13);
        java.lang.Object[] objArray19 = arrayListTestDriver13.toArray();
        experiment.util.Iterator iterator20 = arrayListTestDriver13.iterator();
        java.lang.Object[] objArray21 = arrayListTestDriver13.toArray();
        boolean boolean22 = arrayListTestDriver0.add((java.lang.Object) objArray21);
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        boolean boolean25 = arrayListTestDriver23.remove((java.lang.Object) (short) -1);
        boolean boolean26 = arrayListTestDriver23.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        int int28 = arrayListTestDriver27.size();
        boolean boolean29 = arrayListTestDriver23.equals_CUT((java.lang.Object) arrayListTestDriver27);
        boolean boolean30 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = arrayListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test104");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.contains((java.lang.Object) (byte) -1);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass11 = arrayListTestDriver8.getClass();
        boolean boolean12 = arrayListTestDriver4.contains((java.lang.Object) wildcardClass11);
        boolean boolean13 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) (short) -1);
        boolean boolean17 = arrayListTestDriver14.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        int int19 = arrayListTestDriver18.size();
        boolean boolean20 = arrayListTestDriver14.equals_CUT((java.lang.Object) arrayListTestDriver18);
        boolean boolean21 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver14);
        java.lang.Object[] objArray22 = arrayListTestDriver14.toArray();
        boolean boolean23 = arrayListTestDriver0.contains((java.lang.Object) objArray22);
        java.lang.Class<?> wildcardClass24 = objArray22.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test105");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (byte) -1);
        boolean boolean8 = arrayListTestDriver4.isEmpty();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        int int12 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test106");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test107");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver6.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test108");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        boolean boolean15 = arrayListTestDriver12.isEmpty();
        boolean boolean16 = arrayListTestDriver12.isEmpty();
        boolean boolean17 = arrayListTestDriver4.remove((java.lang.Object) boolean16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) (short) -1);
        int int21 = arrayListTestDriver18.size();
        boolean boolean22 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator24 = arrayListTestDriver18.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test109");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver4.iterator();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = arrayListTestDriver4.remove(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test110");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.contains((java.lang.Object) (byte) -1);
        boolean boolean8 = arrayListTestDriver4.isEmpty();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        boolean boolean11 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (short) -1);
        boolean boolean19 = arrayListTestDriver16.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver20.isEmpty();
        boolean boolean22 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver20);
        boolean boolean23 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        int int25 = arrayListTestDriver24.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (short) -1);
        boolean boolean29 = arrayListTestDriver26.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        int int31 = arrayListTestDriver30.size();
        boolean boolean32 = arrayListTestDriver26.equals_CUT((java.lang.Object) arrayListTestDriver30);
        boolean boolean33 = arrayListTestDriver24.equals_CUT((java.lang.Object) boolean32);
        java.lang.Object[] objArray34 = arrayListTestDriver24.toArray();
        boolean boolean35 = arrayListTestDriver16.remove((java.lang.Object) arrayListTestDriver24);
        boolean boolean36 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver24);
        int int37 = arrayListTestDriver24.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test111");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (short) -1);
        arrayListTestDriver5.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) (short) -1);
        boolean boolean12 = arrayListTestDriver9.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver13.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) arrayListTestDriver13);
        boolean boolean16 = arrayListTestDriver5.add((java.lang.Object) arrayListTestDriver9);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (short) -1);
        boolean boolean22 = arrayListTestDriver19.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        int int24 = arrayListTestDriver23.size();
        boolean boolean25 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver23);
        boolean boolean26 = arrayListTestDriver17.equals_CUT((java.lang.Object) boolean25);
        java.lang.Object[] objArray27 = arrayListTestDriver17.toArray();
        boolean boolean28 = arrayListTestDriver9.remove((java.lang.Object) arrayListTestDriver17);
        experiment.util.ListIterator listIterator30 = arrayListTestDriver17.listIterator((int) (short) 0);
        boolean boolean31 = arrayListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean34 = arrayListTestDriver32.remove((java.lang.Object) (short) -1);
        boolean boolean35 = arrayListTestDriver32.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        int int37 = arrayListTestDriver36.size();
        boolean boolean38 = arrayListTestDriver32.equals_CUT((java.lang.Object) arrayListTestDriver36);
        experiment.util.Iterator iterator39 = arrayListTestDriver36.iterator();
        boolean boolean40 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = arrayListTestDriver36.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(listIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test112");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        int int14 = arrayListTestDriver13.size();
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) int14);
        experiment.util.ListIterator listIterator17 = arrayListTestDriver0.listIterator((int) (short) 0);
        boolean boolean18 = arrayListTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass19 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test113");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        boolean boolean15 = arrayListTestDriver12.isEmpty();
        boolean boolean16 = arrayListTestDriver12.isEmpty();
        boolean boolean17 = arrayListTestDriver4.remove((java.lang.Object) boolean16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) (short) -1);
        int int21 = arrayListTestDriver18.size();
        boolean boolean22 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver18);
        int int23 = arrayListTestDriver18.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = arrayListTestDriver18.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test114");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver6.isEmpty();
        boolean boolean10 = arrayListTestDriver6.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver11.isEmpty();
        boolean boolean14 = arrayListTestDriver11.contains((java.lang.Object) (byte) -1);
        boolean boolean15 = arrayListTestDriver11.isEmpty();
        boolean boolean16 = arrayListTestDriver6.contains((java.lang.Object) arrayListTestDriver11);
        boolean boolean17 = arrayListTestDriver0.add((java.lang.Object) boolean16);
        experiment.util.ListIterator listIterator19 = arrayListTestDriver0.listIterator((int) (short) 1);
        experiment.util.Iterator iterator20 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator22 = arrayListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(listIterator19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test115");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        int int14 = arrayListTestDriver13.size();
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) int14);
        boolean boolean16 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test116");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) 100.0d);
        boolean boolean5 = arrayListTestDriver0.remove((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass6 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test117");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        int int15 = arrayListTestDriver14.size();
        boolean boolean16 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver14);
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver10);
        java.lang.Object[] objArray18 = arrayListTestDriver10.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver10.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test118");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        int int15 = arrayListTestDriver14.size();
        boolean boolean16 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver14);
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver10);
        experiment.util.Iterator iterator18 = arrayListTestDriver10.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (short) -1);
        boolean boolean22 = arrayListTestDriver19.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        int int24 = arrayListTestDriver23.size();
        boolean boolean25 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver23);
        boolean boolean26 = arrayListTestDriver10.remove((java.lang.Object) boolean25);
        experiment.util.Iterator iterator27 = arrayListTestDriver10.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver29.remove((java.lang.Object) (short) -1);
        boolean boolean32 = arrayListTestDriver29.isEmpty();
        boolean boolean33 = arrayListTestDriver29.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        boolean boolean35 = arrayListTestDriver34.isEmpty();
        boolean boolean37 = arrayListTestDriver34.contains((java.lang.Object) (byte) -1);
        boolean boolean38 = arrayListTestDriver34.isEmpty();
        boolean boolean39 = arrayListTestDriver29.contains((java.lang.Object) arrayListTestDriver34);
        experiment.util.Iterator iterator40 = arrayListTestDriver29.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver41 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver42 = new experiment.util.ArrayListTestDriver();
        boolean boolean43 = arrayListTestDriver42.isEmpty();
        java.lang.Object obj44 = new java.lang.Object();
        boolean boolean45 = arrayListTestDriver42.contains(obj44);
        experiment.util.ArrayListTestDriver arrayListTestDriver46 = new experiment.util.ArrayListTestDriver();
        boolean boolean47 = arrayListTestDriver46.isEmpty();
        boolean boolean49 = arrayListTestDriver46.add((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator50 = arrayListTestDriver46.iterator();
        boolean boolean51 = arrayListTestDriver42.equals_CUT((java.lang.Object) iterator50);
        boolean boolean52 = arrayListTestDriver41.equals_CUT((java.lang.Object) boolean51);
        boolean boolean53 = arrayListTestDriver29.add((java.lang.Object) arrayListTestDriver41);
        experiment.util.ArrayListTestDriver arrayListTestDriver54 = new experiment.util.ArrayListTestDriver();
        boolean boolean55 = arrayListTestDriver54.isEmpty();
        boolean boolean57 = arrayListTestDriver54.contains((java.lang.Object) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver58 = new experiment.util.ArrayListTestDriver();
        boolean boolean59 = arrayListTestDriver58.isEmpty();
        boolean boolean61 = arrayListTestDriver58.contains((java.lang.Object) (short) 0);
        boolean boolean62 = arrayListTestDriver54.contains((java.lang.Object) boolean61);
        experiment.util.ArrayListTestDriver arrayListTestDriver63 = new experiment.util.ArrayListTestDriver();
        int int64 = arrayListTestDriver63.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver65 = new experiment.util.ArrayListTestDriver();
        boolean boolean67 = arrayListTestDriver65.remove((java.lang.Object) (short) -1);
        boolean boolean68 = arrayListTestDriver65.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver69 = new experiment.util.ArrayListTestDriver();
        int int70 = arrayListTestDriver69.size();
        boolean boolean71 = arrayListTestDriver65.equals_CUT((java.lang.Object) arrayListTestDriver69);
        boolean boolean72 = arrayListTestDriver63.equals_CUT((java.lang.Object) boolean71);
        boolean boolean73 = arrayListTestDriver54.equals_CUT((java.lang.Object) boolean71);
        boolean boolean75 = arrayListTestDriver54.contains((java.lang.Object) 100.0f);
        boolean boolean76 = arrayListTestDriver41.add((java.lang.Object) arrayListTestDriver54);
        boolean boolean77 = arrayListTestDriver54.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = arrayListTestDriver10.set((int) (short) 1, (java.lang.Object) boolean77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test119");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator12 = arrayListTestDriver0.iterator();
        java.lang.Object[] objArray13 = arrayListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test120");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.remove((java.lang.Object) (short) -1);
        arrayListTestDriver5.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) (short) -1);
        boolean boolean12 = arrayListTestDriver9.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver13.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) arrayListTestDriver13);
        boolean boolean16 = arrayListTestDriver5.add((java.lang.Object) arrayListTestDriver9);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) (short) -1);
        boolean boolean22 = arrayListTestDriver19.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        int int24 = arrayListTestDriver23.size();
        boolean boolean25 = arrayListTestDriver19.equals_CUT((java.lang.Object) arrayListTestDriver23);
        boolean boolean26 = arrayListTestDriver17.equals_CUT((java.lang.Object) boolean25);
        java.lang.Object[] objArray27 = arrayListTestDriver17.toArray();
        boolean boolean28 = arrayListTestDriver9.remove((java.lang.Object) arrayListTestDriver17);
        experiment.util.ListIterator listIterator30 = arrayListTestDriver17.listIterator((int) (short) 0);
        boolean boolean31 = arrayListTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean34 = arrayListTestDriver32.remove((java.lang.Object) (short) -1);
        boolean boolean35 = arrayListTestDriver32.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        boolean boolean38 = arrayListTestDriver36.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass39 = arrayListTestDriver36.getClass();
        boolean boolean40 = arrayListTestDriver32.contains((java.lang.Object) wildcardClass39);
        java.lang.Object[] objArray41 = arrayListTestDriver32.toArray();
        boolean boolean42 = arrayListTestDriver0.add((java.lang.Object) objArray41);
        java.lang.Object[] objArray43 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(listIterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[[]]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test121");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (short) -1);
        boolean boolean11 = arrayListTestDriver8.isEmpty();
        boolean boolean13 = arrayListTestDriver8.contains((java.lang.Object) false);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver14.isEmpty();
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = arrayListTestDriver14.contains(obj16);
        boolean boolean18 = arrayListTestDriver8.remove((java.lang.Object) boolean17);
        boolean boolean19 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver8);
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver21.remove((java.lang.Object) (short) -1);
        boolean boolean24 = arrayListTestDriver21.isEmpty();
        experiment.util.Iterator iterator25 = arrayListTestDriver21.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (short) -1);
        arrayListTestDriver26.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean32 = arrayListTestDriver30.remove((java.lang.Object) (short) -1);
        boolean boolean33 = arrayListTestDriver30.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        boolean boolean35 = arrayListTestDriver34.isEmpty();
        boolean boolean36 = arrayListTestDriver30.remove((java.lang.Object) arrayListTestDriver34);
        boolean boolean37 = arrayListTestDriver26.add((java.lang.Object) arrayListTestDriver30);
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        int int39 = arrayListTestDriver38.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver40 = new experiment.util.ArrayListTestDriver();
        boolean boolean42 = arrayListTestDriver40.remove((java.lang.Object) (short) -1);
        boolean boolean43 = arrayListTestDriver40.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver44 = new experiment.util.ArrayListTestDriver();
        int int45 = arrayListTestDriver44.size();
        boolean boolean46 = arrayListTestDriver40.equals_CUT((java.lang.Object) arrayListTestDriver44);
        boolean boolean47 = arrayListTestDriver38.equals_CUT((java.lang.Object) boolean46);
        java.lang.Object[] objArray48 = arrayListTestDriver38.toArray();
        boolean boolean49 = arrayListTestDriver30.remove((java.lang.Object) arrayListTestDriver38);
        experiment.util.ListIterator listIterator51 = arrayListTestDriver38.listIterator((int) (short) 0);
        boolean boolean52 = arrayListTestDriver21.contains((java.lang.Object) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver53 = new experiment.util.ArrayListTestDriver();
        boolean boolean55 = arrayListTestDriver53.remove((java.lang.Object) (short) -1);
        boolean boolean56 = arrayListTestDriver53.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver57 = new experiment.util.ArrayListTestDriver();
        int int58 = arrayListTestDriver57.size();
        boolean boolean59 = arrayListTestDriver53.equals_CUT((java.lang.Object) arrayListTestDriver57);
        experiment.util.Iterator iterator60 = arrayListTestDriver57.iterator();
        boolean boolean61 = arrayListTestDriver21.equals_CUT((java.lang.Object) arrayListTestDriver57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = arrayListTestDriver4.set((int) (short) 10, (java.lang.Object) boolean61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(listIterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test122");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean6 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver4);
        int int7 = arrayListTestDriver4.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test123");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = arrayListTestDriver0.contains(obj2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver4.isEmpty();
        boolean boolean7 = arrayListTestDriver4.add((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test124");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        boolean boolean6 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) (short) -1);
        arrayListTestDriver8.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        boolean boolean15 = arrayListTestDriver12.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean17 = arrayListTestDriver16.isEmpty();
        boolean boolean18 = arrayListTestDriver12.remove((java.lang.Object) arrayListTestDriver16);
        boolean boolean19 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver12);
        experiment.util.Iterator iterator20 = arrayListTestDriver12.iterator();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = arrayListTestDriver12.contains((java.lang.Object) wildcardClass22);
        boolean boolean24 = arrayListTestDriver4.remove((java.lang.Object) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = arrayListTestDriver4.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test125");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        java.lang.Object[] objArray9 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        experiment.util.Iterator iterator14 = arrayListTestDriver10.iterator();
        arrayListTestDriver10.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.remove((java.lang.Object) (short) -1);
        boolean boolean19 = arrayListTestDriver16.isEmpty();
        boolean boolean20 = arrayListTestDriver16.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver21.isEmpty();
        boolean boolean24 = arrayListTestDriver21.contains((java.lang.Object) (byte) -1);
        boolean boolean25 = arrayListTestDriver21.isEmpty();
        boolean boolean26 = arrayListTestDriver16.contains((java.lang.Object) arrayListTestDriver21);
        boolean boolean27 = arrayListTestDriver10.add((java.lang.Object) boolean26);
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver28.isEmpty();
        boolean boolean31 = arrayListTestDriver28.add((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator32 = arrayListTestDriver28.iterator();
        boolean boolean33 = arrayListTestDriver10.remove((java.lang.Object) iterator32);
        boolean boolean34 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = arrayListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test126");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test127");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass7);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean13 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        int int15 = arrayListTestDriver14.size();
        boolean boolean16 = arrayListTestDriver10.equals_CUT((java.lang.Object) arrayListTestDriver14);
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver10.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_54676380_1024_0.test128");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) (short) -1);
        boolean boolean7 = arrayListTestDriver4.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver8.isEmpty();
        boolean boolean10 = arrayListTestDriver4.remove((java.lang.Object) arrayListTestDriver8);
        boolean boolean11 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        int int14 = arrayListTestDriver13.size();
        boolean boolean15 = arrayListTestDriver0.add((java.lang.Object) int14);
        java.lang.Object[] objArray16 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.remove((java.lang.Object) (short) -1);
        boolean boolean20 = arrayListTestDriver17.isEmpty();
        experiment.util.Iterator iterator21 = arrayListTestDriver17.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.remove((java.lang.Object) (short) -1);
        arrayListTestDriver22.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) (short) -1);
        boolean boolean29 = arrayListTestDriver26.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver30.isEmpty();
        boolean boolean32 = arrayListTestDriver26.remove((java.lang.Object) arrayListTestDriver30);
        boolean boolean33 = arrayListTestDriver22.add((java.lang.Object) arrayListTestDriver26);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        int int35 = arrayListTestDriver34.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        boolean boolean38 = arrayListTestDriver36.remove((java.lang.Object) (short) -1);
        boolean boolean39 = arrayListTestDriver36.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver40 = new experiment.util.ArrayListTestDriver();
        int int41 = arrayListTestDriver40.size();
        boolean boolean42 = arrayListTestDriver36.equals_CUT((java.lang.Object) arrayListTestDriver40);
        boolean boolean43 = arrayListTestDriver34.equals_CUT((java.lang.Object) boolean42);
        java.lang.Object[] objArray44 = arrayListTestDriver34.toArray();
        boolean boolean45 = arrayListTestDriver26.remove((java.lang.Object) arrayListTestDriver34);
        experiment.util.ListIterator listIterator47 = arrayListTestDriver34.listIterator((int) (short) 0);
        boolean boolean48 = arrayListTestDriver17.contains((java.lang.Object) (short) 0);
        int int49 = arrayListTestDriver17.size();
        boolean boolean50 = arrayListTestDriver0.remove((java.lang.Object) int49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(listIterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

}
