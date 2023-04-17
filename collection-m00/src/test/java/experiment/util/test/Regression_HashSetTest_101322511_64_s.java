package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_101322511_64_s {

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

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test033");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 0);
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) (short) 100);
        int int10 = hashSetTestDriver7.size();
        hashSetTestDriver7.clear();
        boolean boolean13 = hashSetTestDriver7.add((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver14.clear();
        boolean boolean17 = hashSetTestDriver14.add((java.lang.Object) 0);
        boolean boolean18 = hashSetTestDriver7.remove((java.lang.Object) boolean17);
        boolean boolean19 = hashSetTestDriver0.add((java.lang.Object) boolean17);
        java.lang.Class<?> wildcardClass20 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test034");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean9 = hashSetTestDriver0.add((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator11 = hashSetTestDriver10.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (short) 100);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator17 = hashSetTestDriver12.iterator();
        boolean boolean18 = hashSetTestDriver10.contains((java.lang.Object) iterator17);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver10);
        java.lang.Object[] objArray20 = hashSetTestDriver10.toArray();
        java.lang.Class<?> wildcardClass21 = hashSetTestDriver10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test035");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 0);
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver5);
        experiment.util.Iterator iterator7 = hashSetTestDriver5.iterator();
        java.lang.Object[] objArray8 = hashSetTestDriver5.toArray();
        int int9 = hashSetTestDriver5.size();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver10.clear();
        java.lang.Object[] objArray12 = hashSetTestDriver10.toArray();
        java.lang.Object obj13 = hashSetTestDriver5.getMatch((java.lang.Object) objArray12);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = hashSetTestDriver5.getMatch(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test036");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 0);
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver5);
        experiment.util.Iterator iterator7 = hashSetTestDriver5.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver8.clear();
        boolean boolean11 = hashSetTestDriver8.add((java.lang.Object) 0);
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver8.equals_CUT((java.lang.Object) hashSetTestDriver13);
        experiment.util.Iterator iterator15 = hashSetTestDriver13.iterator();
        boolean boolean16 = hashSetTestDriver5.add((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver17.clear();
        boolean boolean20 = hashSetTestDriver17.add((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver21.clear();
        boolean boolean24 = hashSetTestDriver21.add((java.lang.Object) 0);
        boolean boolean25 = hashSetTestDriver21.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver26);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray29 = hashSetTestDriver28.toArray();
        boolean boolean31 = hashSetTestDriver28.add((java.lang.Object) 10L);
        boolean boolean32 = hashSetTestDriver26.contains((java.lang.Object) 10L);
        boolean boolean33 = hashSetTestDriver26.isEmpty();
        boolean boolean34 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver26);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver35.clear();
        boolean boolean38 = hashSetTestDriver35.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray40 = hashSetTestDriver39.toArray();
        boolean boolean41 = hashSetTestDriver35.add((java.lang.Object) hashSetTestDriver39);
        boolean boolean42 = hashSetTestDriver17.remove((java.lang.Object) hashSetTestDriver35);
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver43.clear();
        boolean boolean46 = hashSetTestDriver43.add((java.lang.Object) 0);
        boolean boolean47 = hashSetTestDriver43.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver43.equals_CUT((java.lang.Object) hashSetTestDriver48);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray51 = hashSetTestDriver50.toArray();
        boolean boolean53 = hashSetTestDriver50.add((java.lang.Object) 10L);
        boolean boolean54 = hashSetTestDriver48.contains((java.lang.Object) 10L);
        boolean boolean55 = hashSetTestDriver48.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean58 = hashSetTestDriver56.remove((java.lang.Object) (short) 100);
        boolean boolean60 = hashSetTestDriver56.add((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver61 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj63 = hashSetTestDriver61.getMatch((java.lang.Object) (short) 100);
        boolean boolean64 = hashSetTestDriver56.remove((java.lang.Object) hashSetTestDriver61);
        boolean boolean65 = hashSetTestDriver48.add((java.lang.Object) hashSetTestDriver61);
        boolean boolean66 = hashSetTestDriver35.remove((java.lang.Object) hashSetTestDriver61);
        boolean boolean67 = hashSetTestDriver13.add((java.lang.Object) hashSetTestDriver35);
        experiment.util.HashSetTestDriver hashSetTestDriver68 = new experiment.util.HashSetTestDriver();
        boolean boolean70 = hashSetTestDriver68.remove((java.lang.Object) (short) 100);
        boolean boolean72 = hashSetTestDriver68.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator73 = hashSetTestDriver68.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver74 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator75 = hashSetTestDriver74.iterator();
        boolean boolean76 = hashSetTestDriver68.equals_CUT((java.lang.Object) hashSetTestDriver74);
        experiment.util.HashSetTestDriver hashSetTestDriver77 = new experiment.util.HashSetTestDriver();
        boolean boolean79 = hashSetTestDriver77.remove((java.lang.Object) (short) 100);
        boolean boolean81 = hashSetTestDriver77.add((java.lang.Object) (byte) -1);
        int int82 = hashSetTestDriver77.size();
        boolean boolean84 = hashSetTestDriver77.contains((java.lang.Object) (-1.0f));
        boolean boolean85 = hashSetTestDriver74.contains((java.lang.Object) boolean84);
        java.lang.Object obj86 = hashSetTestDriver13.getMatch((java.lang.Object) boolean84);
        int int87 = hashSetTestDriver13.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test037");
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
        boolean boolean21 = hashSetTestDriver18.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray23 = hashSetTestDriver22.toArray();
        boolean boolean24 = hashSetTestDriver18.add((java.lang.Object) hashSetTestDriver22);
        boolean boolean25 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver18);
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = hashSetTestDriver18.add(obj26);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test038");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) (-1.0f));
        boolean boolean5 = hashSetTestDriver0.contains((java.lang.Object) 'a');
        int int6 = hashSetTestDriver0.size();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = hashSetTestDriver0.getMatch(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test039");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) (short) 100);
        int int3 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        experiment.util.Iterator iterator9 = hashSetTestDriver7.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver11.clear();
        boolean boolean14 = hashSetTestDriver11.add((java.lang.Object) 0);
        boolean boolean15 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver11.equals_CUT((java.lang.Object) hashSetTestDriver16);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass20 = hashSetTestDriver19.getClass();
        boolean boolean21 = hashSetTestDriver18.remove((java.lang.Object) hashSetTestDriver19);
        boolean boolean22 = hashSetTestDriver16.add((java.lang.Object) boolean21);
        java.lang.Object obj23 = hashSetTestDriver7.getMatch((java.lang.Object) boolean21);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test040");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj3 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 0);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test041");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) (byte) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (short) 100);
        boolean boolean9 = hashSetTestDriver5.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator10 = hashSetTestDriver5.iterator();
        boolean boolean11 = hashSetTestDriver5.isEmpty();
        boolean boolean12 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        experiment.util.Iterator iterator15 = hashSetTestDriver13.iterator();
        boolean boolean16 = hashSetTestDriver5.add((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver17.clear();
        boolean boolean20 = hashSetTestDriver17.add((java.lang.Object) (-1.0f));
        boolean boolean22 = hashSetTestDriver17.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (short) 100);
        java.lang.Object obj26 = hashSetTestDriver17.getMatch((java.lang.Object) boolean25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = hashSetTestDriver5.equals_CUT(obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test042");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) (-1.0f));
        int int4 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator8 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (short) 100);
        boolean boolean13 = hashSetTestDriver9.add((java.lang.Object) (byte) -1);
        boolean boolean15 = hashSetTestDriver9.equals_CUT((java.lang.Object) true);
        boolean boolean17 = hashSetTestDriver9.remove((java.lang.Object) 1L);
        hashSetTestDriver9.clear();
        boolean boolean19 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver9);
        java.lang.Object[] objArray20 = hashSetTestDriver7.toArray();
        boolean boolean21 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test043");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) (short) 100);
        int int3 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) '4');
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test044");
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
        boolean boolean12 = hashSetTestDriver5.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (short) 100);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) (short) 100);
        boolean boolean21 = hashSetTestDriver13.remove((java.lang.Object) hashSetTestDriver18);
        boolean boolean22 = hashSetTestDriver5.add((java.lang.Object) hashSetTestDriver18);
        int int23 = hashSetTestDriver18.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test045");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean11 = hashSetTestDriver8.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator12 = hashSetTestDriver8.iterator();
        boolean boolean13 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver8);
        boolean boolean15 = hashSetTestDriver0.equals_CUT((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass16 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test046");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) 10L);
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator7 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test047");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 0);
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver8.getClass();
        boolean boolean10 = hashSetTestDriver7.remove((java.lang.Object) hashSetTestDriver8);
        boolean boolean11 = hashSetTestDriver5.add((java.lang.Object) boolean10);
        experiment.util.Iterator iterator12 = hashSetTestDriver5.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test048");
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
        boolean boolean28 = hashSetTestDriver18.add((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass29 = hashSetTestDriver18.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test049");
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
        hashSetTestDriver20.clear();
        boolean boolean23 = hashSetTestDriver20.add((java.lang.Object) 0);
        boolean boolean24 = hashSetTestDriver20.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver20.equals_CUT((java.lang.Object) hashSetTestDriver25);
        experiment.util.Iterator iterator27 = hashSetTestDriver25.iterator();
        java.lang.Object[] objArray28 = hashSetTestDriver25.toArray();
        boolean boolean29 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver25);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver30.clear();
        boolean boolean33 = hashSetTestDriver30.add((java.lang.Object) (-1.0f));
        boolean boolean35 = hashSetTestDriver30.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver36.remove((java.lang.Object) (short) 100);
        java.lang.Object obj39 = hashSetTestDriver30.getMatch((java.lang.Object) boolean38);
        boolean boolean40 = hashSetTestDriver25.equals_CUT((java.lang.Object) boolean38);
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver41.clear();
        boolean boolean44 = hashSetTestDriver41.add((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver45.clear();
        boolean boolean48 = hashSetTestDriver45.add((java.lang.Object) 0);
        boolean boolean49 = hashSetTestDriver45.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean51 = hashSetTestDriver45.equals_CUT((java.lang.Object) hashSetTestDriver50);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray53 = hashSetTestDriver52.toArray();
        boolean boolean55 = hashSetTestDriver52.add((java.lang.Object) 10L);
        boolean boolean56 = hashSetTestDriver50.contains((java.lang.Object) 10L);
        boolean boolean57 = hashSetTestDriver50.isEmpty();
        boolean boolean58 = hashSetTestDriver41.contains((java.lang.Object) hashSetTestDriver50);
        experiment.util.HashSetTestDriver hashSetTestDriver59 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver59.clear();
        boolean boolean62 = hashSetTestDriver59.add((java.lang.Object) 0);
        boolean boolean63 = hashSetTestDriver59.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        boolean boolean65 = hashSetTestDriver59.equals_CUT((java.lang.Object) hashSetTestDriver64);
        boolean boolean66 = hashSetTestDriver41.remove((java.lang.Object) hashSetTestDriver59);
        boolean boolean67 = hashSetTestDriver25.contains((java.lang.Object) boolean66);
        experiment.util.HashSetTestDriver hashSetTestDriver68 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver68.clear();
        boolean boolean71 = hashSetTestDriver68.add((java.lang.Object) 0);
        boolean boolean72 = hashSetTestDriver68.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        boolean boolean74 = hashSetTestDriver68.equals_CUT((java.lang.Object) hashSetTestDriver73);
        java.lang.Class<?> wildcardClass75 = hashSetTestDriver68.getClass();
        boolean boolean76 = hashSetTestDriver25.remove((java.lang.Object) wildcardClass75);
        experiment.util.Iterator iterator77 = hashSetTestDriver25.iterator();
        java.lang.Object[] objArray78 = hashSetTestDriver25.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver79 = new experiment.util.HashSetTestDriver();
        boolean boolean81 = hashSetTestDriver79.remove((java.lang.Object) (short) 100);
        boolean boolean83 = hashSetTestDriver79.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator84 = hashSetTestDriver79.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver85 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator86 = hashSetTestDriver85.iterator();
        boolean boolean87 = hashSetTestDriver79.equals_CUT((java.lang.Object) hashSetTestDriver85);
        int int88 = hashSetTestDriver85.size();
        boolean boolean90 = hashSetTestDriver85.remove((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver91 = new experiment.util.HashSetTestDriver();
        boolean boolean93 = hashSetTestDriver91.remove((java.lang.Object) (short) 100);
        boolean boolean95 = hashSetTestDriver91.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator96 = hashSetTestDriver91.iterator();
        boolean boolean97 = hashSetTestDriver91.isEmpty();
        java.lang.Object obj98 = hashSetTestDriver85.getMatch((java.lang.Object) hashSetTestDriver91);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = hashSetTestDriver25.equals_CUT(obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(iterator84);
        org.junit.Assert.assertNotNull(iterator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(iterator96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test050");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj7 = hashSetTestDriver5.getMatch((java.lang.Object) (short) 100);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver9.clear();
        boolean boolean12 = hashSetTestDriver9.add((java.lang.Object) (-1.0f));
        boolean boolean14 = hashSetTestDriver9.contains((java.lang.Object) 'a');
        java.lang.Object obj15 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver9);
        java.lang.Class<?> wildcardClass16 = hashSetTestDriver9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test051");
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
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver27.clear();
        boolean boolean30 = hashSetTestDriver27.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        boolean boolean33 = hashSetTestDriver27.add((java.lang.Object) hashSetTestDriver31);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (short) 100);
        boolean boolean38 = hashSetTestDriver34.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator39 = hashSetTestDriver34.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator41 = hashSetTestDriver40.iterator();
        boolean boolean42 = hashSetTestDriver34.equals_CUT((java.lang.Object) hashSetTestDriver40);
        int int43 = hashSetTestDriver40.size();
        boolean boolean44 = hashSetTestDriver27.equals_CUT((java.lang.Object) int43);
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver45.remove((java.lang.Object) (short) 100);
        boolean boolean49 = hashSetTestDriver45.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator50 = hashSetTestDriver45.iterator();
        int int51 = hashSetTestDriver45.size();
        boolean boolean52 = hashSetTestDriver27.contains((java.lang.Object) hashSetTestDriver45);
        java.lang.Object obj53 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver45);
        boolean boolean55 = hashSetTestDriver45.add((java.lang.Object) 10.0d);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test052");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) 10L);
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = hashSetTestDriver0.contains(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test053");
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
        boolean boolean21 = hashSetTestDriver18.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray23 = hashSetTestDriver22.toArray();
        boolean boolean24 = hashSetTestDriver18.add((java.lang.Object) hashSetTestDriver22);
        boolean boolean25 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver26.clear();
        boolean boolean29 = hashSetTestDriver26.add((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver30.clear();
        boolean boolean33 = hashSetTestDriver30.add((java.lang.Object) 0);
        boolean boolean34 = hashSetTestDriver30.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver30.equals_CUT((java.lang.Object) hashSetTestDriver35);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray38 = hashSetTestDriver37.toArray();
        boolean boolean40 = hashSetTestDriver37.add((java.lang.Object) 10L);
        boolean boolean41 = hashSetTestDriver35.contains((java.lang.Object) 10L);
        boolean boolean42 = hashSetTestDriver35.isEmpty();
        boolean boolean43 = hashSetTestDriver26.contains((java.lang.Object) hashSetTestDriver35);
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver44.clear();
        boolean boolean47 = hashSetTestDriver44.add((java.lang.Object) 0);
        boolean boolean48 = hashSetTestDriver44.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver44.equals_CUT((java.lang.Object) hashSetTestDriver49);
        boolean boolean51 = hashSetTestDriver26.remove((java.lang.Object) hashSetTestDriver44);
        java.lang.Object[] objArray52 = hashSetTestDriver44.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver53 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver53.clear();
        boolean boolean56 = hashSetTestDriver53.add((java.lang.Object) 0);
        boolean boolean57 = hashSetTestDriver53.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        boolean boolean59 = hashSetTestDriver53.equals_CUT((java.lang.Object) hashSetTestDriver58);
        experiment.util.Iterator iterator60 = hashSetTestDriver58.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver61 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver61.clear();
        boolean boolean64 = hashSetTestDriver61.add((java.lang.Object) 0);
        boolean boolean65 = hashSetTestDriver61.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver66 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver61.equals_CUT((java.lang.Object) hashSetTestDriver66);
        experiment.util.Iterator iterator68 = hashSetTestDriver66.iterator();
        boolean boolean69 = hashSetTestDriver58.add((java.lang.Object) hashSetTestDriver66);
        boolean boolean70 = hashSetTestDriver44.remove((java.lang.Object) boolean69);
        boolean boolean71 = hashSetTestDriver18.equals_CUT((java.lang.Object) boolean70);
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
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test054");
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
        java.lang.Object obj47 = hashSetTestDriver45.getMatch((java.lang.Object) (short) 100);
        hashSetTestDriver45.clear();
        boolean boolean49 = hashSetTestDriver45.isEmpty();
        boolean boolean50 = hashSetTestDriver18.equals_CUT((java.lang.Object) hashSetTestDriver45);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        boolean boolean53 = hashSetTestDriver51.remove((java.lang.Object) (short) 100);
        boolean boolean55 = hashSetTestDriver51.add((java.lang.Object) (byte) -1);
        int int56 = hashSetTestDriver51.size();
        java.lang.Object[] objArray57 = hashSetTestDriver51.toArray();
        int int58 = hashSetTestDriver51.size();
        java.lang.Object obj59 = hashSetTestDriver45.getMatch((java.lang.Object) hashSetTestDriver51);
        experiment.util.HashSetTestDriver hashSetTestDriver60 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray61 = hashSetTestDriver60.toArray();
        boolean boolean63 = hashSetTestDriver60.add((java.lang.Object) 10L);
        java.lang.Object obj65 = hashSetTestDriver60.getMatch((java.lang.Object) 'a');
        java.lang.Object[] objArray66 = hashSetTestDriver60.toArray();
        boolean boolean67 = hashSetTestDriver45.remove((java.lang.Object) objArray66);
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
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[-1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[10]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test055");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (short) 100);
        boolean boolean12 = hashSetTestDriver8.add((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj15 = hashSetTestDriver13.getMatch((java.lang.Object) (short) 100);
        boolean boolean16 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean19 = hashSetTestDriver13.contains((java.lang.Object) objArray18);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver20.clear();
        java.lang.Object[] objArray22 = hashSetTestDriver20.toArray();
        boolean boolean23 = hashSetTestDriver13.contains((java.lang.Object) objArray22);
        boolean boolean24 = hashSetTestDriver0.remove((java.lang.Object) boolean23);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver25.clear();
        boolean boolean28 = hashSetTestDriver25.add((java.lang.Object) 0);
        boolean boolean29 = hashSetTestDriver25.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver25.equals_CUT((java.lang.Object) hashSetTestDriver30);
        experiment.util.Iterator iterator32 = hashSetTestDriver30.iterator();
        java.lang.Object[] objArray33 = hashSetTestDriver30.toArray();
        int int34 = hashSetTestDriver30.size();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver35.clear();
        java.lang.Object[] objArray37 = hashSetTestDriver35.toArray();
        java.lang.Object obj38 = hashSetTestDriver30.getMatch((java.lang.Object) objArray37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = hashSetTestDriver0.remove(obj38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test056");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        boolean boolean3 = hashSetTestDriver1.remove((java.lang.Object) (short) 100);
        boolean boolean5 = hashSetTestDriver1.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator6 = hashSetTestDriver1.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator8 = hashSetTestDriver7.iterator();
        boolean boolean9 = hashSetTestDriver1.equals_CUT((java.lang.Object) hashSetTestDriver7);
        int int10 = hashSetTestDriver7.size();
        boolean boolean12 = hashSetTestDriver7.remove((java.lang.Object) 100.0d);
        java.lang.Object obj13 = hashSetTestDriver0.getMatch((java.lang.Object) 100.0d);
        java.lang.Object obj15 = hashSetTestDriver0.getMatch((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass16 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test057");
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
        boolean boolean12 = hashSetTestDriver5.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver13.clear();
        boolean boolean16 = hashSetTestDriver13.add((java.lang.Object) 0);
        boolean boolean17 = hashSetTestDriver13.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver13.equals_CUT((java.lang.Object) hashSetTestDriver18);
        boolean boolean20 = hashSetTestDriver18.isEmpty();
        hashSetTestDriver18.clear();
        boolean boolean22 = hashSetTestDriver5.remove((java.lang.Object) hashSetTestDriver18);
        java.lang.Object[] objArray23 = hashSetTestDriver5.toArray();
        java.lang.Class<?> wildcardClass24 = hashSetTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test058");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver8.clear();
        boolean boolean11 = hashSetTestDriver8.add((java.lang.Object) 0);
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver8.equals_CUT((java.lang.Object) hashSetTestDriver13);
        boolean boolean15 = hashSetTestDriver13.isEmpty();
        boolean boolean16 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver13);
        java.lang.Class<?> wildcardClass17 = hashSetTestDriver13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test059");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass2 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test060");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass2 = hashSetTestDriver1.getClass();
        boolean boolean3 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver1);
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver4.clear();
        boolean boolean7 = hashSetTestDriver4.add((java.lang.Object) (-1.0f));
        int int8 = hashSetTestDriver4.size();
        hashSetTestDriver4.clear();
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator11 = hashSetTestDriver4.iterator();
        boolean boolean12 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver4);
        int int13 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test061");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (short) 100);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator7 = hashSetTestDriver6.iterator();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver6);
        int int9 = hashSetTestDriver6.size();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.remove((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator13 = hashSetTestDriver10.iterator();
        boolean boolean14 = hashSetTestDriver6.contains((java.lang.Object) iterator13);
        hashSetTestDriver6.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.remove((java.lang.Object) (short) 100);
        boolean boolean20 = hashSetTestDriver16.add((java.lang.Object) (byte) -1);
        experiment.util.Iterator iterator21 = hashSetTestDriver16.iterator();
        int int22 = hashSetTestDriver16.size();
        boolean boolean23 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test062");
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
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) (short) 100);
        hashSetTestDriver18.clear();
        boolean boolean22 = hashSetTestDriver18.isEmpty();
        boolean boolean23 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver18);
        java.lang.Class<?> wildcardClass24 = hashSetTestDriver18.getClass();
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
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test063");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) 10L);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_101322511_1024_0.test064");
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
        hashSetTestDriver20.clear();
        boolean boolean23 = hashSetTestDriver20.add((java.lang.Object) 0);
        boolean boolean24 = hashSetTestDriver20.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver20.equals_CUT((java.lang.Object) hashSetTestDriver25);
        experiment.util.Iterator iterator27 = hashSetTestDriver25.iterator();
        java.lang.Object[] objArray28 = hashSetTestDriver25.toArray();
        boolean boolean29 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver25);
        boolean boolean30 = hashSetTestDriver6.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean33 = hashSetTestDriver31.remove((java.lang.Object) (short) 100);
        boolean boolean35 = hashSetTestDriver31.add((java.lang.Object) (byte) -1);
        boolean boolean37 = hashSetTestDriver31.equals_CUT((java.lang.Object) true);
        java.lang.Class<?> wildcardClass38 = hashSetTestDriver31.getClass();
        boolean boolean39 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver31);
        java.lang.Object obj41 = hashSetTestDriver31.getMatch((java.lang.Object) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
    }

}
