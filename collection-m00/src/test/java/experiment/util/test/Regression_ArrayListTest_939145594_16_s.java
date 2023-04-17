package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_ArrayListTest_939145594_16_s {

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
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test003");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test004");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test005");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass4 = iterator3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test006");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set((int) (byte) -1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test007");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = arrayListTestDriver0.remove(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test008");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.contains((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test009");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.set(1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test010");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean4 = arrayListTestDriver3.isEmpty();
        java.lang.Object[] objArray5 = arrayListTestDriver3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set((int) (short) -1, (java.lang.Object) objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test011");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.set(10, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test012");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = arrayListTestDriver0.remove(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test013");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test014");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        boolean boolean4 = arrayListTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver6.isEmpty();
        arrayListTestDriver6.clear();
        boolean boolean10 = arrayListTestDriver6.remove((java.lang.Object) (byte) 10);
        int int11 = arrayListTestDriver6.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver12.isEmpty();
        java.lang.Object[] objArray14 = arrayListTestDriver12.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver15.isEmpty();
        arrayListTestDriver15.clear();
        experiment.util.Iterator iterator18 = arrayListTestDriver15.iterator();
        boolean boolean19 = arrayListTestDriver12.add((java.lang.Object) iterator18);
        experiment.util.ListIterator listIterator21 = arrayListTestDriver12.listIterator((int) (short) 0);
        experiment.util.Iterator iterator22 = arrayListTestDriver12.iterator();
        boolean boolean23 = arrayListTestDriver6.equals_CUT((java.lang.Object) iterator22);
        boolean boolean25 = arrayListTestDriver6.equals_CUT((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = arrayListTestDriver0.set((int) (short) -1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(listIterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test015");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_939145594_1024_0.test016");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean1 = arrayListTestDriver0.isEmpty();
        arrayListTestDriver0.clear();
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        int int6 = arrayListTestDriver5.size();
        experiment.util.Iterator iterator7 = arrayListTestDriver5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.set((int) (byte) -1, (java.lang.Object) arrayListTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
    }

}
