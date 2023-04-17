package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1082618794_128_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = hashSetTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        int int2 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass6 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass9 = iterator8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean8 = hashSetTestDriver6.isEmpty();
        boolean boolean10 = hashSetTestDriver6.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver11);
        java.lang.Object obj14 = hashSetTestDriver6.getMatch((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = hashSetTestDriver0.remove(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        experiment.util.Iterator iterator7 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass8 = iterator7.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        hashSetTestDriver2.clear();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver2);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver2.remove((java.lang.Object) hashSetTestDriver6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        boolean boolean18 = hashSetTestDriver16.isEmpty();
        boolean boolean20 = hashSetTestDriver16.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = hashSetTestDriver14.contains((java.lang.Object) hashSetTestDriver16);
        int int22 = hashSetTestDriver14.size();
        boolean boolean23 = hashSetTestDriver0.equals_CUT((java.lang.Object) int22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        int int7 = hashSetTestDriver5.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test018");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test020");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) (short) 0);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test022");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test023");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        int int12 = hashSetTestDriver0.size();
        boolean boolean14 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator15 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test024");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass4 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        hashSetTestDriver2.clear();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver2);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = hashSetTestDriver0.add(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = hashSetTestDriver0.add(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        hashSetTestDriver7.clear();
        boolean boolean11 = hashSetTestDriver7.contains((java.lang.Object) (short) 0);
        boolean boolean12 = hashSetTestDriver7.isEmpty();
        hashSetTestDriver7.clear();
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean19 = hashSetTestDriver17.isEmpty();
        boolean boolean21 = hashSetTestDriver17.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean22 = hashSetTestDriver15.contains((java.lang.Object) hashSetTestDriver17);
        boolean boolean24 = hashSetTestDriver15.equals_CUT((java.lang.Object) 100);
        int int25 = hashSetTestDriver15.size();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray27 = hashSetTestDriver26.toArray();
        boolean boolean28 = hashSetTestDriver26.isEmpty();
        boolean boolean30 = hashSetTestDriver26.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray31 = hashSetTestDriver26.toArray();
        boolean boolean32 = hashSetTestDriver15.equals_CUT((java.lang.Object) hashSetTestDriver26);
        boolean boolean33 = hashSetTestDriver26.isEmpty();
        java.lang.Object obj34 = hashSetTestDriver7.getMatch((java.lang.Object) boolean33);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) 100.0f);
        int int9 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test030");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        int int12 = hashSetTestDriver0.size();
        boolean boolean13 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator14 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass2 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test033");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        int int7 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test034");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        int int8 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test035");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean11 = hashSetTestDriver9.isEmpty();
        boolean boolean12 = hashSetTestDriver9.isEmpty();
        hashSetTestDriver9.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        boolean boolean16 = hashSetTestDriver14.isEmpty();
        boolean boolean18 = hashSetTestDriver14.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray19 = hashSetTestDriver14.toArray();
        boolean boolean20 = hashSetTestDriver9.remove((java.lang.Object) objArray19);
        java.lang.Object[] objArray21 = hashSetTestDriver9.toArray();
        java.lang.Object[] objArray22 = hashSetTestDriver9.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        boolean boolean24 = hashSetTestDriver0.contains((java.lang.Object) objArray22);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray28 = hashSetTestDriver27.toArray();
        boolean boolean30 = hashSetTestDriver27.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean31 = hashSetTestDriver27.isEmpty();
        boolean boolean32 = hashSetTestDriver26.equals_CUT((java.lang.Object) boolean31);
        experiment.util.Iterator iterator33 = hashSetTestDriver26.iterator();
        boolean boolean34 = hashSetTestDriver0.add((java.lang.Object) iterator33);
        boolean boolean35 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test036");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 'a');
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test037");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean8 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) boolean8);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        boolean boolean14 = hashSetTestDriver12.isEmpty();
        boolean boolean16 = hashSetTestDriver12.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean17 = hashSetTestDriver10.contains((java.lang.Object) hashSetTestDriver12);
        experiment.util.Iterator iterator18 = hashSetTestDriver10.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean21 = hashSetTestDriver19.isEmpty();
        boolean boolean22 = hashSetTestDriver19.isEmpty();
        hashSetTestDriver19.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        boolean boolean26 = hashSetTestDriver24.isEmpty();
        boolean boolean28 = hashSetTestDriver24.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray29 = hashSetTestDriver24.toArray();
        boolean boolean30 = hashSetTestDriver19.remove((java.lang.Object) objArray29);
        java.lang.Object[] objArray31 = hashSetTestDriver19.toArray();
        java.lang.Object[] objArray32 = hashSetTestDriver19.toArray();
        java.lang.Class<?> wildcardClass33 = objArray32.getClass();
        boolean boolean34 = hashSetTestDriver10.contains((java.lang.Object) objArray32);
        hashSetTestDriver10.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray38 = hashSetTestDriver37.toArray();
        boolean boolean40 = hashSetTestDriver37.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean41 = hashSetTestDriver37.isEmpty();
        boolean boolean42 = hashSetTestDriver36.equals_CUT((java.lang.Object) boolean41);
        experiment.util.Iterator iterator43 = hashSetTestDriver36.iterator();
        boolean boolean44 = hashSetTestDriver10.add((java.lang.Object) iterator43);
        boolean boolean45 = hashSetTestDriver0.remove((java.lang.Object) boolean44);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test038");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) (byte) 100);
        hashSetTestDriver0.clear();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = hashSetTestDriver0.equals_CUT(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test039");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean25 = hashSetTestDriver21.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean26 = hashSetTestDriver19.contains((java.lang.Object) hashSetTestDriver21);
        boolean boolean28 = hashSetTestDriver19.equals_CUT((java.lang.Object) 100);
        int int29 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray31 = hashSetTestDriver30.toArray();
        boolean boolean32 = hashSetTestDriver30.isEmpty();
        boolean boolean34 = hashSetTestDriver30.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray35 = hashSetTestDriver30.toArray();
        boolean boolean36 = hashSetTestDriver19.equals_CUT((java.lang.Object) hashSetTestDriver30);
        experiment.util.Iterator iterator37 = hashSetTestDriver30.iterator();
        boolean boolean38 = hashSetTestDriver11.remove((java.lang.Object) hashSetTestDriver30);
        java.lang.Class<?> wildcardClass39 = hashSetTestDriver30.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test040");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        hashSetTestDriver7.clear();
        boolean boolean11 = hashSetTestDriver7.contains((java.lang.Object) (short) 0);
        boolean boolean12 = hashSetTestDriver7.isEmpty();
        hashSetTestDriver7.clear();
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver7);
        boolean boolean15 = hashSetTestDriver7.isEmpty();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test041");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean11 = hashSetTestDriver9.isEmpty();
        boolean boolean13 = hashSetTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver9);
        boolean boolean16 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        boolean boolean18 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        int int19 = hashSetTestDriver7.size();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray21 = hashSetTestDriver20.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray23 = hashSetTestDriver22.toArray();
        boolean boolean24 = hashSetTestDriver22.isEmpty();
        boolean boolean26 = hashSetTestDriver22.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean27 = hashSetTestDriver20.contains((java.lang.Object) hashSetTestDriver22);
        boolean boolean29 = hashSetTestDriver20.add((java.lang.Object) (-1.0f));
        boolean boolean30 = hashSetTestDriver7.add((java.lang.Object) (-1.0f));
        boolean boolean31 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray33 = hashSetTestDriver32.toArray();
        boolean boolean34 = hashSetTestDriver32.isEmpty();
        boolean boolean36 = hashSetTestDriver32.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray37 = hashSetTestDriver32.toArray();
        java.lang.Object[] objArray38 = hashSetTestDriver32.toArray();
        boolean boolean39 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver32);
        java.lang.Object obj40 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = hashSetTestDriver0.equals_CUT(obj40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test042");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        int int12 = hashSetTestDriver0.size();
        boolean boolean14 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        boolean boolean15 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass16 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test043");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        hashSetTestDriver0.clear();
        int int21 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test044");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        experiment.util.Iterator iterator7 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator11 = hashSetTestDriver8.iterator();
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        java.lang.Object[] objArray13 = hashSetTestDriver8.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver14);
        boolean boolean16 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver14);
        java.lang.Object[] objArray17 = hashSetTestDriver0.toArray();
        boolean boolean18 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test045");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        experiment.util.Iterator iterator7 = hashSetTestDriver0.iterator();
        int int8 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test046");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        int int6 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean9 = hashSetTestDriver7.isEmpty();
        boolean boolean10 = hashSetTestDriver7.isEmpty();
        hashSetTestDriver7.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        boolean boolean14 = hashSetTestDriver12.isEmpty();
        boolean boolean16 = hashSetTestDriver12.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray17 = hashSetTestDriver12.toArray();
        boolean boolean18 = hashSetTestDriver7.remove((java.lang.Object) objArray17);
        int int19 = hashSetTestDriver7.size();
        java.lang.Object obj20 = hashSetTestDriver0.getMatch((java.lang.Object) int19);
        hashSetTestDriver0.clear();
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = hashSetTestDriver0.equals_CUT(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test047");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        int int7 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        boolean boolean11 = hashSetTestDriver8.isEmpty();
        hashSetTestDriver8.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean15 = hashSetTestDriver13.isEmpty();
        boolean boolean17 = hashSetTestDriver13.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray18 = hashSetTestDriver13.toArray();
        boolean boolean19 = hashSetTestDriver8.remove((java.lang.Object) objArray18);
        java.lang.Object[] objArray20 = hashSetTestDriver8.toArray();
        java.lang.Object[] objArray21 = hashSetTestDriver8.toArray();
        boolean boolean23 = hashSetTestDriver8.equals_CUT((java.lang.Object) (short) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        java.lang.Object[] objArray26 = hashSetTestDriver24.toArray();
        boolean boolean27 = hashSetTestDriver8.equals_CUT((java.lang.Object) objArray26);
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver8);
        boolean boolean29 = hashSetTestDriver0.isEmpty();
        boolean boolean31 = hashSetTestDriver0.contains((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test048");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean9 = hashSetTestDriver7.isEmpty();
        boolean boolean11 = hashSetTestDriver7.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray12 = hashSetTestDriver7.toArray();
        hashSetTestDriver7.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        boolean boolean17 = hashSetTestDriver14.equals_CUT((java.lang.Object) 100.0f);
        java.lang.Object[] objArray18 = hashSetTestDriver14.toArray();
        boolean boolean20 = hashSetTestDriver14.contains((java.lang.Object) 0);
        boolean boolean21 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver14);
        boolean boolean22 = hashSetTestDriver0.contains((java.lang.Object) boolean21);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test049");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test050");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = hashSetTestDriver0.remove(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test051");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        hashSetTestDriver2.clear();
        boolean boolean6 = hashSetTestDriver2.remove((java.lang.Object) "hi!");
        java.lang.Object[] objArray7 = hashSetTestDriver2.toArray();
        boolean boolean9 = hashSetTestDriver2.remove((java.lang.Object) (byte) 100);
        hashSetTestDriver2.clear();
        java.lang.Object obj11 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test052");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        boolean boolean11 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        hashSetTestDriver0.clear();
        int int13 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test053");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean11 = hashSetTestDriver9.isEmpty();
        boolean boolean13 = hashSetTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver9);
        boolean boolean16 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        boolean boolean18 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        int int19 = hashSetTestDriver7.size();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray21 = hashSetTestDriver20.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray23 = hashSetTestDriver22.toArray();
        boolean boolean24 = hashSetTestDriver22.isEmpty();
        boolean boolean26 = hashSetTestDriver22.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean27 = hashSetTestDriver20.contains((java.lang.Object) hashSetTestDriver22);
        boolean boolean29 = hashSetTestDriver20.add((java.lang.Object) (-1.0f));
        boolean boolean30 = hashSetTestDriver7.add((java.lang.Object) (-1.0f));
        boolean boolean31 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray33 = hashSetTestDriver32.toArray();
        boolean boolean34 = hashSetTestDriver32.isEmpty();
        boolean boolean36 = hashSetTestDriver32.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray37 = hashSetTestDriver32.toArray();
        hashSetTestDriver32.clear();
        java.lang.Object[] objArray39 = hashSetTestDriver32.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray41 = hashSetTestDriver40.toArray();
        boolean boolean42 = hashSetTestDriver40.isEmpty();
        boolean boolean43 = hashSetTestDriver40.isEmpty();
        hashSetTestDriver40.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray46 = hashSetTestDriver45.toArray();
        boolean boolean47 = hashSetTestDriver45.isEmpty();
        boolean boolean49 = hashSetTestDriver45.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray50 = hashSetTestDriver45.toArray();
        boolean boolean51 = hashSetTestDriver40.remove((java.lang.Object) objArray50);
        int int52 = hashSetTestDriver40.size();
        java.lang.Object[] objArray53 = hashSetTestDriver40.toArray();
        boolean boolean54 = hashSetTestDriver32.add((java.lang.Object) hashSetTestDriver40);
        hashSetTestDriver40.clear();
        boolean boolean56 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver40);
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray58 = hashSetTestDriver57.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver59 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray60 = hashSetTestDriver59.toArray();
        boolean boolean61 = hashSetTestDriver59.isEmpty();
        boolean boolean63 = hashSetTestDriver59.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean64 = hashSetTestDriver57.contains((java.lang.Object) hashSetTestDriver59);
        java.lang.Object[] objArray65 = hashSetTestDriver57.toArray();
        boolean boolean66 = hashSetTestDriver40.contains((java.lang.Object) objArray65);
        experiment.util.HashSetTestDriver hashSetTestDriver67 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray68 = hashSetTestDriver67.toArray();
        boolean boolean69 = hashSetTestDriver67.isEmpty();
        boolean boolean71 = hashSetTestDriver67.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver72 = new experiment.util.HashSetTestDriver();
        boolean boolean73 = hashSetTestDriver67.add((java.lang.Object) hashSetTestDriver72);
        java.lang.Object obj74 = hashSetTestDriver40.getMatch((java.lang.Object) boolean73);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test054");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean15 = hashSetTestDriver13.isEmpty();
        boolean boolean17 = hashSetTestDriver13.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver13.add((java.lang.Object) hashSetTestDriver18);
        boolean boolean20 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver13);
        int int21 = hashSetTestDriver13.size();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray24 = hashSetTestDriver23.toArray();
        boolean boolean26 = hashSetTestDriver23.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean27 = hashSetTestDriver23.isEmpty();
        boolean boolean28 = hashSetTestDriver22.equals_CUT((java.lang.Object) boolean27);
        experiment.util.Iterator iterator29 = hashSetTestDriver22.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        boolean boolean34 = hashSetTestDriver31.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean35 = hashSetTestDriver31.isEmpty();
        boolean boolean36 = hashSetTestDriver30.equals_CUT((java.lang.Object) boolean35);
        java.lang.Object obj38 = hashSetTestDriver30.getMatch((java.lang.Object) 100.0f);
        boolean boolean39 = hashSetTestDriver22.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean40 = hashSetTestDriver13.equals_CUT((java.lang.Object) boolean39);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test055");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) (short) 0);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test056");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        int int8 = hashSetTestDriver2.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test057");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) 10L);
        int int5 = hashSetTestDriver0.size();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean11 = hashSetTestDriver8.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        boolean boolean13 = hashSetTestDriver7.equals_CUT((java.lang.Object) boolean12);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        hashSetTestDriver14.clear();
        boolean boolean18 = hashSetTestDriver14.contains((java.lang.Object) (short) 0);
        boolean boolean19 = hashSetTestDriver14.isEmpty();
        hashSetTestDriver14.clear();
        boolean boolean21 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver14);
        java.lang.Object obj22 = hashSetTestDriver0.getMatch((java.lang.Object) boolean21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = hashSetTestDriver0.remove((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test058");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean10 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100.0f);
        java.lang.Object[] objArray11 = hashSetTestDriver7.toArray();
        boolean boolean13 = hashSetTestDriver7.contains((java.lang.Object) 0);
        boolean boolean14 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver7);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = hashSetTestDriver0.getMatch(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test059");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean25 = hashSetTestDriver21.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean26 = hashSetTestDriver19.contains((java.lang.Object) hashSetTestDriver21);
        boolean boolean28 = hashSetTestDriver19.equals_CUT((java.lang.Object) 100);
        int int29 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray31 = hashSetTestDriver30.toArray();
        boolean boolean32 = hashSetTestDriver30.isEmpty();
        boolean boolean34 = hashSetTestDriver30.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray35 = hashSetTestDriver30.toArray();
        boolean boolean36 = hashSetTestDriver19.equals_CUT((java.lang.Object) hashSetTestDriver30);
        experiment.util.Iterator iterator37 = hashSetTestDriver30.iterator();
        boolean boolean38 = hashSetTestDriver11.remove((java.lang.Object) hashSetTestDriver30);
        boolean boolean40 = hashSetTestDriver30.remove((java.lang.Object) true);
        int int41 = hashSetTestDriver30.size();
        int int42 = hashSetTestDriver30.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test060");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray4 = hashSetTestDriver3.toArray();
        hashSetTestDriver3.clear();
        boolean boolean7 = hashSetTestDriver3.remove((java.lang.Object) "hi!");
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) boolean7);
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator10 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test061");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean25 = hashSetTestDriver21.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean26 = hashSetTestDriver19.contains((java.lang.Object) hashSetTestDriver21);
        boolean boolean28 = hashSetTestDriver19.equals_CUT((java.lang.Object) 100);
        int int29 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray31 = hashSetTestDriver30.toArray();
        boolean boolean32 = hashSetTestDriver30.isEmpty();
        boolean boolean34 = hashSetTestDriver30.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray35 = hashSetTestDriver30.toArray();
        boolean boolean36 = hashSetTestDriver19.equals_CUT((java.lang.Object) hashSetTestDriver30);
        experiment.util.Iterator iterator37 = hashSetTestDriver30.iterator();
        boolean boolean38 = hashSetTestDriver11.remove((java.lang.Object) hashSetTestDriver30);
        boolean boolean40 = hashSetTestDriver30.remove((java.lang.Object) true);
        java.lang.Class<?> wildcardClass41 = hashSetTestDriver30.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test062");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test063");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        int int5 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test064");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test065");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean11 = hashSetTestDriver9.isEmpty();
        boolean boolean13 = hashSetTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver9);
        boolean boolean16 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        boolean boolean18 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean24 = hashSetTestDriver21.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean25 = hashSetTestDriver21.isEmpty();
        boolean boolean26 = hashSetTestDriver20.equals_CUT((java.lang.Object) boolean25);
        experiment.util.Iterator iterator27 = hashSetTestDriver20.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean33 = hashSetTestDriver29.isEmpty();
        boolean boolean34 = hashSetTestDriver28.equals_CUT((java.lang.Object) boolean33);
        java.lang.Object obj36 = hashSetTestDriver28.getMatch((java.lang.Object) 100.0f);
        boolean boolean37 = hashSetTestDriver20.equals_CUT((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray39 = hashSetTestDriver38.toArray();
        boolean boolean40 = hashSetTestDriver38.isEmpty();
        boolean boolean41 = hashSetTestDriver38.isEmpty();
        hashSetTestDriver38.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray44 = hashSetTestDriver43.toArray();
        boolean boolean45 = hashSetTestDriver43.isEmpty();
        boolean boolean47 = hashSetTestDriver43.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray48 = hashSetTestDriver43.toArray();
        boolean boolean49 = hashSetTestDriver38.remove((java.lang.Object) objArray48);
        java.lang.Object[] objArray50 = hashSetTestDriver38.toArray();
        java.lang.Object[] objArray51 = hashSetTestDriver38.toArray();
        java.lang.Class<?> wildcardClass52 = objArray51.getClass();
        boolean boolean53 = hashSetTestDriver20.add((java.lang.Object) wildcardClass52);
        boolean boolean54 = hashSetTestDriver7.equals_CUT((java.lang.Object) wildcardClass52);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test066");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) (short) 0);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean9 = hashSetTestDriver7.isEmpty();
        boolean boolean11 = hashSetTestDriver7.contains((java.lang.Object) 10L);
        int int12 = hashSetTestDriver7.size();
        java.lang.Object[] objArray13 = hashSetTestDriver7.toArray();
        boolean boolean14 = hashSetTestDriver0.remove((java.lang.Object) objArray13);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test067");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        java.lang.Object[] objArray19 = hashSetTestDriver11.toArray();
        experiment.util.Iterator iterator20 = hashSetTestDriver11.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test068");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean25 = hashSetTestDriver21.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean26 = hashSetTestDriver19.contains((java.lang.Object) hashSetTestDriver21);
        boolean boolean28 = hashSetTestDriver19.equals_CUT((java.lang.Object) 100);
        int int29 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray31 = hashSetTestDriver30.toArray();
        boolean boolean32 = hashSetTestDriver30.isEmpty();
        boolean boolean34 = hashSetTestDriver30.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray35 = hashSetTestDriver30.toArray();
        boolean boolean36 = hashSetTestDriver19.equals_CUT((java.lang.Object) hashSetTestDriver30);
        experiment.util.Iterator iterator37 = hashSetTestDriver30.iterator();
        boolean boolean38 = hashSetTestDriver11.remove((java.lang.Object) hashSetTestDriver30);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray40 = hashSetTestDriver39.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray42 = hashSetTestDriver41.toArray();
        boolean boolean43 = hashSetTestDriver41.isEmpty();
        boolean boolean45 = hashSetTestDriver41.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean46 = hashSetTestDriver39.contains((java.lang.Object) hashSetTestDriver41);
        boolean boolean48 = hashSetTestDriver39.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray50 = hashSetTestDriver49.toArray();
        boolean boolean51 = hashSetTestDriver49.isEmpty();
        boolean boolean52 = hashSetTestDriver49.isEmpty();
        hashSetTestDriver49.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray55 = hashSetTestDriver54.toArray();
        boolean boolean56 = hashSetTestDriver54.isEmpty();
        boolean boolean58 = hashSetTestDriver54.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray59 = hashSetTestDriver54.toArray();
        boolean boolean60 = hashSetTestDriver49.remove((java.lang.Object) objArray59);
        int int61 = hashSetTestDriver49.size();
        java.lang.Object obj62 = hashSetTestDriver39.getMatch((java.lang.Object) hashSetTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = hashSetTestDriver30.add(obj62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test069");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        boolean boolean16 = hashSetTestDriver14.isEmpty();
        boolean boolean17 = hashSetTestDriver14.isEmpty();
        hashSetTestDriver14.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean21 = hashSetTestDriver19.isEmpty();
        boolean boolean23 = hashSetTestDriver19.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray24 = hashSetTestDriver19.toArray();
        boolean boolean25 = hashSetTestDriver14.remove((java.lang.Object) objArray24);
        java.lang.Object[] objArray26 = hashSetTestDriver14.toArray();
        java.lang.Object[] objArray27 = hashSetTestDriver14.toArray();
        boolean boolean29 = hashSetTestDriver14.equals_CUT((java.lang.Object) (short) 0);
        boolean boolean30 = hashSetTestDriver0.add((java.lang.Object) boolean29);
        int int31 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray33 = hashSetTestDriver32.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray35 = hashSetTestDriver34.toArray();
        boolean boolean36 = hashSetTestDriver34.isEmpty();
        boolean boolean38 = hashSetTestDriver34.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean39 = hashSetTestDriver32.contains((java.lang.Object) hashSetTestDriver34);
        boolean boolean41 = hashSetTestDriver32.equals_CUT((java.lang.Object) 100);
        int int42 = hashSetTestDriver32.size();
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray44 = hashSetTestDriver43.toArray();
        boolean boolean45 = hashSetTestDriver43.isEmpty();
        boolean boolean47 = hashSetTestDriver43.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray48 = hashSetTestDriver43.toArray();
        boolean boolean49 = hashSetTestDriver32.equals_CUT((java.lang.Object) hashSetTestDriver43);
        boolean boolean50 = hashSetTestDriver43.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray52 = hashSetTestDriver51.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver53 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray54 = hashSetTestDriver53.toArray();
        boolean boolean55 = hashSetTestDriver53.isEmpty();
        boolean boolean57 = hashSetTestDriver53.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean58 = hashSetTestDriver51.contains((java.lang.Object) hashSetTestDriver53);
        boolean boolean60 = hashSetTestDriver51.equals_CUT((java.lang.Object) 100);
        int int61 = hashSetTestDriver51.size();
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray63 = hashSetTestDriver62.toArray();
        boolean boolean64 = hashSetTestDriver62.isEmpty();
        boolean boolean66 = hashSetTestDriver62.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray67 = hashSetTestDriver62.toArray();
        boolean boolean68 = hashSetTestDriver51.equals_CUT((java.lang.Object) hashSetTestDriver62);
        experiment.util.Iterator iterator69 = hashSetTestDriver62.iterator();
        boolean boolean70 = hashSetTestDriver43.remove((java.lang.Object) hashSetTestDriver62);
        boolean boolean72 = hashSetTestDriver62.remove((java.lang.Object) true);
        int int73 = hashSetTestDriver62.size();
        java.lang.Object obj74 = hashSetTestDriver0.getMatch((java.lang.Object) int73);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test070");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        experiment.util.Iterator iterator7 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean13 = hashSetTestDriver9.isEmpty();
        boolean boolean14 = hashSetTestDriver8.equals_CUT((java.lang.Object) boolean13);
        java.lang.Object obj16 = hashSetTestDriver8.getMatch((java.lang.Object) 100.0f);
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean18 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        hashSetTestDriver19.clear();
        boolean boolean23 = hashSetTestDriver19.contains((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass24 = hashSetTestDriver19.getClass();
        boolean boolean25 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver19);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test071");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) (byte) 100);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean14 = hashSetTestDriver10.isEmpty();
        boolean boolean15 = hashSetTestDriver9.equals_CUT((java.lang.Object) boolean14);
        boolean boolean17 = hashSetTestDriver9.remove((java.lang.Object) 10.0d);
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver9);
        java.lang.Object[] objArray19 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test072");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        java.lang.Object[] objArray19 = hashSetTestDriver11.toArray();
        int int20 = hashSetTestDriver11.size();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean25 = hashSetTestDriver21.equals_CUT((java.lang.Object) (byte) -1);
        int int26 = hashSetTestDriver21.size();
        java.lang.Object[] objArray27 = hashSetTestDriver21.toArray();
        boolean boolean28 = hashSetTestDriver11.contains((java.lang.Object) hashSetTestDriver21);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test073");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        boolean boolean12 = hashSetTestDriver8.remove((java.lang.Object) 'a');
        experiment.util.Iterator iterator13 = hashSetTestDriver8.iterator();
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator13);
        boolean boolean15 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test074");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean11 = hashSetTestDriver9.isEmpty();
        boolean boolean13 = hashSetTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver9);
        boolean boolean16 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        java.lang.Object[] objArray17 = hashSetTestDriver7.toArray();
        boolean boolean18 = hashSetTestDriver0.equals_CUT((java.lang.Object) objArray17);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean21 = hashSetTestDriver19.isEmpty();
        boolean boolean23 = hashSetTestDriver19.equals_CUT((java.lang.Object) (byte) -1);
        int int24 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray26 = hashSetTestDriver25.toArray();
        hashSetTestDriver25.clear();
        boolean boolean28 = hashSetTestDriver19.contains((java.lang.Object) hashSetTestDriver25);
        java.lang.Object obj29 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test075");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        hashSetTestDriver19.clear();
        boolean boolean23 = hashSetTestDriver19.contains((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass24 = hashSetTestDriver19.getClass();
        boolean boolean25 = hashSetTestDriver11.equals_CUT((java.lang.Object) hashSetTestDriver19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test076");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        java.lang.Class<?> wildcardClass11 = hashSetTestDriver8.getClass();
        boolean boolean12 = hashSetTestDriver0.equals_CUT((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test077");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean9 = hashSetTestDriver7.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean12 = hashSetTestDriver10.isEmpty();
        boolean boolean13 = hashSetTestDriver10.isEmpty();
        hashSetTestDriver10.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        boolean boolean17 = hashSetTestDriver15.isEmpty();
        boolean boolean19 = hashSetTestDriver15.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray20 = hashSetTestDriver15.toArray();
        boolean boolean21 = hashSetTestDriver10.remove((java.lang.Object) objArray20);
        int int22 = hashSetTestDriver10.size();
        java.lang.Object[] objArray23 = hashSetTestDriver10.toArray();
        boolean boolean24 = hashSetTestDriver7.equals_CUT((java.lang.Object) objArray23);
        experiment.util.Iterator iterator25 = hashSetTestDriver7.iterator();
        boolean boolean26 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator25);
        int int27 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test078");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) 10L);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test079");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        java.lang.Object[] objArray10 = hashSetTestDriver0.toArray();
        boolean boolean12 = hashSetTestDriver0.remove((java.lang.Object) (byte) 100);
        boolean boolean13 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray14 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test080");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver0.size();
        int int10 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test081");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        int int4 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test082");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        boolean boolean16 = hashSetTestDriver14.isEmpty();
        boolean boolean17 = hashSetTestDriver14.isEmpty();
        hashSetTestDriver14.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean21 = hashSetTestDriver19.isEmpty();
        boolean boolean23 = hashSetTestDriver19.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray24 = hashSetTestDriver19.toArray();
        boolean boolean25 = hashSetTestDriver14.remove((java.lang.Object) objArray24);
        java.lang.Object[] objArray26 = hashSetTestDriver14.toArray();
        java.lang.Object[] objArray27 = hashSetTestDriver14.toArray();
        boolean boolean29 = hashSetTestDriver14.equals_CUT((java.lang.Object) (short) 0);
        boolean boolean30 = hashSetTestDriver0.add((java.lang.Object) boolean29);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray34 = hashSetTestDriver33.toArray();
        boolean boolean35 = hashSetTestDriver33.isEmpty();
        boolean boolean37 = hashSetTestDriver33.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean38 = hashSetTestDriver31.contains((java.lang.Object) hashSetTestDriver33);
        boolean boolean40 = hashSetTestDriver31.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray42 = hashSetTestDriver41.toArray();
        boolean boolean43 = hashSetTestDriver41.isEmpty();
        boolean boolean44 = hashSetTestDriver41.isEmpty();
        hashSetTestDriver41.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray47 = hashSetTestDriver46.toArray();
        boolean boolean48 = hashSetTestDriver46.isEmpty();
        boolean boolean50 = hashSetTestDriver46.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray51 = hashSetTestDriver46.toArray();
        boolean boolean52 = hashSetTestDriver41.remove((java.lang.Object) objArray51);
        int int53 = hashSetTestDriver41.size();
        java.lang.Object obj54 = hashSetTestDriver31.getMatch((java.lang.Object) hashSetTestDriver41);
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray56 = hashSetTestDriver55.toArray();
        boolean boolean57 = hashSetTestDriver55.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray59 = hashSetTestDriver58.toArray();
        boolean boolean60 = hashSetTestDriver58.isEmpty();
        boolean boolean61 = hashSetTestDriver58.isEmpty();
        hashSetTestDriver58.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray64 = hashSetTestDriver63.toArray();
        boolean boolean65 = hashSetTestDriver63.isEmpty();
        boolean boolean67 = hashSetTestDriver63.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray68 = hashSetTestDriver63.toArray();
        boolean boolean69 = hashSetTestDriver58.remove((java.lang.Object) objArray68);
        int int70 = hashSetTestDriver58.size();
        java.lang.Object[] objArray71 = hashSetTestDriver58.toArray();
        boolean boolean72 = hashSetTestDriver55.equals_CUT((java.lang.Object) objArray71);
        boolean boolean73 = hashSetTestDriver31.add((java.lang.Object) boolean72);
        boolean boolean74 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver31);
        java.lang.Object obj75 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = hashSetTestDriver0.contains(obj75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test083");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test084");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        boolean boolean12 = hashSetTestDriver8.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean13 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver8);
        boolean boolean15 = hashSetTestDriver6.equals_CUT((java.lang.Object) 100);
        int int16 = hashSetTestDriver6.size();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean19 = hashSetTestDriver17.isEmpty();
        boolean boolean21 = hashSetTestDriver17.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray22 = hashSetTestDriver17.toArray();
        boolean boolean23 = hashSetTestDriver6.equals_CUT((java.lang.Object) hashSetTestDriver17);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray26 = hashSetTestDriver25.toArray();
        boolean boolean28 = hashSetTestDriver25.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean29 = hashSetTestDriver25.isEmpty();
        boolean boolean30 = hashSetTestDriver24.equals_CUT((java.lang.Object) boolean29);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        hashSetTestDriver31.clear();
        boolean boolean35 = hashSetTestDriver31.contains((java.lang.Object) (short) 0);
        boolean boolean36 = hashSetTestDriver31.isEmpty();
        hashSetTestDriver31.clear();
        boolean boolean38 = hashSetTestDriver24.equals_CUT((java.lang.Object) hashSetTestDriver31);
        boolean boolean39 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver24);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray42 = hashSetTestDriver41.toArray();
        boolean boolean44 = hashSetTestDriver41.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean45 = hashSetTestDriver41.isEmpty();
        boolean boolean46 = hashSetTestDriver40.equals_CUT((java.lang.Object) boolean45);
        experiment.util.Iterator iterator47 = hashSetTestDriver40.iterator();
        boolean boolean48 = hashSetTestDriver24.equals_CUT((java.lang.Object) hashSetTestDriver40);
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray50 = hashSetTestDriver49.toArray();
        boolean boolean51 = hashSetTestDriver49.isEmpty();
        boolean boolean52 = hashSetTestDriver49.isEmpty();
        hashSetTestDriver49.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray55 = hashSetTestDriver54.toArray();
        boolean boolean56 = hashSetTestDriver54.isEmpty();
        boolean boolean58 = hashSetTestDriver54.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray59 = hashSetTestDriver54.toArray();
        boolean boolean60 = hashSetTestDriver49.remove((java.lang.Object) objArray59);
        java.lang.Object[] objArray61 = hashSetTestDriver49.toArray();
        java.lang.Object[] objArray62 = hashSetTestDriver49.toArray();
        boolean boolean64 = hashSetTestDriver49.equals_CUT((java.lang.Object) (short) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver65 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray66 = hashSetTestDriver65.toArray();
        java.lang.Object[] objArray67 = hashSetTestDriver65.toArray();
        boolean boolean68 = hashSetTestDriver49.equals_CUT((java.lang.Object) objArray67);
        java.lang.Object obj69 = hashSetTestDriver40.getMatch((java.lang.Object) hashSetTestDriver49);
        experiment.util.HashSetTestDriver hashSetTestDriver70 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray71 = hashSetTestDriver70.toArray();
        boolean boolean72 = hashSetTestDriver70.isEmpty();
        experiment.util.Iterator iterator73 = hashSetTestDriver70.iterator();
        boolean boolean74 = hashSetTestDriver70.isEmpty();
        java.lang.Object[] objArray75 = hashSetTestDriver70.toArray();
        boolean boolean76 = hashSetTestDriver40.add((java.lang.Object) objArray75);
        boolean boolean77 = hashSetTestDriver0.add((java.lang.Object) boolean76);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test085");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        hashSetTestDriver6.clear();
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver10.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        hashSetTestDriver12.clear();
        boolean boolean15 = hashSetTestDriver10.remove((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray19 = hashSetTestDriver18.toArray();
        boolean boolean20 = hashSetTestDriver18.isEmpty();
        boolean boolean22 = hashSetTestDriver18.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean23 = hashSetTestDriver16.contains((java.lang.Object) hashSetTestDriver18);
        java.lang.Object[] objArray24 = hashSetTestDriver16.toArray();
        boolean boolean25 = hashSetTestDriver12.add((java.lang.Object) hashSetTestDriver16);
        boolean boolean26 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver16);
        java.lang.Object obj27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = hashSetTestDriver16.contains(obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test086");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        boolean boolean14 = hashSetTestDriver12.isEmpty();
        boolean boolean16 = hashSetTestDriver12.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean17 = hashSetTestDriver10.contains((java.lang.Object) hashSetTestDriver12);
        boolean boolean19 = hashSetTestDriver10.equals_CUT((java.lang.Object) 100);
        int int20 = hashSetTestDriver10.size();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean25 = hashSetTestDriver21.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray26 = hashSetTestDriver21.toArray();
        boolean boolean27 = hashSetTestDriver10.equals_CUT((java.lang.Object) hashSetTestDriver21);
        boolean boolean28 = hashSetTestDriver10.isEmpty();
        java.lang.Object obj29 = hashSetTestDriver0.getMatch((java.lang.Object) boolean28);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test087");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (short) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean6 = hashSetTestDriver4.isEmpty();
        boolean boolean8 = hashSetTestDriver4.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray9 = hashSetTestDriver4.toArray();
        hashSetTestDriver4.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean14 = hashSetTestDriver11.equals_CUT((java.lang.Object) 100.0f);
        java.lang.Object[] objArray15 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver11.contains((java.lang.Object) 0);
        boolean boolean18 = hashSetTestDriver4.contains((java.lang.Object) hashSetTestDriver11);
        java.lang.Object[] objArray19 = hashSetTestDriver11.toArray();
        experiment.util.Iterator iterator20 = hashSetTestDriver11.iterator();
        boolean boolean21 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver11);
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = hashSetTestDriver0.contains(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test088");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean11 = hashSetTestDriver9.isEmpty();
        boolean boolean13 = hashSetTestDriver9.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean14 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver9);
        boolean boolean16 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        boolean boolean18 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100);
        int int19 = hashSetTestDriver7.size();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray21 = hashSetTestDriver20.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray23 = hashSetTestDriver22.toArray();
        boolean boolean24 = hashSetTestDriver22.isEmpty();
        boolean boolean26 = hashSetTestDriver22.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean27 = hashSetTestDriver20.contains((java.lang.Object) hashSetTestDriver22);
        boolean boolean29 = hashSetTestDriver20.add((java.lang.Object) (-1.0f));
        boolean boolean30 = hashSetTestDriver7.add((java.lang.Object) (-1.0f));
        boolean boolean31 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray33 = hashSetTestDriver32.toArray();
        boolean boolean34 = hashSetTestDriver32.isEmpty();
        boolean boolean36 = hashSetTestDriver32.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray37 = hashSetTestDriver32.toArray();
        java.lang.Object[] objArray38 = hashSetTestDriver32.toArray();
        boolean boolean39 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver32);
        boolean boolean41 = hashSetTestDriver32.equals_CUT((java.lang.Object) (byte) 100);
        hashSetTestDriver32.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray45 = hashSetTestDriver44.toArray();
        boolean boolean47 = hashSetTestDriver44.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean48 = hashSetTestDriver44.isEmpty();
        boolean boolean49 = hashSetTestDriver43.equals_CUT((java.lang.Object) boolean48);
        experiment.util.Iterator iterator50 = hashSetTestDriver43.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray53 = hashSetTestDriver52.toArray();
        boolean boolean55 = hashSetTestDriver52.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean56 = hashSetTestDriver52.isEmpty();
        boolean boolean57 = hashSetTestDriver51.equals_CUT((java.lang.Object) boolean56);
        java.lang.Object obj59 = hashSetTestDriver51.getMatch((java.lang.Object) 100.0f);
        boolean boolean60 = hashSetTestDriver43.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean61 = hashSetTestDriver43.isEmpty();
        boolean boolean62 = hashSetTestDriver32.add((java.lang.Object) boolean61);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test089");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean12 = hashSetTestDriver10.isEmpty();
        boolean boolean13 = hashSetTestDriver10.isEmpty();
        hashSetTestDriver10.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        boolean boolean17 = hashSetTestDriver15.isEmpty();
        boolean boolean19 = hashSetTestDriver15.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray20 = hashSetTestDriver15.toArray();
        boolean boolean21 = hashSetTestDriver10.remove((java.lang.Object) objArray20);
        int int22 = hashSetTestDriver10.size();
        java.lang.Object obj23 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver10);
        java.lang.Object[] objArray24 = hashSetTestDriver10.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test090");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        boolean boolean16 = hashSetTestDriver14.isEmpty();
        boolean boolean17 = hashSetTestDriver14.isEmpty();
        hashSetTestDriver14.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean21 = hashSetTestDriver19.isEmpty();
        boolean boolean23 = hashSetTestDriver19.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray24 = hashSetTestDriver19.toArray();
        boolean boolean25 = hashSetTestDriver14.remove((java.lang.Object) objArray24);
        java.lang.Object[] objArray26 = hashSetTestDriver14.toArray();
        java.lang.Object[] objArray27 = hashSetTestDriver14.toArray();
        boolean boolean29 = hashSetTestDriver14.equals_CUT((java.lang.Object) (short) 0);
        boolean boolean30 = hashSetTestDriver0.add((java.lang.Object) boolean29);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test091");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        boolean boolean4 = hashSetTestDriver1.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean5);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) 10.0d);
        java.lang.Object[] objArray9 = hashSetTestDriver0.toArray();
        boolean boolean10 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test092");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean25 = hashSetTestDriver21.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean26 = hashSetTestDriver19.contains((java.lang.Object) hashSetTestDriver21);
        boolean boolean28 = hashSetTestDriver19.equals_CUT((java.lang.Object) 100);
        int int29 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray31 = hashSetTestDriver30.toArray();
        boolean boolean32 = hashSetTestDriver30.isEmpty();
        boolean boolean34 = hashSetTestDriver30.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray35 = hashSetTestDriver30.toArray();
        boolean boolean36 = hashSetTestDriver19.equals_CUT((java.lang.Object) hashSetTestDriver30);
        experiment.util.Iterator iterator37 = hashSetTestDriver30.iterator();
        boolean boolean38 = hashSetTestDriver11.remove((java.lang.Object) hashSetTestDriver30);
        hashSetTestDriver11.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test093");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 'a');
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test094");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test095");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean14 = hashSetTestDriver0.remove((java.lang.Object) 100.0f);
        int int15 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test096");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.add((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test097");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        hashSetTestDriver6.clear();
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        java.lang.Class<?> wildcardClass10 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test098");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass19 = hashSetTestDriver11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test099");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (short) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean8 = hashSetTestDriver6.isEmpty();
        boolean boolean10 = hashSetTestDriver6.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean11 = hashSetTestDriver4.contains((java.lang.Object) hashSetTestDriver6);
        boolean boolean13 = hashSetTestDriver4.equals_CUT((java.lang.Object) 100);
        boolean boolean15 = hashSetTestDriver4.equals_CUT((java.lang.Object) 100);
        int int16 = hashSetTestDriver4.size();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean21 = hashSetTestDriver19.isEmpty();
        boolean boolean23 = hashSetTestDriver19.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean24 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver19);
        boolean boolean26 = hashSetTestDriver17.add((java.lang.Object) (-1.0f));
        boolean boolean27 = hashSetTestDriver4.add((java.lang.Object) (-1.0f));
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        boolean boolean29 = hashSetTestDriver4.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test100");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) 10L);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.equals_CUT((java.lang.Object) 100.0f);
        java.lang.Object[] objArray10 = hashSetTestDriver6.toArray();
        boolean boolean12 = hashSetTestDriver6.contains((java.lang.Object) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        boolean boolean17 = hashSetTestDriver15.isEmpty();
        boolean boolean19 = hashSetTestDriver15.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean20 = hashSetTestDriver13.contains((java.lang.Object) hashSetTestDriver15);
        boolean boolean22 = hashSetTestDriver13.equals_CUT((java.lang.Object) 100);
        boolean boolean24 = hashSetTestDriver13.equals_CUT((java.lang.Object) 100);
        java.lang.Object obj25 = hashSetTestDriver6.getMatch((java.lang.Object) hashSetTestDriver13);
        java.lang.Object[] objArray26 = hashSetTestDriver13.toArray();
        boolean boolean27 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver13);
        hashSetTestDriver13.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test101");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean15 = hashSetTestDriver13.isEmpty();
        boolean boolean17 = hashSetTestDriver13.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver13.add((java.lang.Object) hashSetTestDriver18);
        boolean boolean20 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver13);
        int int21 = hashSetTestDriver13.size();
        int int22 = hashSetTestDriver13.size();
        int int23 = hashSetTestDriver13.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test102");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        int int12 = hashSetTestDriver0.size();
        boolean boolean14 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        boolean boolean15 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray16 = hashSetTestDriver0.toArray();
        boolean boolean18 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        boolean boolean19 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test103");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray4 = hashSetTestDriver3.toArray();
        boolean boolean5 = hashSetTestDriver3.isEmpty();
        boolean boolean6 = hashSetTestDriver3.isEmpty();
        hashSetTestDriver3.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        boolean boolean12 = hashSetTestDriver8.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray13 = hashSetTestDriver8.toArray();
        boolean boolean14 = hashSetTestDriver3.remove((java.lang.Object) objArray13);
        int int15 = hashSetTestDriver3.size();
        java.lang.Object[] objArray16 = hashSetTestDriver3.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) objArray16);
        experiment.util.Iterator iterator18 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean22 = hashSetTestDriver19.contains((java.lang.Object) (short) 100);
        boolean boolean23 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver19);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        boolean boolean26 = hashSetTestDriver24.isEmpty();
        boolean boolean27 = hashSetTestDriver24.isEmpty();
        hashSetTestDriver24.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean31 = hashSetTestDriver29.isEmpty();
        boolean boolean33 = hashSetTestDriver29.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray34 = hashSetTestDriver29.toArray();
        boolean boolean35 = hashSetTestDriver24.remove((java.lang.Object) objArray34);
        java.lang.Object[] objArray36 = hashSetTestDriver24.toArray();
        java.lang.Object[] objArray37 = hashSetTestDriver24.toArray();
        boolean boolean39 = hashSetTestDriver24.equals_CUT((java.lang.Object) (short) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray41 = hashSetTestDriver40.toArray();
        java.lang.Object[] objArray42 = hashSetTestDriver40.toArray();
        boolean boolean43 = hashSetTestDriver24.equals_CUT((java.lang.Object) objArray42);
        hashSetTestDriver24.clear();
        boolean boolean46 = hashSetTestDriver24.add((java.lang.Object) 1L);
        boolean boolean47 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test104");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        hashSetTestDriver2.clear();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver2);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        boolean boolean12 = hashSetTestDriver8.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean13 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver8);
        boolean boolean15 = hashSetTestDriver6.equals_CUT((java.lang.Object) 100);
        int int16 = hashSetTestDriver6.size();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean19 = hashSetTestDriver17.isEmpty();
        boolean boolean21 = hashSetTestDriver17.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray22 = hashSetTestDriver17.toArray();
        boolean boolean23 = hashSetTestDriver6.equals_CUT((java.lang.Object) hashSetTestDriver17);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray26 = hashSetTestDriver25.toArray();
        boolean boolean28 = hashSetTestDriver25.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean29 = hashSetTestDriver25.isEmpty();
        boolean boolean30 = hashSetTestDriver24.equals_CUT((java.lang.Object) boolean29);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        hashSetTestDriver31.clear();
        boolean boolean35 = hashSetTestDriver31.contains((java.lang.Object) (short) 0);
        boolean boolean36 = hashSetTestDriver31.isEmpty();
        hashSetTestDriver31.clear();
        boolean boolean38 = hashSetTestDriver24.equals_CUT((java.lang.Object) hashSetTestDriver31);
        boolean boolean39 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver24);
        java.lang.Object obj40 = hashSetTestDriver2.getMatch((java.lang.Object) boolean39);
        int int41 = hashSetTestDriver2.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test105");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) (byte) 100);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test106");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        int int12 = hashSetTestDriver0.size();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        boolean boolean15 = hashSetTestDriver0.equals_CUT((java.lang.Object) (short) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        boolean boolean18 = hashSetTestDriver16.isEmpty();
        boolean boolean19 = hashSetTestDriver16.isEmpty();
        hashSetTestDriver16.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean25 = hashSetTestDriver21.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray26 = hashSetTestDriver21.toArray();
        boolean boolean27 = hashSetTestDriver16.remove((java.lang.Object) objArray26);
        int int28 = hashSetTestDriver16.size();
        boolean boolean30 = hashSetTestDriver16.contains((java.lang.Object) 10.0d);
        boolean boolean31 = hashSetTestDriver16.isEmpty();
        boolean boolean32 = hashSetTestDriver0.remove((java.lang.Object) boolean31);
        int int33 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test107");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        boolean boolean18 = hashSetTestDriver16.isEmpty();
        boolean boolean20 = hashSetTestDriver16.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = hashSetTestDriver14.contains((java.lang.Object) hashSetTestDriver16);
        boolean boolean23 = hashSetTestDriver14.add((java.lang.Object) (-1.0f));
        boolean boolean24 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver14);
        boolean boolean25 = hashSetTestDriver14.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test108");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.add((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean12 = hashSetTestDriver10.isEmpty();
        boolean boolean13 = hashSetTestDriver10.isEmpty();
        hashSetTestDriver10.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        boolean boolean17 = hashSetTestDriver15.isEmpty();
        boolean boolean19 = hashSetTestDriver15.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray20 = hashSetTestDriver15.toArray();
        boolean boolean21 = hashSetTestDriver10.remove((java.lang.Object) objArray20);
        int int22 = hashSetTestDriver10.size();
        java.lang.Object obj23 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver10);
        java.lang.Object[] objArray24 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test109");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        java.lang.Object[] objArray18 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test110");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        java.lang.Class<?> wildcardClass18 = hashSetTestDriver11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test111");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test112");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        experiment.util.Iterator iterator10 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test113");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        hashSetTestDriver8.clear();
        boolean boolean12 = hashSetTestDriver8.remove((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = hashSetTestDriver8.toArray();
        boolean boolean15 = hashSetTestDriver8.remove((java.lang.Object) (byte) 100);
        boolean boolean16 = hashSetTestDriver6.contains((java.lang.Object) boolean15);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean21 = hashSetTestDriver19.isEmpty();
        boolean boolean23 = hashSetTestDriver19.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean24 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver19);
        boolean boolean26 = hashSetTestDriver17.equals_CUT((java.lang.Object) 100);
        int int27 = hashSetTestDriver17.size();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray29 = hashSetTestDriver28.toArray();
        boolean boolean30 = hashSetTestDriver28.isEmpty();
        boolean boolean32 = hashSetTestDriver28.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray33 = hashSetTestDriver28.toArray();
        boolean boolean34 = hashSetTestDriver17.equals_CUT((java.lang.Object) hashSetTestDriver28);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray37 = hashSetTestDriver36.toArray();
        boolean boolean39 = hashSetTestDriver36.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean40 = hashSetTestDriver36.isEmpty();
        boolean boolean41 = hashSetTestDriver35.equals_CUT((java.lang.Object) boolean40);
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray43 = hashSetTestDriver42.toArray();
        hashSetTestDriver42.clear();
        boolean boolean46 = hashSetTestDriver42.contains((java.lang.Object) (short) 0);
        boolean boolean47 = hashSetTestDriver42.isEmpty();
        hashSetTestDriver42.clear();
        boolean boolean49 = hashSetTestDriver35.equals_CUT((java.lang.Object) hashSetTestDriver42);
        boolean boolean50 = hashSetTestDriver17.add((java.lang.Object) hashSetTestDriver35);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray52 = hashSetTestDriver51.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver53 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray54 = hashSetTestDriver53.toArray();
        boolean boolean55 = hashSetTestDriver53.isEmpty();
        boolean boolean57 = hashSetTestDriver53.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean58 = hashSetTestDriver51.contains((java.lang.Object) hashSetTestDriver53);
        boolean boolean60 = hashSetTestDriver51.equals_CUT((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver61 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray62 = hashSetTestDriver61.toArray();
        boolean boolean64 = hashSetTestDriver61.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean65 = hashSetTestDriver51.remove((java.lang.Object) 100.0f);
        boolean boolean66 = hashSetTestDriver17.add((java.lang.Object) 100.0f);
        boolean boolean67 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver17);
        java.lang.Object[] objArray68 = hashSetTestDriver6.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test114");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) objArray10);
        int int12 = hashSetTestDriver0.size();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        int int14 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test115");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean18 = hashSetTestDriver11.isEmpty();
        java.lang.Object[] objArray19 = hashSetTestDriver11.toArray();
        int int20 = hashSetTestDriver11.size();
        boolean boolean21 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray23 = hashSetTestDriver22.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        boolean boolean26 = hashSetTestDriver24.isEmpty();
        boolean boolean28 = hashSetTestDriver24.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean29 = hashSetTestDriver22.contains((java.lang.Object) hashSetTestDriver24);
        boolean boolean31 = hashSetTestDriver22.add((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = hashSetTestDriver11.getMatch((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test116");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean8 = hashSetTestDriver6.isEmpty();
        boolean boolean10 = hashSetTestDriver6.equals_CUT((java.lang.Object) (byte) -1);
        hashSetTestDriver6.clear();
        boolean boolean12 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver6);
        java.lang.Class<?> wildcardClass13 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test117");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        hashSetTestDriver6.clear();
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        hashSetTestDriver10.clear();
        boolean boolean13 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver10);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        boolean boolean18 = hashSetTestDriver16.isEmpty();
        boolean boolean20 = hashSetTestDriver16.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean21 = hashSetTestDriver14.contains((java.lang.Object) hashSetTestDriver16);
        boolean boolean23 = hashSetTestDriver14.equals_CUT((java.lang.Object) 100);
        int int24 = hashSetTestDriver14.size();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray26 = hashSetTestDriver25.toArray();
        boolean boolean27 = hashSetTestDriver25.isEmpty();
        boolean boolean29 = hashSetTestDriver25.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray30 = hashSetTestDriver25.toArray();
        boolean boolean31 = hashSetTestDriver14.equals_CUT((java.lang.Object) hashSetTestDriver25);
        boolean boolean32 = hashSetTestDriver25.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray34 = hashSetTestDriver33.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        boolean boolean37 = hashSetTestDriver35.isEmpty();
        boolean boolean39 = hashSetTestDriver35.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean40 = hashSetTestDriver33.contains((java.lang.Object) hashSetTestDriver35);
        boolean boolean42 = hashSetTestDriver33.equals_CUT((java.lang.Object) 100);
        int int43 = hashSetTestDriver33.size();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray45 = hashSetTestDriver44.toArray();
        boolean boolean46 = hashSetTestDriver44.isEmpty();
        boolean boolean48 = hashSetTestDriver44.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray49 = hashSetTestDriver44.toArray();
        boolean boolean50 = hashSetTestDriver33.equals_CUT((java.lang.Object) hashSetTestDriver44);
        experiment.util.Iterator iterator51 = hashSetTestDriver44.iterator();
        boolean boolean52 = hashSetTestDriver25.remove((java.lang.Object) hashSetTestDriver44);
        hashSetTestDriver44.clear();
        boolean boolean54 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver44);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test118");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int5 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        hashSetTestDriver6.clear();
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = hashSetTestDriver0.add(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test119");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.equals_CUT((java.lang.Object) (byte) -1);
        int int10 = hashSetTestDriver5.size();
        java.lang.Object[] objArray11 = hashSetTestDriver5.toArray();
        boolean boolean12 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean15 = hashSetTestDriver13.isEmpty();
        boolean boolean16 = hashSetTestDriver13.isEmpty();
        hashSetTestDriver13.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray19 = hashSetTestDriver18.toArray();
        boolean boolean20 = hashSetTestDriver18.isEmpty();
        boolean boolean22 = hashSetTestDriver18.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray23 = hashSetTestDriver18.toArray();
        boolean boolean24 = hashSetTestDriver13.remove((java.lang.Object) objArray23);
        int int25 = hashSetTestDriver13.size();
        boolean boolean27 = hashSetTestDriver13.contains((java.lang.Object) 10.0d);
        boolean boolean28 = hashSetTestDriver13.isEmpty();
        java.lang.Object[] objArray29 = hashSetTestDriver13.toArray();
        boolean boolean30 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver13);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test120");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        boolean boolean15 = hashSetTestDriver12.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean16 = hashSetTestDriver12.isEmpty();
        boolean boolean17 = hashSetTestDriver11.equals_CUT((java.lang.Object) boolean16);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray19 = hashSetTestDriver18.toArray();
        hashSetTestDriver18.clear();
        boolean boolean22 = hashSetTestDriver18.contains((java.lang.Object) (short) 0);
        boolean boolean23 = hashSetTestDriver18.isEmpty();
        hashSetTestDriver18.clear();
        boolean boolean25 = hashSetTestDriver11.equals_CUT((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray28 = hashSetTestDriver27.toArray();
        boolean boolean30 = hashSetTestDriver27.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean31 = hashSetTestDriver27.isEmpty();
        boolean boolean32 = hashSetTestDriver26.equals_CUT((java.lang.Object) boolean31);
        experiment.util.Iterator iterator33 = hashSetTestDriver26.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray35 = hashSetTestDriver34.toArray();
        boolean boolean36 = hashSetTestDriver34.isEmpty();
        experiment.util.Iterator iterator37 = hashSetTestDriver34.iterator();
        boolean boolean38 = hashSetTestDriver34.isEmpty();
        java.lang.Object[] objArray39 = hashSetTestDriver34.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver34.contains((java.lang.Object) hashSetTestDriver40);
        boolean boolean42 = hashSetTestDriver26.equals_CUT((java.lang.Object) hashSetTestDriver40);
        int int43 = hashSetTestDriver40.size();
        boolean boolean44 = hashSetTestDriver11.remove((java.lang.Object) int43);
        java.lang.Object[] objArray45 = hashSetTestDriver11.toArray();
        java.lang.Object[] objArray46 = hashSetTestDriver11.toArray();
        boolean boolean47 = hashSetTestDriver0.remove((java.lang.Object) objArray46);
        java.lang.Class<?> wildcardClass48 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test121");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean7 = hashSetTestDriver5.isEmpty();
        boolean boolean9 = hashSetTestDriver5.equals_CUT((java.lang.Object) (byte) -1);
        int int10 = hashSetTestDriver5.size();
        java.lang.Object[] objArray11 = hashSetTestDriver5.toArray();
        boolean boolean12 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean15 = hashSetTestDriver13.isEmpty();
        boolean boolean17 = hashSetTestDriver13.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray18 = hashSetTestDriver13.toArray();
        hashSetTestDriver13.clear();
        java.lang.Object[] objArray20 = hashSetTestDriver13.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean23 = hashSetTestDriver21.isEmpty();
        boolean boolean24 = hashSetTestDriver21.isEmpty();
        hashSetTestDriver21.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray27 = hashSetTestDriver26.toArray();
        boolean boolean28 = hashSetTestDriver26.isEmpty();
        boolean boolean30 = hashSetTestDriver26.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray31 = hashSetTestDriver26.toArray();
        boolean boolean32 = hashSetTestDriver21.remove((java.lang.Object) objArray31);
        int int33 = hashSetTestDriver21.size();
        java.lang.Object[] objArray34 = hashSetTestDriver21.toArray();
        boolean boolean35 = hashSetTestDriver13.add((java.lang.Object) hashSetTestDriver21);
        java.lang.Object obj36 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver13);
        int int37 = hashSetTestDriver13.size();
        int int38 = hashSetTestDriver13.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test122");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        int int7 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        boolean boolean11 = hashSetTestDriver8.isEmpty();
        hashSetTestDriver8.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean15 = hashSetTestDriver13.isEmpty();
        boolean boolean17 = hashSetTestDriver13.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray18 = hashSetTestDriver13.toArray();
        boolean boolean19 = hashSetTestDriver8.remove((java.lang.Object) objArray18);
        java.lang.Object[] objArray20 = hashSetTestDriver8.toArray();
        java.lang.Object[] objArray21 = hashSetTestDriver8.toArray();
        boolean boolean23 = hashSetTestDriver8.equals_CUT((java.lang.Object) (short) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        java.lang.Object[] objArray26 = hashSetTestDriver24.toArray();
        boolean boolean27 = hashSetTestDriver8.equals_CUT((java.lang.Object) objArray26);
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver8);
        boolean boolean29 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray30 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test123");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver2.isEmpty();
        boolean boolean6 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver2);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean13 = hashSetTestDriver11.isEmpty();
        boolean boolean15 = hashSetTestDriver11.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean22 = hashSetTestDriver19.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean23 = hashSetTestDriver19.isEmpty();
        boolean boolean24 = hashSetTestDriver18.equals_CUT((java.lang.Object) boolean23);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray26 = hashSetTestDriver25.toArray();
        hashSetTestDriver25.clear();
        boolean boolean29 = hashSetTestDriver25.contains((java.lang.Object) (short) 0);
        boolean boolean30 = hashSetTestDriver25.isEmpty();
        hashSetTestDriver25.clear();
        boolean boolean32 = hashSetTestDriver18.equals_CUT((java.lang.Object) hashSetTestDriver25);
        boolean boolean33 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver18);
        boolean boolean34 = hashSetTestDriver0.isEmpty();
        boolean boolean35 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test124");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test125");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean8 = hashSetTestDriver6.isEmpty();
        boolean boolean10 = hashSetTestDriver6.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray11 = hashSetTestDriver6.toArray();
        hashSetTestDriver6.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        boolean boolean17 = hashSetTestDriver15.isEmpty();
        boolean boolean19 = hashSetTestDriver15.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean20 = hashSetTestDriver13.contains((java.lang.Object) hashSetTestDriver15);
        boolean boolean22 = hashSetTestDriver13.equals_CUT((java.lang.Object) 100);
        boolean boolean24 = hashSetTestDriver13.equals_CUT((java.lang.Object) 100);
        int int25 = hashSetTestDriver13.size();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray27 = hashSetTestDriver26.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray29 = hashSetTestDriver28.toArray();
        boolean boolean30 = hashSetTestDriver28.isEmpty();
        boolean boolean32 = hashSetTestDriver28.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean33 = hashSetTestDriver26.contains((java.lang.Object) hashSetTestDriver28);
        boolean boolean35 = hashSetTestDriver26.add((java.lang.Object) (-1.0f));
        boolean boolean36 = hashSetTestDriver13.add((java.lang.Object) (-1.0f));
        boolean boolean37 = hashSetTestDriver6.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray39 = hashSetTestDriver38.toArray();
        boolean boolean40 = hashSetTestDriver38.isEmpty();
        boolean boolean42 = hashSetTestDriver38.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray43 = hashSetTestDriver38.toArray();
        hashSetTestDriver38.clear();
        java.lang.Object[] objArray45 = hashSetTestDriver38.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray47 = hashSetTestDriver46.toArray();
        boolean boolean48 = hashSetTestDriver46.isEmpty();
        boolean boolean49 = hashSetTestDriver46.isEmpty();
        hashSetTestDriver46.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray52 = hashSetTestDriver51.toArray();
        boolean boolean53 = hashSetTestDriver51.isEmpty();
        boolean boolean55 = hashSetTestDriver51.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray56 = hashSetTestDriver51.toArray();
        boolean boolean57 = hashSetTestDriver46.remove((java.lang.Object) objArray56);
        int int58 = hashSetTestDriver46.size();
        java.lang.Object[] objArray59 = hashSetTestDriver46.toArray();
        boolean boolean60 = hashSetTestDriver38.add((java.lang.Object) hashSetTestDriver46);
        hashSetTestDriver46.clear();
        boolean boolean62 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver46);
        boolean boolean63 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver6);
        boolean boolean64 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test126");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean10 = hashSetTestDriver8.isEmpty();
        boolean boolean11 = hashSetTestDriver8.isEmpty();
        hashSetTestDriver8.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean15 = hashSetTestDriver13.isEmpty();
        boolean boolean17 = hashSetTestDriver13.remove((java.lang.Object) 'a');
        java.lang.Object[] objArray18 = hashSetTestDriver13.toArray();
        boolean boolean19 = hashSetTestDriver8.remove((java.lang.Object) objArray18);
        int int20 = hashSetTestDriver8.size();
        java.lang.Object[] objArray21 = hashSetTestDriver8.toArray();
        boolean boolean22 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver8);
        experiment.util.Iterator iterator23 = hashSetTestDriver8.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test127");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean8 = hashSetTestDriver6.isEmpty();
        boolean boolean10 = hashSetTestDriver6.remove((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver11);
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver6);
        hashSetTestDriver6.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1082618794_1024_0.test128");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean2 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

}
