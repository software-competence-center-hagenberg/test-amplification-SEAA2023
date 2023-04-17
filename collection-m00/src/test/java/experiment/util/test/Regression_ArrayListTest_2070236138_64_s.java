package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_ArrayListTest_2070236138_64_s {

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

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test033");
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
            experiment.util.ListIterator listIterator12 = arrayListTestDriver2.listIterator((int) '4');
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test034");
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
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver22.clear();
        boolean boolean25 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator26 = arrayListTestDriver22.iterator();
        boolean boolean27 = arrayListTestDriver13.remove((java.lang.Object) arrayListTestDriver22);
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver28.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver28.add((java.lang.Object) arrayListTestDriver30);
        int int32 = arrayListTestDriver30.size();
        boolean boolean34 = arrayListTestDriver30.equals_CUT((java.lang.Object) true);
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = arrayListTestDriver30.add(obj35);
        java.lang.Object[] objArray37 = arrayListTestDriver30.toArray();
        experiment.util.Iterator iterator38 = arrayListTestDriver30.iterator();
        boolean boolean39 = arrayListTestDriver22.equals_CUT((java.lang.Object) arrayListTestDriver30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = arrayListTestDriver22.remove((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test035");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        int int5 = arrayListTestDriver0.size();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.Iterator iterator9 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test036");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        boolean boolean7 = arrayListTestDriver2.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver2.iterator();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver2.set(10, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test037");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.Iterator iterator4 = arrayListTestDriver2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver2.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test038");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver2.remove((java.lang.Object) arrayListTestDriver4);
        boolean boolean7 = arrayListTestDriver4.add((java.lang.Object) 1.0f);
        arrayListTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver4.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test039");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = arrayListTestDriver2.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test040");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver2.remove((java.lang.Object) arrayListTestDriver4);
        boolean boolean7 = arrayListTestDriver4.add((java.lang.Object) 1.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver8.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver10);
        experiment.util.Iterator iterator12 = arrayListTestDriver8.iterator();
        boolean boolean13 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver8);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = arrayListTestDriver8.remove(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test041");
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
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver22.clear();
        boolean boolean25 = arrayListTestDriver22.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator26 = arrayListTestDriver22.iterator();
        boolean boolean27 = arrayListTestDriver13.remove((java.lang.Object) arrayListTestDriver22);
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver28.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver28.add((java.lang.Object) arrayListTestDriver30);
        int int32 = arrayListTestDriver30.size();
        boolean boolean34 = arrayListTestDriver30.equals_CUT((java.lang.Object) true);
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = arrayListTestDriver30.add(obj35);
        java.lang.Object[] objArray37 = arrayListTestDriver30.toArray();
        experiment.util.Iterator iterator38 = arrayListTestDriver30.iterator();
        boolean boolean39 = arrayListTestDriver22.equals_CUT((java.lang.Object) arrayListTestDriver30);
        experiment.util.ArrayListTestDriver arrayListTestDriver41 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver41.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver43 = new experiment.util.ArrayListTestDriver();
        boolean boolean44 = arrayListTestDriver41.add((java.lang.Object) arrayListTestDriver43);
        int int45 = arrayListTestDriver43.size();
        boolean boolean47 = arrayListTestDriver43.equals_CUT((java.lang.Object) true);
        boolean boolean48 = arrayListTestDriver43.isEmpty();
        experiment.util.Iterator iterator49 = arrayListTestDriver43.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver50 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver50.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver52 = new experiment.util.ArrayListTestDriver();
        boolean boolean53 = arrayListTestDriver50.add((java.lang.Object) arrayListTestDriver52);
        experiment.util.ArrayListTestDriver arrayListTestDriver54 = new experiment.util.ArrayListTestDriver();
        boolean boolean55 = arrayListTestDriver52.remove((java.lang.Object) arrayListTestDriver54);
        experiment.util.ArrayListTestDriver arrayListTestDriver56 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver56.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver58 = new experiment.util.ArrayListTestDriver();
        boolean boolean59 = arrayListTestDriver56.add((java.lang.Object) arrayListTestDriver58);
        experiment.util.Iterator iterator60 = arrayListTestDriver58.iterator();
        boolean boolean61 = arrayListTestDriver54.add((java.lang.Object) arrayListTestDriver58);
        boolean boolean62 = arrayListTestDriver43.add((java.lang.Object) arrayListTestDriver54);
        experiment.util.ArrayListTestDriver arrayListTestDriver63 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver63.clear();
        boolean boolean66 = arrayListTestDriver63.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator67 = arrayListTestDriver63.iterator();
        boolean boolean68 = arrayListTestDriver54.remove((java.lang.Object) arrayListTestDriver63);
        experiment.util.ArrayListTestDriver arrayListTestDriver69 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver69.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver71 = new experiment.util.ArrayListTestDriver();
        boolean boolean72 = arrayListTestDriver69.add((java.lang.Object) arrayListTestDriver71);
        int int73 = arrayListTestDriver71.size();
        boolean boolean75 = arrayListTestDriver71.equals_CUT((java.lang.Object) true);
        java.lang.Object obj76 = new java.lang.Object();
        boolean boolean77 = arrayListTestDriver71.add(obj76);
        java.lang.Object[] objArray78 = arrayListTestDriver71.toArray();
        experiment.util.Iterator iterator79 = arrayListTestDriver71.iterator();
        boolean boolean80 = arrayListTestDriver63.equals_CUT((java.lang.Object) arrayListTestDriver71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = arrayListTestDriver30.set((int) (short) 100, (java.lang.Object) arrayListTestDriver63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test042");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        java.lang.Object[] objArray9 = arrayListTestDriver2.toArray();
        experiment.util.Iterator iterator10 = arrayListTestDriver2.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver14);
        int int16 = arrayListTestDriver14.size();
        boolean boolean18 = arrayListTestDriver14.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray19 = arrayListTestDriver14.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver20.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver20.add((java.lang.Object) arrayListTestDriver22);
        int int24 = arrayListTestDriver22.size();
        boolean boolean25 = arrayListTestDriver14.contains((java.lang.Object) int24);
        java.lang.Object[] objArray26 = arrayListTestDriver14.toArray();
        java.lang.Object[] objArray27 = arrayListTestDriver14.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = arrayListTestDriver2.set((int) '4', (java.lang.Object) objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test043");
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
        boolean boolean23 = arrayListTestDriver2.equals_CUT((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = arrayListTestDriver2.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test044");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        int int5 = arrayListTestDriver0.size();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        boolean boolean9 = arrayListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test045");
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
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = arrayListTestDriver7.set(100, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test046");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        boolean boolean7 = arrayListTestDriver2.isEmpty();
        experiment.util.Iterator iterator8 = arrayListTestDriver2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = arrayListTestDriver2.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test047");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver2.remove((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver6.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver6.add((java.lang.Object) arrayListTestDriver8);
        experiment.util.Iterator iterator10 = arrayListTestDriver8.iterator();
        boolean boolean11 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver8);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver14);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean17 = arrayListTestDriver14.remove((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver18.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver18.add((java.lang.Object) arrayListTestDriver20);
        experiment.util.Iterator iterator22 = arrayListTestDriver20.iterator();
        boolean boolean23 = arrayListTestDriver16.add((java.lang.Object) arrayListTestDriver20);
        arrayListTestDriver20.clear();
        boolean boolean25 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver20);
        boolean boolean26 = arrayListTestDriver4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test048");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray7 = arrayListTestDriver2.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver8.clear();
        boolean boolean10 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver2.get((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test049");
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
        int int17 = arrayListTestDriver14.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver18.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver18.add((java.lang.Object) arrayListTestDriver20);
        experiment.util.Iterator iterator22 = arrayListTestDriver18.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver23.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver23.add((java.lang.Object) arrayListTestDriver25);
        int int27 = arrayListTestDriver25.size();
        boolean boolean29 = arrayListTestDriver25.equals_CUT((java.lang.Object) true);
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = arrayListTestDriver25.add(obj30);
        boolean boolean33 = arrayListTestDriver25.remove((java.lang.Object) (byte) 100);
        boolean boolean34 = arrayListTestDriver18.contains((java.lang.Object) (byte) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver35 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver35.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver37 = new experiment.util.ArrayListTestDriver();
        boolean boolean38 = arrayListTestDriver35.add((java.lang.Object) arrayListTestDriver37);
        int int39 = arrayListTestDriver37.size();
        boolean boolean41 = arrayListTestDriver37.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray42 = arrayListTestDriver37.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver43 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver43.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver45 = new experiment.util.ArrayListTestDriver();
        boolean boolean46 = arrayListTestDriver43.add((java.lang.Object) arrayListTestDriver45);
        int int47 = arrayListTestDriver45.size();
        boolean boolean48 = arrayListTestDriver37.contains((java.lang.Object) int47);
        boolean boolean49 = arrayListTestDriver18.equals_CUT((java.lang.Object) boolean48);
        boolean boolean51 = arrayListTestDriver18.add((java.lang.Object) (byte) 10);
        boolean boolean52 = arrayListTestDriver14.equals_CUT((java.lang.Object) boolean51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = arrayListTestDriver14.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test050");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.Iterator iterator4 = arrayListTestDriver2.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver5.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver5.add((java.lang.Object) arrayListTestDriver7);
        int int9 = arrayListTestDriver7.size();
        boolean boolean11 = arrayListTestDriver7.equals_CUT((java.lang.Object) true);
        boolean boolean12 = arrayListTestDriver7.isEmpty();
        boolean boolean13 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver7);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver14.clear();
        boolean boolean17 = arrayListTestDriver14.add((java.lang.Object) (-1.0d));
        boolean boolean18 = arrayListTestDriver2.contains((java.lang.Object) arrayListTestDriver14);
        boolean boolean19 = arrayListTestDriver2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test051");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        int int5 = arrayListTestDriver0.size();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.Iterator iterator9 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass10 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test052");
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
        boolean boolean22 = arrayListTestDriver7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = arrayListTestDriver7.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 1");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test053");
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
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver2.set((int) (short) 1, obj13);
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
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test054");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver6.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver6.add((java.lang.Object) arrayListTestDriver8);
        experiment.util.Iterator iterator10 = arrayListTestDriver6.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver11.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver11.add((java.lang.Object) arrayListTestDriver13);
        int int15 = arrayListTestDriver13.size();
        boolean boolean17 = arrayListTestDriver13.equals_CUT((java.lang.Object) true);
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = arrayListTestDriver13.add(obj18);
        boolean boolean21 = arrayListTestDriver13.remove((java.lang.Object) (byte) 100);
        boolean boolean22 = arrayListTestDriver6.contains((java.lang.Object) (byte) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver23.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver23.add((java.lang.Object) arrayListTestDriver25);
        int int27 = arrayListTestDriver25.size();
        boolean boolean29 = arrayListTestDriver25.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray30 = arrayListTestDriver25.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver31.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        boolean boolean34 = arrayListTestDriver31.add((java.lang.Object) arrayListTestDriver33);
        int int35 = arrayListTestDriver33.size();
        boolean boolean36 = arrayListTestDriver25.contains((java.lang.Object) int35);
        boolean boolean37 = arrayListTestDriver6.equals_CUT((java.lang.Object) boolean36);
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        int int39 = arrayListTestDriver38.size();
        boolean boolean40 = arrayListTestDriver38.isEmpty();
        int int41 = arrayListTestDriver38.size();
        boolean boolean42 = arrayListTestDriver6.contains((java.lang.Object) arrayListTestDriver38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = arrayListTestDriver0.set(100, (java.lang.Object) arrayListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test055");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.Iterator iterator4 = arrayListTestDriver2.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver5.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver5.add((java.lang.Object) arrayListTestDriver7);
        int int9 = arrayListTestDriver7.size();
        boolean boolean11 = arrayListTestDriver7.equals_CUT((java.lang.Object) true);
        boolean boolean12 = arrayListTestDriver7.isEmpty();
        boolean boolean13 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver7);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        int int16 = arrayListTestDriver15.size();
        boolean boolean18 = arrayListTestDriver15.remove((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver2.set(100, (java.lang.Object) arrayListTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test056");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = arrayListTestDriver2.add(obj7);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver9.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver11);
        int int13 = arrayListTestDriver11.size();
        boolean boolean15 = arrayListTestDriver11.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray16 = arrayListTestDriver11.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver17.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver17.add((java.lang.Object) arrayListTestDriver19);
        int int21 = arrayListTestDriver19.size();
        boolean boolean22 = arrayListTestDriver11.contains((java.lang.Object) int21);
        java.lang.Object[] objArray23 = arrayListTestDriver11.toArray();
        boolean boolean24 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver11);
        java.lang.Class<?> wildcardClass25 = arrayListTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test057");
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
        boolean boolean13 = arrayListTestDriver2.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver15.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver15.add((java.lang.Object) arrayListTestDriver17);
        int int19 = arrayListTestDriver17.size();
        boolean boolean21 = arrayListTestDriver17.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray22 = arrayListTestDriver17.toArray();
        boolean boolean24 = arrayListTestDriver17.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = arrayListTestDriver2.set(0, (java.lang.Object) arrayListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = arrayListTestDriver17.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test058");
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
        boolean boolean16 = arrayListTestDriver13.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator17 = arrayListTestDriver13.iterator();
        boolean boolean18 = arrayListTestDriver7.equals_CUT((java.lang.Object) iterator17);
        experiment.util.Iterator iterator19 = arrayListTestDriver7.iterator();
        boolean boolean21 = arrayListTestDriver7.remove((java.lang.Object) 10.0d);
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver22.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean25 = arrayListTestDriver22.add((java.lang.Object) arrayListTestDriver24);
        int int26 = arrayListTestDriver24.size();
        boolean boolean28 = arrayListTestDriver24.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray29 = arrayListTestDriver24.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver30.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        boolean boolean33 = arrayListTestDriver30.add((java.lang.Object) arrayListTestDriver32);
        int int34 = arrayListTestDriver32.size();
        boolean boolean35 = arrayListTestDriver24.contains((java.lang.Object) int34);
        boolean boolean36 = arrayListTestDriver7.contains((java.lang.Object) boolean35);
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver38.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver40 = new experiment.util.ArrayListTestDriver();
        boolean boolean41 = arrayListTestDriver38.add((java.lang.Object) arrayListTestDriver40);
        int int42 = arrayListTestDriver40.size();
        boolean boolean44 = arrayListTestDriver40.equals_CUT((java.lang.Object) true);
        java.lang.Object obj45 = new java.lang.Object();
        boolean boolean46 = arrayListTestDriver40.add(obj45);
        boolean boolean48 = arrayListTestDriver40.remove((java.lang.Object) (byte) 100);
        boolean boolean49 = arrayListTestDriver40.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = arrayListTestDriver7.set((int) (short) -1, (java.lang.Object) arrayListTestDriver40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
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
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test059");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray7 = arrayListTestDriver2.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver8.clear();
        boolean boolean10 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver8);
        experiment.util.Iterator iterator11 = arrayListTestDriver2.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test060");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver4.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver6);
        int int8 = arrayListTestDriver6.size();
        boolean boolean10 = arrayListTestDriver6.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray11 = arrayListTestDriver6.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver14);
        int int16 = arrayListTestDriver14.size();
        boolean boolean17 = arrayListTestDriver6.contains((java.lang.Object) int16);
        java.lang.Object[] objArray18 = arrayListTestDriver6.toArray();
        boolean boolean19 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray18);
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver20.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver20.add((java.lang.Object) arrayListTestDriver22);
        int int24 = arrayListTestDriver22.size();
        boolean boolean26 = arrayListTestDriver22.equals_CUT((java.lang.Object) true);
        java.lang.Object obj27 = new java.lang.Object();
        boolean boolean28 = arrayListTestDriver22.add(obj27);
        java.lang.Object[] objArray29 = arrayListTestDriver22.toArray();
        boolean boolean31 = arrayListTestDriver22.remove((java.lang.Object) 1.0d);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver32.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        boolean boolean35 = arrayListTestDriver32.add((java.lang.Object) arrayListTestDriver34);
        boolean boolean36 = arrayListTestDriver22.equals_CUT((java.lang.Object) arrayListTestDriver34);
        boolean boolean37 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver34);
        int int38 = arrayListTestDriver34.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test061");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        int int4 = arrayListTestDriver2.size();
        boolean boolean6 = arrayListTestDriver2.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray7 = arrayListTestDriver2.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver8.clear();
        boolean boolean10 = arrayListTestDriver2.equals_CUT((java.lang.Object) arrayListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver2.remove((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test062");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.Iterator iterator4 = arrayListTestDriver2.iterator();
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test063");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver2);
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver2.remove((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver6.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver6.add((java.lang.Object) arrayListTestDriver8);
        experiment.util.Iterator iterator10 = arrayListTestDriver8.iterator();
        boolean boolean11 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver8);
        java.lang.Object[] objArray12 = arrayListTestDriver4.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver13.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver13.add((java.lang.Object) arrayListTestDriver15);
        int int17 = arrayListTestDriver15.size();
        boolean boolean19 = arrayListTestDriver15.equals_CUT((java.lang.Object) true);
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = arrayListTestDriver15.add(obj20);
        boolean boolean22 = arrayListTestDriver4.equals_CUT((java.lang.Object) arrayListTestDriver15);
        java.lang.Class<?> wildcardClass23 = arrayListTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_2070236138_1024_0.test064");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver0.clear();
        boolean boolean3 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver4.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver6);
        int int8 = arrayListTestDriver6.size();
        boolean boolean10 = arrayListTestDriver6.equals_CUT((java.lang.Object) true);
        java.lang.Object[] objArray11 = arrayListTestDriver6.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver14);
        int int16 = arrayListTestDriver14.size();
        boolean boolean17 = arrayListTestDriver6.contains((java.lang.Object) int16);
        java.lang.Object[] objArray18 = arrayListTestDriver6.toArray();
        boolean boolean19 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray18);
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver20.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver20.add((java.lang.Object) arrayListTestDriver22);
        int int24 = arrayListTestDriver22.size();
        boolean boolean26 = arrayListTestDriver22.equals_CUT((java.lang.Object) true);
        java.lang.Object obj27 = new java.lang.Object();
        boolean boolean28 = arrayListTestDriver22.add(obj27);
        java.lang.Object[] objArray29 = arrayListTestDriver22.toArray();
        boolean boolean31 = arrayListTestDriver22.remove((java.lang.Object) 1.0d);
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        arrayListTestDriver32.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        boolean boolean35 = arrayListTestDriver32.add((java.lang.Object) arrayListTestDriver34);
        boolean boolean36 = arrayListTestDriver22.equals_CUT((java.lang.Object) arrayListTestDriver34);
        boolean boolean37 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = arrayListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

}
