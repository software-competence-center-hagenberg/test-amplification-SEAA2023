package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_ArrayListTest_1191369007_128_s {

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
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test001");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test003");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test004");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test005");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test006");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test007");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test008");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test009");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test010");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = arrayListTestDriver0.contains(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test011");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.set((-1), (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test012");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test013");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.set((int) (byte) 1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test014");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test015");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass5 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test016");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver4.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test017");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test018");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) listIterator8);
        java.lang.Class<?> wildcardClass10 = listIterator8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test019");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver6);
        java.lang.Object[] objArray9 = arrayListTestDriver6.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver6.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test020");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver6);
        java.lang.Object[] objArray9 = arrayListTestDriver6.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.remove((java.lang.Object) 100);
        int int14 = arrayListTestDriver11.size();
        boolean boolean15 = arrayListTestDriver11.isEmpty();
        boolean boolean16 = arrayListTestDriver11.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        boolean boolean19 = arrayListTestDriver11.remove((java.lang.Object) arrayListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver6.set(0, (java.lang.Object) arrayListTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test021");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = arrayListTestDriver0.remove(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test022");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test023");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set(0, (java.lang.Object) arrayListTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test024");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        boolean boolean9 = arrayListTestDriver4.contains((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver4.set((int) (short) -1, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test025");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test026");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) (-1));
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) (-1));
        experiment.util.Iterator iterator12 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = arrayListTestDriver0.set((int) (short) 100, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test027");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) 100);
        int int12 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) 1);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) 1);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass19 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test028");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver4.clear();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = arrayListTestDriver4.equals_CUT(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test029");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test030");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        int int10 = arrayListTestDriver9.size();
        boolean boolean12 = arrayListTestDriver9.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) 100);
        boolean boolean16 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver13);
        boolean boolean18 = arrayListTestDriver13.contains((java.lang.Object) 100.0f);
        boolean boolean19 = arrayListTestDriver13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver0.set((int) (short) 100, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test031");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj9 = arrayListTestDriver0.remove(0);
        experiment.util.Iterator iterator10 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test032");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) (-1));
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) (-1));
        experiment.util.Iterator iterator12 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test033");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.set((int) (byte) 100, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test034");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        boolean boolean9 = arrayListTestDriver4.contains((java.lang.Object) 100.0f);
        boolean boolean10 = arrayListTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver4.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test035");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        java.lang.Class<?> wildcardClass11 = arrayListTestDriver10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayListTestDriver0.set((int) '#', (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test036");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) 100);
        int int10 = arrayListTestDriver7.size();
        boolean boolean11 = arrayListTestDriver7.isEmpty();
        boolean boolean12 = arrayListTestDriver7.isEmpty();
        experiment.util.Iterator iterator13 = arrayListTestDriver7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver0.set((int) (byte) 1, (java.lang.Object) iterator13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test037");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = iterator6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test038");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver7.listIterator((int) (byte) 0);
        boolean boolean11 = arrayListTestDriver7.remove((java.lang.Object) (short) 1);
        boolean boolean13 = arrayListTestDriver7.add((java.lang.Object) 10L);
        boolean boolean15 = arrayListTestDriver7.remove((java.lang.Object) (short) -1);
        boolean boolean16 = arrayListTestDriver7.isEmpty();
        boolean boolean18 = arrayListTestDriver7.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver7.clear();
        arrayListTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = arrayListTestDriver0.set((int) 'a', (java.lang.Object) arrayListTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test039");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = arrayListTestDriver0.contains(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test040");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator6 = arrayListTestDriver4.listIterator((int) (byte) 0);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) 1);
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.set((int) (short) 1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test041");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test042");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test043");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        boolean boolean9 = arrayListTestDriver4.contains((java.lang.Object) 100.0f);
        boolean boolean10 = arrayListTestDriver4.isEmpty();
        experiment.util.Iterator iterator11 = arrayListTestDriver4.iterator();
        java.lang.Class<?> wildcardClass12 = iterator11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test044");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test045");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator4 = arrayListTestDriver2.listIterator((int) (byte) 0);
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) 1);
        boolean boolean7 = arrayListTestDriver0.contains((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test046");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean10 = arrayListTestDriver6.remove((java.lang.Object) (short) 1);
        boolean boolean11 = arrayListTestDriver6.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver12.listIterator((int) (byte) 0);
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) (-1));
        boolean boolean17 = arrayListTestDriver6.contains((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver0.set((int) (short) 100, (java.lang.Object) arrayListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test047");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver8.listIterator((int) (byte) 0);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) 1);
        java.lang.Object[] objArray13 = arrayListTestDriver8.toArray();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver8);
        java.lang.Class<?> wildcardClass15 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test048");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) 100);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) 0);
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator((int) (byte) 0);
        java.lang.Object obj15 = arrayListTestDriver0.set((int) (short) 0, (java.lang.Object) listIterator14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test049");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) 100);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) 0);
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator((int) (byte) 0);
        java.lang.Object obj15 = arrayListTestDriver0.set((int) (short) 0, (java.lang.Object) listIterator14);
        boolean boolean16 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.remove((java.lang.Object) 100);
        int int20 = arrayListTestDriver17.size();
        boolean boolean21 = arrayListTestDriver17.isEmpty();
        boolean boolean22 = arrayListTestDriver17.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator25 = arrayListTestDriver23.listIterator((int) (byte) 0);
        boolean boolean26 = arrayListTestDriver17.add((java.lang.Object) listIterator25);
        boolean boolean27 = arrayListTestDriver0.add((java.lang.Object) boolean26);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator29 = arrayListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test050");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean10 = arrayListTestDriver6.remove((java.lang.Object) (short) 1);
        boolean boolean12 = arrayListTestDriver6.add((java.lang.Object) 10L);
        boolean boolean14 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        java.lang.Object obj16 = arrayListTestDriver6.get(0);
        arrayListTestDriver6.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.remove((java.lang.Object) 100);
        int int21 = arrayListTestDriver18.size();
        boolean boolean22 = arrayListTestDriver18.isEmpty();
        boolean boolean23 = arrayListTestDriver18.isEmpty();
        boolean boolean24 = arrayListTestDriver6.remove((java.lang.Object) arrayListTestDriver18);
        boolean boolean25 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = arrayListTestDriver18.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10L + "'", obj16, 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test051");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) listIterator8);
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        int int11 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test052");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        arrayListTestDriver0.clear();
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) 100);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) 0);
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        boolean boolean15 = arrayListTestDriver8.remove((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator17 = arrayListTestDriver8.listIterator((int) (byte) 0);
        boolean boolean18 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test053");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test054");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver6);
        java.lang.Class<?> wildcardClass9 = arrayListTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test055");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver6);
        java.lang.Object[] objArray9 = arrayListTestDriver6.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = arrayListTestDriver6.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test056");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        java.lang.Object[] objArray8 = arrayListTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = arrayListTestDriver4.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test057");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) 1);
        java.lang.Object[] objArray11 = arrayListTestDriver6.toArray();
        boolean boolean12 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver6);
        java.lang.Class<?> wildcardClass13 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test058");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        experiment.util.Iterator iterator7 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = arrayListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test059");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        java.lang.Object obj10 = arrayListTestDriver0.get(0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) 100);
        int int15 = arrayListTestDriver12.size();
        boolean boolean16 = arrayListTestDriver12.isEmpty();
        boolean boolean17 = arrayListTestDriver12.isEmpty();
        boolean boolean18 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver12);
        boolean boolean19 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator22 = arrayListTestDriver20.listIterator((int) (byte) 0);
        boolean boolean24 = arrayListTestDriver20.add((java.lang.Object) 1);
        experiment.util.ListIterator listIterator26 = arrayListTestDriver20.listIterator(1);
        boolean boolean27 = arrayListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass28 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test060");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        int int6 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        int int9 = arrayListTestDriver8.size();
        boolean boolean11 = arrayListTestDriver8.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) 100);
        boolean boolean15 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver12);
        boolean boolean17 = arrayListTestDriver12.contains((java.lang.Object) 100.0f);
        boolean boolean18 = arrayListTestDriver12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver0.set((int) ' ', (java.lang.Object) arrayListTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test061");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) listIterator8);
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) true);
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator15 = arrayListTestDriver13.listIterator((int) (byte) 0);
        boolean boolean17 = arrayListTestDriver13.remove((java.lang.Object) (short) 1);
        boolean boolean19 = arrayListTestDriver13.add((java.lang.Object) 10L);
        boolean boolean21 = arrayListTestDriver13.remove((java.lang.Object) (short) -1);
        boolean boolean22 = arrayListTestDriver13.isEmpty();
        boolean boolean23 = arrayListTestDriver0.contains((java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test062");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test063");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) (-1));
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) (-1));
        experiment.util.Iterator iterator12 = arrayListTestDriver0.iterator();
        boolean boolean14 = arrayListTestDriver0.add((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test064");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) 100);
        int int12 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) 1);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) 1);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) "hi!");
        int int19 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = arrayListTestDriver0.set((int) (byte) 1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test065");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        int int6 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        int int9 = arrayListTestDriver8.size();
        boolean boolean11 = arrayListTestDriver8.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) 100);
        boolean boolean15 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver12);
        boolean boolean17 = arrayListTestDriver12.contains((java.lang.Object) 100.0f);
        boolean boolean18 = arrayListTestDriver12.isEmpty();
        experiment.util.Iterator iterator19 = arrayListTestDriver12.iterator();
        java.lang.Object[] objArray20 = arrayListTestDriver12.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = arrayListTestDriver0.set((int) ' ', (java.lang.Object) arrayListTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test066");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.remove((java.lang.Object) 100);
        int int16 = arrayListTestDriver13.size();
        boolean boolean17 = arrayListTestDriver13.isEmpty();
        boolean boolean18 = arrayListTestDriver13.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        int int20 = arrayListTestDriver19.size();
        boolean boolean21 = arrayListTestDriver13.remove((java.lang.Object) arrayListTestDriver19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = arrayListTestDriver0.set((int) (byte) 1, (java.lang.Object) arrayListTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test067");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) listIterator8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test068");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        java.lang.Object obj10 = arrayListTestDriver0.get(0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) 100);
        int int15 = arrayListTestDriver12.size();
        boolean boolean16 = arrayListTestDriver12.isEmpty();
        boolean boolean17 = arrayListTestDriver12.isEmpty();
        boolean boolean18 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver12);
        boolean boolean19 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator22 = arrayListTestDriver20.listIterator((int) (byte) 0);
        boolean boolean24 = arrayListTestDriver20.add((java.lang.Object) 1);
        experiment.util.ListIterator listIterator26 = arrayListTestDriver20.listIterator(1);
        boolean boolean27 = arrayListTestDriver0.remove((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = arrayListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test069");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = arrayListTestDriver0.remove(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test070");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        int int13 = arrayListTestDriver0.size();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test071");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray6 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test072");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        arrayListTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test073");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test074");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator7 = arrayListTestDriver5.listIterator((int) (byte) 0);
        boolean boolean9 = arrayListTestDriver5.remove((java.lang.Object) (short) 1);
        boolean boolean11 = arrayListTestDriver5.add((java.lang.Object) 10L);
        boolean boolean13 = arrayListTestDriver5.remove((java.lang.Object) (short) -1);
        boolean boolean14 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test075");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = arrayListTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test076");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test077");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) 100);
        int int12 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) 1);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) 1);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) "hi!");
        int int19 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = arrayListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test078");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver8.listIterator((int) (byte) 0);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) 1);
        java.lang.Object[] objArray13 = arrayListTestDriver8.toArray();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator16 = arrayListTestDriver8.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test079");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test080");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) 100);
        int int11 = arrayListTestDriver8.size();
        java.lang.Object[] objArray12 = arrayListTestDriver8.toArray();
        arrayListTestDriver8.clear();
        boolean boolean14 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver8);
        int int15 = arrayListTestDriver4.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = arrayListTestDriver4.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test081");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator12 = arrayListTestDriver10.listIterator((int) (byte) 0);
        arrayListTestDriver10.clear();
        boolean boolean14 = arrayListTestDriver10.isEmpty();
        boolean boolean15 = arrayListTestDriver0.contains((java.lang.Object) boolean14);
        java.lang.Object[] objArray16 = arrayListTestDriver0.toArray();
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver0.set((int) (byte) 0, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test082");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test083");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test084");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        int int6 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test085");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator6 = arrayListTestDriver4.listIterator((int) (byte) 0);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) 1);
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray9);
        boolean boolean11 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test086");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        java.lang.Object obj10 = arrayListTestDriver0.get(0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) 100);
        int int15 = arrayListTestDriver12.size();
        boolean boolean16 = arrayListTestDriver12.isEmpty();
        boolean boolean17 = arrayListTestDriver12.isEmpty();
        boolean boolean18 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver12);
        boolean boolean19 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator22 = arrayListTestDriver20.listIterator((int) (byte) 0);
        boolean boolean24 = arrayListTestDriver20.add((java.lang.Object) 1);
        experiment.util.ListIterator listIterator26 = arrayListTestDriver20.listIterator(1);
        boolean boolean27 = arrayListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object[] objArray28 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator31 = arrayListTestDriver29.listIterator((int) (byte) 0);
        boolean boolean33 = arrayListTestDriver29.remove((java.lang.Object) (short) 1);
        boolean boolean34 = arrayListTestDriver29.isEmpty();
        boolean boolean35 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver29);
        int int36 = arrayListTestDriver29.size();
        arrayListTestDriver29.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = arrayListTestDriver29.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(listIterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test087");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver6.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test088");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) listIterator8);
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        int int11 = arrayListTestDriver0.size();
        boolean boolean12 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator16 = arrayListTestDriver14.listIterator((int) (byte) 0);
        boolean boolean18 = arrayListTestDriver14.remove((java.lang.Object) (short) 1);
        boolean boolean20 = arrayListTestDriver14.add((java.lang.Object) 10L);
        boolean boolean22 = arrayListTestDriver14.remove((java.lang.Object) (short) -1);
        java.lang.Object obj24 = arrayListTestDriver14.get(0);
        arrayListTestDriver14.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) 100);
        int int29 = arrayListTestDriver26.size();
        boolean boolean30 = arrayListTestDriver26.isEmpty();
        boolean boolean31 = arrayListTestDriver26.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver32 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator34 = arrayListTestDriver32.listIterator((int) (byte) 0);
        boolean boolean35 = arrayListTestDriver26.add((java.lang.Object) listIterator34);
        java.lang.Object[] objArray36 = arrayListTestDriver26.toArray();
        boolean boolean38 = arrayListTestDriver26.contains((java.lang.Object) true);
        boolean boolean39 = arrayListTestDriver14.add((java.lang.Object) arrayListTestDriver26);
        boolean boolean41 = arrayListTestDriver14.contains((java.lang.Object) (byte) 1);
        experiment.util.ArrayListTestDriver arrayListTestDriver42 = new experiment.util.ArrayListTestDriver();
        boolean boolean44 = arrayListTestDriver42.remove((java.lang.Object) 100);
        int int45 = arrayListTestDriver42.size();
        boolean boolean46 = arrayListTestDriver42.isEmpty();
        java.lang.Object[] objArray47 = arrayListTestDriver42.toArray();
        boolean boolean48 = arrayListTestDriver14.remove((java.lang.Object) arrayListTestDriver42);
        experiment.util.Iterator iterator49 = arrayListTestDriver14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = arrayListTestDriver0.set((int) ' ', (java.lang.Object) arrayListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(listIterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10L + "'", obj24, 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(listIterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator49);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test089");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1));
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test090");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = arrayListTestDriver4.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test091");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        int int7 = arrayListTestDriver6.size();
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver6);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) '4');
        arrayListTestDriver6.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test092");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean6 = arrayListTestDriver0.remove((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test093");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator12 = arrayListTestDriver10.listIterator((int) (byte) 0);
        arrayListTestDriver10.clear();
        boolean boolean14 = arrayListTestDriver10.isEmpty();
        boolean boolean15 = arrayListTestDriver0.contains((java.lang.Object) boolean14);
        int int16 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test094");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator6 = arrayListTestDriver4.listIterator((int) (byte) 0);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) 1);
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        boolean boolean10 = arrayListTestDriver4.isEmpty();
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test095");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) 100);
        int int12 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) 1);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) 1);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) "hi!");
        boolean boolean20 = arrayListTestDriver0.add((java.lang.Object) 10L);
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator23 = arrayListTestDriver21.listIterator((int) (byte) 0);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) 1);
        java.lang.Object[] objArray26 = arrayListTestDriver21.toArray();
        boolean boolean27 = arrayListTestDriver0.remove((java.lang.Object) objArray26);
        java.lang.Object[] objArray28 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = arrayListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test096");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1));
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) (short) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) 100);
        int int10 = arrayListTestDriver7.size();
        boolean boolean11 = arrayListTestDriver7.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver12.listIterator((int) (byte) 0);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        boolean boolean18 = arrayListTestDriver12.add((java.lang.Object) 10L);
        boolean boolean20 = arrayListTestDriver12.remove((java.lang.Object) (short) -1);
        boolean boolean21 = arrayListTestDriver7.add((java.lang.Object) arrayListTestDriver12);
        boolean boolean22 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator24 = arrayListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test097");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test098");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.contains((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test099");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.remove((java.lang.Object) 100);
        boolean boolean6 = arrayListTestDriver0.remove((java.lang.Object) boolean5);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) 100);
        int int12 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.isEmpty();
        boolean boolean14 = arrayListTestDriver9.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        int int16 = arrayListTestDriver15.size();
        boolean boolean17 = arrayListTestDriver9.remove((java.lang.Object) arrayListTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver0.set((int) '#', (java.lang.Object) arrayListTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test100");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) 100);
        java.lang.Object obj13 = arrayListTestDriver0.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = arrayListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10L + "'", obj13, 10L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test101");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) 1);
        java.lang.Object[] objArray11 = arrayListTestDriver6.toArray();
        boolean boolean12 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = arrayListTestDriver0.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test102");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        int int7 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver8.listIterator((int) (byte) 0);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) 1);
        arrayListTestDriver8.clear();
        boolean boolean14 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver8.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test103");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        java.lang.Object[] objArray13 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator14 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass15 = iterator14.getClass();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test104");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        int int8 = arrayListTestDriver7.size();
        boolean boolean10 = arrayListTestDriver7.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.remove((java.lang.Object) 100);
        boolean boolean14 = arrayListTestDriver7.add((java.lang.Object) arrayListTestDriver11);
        boolean boolean16 = arrayListTestDriver11.remove((java.lang.Object) '4');
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.remove((java.lang.Object) 100);
        int int20 = arrayListTestDriver17.size();
        boolean boolean21 = arrayListTestDriver17.isEmpty();
        boolean boolean22 = arrayListTestDriver11.remove((java.lang.Object) arrayListTestDriver17);
        boolean boolean23 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver11);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator26 = arrayListTestDriver24.listIterator((int) (byte) 0);
        boolean boolean28 = arrayListTestDriver24.add((java.lang.Object) 1);
        experiment.util.Iterator iterator29 = arrayListTestDriver24.iterator();
        boolean boolean30 = arrayListTestDriver24.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        int int32 = arrayListTestDriver31.size();
        boolean boolean34 = arrayListTestDriver31.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver35 = new experiment.util.ArrayListTestDriver();
        boolean boolean37 = arrayListTestDriver35.remove((java.lang.Object) 100);
        boolean boolean38 = arrayListTestDriver31.add((java.lang.Object) arrayListTestDriver35);
        boolean boolean40 = arrayListTestDriver35.remove((java.lang.Object) '4');
        experiment.util.ArrayListTestDriver arrayListTestDriver41 = new experiment.util.ArrayListTestDriver();
        boolean boolean43 = arrayListTestDriver41.remove((java.lang.Object) 100);
        int int44 = arrayListTestDriver41.size();
        boolean boolean45 = arrayListTestDriver41.isEmpty();
        boolean boolean46 = arrayListTestDriver35.remove((java.lang.Object) arrayListTestDriver41);
        boolean boolean47 = arrayListTestDriver24.remove((java.lang.Object) arrayListTestDriver35);
        boolean boolean48 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver24);
        experiment.util.ArrayListTestDriver arrayListTestDriver49 = new experiment.util.ArrayListTestDriver();
        int int50 = arrayListTestDriver49.size();
        boolean boolean52 = arrayListTestDriver49.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver53 = new experiment.util.ArrayListTestDriver();
        boolean boolean55 = arrayListTestDriver53.remove((java.lang.Object) 100);
        boolean boolean56 = arrayListTestDriver49.add((java.lang.Object) arrayListTestDriver53);
        boolean boolean58 = arrayListTestDriver53.contains((java.lang.Object) 100.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver59 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator61 = arrayListTestDriver59.listIterator((int) (byte) 0);
        boolean boolean63 = arrayListTestDriver59.remove((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass64 = arrayListTestDriver59.getClass();
        boolean boolean65 = arrayListTestDriver53.equals_CUT((java.lang.Object) arrayListTestDriver59);
        boolean boolean66 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver59);
        java.lang.Object[] objArray67 = arrayListTestDriver59.toArray();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(listIterator61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test105");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) 100);
        boolean boolean11 = arrayListTestDriver7.add((java.lang.Object) 0);
        experiment.util.Iterator iterator12 = arrayListTestDriver7.iterator();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver7.listIterator((int) (byte) 0);
        java.lang.Object obj15 = arrayListTestDriver0.set((int) (short) 0, (java.lang.Object) listIterator14);
        boolean boolean16 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        int int18 = arrayListTestDriver17.size();
        boolean boolean20 = arrayListTestDriver17.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        boolean boolean23 = arrayListTestDriver21.remove((java.lang.Object) 100);
        boolean boolean24 = arrayListTestDriver17.add((java.lang.Object) arrayListTestDriver21);
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        boolean boolean27 = arrayListTestDriver25.remove((java.lang.Object) 100);
        int int28 = arrayListTestDriver25.size();
        java.lang.Object[] objArray29 = arrayListTestDriver25.toArray();
        arrayListTestDriver25.clear();
        boolean boolean31 = arrayListTestDriver21.contains((java.lang.Object) arrayListTestDriver25);
        boolean boolean32 = arrayListTestDriver0.remove((java.lang.Object) boolean31);
        java.lang.Object[] objArray33 = arrayListTestDriver0.toArray();
        int int34 = arrayListTestDriver0.size();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test106");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        java.lang.Object[] objArray4 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean10 = arrayListTestDriver6.remove((java.lang.Object) (short) 1);
        boolean boolean12 = arrayListTestDriver6.add((java.lang.Object) 10L);
        boolean boolean14 = arrayListTestDriver6.remove((java.lang.Object) (short) -1);
        boolean boolean15 = arrayListTestDriver6.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator18 = arrayListTestDriver16.listIterator((int) (byte) 0);
        arrayListTestDriver16.clear();
        boolean boolean20 = arrayListTestDriver16.isEmpty();
        boolean boolean21 = arrayListTestDriver6.contains((java.lang.Object) boolean20);
        java.lang.Object[] objArray22 = arrayListTestDriver6.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = arrayListTestDriver0.set((int) (byte) 1, (java.lang.Object) arrayListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(listIterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test107");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass3 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test108");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) 100);
        int int12 = arrayListTestDriver0.size();
        boolean boolean13 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) 100);
        boolean boolean18 = arrayListTestDriver14.add((java.lang.Object) 0);
        experiment.util.Iterator iterator19 = arrayListTestDriver14.iterator();
        boolean boolean21 = arrayListTestDriver14.remove((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator23 = arrayListTestDriver14.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator26 = arrayListTestDriver24.listIterator((int) (byte) 0);
        boolean boolean28 = arrayListTestDriver24.remove((java.lang.Object) (short) 1);
        boolean boolean30 = arrayListTestDriver24.add((java.lang.Object) 10L);
        boolean boolean32 = arrayListTestDriver24.remove((java.lang.Object) (short) -1);
        boolean boolean33 = arrayListTestDriver24.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator36 = arrayListTestDriver34.listIterator((int) (byte) 0);
        arrayListTestDriver34.clear();
        boolean boolean38 = arrayListTestDriver34.isEmpty();
        boolean boolean39 = arrayListTestDriver24.contains((java.lang.Object) boolean38);
        java.lang.Object[] objArray40 = arrayListTestDriver24.toArray();
        boolean boolean41 = arrayListTestDriver14.contains((java.lang.Object) objArray40);
        boolean boolean42 = arrayListTestDriver0.remove((java.lang.Object) objArray40);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator44 = arrayListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(listIterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test109");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator6 = arrayListTestDriver4.listIterator((int) (byte) 0);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) 1);
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        boolean boolean10 = arrayListTestDriver4.isEmpty();
        boolean boolean11 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator14 = arrayListTestDriver12.listIterator((int) (byte) 0);
        boolean boolean16 = arrayListTestDriver12.remove((java.lang.Object) (short) 1);
        boolean boolean17 = arrayListTestDriver12.isEmpty();
        arrayListTestDriver12.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.remove((java.lang.Object) 100);
        int int22 = arrayListTestDriver19.size();
        boolean boolean23 = arrayListTestDriver19.isEmpty();
        boolean boolean24 = arrayListTestDriver19.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator27 = arrayListTestDriver25.listIterator((int) (byte) 0);
        boolean boolean28 = arrayListTestDriver19.add((java.lang.Object) listIterator27);
        java.lang.Object[] objArray29 = arrayListTestDriver19.toArray();
        int int30 = arrayListTestDriver19.size();
        java.lang.Object[] objArray31 = arrayListTestDriver19.toArray();
        boolean boolean32 = arrayListTestDriver12.remove((java.lang.Object) objArray31);
        boolean boolean33 = arrayListTestDriver4.equals_CUT((java.lang.Object) boolean32);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator35 = arrayListTestDriver4.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(listIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test110");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        boolean boolean11 = arrayListTestDriver0.contains((java.lang.Object) 100);
        int int12 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator16 = arrayListTestDriver14.listIterator((int) (byte) 0);
        boolean boolean18 = arrayListTestDriver14.remove((java.lang.Object) (short) 1);
        boolean boolean20 = arrayListTestDriver14.add((java.lang.Object) 10L);
        boolean boolean22 = arrayListTestDriver14.remove((java.lang.Object) (short) -1);
        boolean boolean23 = arrayListTestDriver14.isEmpty();
        boolean boolean25 = arrayListTestDriver14.contains((java.lang.Object) 100);
        java.lang.Object obj27 = arrayListTestDriver14.get((int) (byte) 0);
        java.lang.Object[] objArray28 = arrayListTestDriver14.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = arrayListTestDriver0.set((int) '4', (java.lang.Object) arrayListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(listIterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10L + "'", obj27, 10L);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test111");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        boolean boolean3 = arrayListTestDriver0.remove((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.remove((java.lang.Object) 100);
        boolean boolean7 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) 100);
        int int11 = arrayListTestDriver8.size();
        java.lang.Object[] objArray12 = arrayListTestDriver8.toArray();
        arrayListTestDriver8.clear();
        boolean boolean14 = arrayListTestDriver4.contains((java.lang.Object) arrayListTestDriver8);
        int int15 = arrayListTestDriver4.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = arrayListTestDriver4.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test112");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator6 = arrayListTestDriver4.listIterator((int) (byte) 0);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) 1);
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray9);
        boolean boolean12 = arrayListTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.Iterator iterator13 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test113");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator6 = arrayListTestDriver4.listIterator((int) (byte) 0);
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) 1);
        java.lang.Object[] objArray9 = arrayListTestDriver4.toArray();
        boolean boolean10 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray9);
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator13 = arrayListTestDriver11.listIterator((int) (byte) 0);
        boolean boolean15 = arrayListTestDriver11.add((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass16 = arrayListTestDriver11.getClass();
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(listIterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test114");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) listIterator8);
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test115");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test116");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        boolean boolean6 = arrayListTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.remove((java.lang.Object) 100);
        int int10 = arrayListTestDriver7.size();
        java.lang.Object[] objArray11 = arrayListTestDriver7.toArray();
        boolean boolean13 = arrayListTestDriver7.equals_CUT((java.lang.Object) 1.0f);
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.remove((java.lang.Object) 100);
        int int17 = arrayListTestDriver14.size();
        boolean boolean18 = arrayListTestDriver14.isEmpty();
        boolean boolean19 = arrayListTestDriver14.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator22 = arrayListTestDriver20.listIterator((int) (byte) 0);
        boolean boolean23 = arrayListTestDriver14.add((java.lang.Object) listIterator22);
        java.lang.Object[] objArray24 = arrayListTestDriver14.toArray();
        int int25 = arrayListTestDriver14.size();
        java.lang.Object[] objArray26 = arrayListTestDriver14.toArray();
        java.lang.Object[] objArray27 = arrayListTestDriver14.toArray();
        boolean boolean28 = arrayListTestDriver7.remove((java.lang.Object) objArray27);
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver29.remove((java.lang.Object) 100);
        boolean boolean33 = arrayListTestDriver29.add((java.lang.Object) 0);
        experiment.util.Iterator iterator34 = arrayListTestDriver29.iterator();
        boolean boolean36 = arrayListTestDriver29.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver29.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        boolean boolean40 = arrayListTestDriver38.remove((java.lang.Object) 100);
        int int41 = arrayListTestDriver38.size();
        boolean boolean42 = arrayListTestDriver38.isEmpty();
        boolean boolean44 = arrayListTestDriver38.remove((java.lang.Object) 1);
        boolean boolean45 = arrayListTestDriver29.contains((java.lang.Object) 1);
        boolean boolean47 = arrayListTestDriver29.equals_CUT((java.lang.Object) "hi!");
        boolean boolean49 = arrayListTestDriver29.add((java.lang.Object) 10L);
        experiment.util.ArrayListTestDriver arrayListTestDriver50 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator52 = arrayListTestDriver50.listIterator((int) (byte) 0);
        boolean boolean54 = arrayListTestDriver50.add((java.lang.Object) 1);
        java.lang.Object[] objArray55 = arrayListTestDriver50.toArray();
        boolean boolean56 = arrayListTestDriver29.remove((java.lang.Object) objArray55);
        boolean boolean57 = arrayListTestDriver7.contains((java.lang.Object) boolean56);
        boolean boolean58 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver7);
        boolean boolean59 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test117");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 10L);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) (short) -1);
        java.lang.Object obj10 = arrayListTestDriver0.get(0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.remove((java.lang.Object) 100);
        int int15 = arrayListTestDriver12.size();
        boolean boolean16 = arrayListTestDriver12.isEmpty();
        boolean boolean17 = arrayListTestDriver12.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator20 = arrayListTestDriver18.listIterator((int) (byte) 0);
        boolean boolean21 = arrayListTestDriver12.add((java.lang.Object) listIterator20);
        java.lang.Object[] objArray22 = arrayListTestDriver12.toArray();
        boolean boolean24 = arrayListTestDriver12.contains((java.lang.Object) true);
        boolean boolean25 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver12);
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.remove((java.lang.Object) 100);
        boolean boolean30 = arrayListTestDriver26.add((java.lang.Object) 0);
        experiment.util.Iterator iterator31 = arrayListTestDriver26.iterator();
        experiment.util.ListIterator listIterator33 = arrayListTestDriver26.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator36 = arrayListTestDriver34.listIterator((int) (byte) 0);
        boolean boolean38 = arrayListTestDriver34.add((java.lang.Object) 1);
        java.lang.Object[] objArray39 = arrayListTestDriver34.toArray();
        boolean boolean40 = arrayListTestDriver26.equals_CUT((java.lang.Object) arrayListTestDriver34);
        boolean boolean41 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver26);
        int int42 = arrayListTestDriver26.size();
        arrayListTestDriver26.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = arrayListTestDriver26.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10L + "'", obj10, 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(listIterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(listIterator33);
        org.junit.Assert.assertNotNull(listIterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test118");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) 100);
        int int12 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) 1);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) 1);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) "hi!");
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver19);
        java.lang.Class<?> wildcardClass21 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test119");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test120");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1));
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.remove((java.lang.Object) 100);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) 0);
        experiment.util.Iterator iterator13 = arrayListTestDriver8.iterator();
        experiment.util.ListIterator listIterator15 = arrayListTestDriver8.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator18 = arrayListTestDriver16.listIterator((int) (byte) 0);
        boolean boolean20 = arrayListTestDriver16.add((java.lang.Object) 1);
        java.lang.Object[] objArray21 = arrayListTestDriver16.toArray();
        boolean boolean22 = arrayListTestDriver8.equals_CUT((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        boolean boolean25 = arrayListTestDriver23.remove((java.lang.Object) 100);
        int int26 = arrayListTestDriver23.size();
        java.lang.Object[] objArray27 = arrayListTestDriver23.toArray();
        arrayListTestDriver23.clear();
        boolean boolean29 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver23);
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator32 = arrayListTestDriver30.listIterator((int) (byte) 0);
        boolean boolean34 = arrayListTestDriver30.remove((java.lang.Object) (short) 1);
        boolean boolean36 = arrayListTestDriver30.add((java.lang.Object) 10L);
        boolean boolean38 = arrayListTestDriver30.remove((java.lang.Object) (short) -1);
        java.lang.Object obj40 = arrayListTestDriver30.get(0);
        arrayListTestDriver30.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver42 = new experiment.util.ArrayListTestDriver();
        boolean boolean44 = arrayListTestDriver42.remove((java.lang.Object) 100);
        int int45 = arrayListTestDriver42.size();
        boolean boolean46 = arrayListTestDriver42.isEmpty();
        boolean boolean47 = arrayListTestDriver42.isEmpty();
        boolean boolean48 = arrayListTestDriver30.remove((java.lang.Object) arrayListTestDriver42);
        boolean boolean49 = arrayListTestDriver30.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver50 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator52 = arrayListTestDriver50.listIterator((int) (byte) 0);
        boolean boolean54 = arrayListTestDriver50.add((java.lang.Object) 1);
        experiment.util.ListIterator listIterator56 = arrayListTestDriver50.listIterator(1);
        boolean boolean57 = arrayListTestDriver30.remove((java.lang.Object) 1);
        java.lang.Object[] objArray58 = arrayListTestDriver30.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver59 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator61 = arrayListTestDriver59.listIterator((int) (byte) 0);
        boolean boolean63 = arrayListTestDriver59.remove((java.lang.Object) (short) 1);
        boolean boolean64 = arrayListTestDriver59.isEmpty();
        boolean boolean65 = arrayListTestDriver30.remove((java.lang.Object) arrayListTestDriver59);
        boolean boolean66 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver30);
        experiment.util.ArrayListTestDriver arrayListTestDriver67 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator69 = arrayListTestDriver67.listIterator((int) (byte) 0);
        boolean boolean71 = arrayListTestDriver67.remove((java.lang.Object) (short) 1);
        boolean boolean73 = arrayListTestDriver67.add((java.lang.Object) 10L);
        boolean boolean75 = arrayListTestDriver67.remove((java.lang.Object) (short) -1);
        java.lang.Object obj77 = arrayListTestDriver67.get(0);
        arrayListTestDriver67.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver79 = new experiment.util.ArrayListTestDriver();
        boolean boolean81 = arrayListTestDriver79.remove((java.lang.Object) 100);
        int int82 = arrayListTestDriver79.size();
        boolean boolean83 = arrayListTestDriver79.isEmpty();
        boolean boolean84 = arrayListTestDriver79.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver85 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator87 = arrayListTestDriver85.listIterator((int) (byte) 0);
        boolean boolean88 = arrayListTestDriver79.add((java.lang.Object) listIterator87);
        java.lang.Object[] objArray89 = arrayListTestDriver79.toArray();
        boolean boolean91 = arrayListTestDriver79.contains((java.lang.Object) true);
        boolean boolean92 = arrayListTestDriver67.add((java.lang.Object) arrayListTestDriver79);
        boolean boolean94 = arrayListTestDriver67.contains((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator95 = arrayListTestDriver67.iterator();
        boolean boolean96 = arrayListTestDriver30.equals_CUT((java.lang.Object) iterator95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj97 = arrayListTestDriver0.set((int) (byte) -1, (java.lang.Object) boolean96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertNotNull(listIterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(listIterator32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10L + "'", obj40, 10L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(listIterator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(listIterator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(listIterator61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(listIterator69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 10L + "'", obj77, 10L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(listIterator87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(iterator95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test121");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) 100);
        int int12 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) 1);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) 1);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) "hi!");
        boolean boolean20 = arrayListTestDriver0.add((java.lang.Object) 10L);
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator23 = arrayListTestDriver21.listIterator((int) (byte) 0);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) 1);
        experiment.util.ListIterator listIterator27 = arrayListTestDriver21.listIterator(1);
        boolean boolean28 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver21);
        int int29 = arrayListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(listIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test122");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) (-1));
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        boolean boolean6 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test123");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.ListIterator listIterator7 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver8.listIterator((int) (byte) 0);
        boolean boolean12 = arrayListTestDriver8.add((java.lang.Object) 1);
        java.lang.Object[] objArray13 = arrayListTestDriver8.toArray();
        boolean boolean14 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver8);
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator17 = arrayListTestDriver15.listIterator((int) (byte) 0);
        arrayListTestDriver15.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator21 = arrayListTestDriver19.listIterator((int) (byte) 0);
        boolean boolean23 = arrayListTestDriver19.add((java.lang.Object) 1);
        java.lang.Object[] objArray24 = arrayListTestDriver19.toArray();
        boolean boolean25 = arrayListTestDriver15.equals_CUT((java.lang.Object) objArray24);
        boolean boolean26 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean25);
        experiment.util.ArrayListTestDriver arrayListTestDriver27 = new experiment.util.ArrayListTestDriver();
        boolean boolean29 = arrayListTestDriver27.remove((java.lang.Object) 100);
        int int30 = arrayListTestDriver27.size();
        boolean boolean31 = arrayListTestDriver27.isEmpty();
        boolean boolean32 = arrayListTestDriver27.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        int int34 = arrayListTestDriver33.size();
        boolean boolean35 = arrayListTestDriver27.remove((java.lang.Object) arrayListTestDriver33);
        java.lang.Object[] objArray36 = arrayListTestDriver33.toArray();
        boolean boolean37 = arrayListTestDriver0.equals_CUT((java.lang.Object) objArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = arrayListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(listIterator7);
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test124");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.ListIterator listIterator9 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator12 = arrayListTestDriver10.listIterator((int) (byte) 0);
        boolean boolean14 = arrayListTestDriver10.remove((java.lang.Object) (short) 1);
        boolean boolean16 = arrayListTestDriver10.add((java.lang.Object) 10L);
        boolean boolean18 = arrayListTestDriver10.remove((java.lang.Object) (short) -1);
        boolean boolean19 = arrayListTestDriver10.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator22 = arrayListTestDriver20.listIterator((int) (byte) 0);
        arrayListTestDriver20.clear();
        boolean boolean24 = arrayListTestDriver20.isEmpty();
        boolean boolean25 = arrayListTestDriver10.contains((java.lang.Object) boolean24);
        java.lang.Object[] objArray26 = arrayListTestDriver10.toArray();
        boolean boolean27 = arrayListTestDriver0.contains((java.lang.Object) objArray26);
        experiment.util.Iterator iterator28 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertNotNull(listIterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test125");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator5 = arrayListTestDriver3.listIterator((int) (byte) 0);
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) 1);
        java.lang.Object[] objArray8 = arrayListTestDriver3.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.remove((java.lang.Object) 100);
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = arrayListTestDriver10.iterator();
        experiment.util.ListIterator listIterator17 = arrayListTestDriver10.listIterator((int) (byte) 0);
        java.lang.Object obj18 = arrayListTestDriver3.set((int) (short) 0, (java.lang.Object) listIterator17);
        boolean boolean19 = arrayListTestDriver3.isEmpty();
        boolean boolean20 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver3);
        experiment.util.ListIterator listIterator22 = arrayListTestDriver3.listIterator((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(listIterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(listIterator17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1 + "'", obj18, 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIterator22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test126");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) 0);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.remove((java.lang.Object) 100);
        int int12 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.isEmpty();
        boolean boolean15 = arrayListTestDriver9.remove((java.lang.Object) 1);
        boolean boolean16 = arrayListTestDriver0.contains((java.lang.Object) 1);
        boolean boolean18 = arrayListTestDriver0.equals_CUT((java.lang.Object) "hi!");
        boolean boolean20 = arrayListTestDriver0.add((java.lang.Object) 10L);
        experiment.util.ArrayListTestDriver arrayListTestDriver21 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator23 = arrayListTestDriver21.listIterator((int) (byte) 0);
        boolean boolean25 = arrayListTestDriver21.add((java.lang.Object) 1);
        java.lang.Object[] objArray26 = arrayListTestDriver21.toArray();
        boolean boolean27 = arrayListTestDriver0.remove((java.lang.Object) objArray26);
        java.lang.Object[] objArray28 = arrayListTestDriver0.toArray();
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = arrayListTestDriver0.remove(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test127");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.remove((java.lang.Object) 100);
        int int3 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.isEmpty();
        boolean boolean5 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator8 = arrayListTestDriver6.listIterator((int) (byte) 0);
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) listIterator8);
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        int int11 = arrayListTestDriver0.size();
        java.lang.Object[] objArray12 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray13 = arrayListTestDriver0.toArray();
        experiment.util.ListIterator listIterator15 = arrayListTestDriver0.listIterator(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(listIterator15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_1191369007_1024_0.test128");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ListIterator listIterator2 = arrayListTestDriver0.listIterator((int) (byte) 0);
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) 1);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(listIterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

}
