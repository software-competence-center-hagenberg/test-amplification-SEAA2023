package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_ArrayListTest_2070236138_32_s {

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
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test001");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver2.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test002");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver2.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test004");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver3.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver3.add((java.lang.Object) arrayListTestDriver5);
        experiment.util.Iterator iterator7 = arrayListTestDriver3.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.set((int) (short) 10, (java.lang.Object) iterator7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test005");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver2.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test006");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator3 = arrayListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test007");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        arrayListTestDriver2.clear();
        arrayListTestDriver2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver2.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test008");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set((int) (short) -1, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test009");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        arrayListTestDriver2.clear();
        arrayListTestDriver2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver2.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test010");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray7 = arrayListTestDriver2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver2.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test011");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        boolean boolean10 = arrayListTestDriver2.remove((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver2.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test012");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        boolean boolean10 = arrayListTestDriver2.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = arrayListTestDriver2.contains(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test013");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver2.set(1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test014");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test015");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver2.set((-1), (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test016");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.set((int) (byte) 100, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test017");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver2.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test018");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test019");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        int int5 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver7.clear();
        boolean boolean10 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator11 = arrayListTestDriver7.iterator();
        int int12 = arrayListTestDriver7.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.set(1, (java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test020");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        java.lang.Object[] objArray9 = arrayListTestDriver2.toArray();
        boolean boolean11 = arrayListTestDriver2.remove((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver2.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test021");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test022");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean2 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test023");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        java.lang.Object[] objArray9 = arrayListTestDriver2.toArray();
        boolean boolean11 = arrayListTestDriver2.remove((java.lang.Object) 1.0d);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver14);
        boolean boolean16 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver2.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test024");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver5.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver5.add((java.lang.Object) arrayListTestDriver7);
        int int9 = arrayListTestDriver7.size();
        boolean boolean11 = arrayListTestDriver7.equals_CUT((java.lang.Object) true);
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = arrayListTestDriver7.add(obj12);
        boolean boolean15 = arrayListTestDriver7.remove((java.lang.Object) (byte) 100);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver17.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver17.add((java.lang.Object) arrayListTestDriver19);
        int int21 = arrayListTestDriver19.size();
        boolean boolean23 = arrayListTestDriver19.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray24 = arrayListTestDriver19.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver25.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver25.add((java.lang.Object) arrayListTestDriver27);
        int int29 = arrayListTestDriver27.size();
        boolean boolean30 = arrayListTestDriver19.contains((java.lang.Object) int29);
        boolean boolean31 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean30);
        boolean boolean33 = arrayListTestDriver0.add((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = arrayListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test025");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test026");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        boolean boolean7 = arrayListTestDriver2.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver2.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver9.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver11);
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver11.remove((java.lang.Object) arrayListTestDriver13);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver15.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver15.add((java.lang.Object) arrayListTestDriver17);
        experiment.util.Iterator iterator19 = arrayListTestDriver17.iterator();
        boolean boolean20 = arrayListTestDriver13.add((java.lang.Object) arrayListTestDriver17);
        boolean boolean21 = arrayListTestDriver2.add((java.lang.Object) arrayListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator23 = arrayListTestDriver13.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test027");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        java.lang.Object[] objArray9 = arrayListTestDriver2.toArray();
        boolean boolean11 = arrayListTestDriver2.remove((java.lang.Object) 1.0d);
        java.lang.Object[] objArray12 = arrayListTestDriver2.toArray();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = arrayListTestDriver2.equals_CUT(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test028");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        java.lang.Object[] objArray9 = arrayListTestDriver2.toArray();
        boolean boolean11 = arrayListTestDriver2.remove((java.lang.Object) 1.0d);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver14);
        boolean boolean16 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator18 = arrayListTestDriver2.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test029");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test030");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        java.lang.Class<?> wildcardClass9 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test031");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver7.clear();
        boolean boolean10 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator11 = arrayListTestDriver7.iterator();
        boolean boolean12 = arrayListTestDriver2.add((java.lang.Object) arrayListTestDriver7);
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver13.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver13.add((java.lang.Object) arrayListTestDriver15);
        int int17 = arrayListTestDriver15.size();
        boolean boolean19 = arrayListTestDriver15.equals_CUT((java.lang.Object) true);
        experiment.util.Iterator iterator20 = arrayListTestDriver15.iterator();
        boolean boolean21 = arrayListTestDriver7.equals_CUT((java.lang.Object) iterator20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = arrayListTestDriver7.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test032");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray7 = arrayListTestDriver2.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver8.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver10);
        int int12 = arrayListTestDriver10.size();
        boolean boolean13 = arrayListTestDriver2.contains((java.lang.Object) int12);
        java.lang.Object[] objArray14 = arrayListTestDriver2.toArray();
        java.lang.Object[] objArray15 = arrayListTestDriver2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = arrayListTestDriver2.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

}
