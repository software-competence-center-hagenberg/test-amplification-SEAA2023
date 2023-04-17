package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_101322511_32_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test001");
        experiment.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) (-1.0f));
        int int4 = hashSetTestDriver0.size();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = hashSetTestDriver0.remove(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass5 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 0);
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean10 = hashSetTestDriver7.add((java.lang.Object) 10L);
        boolean boolean11 = hashSetTestDriver5.contains((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass12 = hashSetTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver4);
        int int7 = hashSetTestDriver4.size();
        java.lang.Class<?> wildcardClass8 = hashSetTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass5 = iterator4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) (short) 100);
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.add((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (short) 100);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator14 = hashSetTestDriver13.iterator();
        boolean boolean15 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver13);
        int int16 = hashSetTestDriver13.size();
        boolean boolean18 = hashSetTestDriver13.remove((java.lang.Object) 100.0d);
        java.lang.Object obj19 = hashSetTestDriver6.getMatch((java.lang.Object) 100.0d);
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) (-1.0f));
        int int4 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = hashSetTestDriver0.add(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        int int7 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver8.clear();
        java.lang.Class<?> wildcardClass10 = hashSetTestDriver8.getClass();
        boolean boolean11 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver8);
        java.lang.Class<?> wildcardClass12 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver4.clear();
        boolean boolean7 = hashSetTestDriver4.add((java.lang.Object) 0);
        boolean boolean8 = hashSetTestDriver4.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver4.equals_CUT((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean14 = hashSetTestDriver11.add((java.lang.Object) 10L);
        boolean boolean15 = hashSetTestDriver9.contains((java.lang.Object) 10L);
        boolean boolean16 = hashSetTestDriver9.isEmpty();
        boolean boolean17 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver9);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = hashSetTestDriver0.remove(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        int int7 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver8.clear();
        java.lang.Class<?> wildcardClass10 = hashSetTestDriver8.getClass();
        boolean boolean11 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver8);
        java.lang.Class<?> wildcardClass12 = hashSetTestDriver8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator7 = hashSetTestDriver6.iterator();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (short) 100);
        boolean boolean13 = hashSetTestDriver9.add((java.lang.Object) (byte) -1);
        int int14 = hashSetTestDriver9.size();
        boolean boolean16 = hashSetTestDriver9.contains((java.lang.Object) (-1.0f));
        boolean boolean17 = hashSetTestDriver6.contains((java.lang.Object) boolean16);
        java.lang.Class<?> wildcardClass18 = hashSetTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver2.clear();
        boolean boolean5 = hashSetTestDriver2.add((java.lang.Object) 0);
        boolean boolean6 = hashSetTestDriver2.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver2.equals_CUT((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.add((java.lang.Object) 10L);
        boolean boolean13 = hashSetTestDriver7.contains((java.lang.Object) 10L);
        boolean boolean14 = hashSetTestDriver7.isEmpty();
        boolean boolean15 = hashSetTestDriver7.isEmpty();
        boolean boolean16 = hashSetTestDriver0.contains((java.lang.Object) boolean15);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass4 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver4.clear();
        boolean boolean7 = hashSetTestDriver4.add((java.lang.Object) 0);
        boolean boolean8 = hashSetTestDriver4.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver4.equals_CUT((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean14 = hashSetTestDriver11.add((java.lang.Object) 10L);
        boolean boolean15 = hashSetTestDriver9.contains((java.lang.Object) 10L);
        boolean boolean16 = hashSetTestDriver9.isEmpty();
        boolean boolean17 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver9);
        java.lang.Class<?> wildcardClass18 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        int int7 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test018");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator7 = hashSetTestDriver6.iterator();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver6);
        int int9 = hashSetTestDriver6.size();
        boolean boolean11 = hashSetTestDriver6.remove((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (short) 100);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator17 = hashSetTestDriver12.iterator();
        boolean boolean18 = hashSetTestDriver12.isEmpty();
        java.lang.Object obj19 = hashSetTestDriver6.getMatch((java.lang.Object) hashSetTestDriver12);
        java.lang.Class<?> wildcardClass20 = hashSetTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) (short) 100);
        int int3 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (short) 100);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) (byte) -1);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (short) 100);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) (byte) -1);
        boolean boolean19 = hashSetTestDriver13.equals_CUT((java.lang.Object) true);
        java.lang.Class<?> wildcardClass20 = hashSetTestDriver13.getClass();
        boolean boolean21 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.remove((java.lang.Object) (short) 100);
        boolean boolean26 = hashSetTestDriver22.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator27 = hashSetTestDriver22.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator29 = hashSetTestDriver28.iterator();
        boolean boolean30 = hashSetTestDriver22.equals_CUT((java.lang.Object) hashSetTestDriver28);
        int int31 = hashSetTestDriver28.size();
        boolean boolean33 = hashSetTestDriver28.remove((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (short) 100);
        boolean boolean38 = hashSetTestDriver34.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator39 = hashSetTestDriver34.iterator();
        boolean boolean40 = hashSetTestDriver34.isEmpty();
        java.lang.Object obj41 = hashSetTestDriver28.getMatch((java.lang.Object) hashSetTestDriver34);
        boolean boolean43 = hashSetTestDriver28.add((java.lang.Object) 10L);
        boolean boolean44 = hashSetTestDriver13.remove((java.lang.Object) boolean43);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test020");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) (short) 100);
        int int3 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (short) 100);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) (byte) -1);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (short) 100);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) (byte) -1);
        boolean boolean19 = hashSetTestDriver13.equals_CUT((java.lang.Object) true);
        java.lang.Class<?> wildcardClass20 = hashSetTestDriver13.getClass();
        boolean boolean21 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver13);
        java.lang.Class<?> wildcardClass22 = hashSetTestDriver13.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver4);
        hashSetTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test022");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        int int1 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test023");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver4.clear();
        boolean boolean7 = hashSetTestDriver4.add((java.lang.Object) 0);
        boolean boolean8 = hashSetTestDriver4.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver4.equals_CUT((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean14 = hashSetTestDriver11.add((java.lang.Object) 10L);
        boolean boolean15 = hashSetTestDriver9.contains((java.lang.Object) 10L);
        boolean boolean16 = hashSetTestDriver9.isEmpty();
        boolean boolean17 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver18.clear();
        boolean boolean21 = hashSetTestDriver18.add((java.lang.Object) 0);
        boolean boolean22 = hashSetTestDriver18.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver18.equals_CUT((java.lang.Object) hashSetTestDriver23);
        boolean boolean25 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver18);
        java.lang.Object[] objArray26 = hashSetTestDriver18.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver27.clear();
        boolean boolean30 = hashSetTestDriver27.add((java.lang.Object) 0);
        boolean boolean31 = hashSetTestDriver27.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        boolean boolean33 = hashSetTestDriver27.equals_CUT((java.lang.Object) hashSetTestDriver32);
        experiment.util.Iterator iterator34 = hashSetTestDriver32.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver35.clear();
        boolean boolean38 = hashSetTestDriver35.add((java.lang.Object) 0);
        boolean boolean39 = hashSetTestDriver35.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver35.equals_CUT((java.lang.Object) hashSetTestDriver40);
        experiment.util.Iterator iterator42 = hashSetTestDriver40.iterator();
        boolean boolean43 = hashSetTestDriver32.add((java.lang.Object) hashSetTestDriver40);
        boolean boolean44 = hashSetTestDriver18.remove((java.lang.Object) boolean43);
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver45.clear();
        boolean boolean48 = hashSetTestDriver45.add((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver49.clear();
        boolean boolean52 = hashSetTestDriver49.add((java.lang.Object) 0);
        boolean boolean53 = hashSetTestDriver49.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        boolean boolean55 = hashSetTestDriver49.equals_CUT((java.lang.Object) hashSetTestDriver54);
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray57 = hashSetTestDriver56.toArray();
        boolean boolean59 = hashSetTestDriver56.add((java.lang.Object) 10L);
        boolean boolean60 = hashSetTestDriver54.contains((java.lang.Object) 10L);
        boolean boolean61 = hashSetTestDriver54.isEmpty();
        boolean boolean62 = hashSetTestDriver45.contains((java.lang.Object) hashSetTestDriver54);
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver63.clear();
        boolean boolean66 = hashSetTestDriver63.add((java.lang.Object) 0);
        boolean boolean67 = hashSetTestDriver63.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver68 = new experiment.util.HashSetTestDriver();
        boolean boolean69 = hashSetTestDriver63.equals_CUT((java.lang.Object) hashSetTestDriver68);
        boolean boolean70 = hashSetTestDriver45.remove((java.lang.Object) hashSetTestDriver63);
        experiment.util.Iterator iterator71 = hashSetTestDriver45.iterator();
        java.lang.Object obj72 = hashSetTestDriver18.getMatch((java.lang.Object) iterator71);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test024");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) (short) 100);
        int int3 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) '4');
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray9 = hashSetTestDriver0.toArray();
        boolean boolean10 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass2 = hashSetTestDriver1.getClass();
        boolean boolean3 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver1);
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator7 = hashSetTestDriver6.iterator();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver6);
        int int9 = hashSetTestDriver6.size();
        boolean boolean11 = hashSetTestDriver6.remove((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (short) 100);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator17 = hashSetTestDriver12.iterator();
        boolean boolean18 = hashSetTestDriver12.isEmpty();
        java.lang.Object obj19 = hashSetTestDriver6.getMatch((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator21 = hashSetTestDriver20.iterator();
        java.lang.Class<?> wildcardClass22 = iterator21.getClass();
        boolean boolean23 = hashSetTestDriver6.remove((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator6 = hashSetTestDriver5.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (short) 100);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = hashSetTestDriver7.iterator();
        boolean boolean13 = hashSetTestDriver5.contains((java.lang.Object) iterator12);
        java.lang.Object obj14 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver5);
        experiment.util.Iterator iterator15 = hashSetTestDriver5.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver2.clear();
        boolean boolean5 = hashSetTestDriver2.add((java.lang.Object) 0);
        boolean boolean6 = hashSetTestDriver2.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver2.equals_CUT((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.add((java.lang.Object) 10L);
        boolean boolean13 = hashSetTestDriver7.contains((java.lang.Object) 10L);
        boolean boolean14 = hashSetTestDriver7.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver15.clear();
        boolean boolean18 = hashSetTestDriver15.add((java.lang.Object) 0);
        boolean boolean19 = hashSetTestDriver15.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver15.equals_CUT((java.lang.Object) hashSetTestDriver20);
        boolean boolean22 = hashSetTestDriver20.isEmpty();
        hashSetTestDriver20.clear();
        boolean boolean24 = hashSetTestDriver7.remove((java.lang.Object) hashSetTestDriver20);
        int int25 = hashSetTestDriver7.size();
        java.lang.Object obj26 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        java.lang.Object obj27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = hashSetTestDriver7.equals_CUT(obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test030");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) (short) 100);
        int int3 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (short) 100);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) (byte) -1);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (short) 100);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) (byte) -1);
        boolean boolean19 = hashSetTestDriver13.equals_CUT((java.lang.Object) true);
        java.lang.Class<?> wildcardClass20 = hashSetTestDriver13.getClass();
        boolean boolean21 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver13);
        int int22 = hashSetTestDriver13.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 10L);
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) (short) 100);
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) int7);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = hashSetTestDriver0.add(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        int int6 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (short) 100);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator12 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator14 = hashSetTestDriver13.iterator();
        boolean boolean15 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver13);
        int int16 = hashSetTestDriver13.size();
        boolean boolean18 = hashSetTestDriver13.remove((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (short) 100);
        boolean boolean23 = hashSetTestDriver19.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator24 = hashSetTestDriver19.iterator();
        boolean boolean25 = hashSetTestDriver19.isEmpty();
        java.lang.Object obj26 = hashSetTestDriver13.getMatch((java.lang.Object) hashSetTestDriver19);
        boolean boolean28 = hashSetTestDriver13.add((java.lang.Object) 10L);
        java.lang.Object[] objArray29 = hashSetTestDriver13.toArray();
        boolean boolean30 = hashSetTestDriver0.remove((java.lang.Object) objArray29);
        java.lang.Class<?> wildcardClass31 = objArray29.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

}
