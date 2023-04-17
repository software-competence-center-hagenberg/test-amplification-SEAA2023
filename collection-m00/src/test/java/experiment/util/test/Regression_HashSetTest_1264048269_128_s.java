package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1264048269_128_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass1 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        boolean boolean20 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass21 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = hashSetTestDriver0.equals_CUT(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass5 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = hashSetTestDriver3.add((java.lang.Object) 10.0d);
        java.lang.Object obj9 = hashSetTestDriver3.getMatch((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = hashSetTestDriver0.getMatch(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        java.lang.Class<?> wildcardClass19 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator12 = hashSetTestDriver11.iterator();
        java.lang.Object obj14 = hashSetTestDriver11.getMatch((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = hashSetTestDriver0.add(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = hashSetTestDriver21.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator26 = hashSetTestDriver21.iterator();
        experiment.util.Iterator iterator27 = hashSetTestDriver21.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = hashSetTestDriver28.add((java.lang.Object) 10.0d);
        boolean boolean33 = hashSetTestDriver21.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean35 = hashSetTestDriver21.equals_CUT((java.lang.Object) false);
        java.lang.Object obj36 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver21);
        java.lang.Object obj37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = hashSetTestDriver21.getMatch(obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        boolean boolean10 = hashSetTestDriver6.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator14 = hashSetTestDriver11.iterator();
        boolean boolean15 = hashSetTestDriver6.equals_CUT((java.lang.Object) iterator14);
        java.lang.Object obj17 = hashSetTestDriver6.getMatch((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = hashSetTestDriver0.equals_CUT(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator8);
        java.lang.Object obj11 = hashSetTestDriver0.getMatch((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass12 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = hashSetTestDriver0.equals_CUT(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashSetTestDriver5.getMatch((java.lang.Object) 10);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver5);
        int int13 = hashSetTestDriver0.size();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = hashSetTestDriver0.add(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass11 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = hashSetTestDriver12.toArray();
        java.lang.Object obj16 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.remove((java.lang.Object) (byte) 10);
        boolean boolean21 = hashSetTestDriver17.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj26 = hashSetTestDriver22.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj28 = hashSetTestDriver22.getMatch((java.lang.Object) 10);
        boolean boolean29 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver22);
        int int30 = hashSetTestDriver17.size();
        java.lang.Object[] objArray31 = hashSetTestDriver17.toArray();
        java.lang.Object[] objArray32 = hashSetTestDriver17.toArray();
        boolean boolean33 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver17);
        java.lang.Object obj34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = hashSetTestDriver17.getMatch(obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test018");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.equals_CUT((java.lang.Object) 0);
        int int11 = hashSetTestDriver8.size();
        int int12 = hashSetTestDriver8.size();
        experiment.util.Iterator iterator13 = hashSetTestDriver8.iterator();
        boolean boolean14 = hashSetTestDriver0.add((java.lang.Object) iterator13);
        java.lang.Class<?> wildcardClass15 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray11 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = hashSetTestDriver12.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator17 = hashSetTestDriver12.iterator();
        boolean boolean18 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver12);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test020");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        int int9 = hashSetTestDriver0.size();
        java.lang.Object[] objArray10 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean15 = hashSetTestDriver11.add((java.lang.Object) 10.0d);
        java.lang.Object obj17 = hashSetTestDriver11.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver11.remove((java.lang.Object) "");
        boolean boolean21 = hashSetTestDriver11.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray22 = hashSetTestDriver11.toArray();
        boolean boolean23 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver11);
        experiment.util.Iterator iterator24 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test022");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = hashSetTestDriver12.toArray();
        java.lang.Object obj16 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver12);
        boolean boolean17 = hashSetTestDriver12.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test023");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        boolean boolean20 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        int int25 = hashSetTestDriver21.size();
        boolean boolean26 = hashSetTestDriver0.equals_CUT((java.lang.Object) int25);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = hashSetTestDriver27.add((java.lang.Object) 10.0d);
        java.lang.Object obj33 = hashSetTestDriver27.getMatch((java.lang.Object) 0.0f);
        boolean boolean35 = hashSetTestDriver27.remove((java.lang.Object) "");
        int int36 = hashSetTestDriver27.size();
        java.lang.Object[] objArray37 = hashSetTestDriver27.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = hashSetTestDriver38.add((java.lang.Object) 10.0d);
        java.lang.Object obj44 = hashSetTestDriver38.getMatch((java.lang.Object) 0.0f);
        boolean boolean46 = hashSetTestDriver38.remove((java.lang.Object) "");
        boolean boolean48 = hashSetTestDriver38.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray49 = hashSetTestDriver38.toArray();
        boolean boolean50 = hashSetTestDriver27.contains((java.lang.Object) hashSetTestDriver38);
        java.lang.Object obj51 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver38);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        boolean boolean54 = hashSetTestDriver52.remove((java.lang.Object) (byte) 10);
        boolean boolean56 = hashSetTestDriver52.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        boolean boolean59 = hashSetTestDriver57.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj61 = hashSetTestDriver57.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj63 = hashSetTestDriver57.getMatch((java.lang.Object) 10);
        boolean boolean64 = hashSetTestDriver52.contains((java.lang.Object) hashSetTestDriver57);
        experiment.util.Iterator iterator65 = hashSetTestDriver57.iterator();
        boolean boolean66 = hashSetTestDriver38.equals_CUT((java.lang.Object) iterator65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test024");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) 10.0d);
        boolean boolean12 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) false);
        java.lang.Class<?> wildcardClass15 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.equals_CUT((java.lang.Object) 0);
        int int11 = hashSetTestDriver8.size();
        int int12 = hashSetTestDriver8.size();
        experiment.util.Iterator iterator13 = hashSetTestDriver8.iterator();
        boolean boolean14 = hashSetTestDriver0.add((java.lang.Object) iterator13);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashSetTestDriver5.getMatch((java.lang.Object) 10);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver5);
        experiment.util.Iterator iterator13 = hashSetTestDriver5.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = hashSetTestDriver14.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray19 = hashSetTestDriver14.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver14.remove((java.lang.Object) hashSetTestDriver20);
        java.lang.Object[] objArray22 = hashSetTestDriver14.toArray();
        boolean boolean23 = hashSetTestDriver5.contains((java.lang.Object) hashSetTestDriver14);
        java.lang.Class<?> wildcardClass24 = hashSetTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        int int9 = hashSetTestDriver0.size();
        java.lang.Object[] objArray10 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray11 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        boolean boolean11 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = hashSetTestDriver12.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator17 = hashSetTestDriver12.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator21 = hashSetTestDriver18.iterator();
        java.lang.Object obj22 = hashSetTestDriver12.getMatch((java.lang.Object) iterator21);
        java.lang.Object obj24 = hashSetTestDriver12.getMatch((java.lang.Object) 0);
        hashSetTestDriver12.clear();
        boolean boolean26 = hashSetTestDriver12.isEmpty();
        boolean boolean27 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj32 = hashSetTestDriver28.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator33 = hashSetTestDriver28.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator37 = hashSetTestDriver34.iterator();
        java.lang.Object obj38 = hashSetTestDriver28.getMatch((java.lang.Object) iterator37);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator42 = hashSetTestDriver39.iterator();
        boolean boolean43 = hashSetTestDriver39.isEmpty();
        boolean boolean44 = hashSetTestDriver28.remove((java.lang.Object) boolean43);
        java.lang.Object[] objArray45 = hashSetTestDriver28.toArray();
        boolean boolean46 = hashSetTestDriver12.contains((java.lang.Object) objArray45);
        int int47 = hashSetTestDriver12.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) 10.0d);
        boolean boolean12 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) false);
        java.lang.Object[] objArray15 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test030");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        boolean boolean22 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = hashSetTestDriver23.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator28 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver29.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator32 = hashSetTestDriver29.iterator();
        java.lang.Object obj33 = hashSetTestDriver23.getMatch((java.lang.Object) iterator32);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator37 = hashSetTestDriver34.iterator();
        boolean boolean38 = hashSetTestDriver34.isEmpty();
        boolean boolean39 = hashSetTestDriver23.remove((java.lang.Object) boolean38);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator41 = hashSetTestDriver40.iterator();
        boolean boolean42 = hashSetTestDriver23.equals_CUT((java.lang.Object) iterator41);
        experiment.util.Iterator iterator43 = hashSetTestDriver23.iterator();
        boolean boolean44 = hashSetTestDriver0.contains((java.lang.Object) iterator43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = hashSetTestDriver6.getMatch(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        java.lang.Object obj12 = hashSetTestDriver0.getMatch((java.lang.Object) 0);
        hashSetTestDriver0.clear();
        boolean boolean14 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        boolean boolean19 = hashSetTestDriver15.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = hashSetTestDriver20.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = hashSetTestDriver20.getMatch((java.lang.Object) 10);
        boolean boolean27 = hashSetTestDriver15.contains((java.lang.Object) hashSetTestDriver20);
        int int28 = hashSetTestDriver15.size();
        java.lang.Object[] objArray29 = hashSetTestDriver15.toArray();
        experiment.util.Iterator iterator30 = hashSetTestDriver15.iterator();
        boolean boolean31 = hashSetTestDriver0.remove((java.lang.Object) iterator30);
        java.lang.Object obj32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = hashSetTestDriver0.equals_CUT(obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10.0]");
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test033");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        hashSetTestDriver0.clear();
        int int8 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test034");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean10 = hashSetTestDriver0.add((java.lang.Object) 100L);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = hashSetTestDriver11.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator16 = hashSetTestDriver11.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        java.lang.Object obj21 = hashSetTestDriver11.getMatch((java.lang.Object) iterator20);
        hashSetTestDriver11.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray26 = hashSetTestDriver23.toArray();
        java.lang.Object obj27 = hashSetTestDriver11.getMatch((java.lang.Object) hashSetTestDriver23);
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver23);
        java.lang.Class<?> wildcardClass29 = hashSetTestDriver23.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test035");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray11 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) 10.0d);
        java.lang.Object obj19 = hashSetTestDriver13.getMatch((java.lang.Object) (short) -1);
        boolean boolean21 = hashSetTestDriver13.contains((java.lang.Object) 10.0f);
        boolean boolean22 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test036");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = hashSetTestDriver19.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator24 = hashSetTestDriver19.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator28 = hashSetTestDriver25.iterator();
        java.lang.Object obj29 = hashSetTestDriver19.getMatch((java.lang.Object) iterator28);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator33 = hashSetTestDriver30.iterator();
        boolean boolean34 = hashSetTestDriver30.isEmpty();
        boolean boolean35 = hashSetTestDriver19.remove((java.lang.Object) boolean34);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator37 = hashSetTestDriver36.iterator();
        boolean boolean38 = hashSetTestDriver19.equals_CUT((java.lang.Object) iterator37);
        boolean boolean39 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver19);
        int int40 = hashSetTestDriver6.size();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.remove((java.lang.Object) (byte) 10);
        boolean boolean45 = hashSetTestDriver41.add((java.lang.Object) 10.0d);
        java.lang.Object obj47 = hashSetTestDriver41.getMatch((java.lang.Object) 0.0f);
        boolean boolean49 = hashSetTestDriver41.remove((java.lang.Object) "");
        boolean boolean50 = hashSetTestDriver6.equals_CUT((java.lang.Object) boolean49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test037");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = obj10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test038");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean10 = hashSetTestDriver0.add((java.lang.Object) 100L);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = hashSetTestDriver11.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator16 = hashSetTestDriver11.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        java.lang.Object obj21 = hashSetTestDriver11.getMatch((java.lang.Object) iterator20);
        hashSetTestDriver11.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray26 = hashSetTestDriver23.toArray();
        java.lang.Object obj27 = hashSetTestDriver11.getMatch((java.lang.Object) hashSetTestDriver23);
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver23);
        boolean boolean29 = hashSetTestDriver23.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test039");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = hashSetTestDriver12.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator17 = hashSetTestDriver12.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator21 = hashSetTestDriver18.iterator();
        java.lang.Object obj22 = hashSetTestDriver12.getMatch((java.lang.Object) iterator21);
        hashSetTestDriver12.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) (byte) 10);
        boolean boolean28 = hashSetTestDriver24.add((java.lang.Object) 10.0d);
        boolean boolean29 = hashSetTestDriver12.contains((java.lang.Object) hashSetTestDriver24);
        boolean boolean30 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver24);
        int int31 = hashSetTestDriver0.size();
        java.lang.Object[] objArray32 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test040");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean10 = hashSetTestDriver0.add((java.lang.Object) 100L);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = hashSetTestDriver11.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator16 = hashSetTestDriver11.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        java.lang.Object obj21 = hashSetTestDriver11.getMatch((java.lang.Object) iterator20);
        hashSetTestDriver11.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray26 = hashSetTestDriver23.toArray();
        java.lang.Object obj27 = hashSetTestDriver11.getMatch((java.lang.Object) hashSetTestDriver23);
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver23);
        boolean boolean29 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = hashSetTestDriver30.add((java.lang.Object) 10.0d);
        java.lang.Object obj36 = hashSetTestDriver30.getMatch((java.lang.Object) (short) -1);
        boolean boolean38 = hashSetTestDriver30.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator39 = hashSetTestDriver30.iterator();
        boolean boolean40 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test041");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        hashSetTestDriver0.clear();
        int int8 = hashSetTestDriver0.size();
        int int9 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashSetTestDriver10.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = hashSetTestDriver15.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = hashSetTestDriver15.getMatch((java.lang.Object) 10);
        boolean boolean22 = hashSetTestDriver10.contains((java.lang.Object) hashSetTestDriver15);
        int int23 = hashSetTestDriver10.size();
        java.lang.Object[] objArray24 = hashSetTestDriver10.toArray();
        java.lang.Object[] objArray25 = hashSetTestDriver10.toArray();
        boolean boolean26 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test042");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver6);
        experiment.util.Iterator iterator8 = hashSetTestDriver6.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test043");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        int int9 = hashSetTestDriver0.size();
        java.lang.Object[] objArray10 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean15 = hashSetTestDriver11.add((java.lang.Object) 10.0d);
        java.lang.Object obj17 = hashSetTestDriver11.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver11.remove((java.lang.Object) "");
        boolean boolean21 = hashSetTestDriver11.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray22 = hashSetTestDriver11.toArray();
        boolean boolean23 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = hashSetTestDriver24.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator29 = hashSetTestDriver24.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator33 = hashSetTestDriver30.iterator();
        java.lang.Object obj34 = hashSetTestDriver24.getMatch((java.lang.Object) iterator33);
        java.lang.Object obj36 = hashSetTestDriver24.getMatch((java.lang.Object) 0);
        hashSetTestDriver24.clear();
        boolean boolean38 = hashSetTestDriver24.isEmpty();
        boolean boolean39 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver24);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver40.remove((java.lang.Object) (byte) 10);
        boolean boolean44 = hashSetTestDriver40.add((java.lang.Object) 10.0d);
        java.lang.Object obj46 = hashSetTestDriver40.getMatch((java.lang.Object) 0.0f);
        boolean boolean48 = hashSetTestDriver40.remove((java.lang.Object) "");
        int int49 = hashSetTestDriver40.size();
        java.lang.Object[] objArray50 = hashSetTestDriver40.toArray();
        boolean boolean51 = hashSetTestDriver0.add((java.lang.Object) objArray50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test044");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        int int5 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test045");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray11 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = hashSetTestDriver13.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator18 = hashSetTestDriver13.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = hashSetTestDriver19.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator24 = hashSetTestDriver19.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator28 = hashSetTestDriver25.iterator();
        java.lang.Object obj29 = hashSetTestDriver19.getMatch((java.lang.Object) iterator28);
        hashSetTestDriver19.clear();
        boolean boolean31 = hashSetTestDriver13.contains((java.lang.Object) hashSetTestDriver19);
        boolean boolean32 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver19);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        boolean boolean35 = hashSetTestDriver33.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = hashSetTestDriver33.getMatch((java.lang.Object) (byte) 1);
        boolean boolean39 = hashSetTestDriver33.equals_CUT((java.lang.Object) 100.0f);
        hashSetTestDriver33.clear();
        int int41 = hashSetTestDriver33.size();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.remove((java.lang.Object) (byte) 10);
        boolean boolean46 = hashSetTestDriver42.add((java.lang.Object) 10.0d);
        java.lang.Object obj48 = hashSetTestDriver42.getMatch((java.lang.Object) (short) -1);
        boolean boolean50 = hashSetTestDriver42.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator51 = hashSetTestDriver42.iterator();
        hashSetTestDriver42.clear();
        boolean boolean53 = hashSetTestDriver42.isEmpty();
        boolean boolean54 = hashSetTestDriver33.remove((java.lang.Object) hashSetTestDriver42);
        java.lang.Object obj55 = hashSetTestDriver0.getMatch((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test046");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        hashSetTestDriver9.clear();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver9);
        boolean boolean14 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test047");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        int int19 = hashSetTestDriver0.size();
        boolean boolean20 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test048");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        hashSetTestDriver6.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = hashSetTestDriver20.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray25 = hashSetTestDriver20.toArray();
        boolean boolean26 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver20);
        hashSetTestDriver6.clear();
        int int28 = hashSetTestDriver6.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test049");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        boolean boolean22 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean23 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray24 = hashSetTestDriver0.toArray();
        boolean boolean25 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test050");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean10 = hashSetTestDriver6.add((java.lang.Object) 10.0d);
        java.lang.Object obj12 = hashSetTestDriver6.getMatch((java.lang.Object) (short) -1);
        boolean boolean14 = hashSetTestDriver6.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator15 = hashSetTestDriver6.iterator();
        hashSetTestDriver6.clear();
        boolean boolean17 = hashSetTestDriver6.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = hashSetTestDriver18.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator23 = hashSetTestDriver18.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator27 = hashSetTestDriver24.iterator();
        java.lang.Object obj28 = hashSetTestDriver18.getMatch((java.lang.Object) iterator27);
        java.lang.Object obj30 = hashSetTestDriver18.getMatch((java.lang.Object) 0);
        hashSetTestDriver18.clear();
        boolean boolean32 = hashSetTestDriver18.isEmpty();
        boolean boolean33 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj38 = hashSetTestDriver34.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator39 = hashSetTestDriver34.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver40.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator43 = hashSetTestDriver40.iterator();
        java.lang.Object obj44 = hashSetTestDriver34.getMatch((java.lang.Object) iterator43);
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver45.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator48 = hashSetTestDriver45.iterator();
        boolean boolean49 = hashSetTestDriver45.isEmpty();
        boolean boolean50 = hashSetTestDriver34.remove((java.lang.Object) boolean49);
        java.lang.Object[] objArray51 = hashSetTestDriver34.toArray();
        boolean boolean52 = hashSetTestDriver18.contains((java.lang.Object) objArray51);
        java.lang.Object obj53 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver18);
        boolean boolean54 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test051");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator8);
        java.lang.Object obj11 = hashSetTestDriver0.getMatch((java.lang.Object) 0L);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) 10.0d);
        java.lang.Object obj19 = hashSetTestDriver13.getMatch((java.lang.Object) (short) -1);
        boolean boolean21 = hashSetTestDriver13.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator22 = hashSetTestDriver13.iterator();
        hashSetTestDriver13.clear();
        java.lang.Object obj24 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = hashSetTestDriver25.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator30 = hashSetTestDriver25.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean33 = hashSetTestDriver31.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator34 = hashSetTestDriver31.iterator();
        java.lang.Object obj35 = hashSetTestDriver25.getMatch((java.lang.Object) iterator34);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver36.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator39 = hashSetTestDriver36.iterator();
        boolean boolean40 = hashSetTestDriver36.isEmpty();
        boolean boolean41 = hashSetTestDriver25.remove((java.lang.Object) boolean40);
        java.lang.Object[] objArray42 = hashSetTestDriver25.toArray();
        java.lang.Object obj43 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver25);
        java.lang.Class<?> wildcardClass44 = hashSetTestDriver25.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test052");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver2.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = hashSetTestDriver2.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator7 = hashSetTestDriver2.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator11 = hashSetTestDriver8.iterator();
        java.lang.Object obj12 = hashSetTestDriver2.getMatch((java.lang.Object) iterator11);
        hashSetTestDriver2.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.remove((java.lang.Object) (byte) 10);
        boolean boolean18 = hashSetTestDriver14.add((java.lang.Object) 10.0d);
        java.lang.Object obj20 = hashSetTestDriver14.getMatch((java.lang.Object) 0.0f);
        boolean boolean21 = hashSetTestDriver2.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver2.clear();
        boolean boolean24 = hashSetTestDriver2.contains((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass25 = hashSetTestDriver2.getClass();
        boolean boolean26 = hashSetTestDriver0.remove((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test053");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = hashSetTestDriver12.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator17 = hashSetTestDriver12.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator21 = hashSetTestDriver18.iterator();
        java.lang.Object obj22 = hashSetTestDriver12.getMatch((java.lang.Object) iterator21);
        hashSetTestDriver12.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) (byte) 10);
        boolean boolean28 = hashSetTestDriver24.add((java.lang.Object) 10.0d);
        boolean boolean29 = hashSetTestDriver12.contains((java.lang.Object) hashSetTestDriver24);
        boolean boolean30 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver24);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test054");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        boolean boolean22 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean23 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray24 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator25 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass26 = iterator25.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test055");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = hashSetTestDriver21.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator26 = hashSetTestDriver21.iterator();
        experiment.util.Iterator iterator27 = hashSetTestDriver21.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = hashSetTestDriver28.add((java.lang.Object) 10.0d);
        boolean boolean33 = hashSetTestDriver21.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean35 = hashSetTestDriver21.equals_CUT((java.lang.Object) false);
        java.lang.Object obj36 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver21);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test056");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 10);
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        java.lang.Object obj9 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test057");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator6 = hashSetTestDriver3.iterator();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        int int8 = hashSetTestDriver3.size();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        int int12 = hashSetTestDriver9.size();
        boolean boolean13 = hashSetTestDriver9.isEmpty();
        java.lang.Object obj14 = hashSetTestDriver3.getMatch((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test058");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 10);
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj13 = hashSetTestDriver9.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator14 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = hashSetTestDriver15.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = hashSetTestDriver15.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        java.lang.Object obj25 = hashSetTestDriver15.getMatch((java.lang.Object) iterator24);
        hashSetTestDriver15.clear();
        boolean boolean27 = hashSetTestDriver9.contains((java.lang.Object) hashSetTestDriver15);
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) boolean27);
        int int29 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = hashSetTestDriver30.add((java.lang.Object) 10.0d);
        java.lang.Object obj36 = hashSetTestDriver30.getMatch((java.lang.Object) 0.0f);
        java.lang.Object obj37 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver30);
        int int38 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = hashSetTestDriver39.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj45 = hashSetTestDriver39.getMatch((java.lang.Object) 10);
        java.lang.Object obj47 = hashSetTestDriver39.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver48.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj52 = hashSetTestDriver48.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator53 = hashSetTestDriver48.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        boolean boolean56 = hashSetTestDriver54.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj58 = hashSetTestDriver54.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator59 = hashSetTestDriver54.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver60 = new experiment.util.HashSetTestDriver();
        boolean boolean62 = hashSetTestDriver60.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator63 = hashSetTestDriver60.iterator();
        java.lang.Object obj64 = hashSetTestDriver54.getMatch((java.lang.Object) iterator63);
        hashSetTestDriver54.clear();
        boolean boolean66 = hashSetTestDriver48.contains((java.lang.Object) hashSetTestDriver54);
        boolean boolean67 = hashSetTestDriver39.contains((java.lang.Object) boolean66);
        int int68 = hashSetTestDriver39.size();
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        boolean boolean71 = hashSetTestDriver69.remove((java.lang.Object) (byte) 10);
        boolean boolean73 = hashSetTestDriver69.add((java.lang.Object) 10.0d);
        java.lang.Object obj75 = hashSetTestDriver69.getMatch((java.lang.Object) 0.0f);
        java.lang.Object obj76 = hashSetTestDriver39.getMatch((java.lang.Object) hashSetTestDriver69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj77 = hashSetTestDriver0.getMatch(obj76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test059");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = hashSetTestDriver19.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray24 = hashSetTestDriver19.toArray();
        java.lang.Class<?> wildcardClass25 = hashSetTestDriver19.getClass();
        boolean boolean26 = hashSetTestDriver0.add((java.lang.Object) wildcardClass25);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj31 = hashSetTestDriver27.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator32 = hashSetTestDriver27.iterator();
        boolean boolean33 = hashSetTestDriver27.isEmpty();
        boolean boolean35 = hashSetTestDriver27.add((java.lang.Object) (-1.0d));
        java.lang.Object obj37 = hashSetTestDriver27.getMatch((java.lang.Object) (-1.0d));
        boolean boolean38 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0d) + "'", obj37, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test060");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test061");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test062");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        int int9 = hashSetTestDriver0.size();
        java.lang.Object[] objArray10 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean15 = hashSetTestDriver11.add((java.lang.Object) 10.0d);
        java.lang.Object obj17 = hashSetTestDriver11.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver11.remove((java.lang.Object) "");
        boolean boolean21 = hashSetTestDriver11.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray22 = hashSetTestDriver11.toArray();
        boolean boolean23 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = hashSetTestDriver24.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator29 = hashSetTestDriver24.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator33 = hashSetTestDriver30.iterator();
        java.lang.Object obj34 = hashSetTestDriver24.getMatch((java.lang.Object) iterator33);
        java.lang.Object obj36 = hashSetTestDriver24.getMatch((java.lang.Object) 0);
        hashSetTestDriver24.clear();
        boolean boolean38 = hashSetTestDriver24.isEmpty();
        boolean boolean39 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver24);
        hashSetTestDriver24.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj45 = hashSetTestDriver41.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator46 = hashSetTestDriver41.iterator();
        boolean boolean47 = hashSetTestDriver41.isEmpty();
        java.lang.Class<?> wildcardClass48 = hashSetTestDriver41.getClass();
        boolean boolean49 = hashSetTestDriver24.add((java.lang.Object) hashSetTestDriver41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test063");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator8);
        java.lang.Object obj11 = hashSetTestDriver0.getMatch((java.lang.Object) 0L);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) 10.0d);
        java.lang.Object obj19 = hashSetTestDriver13.getMatch((java.lang.Object) (short) -1);
        boolean boolean21 = hashSetTestDriver13.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator22 = hashSetTestDriver13.iterator();
        hashSetTestDriver13.clear();
        java.lang.Object obj24 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = hashSetTestDriver25.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator30 = hashSetTestDriver25.iterator();
        experiment.util.Iterator iterator31 = hashSetTestDriver25.iterator();
        boolean boolean32 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator31);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        boolean boolean35 = hashSetTestDriver33.remove((java.lang.Object) (byte) 10);
        boolean boolean37 = hashSetTestDriver33.add((java.lang.Object) 10.0d);
        java.lang.Object obj39 = hashSetTestDriver33.getMatch((java.lang.Object) 0.0f);
        boolean boolean41 = hashSetTestDriver33.remove((java.lang.Object) "");
        boolean boolean43 = hashSetTestDriver33.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator44 = hashSetTestDriver33.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver45.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj49 = hashSetTestDriver45.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator50 = hashSetTestDriver45.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        boolean boolean53 = hashSetTestDriver51.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator54 = hashSetTestDriver51.iterator();
        java.lang.Object obj55 = hashSetTestDriver45.getMatch((java.lang.Object) iterator54);
        hashSetTestDriver45.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        boolean boolean59 = hashSetTestDriver57.remove((java.lang.Object) (byte) 10);
        boolean boolean61 = hashSetTestDriver57.add((java.lang.Object) 10.0d);
        boolean boolean62 = hashSetTestDriver45.contains((java.lang.Object) hashSetTestDriver57);
        boolean boolean63 = hashSetTestDriver33.add((java.lang.Object) hashSetTestDriver57);
        boolean boolean64 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver57);
        experiment.util.HashSetTestDriver hashSetTestDriver65 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver65.remove((java.lang.Object) (byte) 10);
        boolean boolean69 = hashSetTestDriver65.add((java.lang.Object) 10.0d);
        java.lang.Object obj71 = hashSetTestDriver65.getMatch((java.lang.Object) (short) -1);
        boolean boolean73 = hashSetTestDriver65.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator74 = hashSetTestDriver65.iterator();
        hashSetTestDriver65.clear();
        int int76 = hashSetTestDriver65.size();
        boolean boolean77 = hashSetTestDriver57.remove((java.lang.Object) int76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test064");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) 10.0d);
        boolean boolean12 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) false);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = hashSetTestDriver15.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = hashSetTestDriver15.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        java.lang.Object obj25 = hashSetTestDriver15.getMatch((java.lang.Object) iterator24);
        hashSetTestDriver15.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = hashSetTestDriver27.add((java.lang.Object) 10.0d);
        boolean boolean32 = hashSetTestDriver15.contains((java.lang.Object) hashSetTestDriver27);
        boolean boolean33 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver27);
        boolean boolean34 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test065");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        hashSetTestDriver0.clear();
        int int8 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        boolean boolean13 = hashSetTestDriver9.add((java.lang.Object) 10.0d);
        java.lang.Object obj15 = hashSetTestDriver9.getMatch((java.lang.Object) (short) -1);
        boolean boolean17 = hashSetTestDriver9.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator18 = hashSetTestDriver9.iterator();
        hashSetTestDriver9.clear();
        boolean boolean20 = hashSetTestDriver9.isEmpty();
        boolean boolean21 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        java.lang.Object[] objArray22 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test066");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        java.lang.Object obj12 = hashSetTestDriver0.getMatch((java.lang.Object) 1);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test067");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 10);
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = hashSetTestDriver8.add((java.lang.Object) 10.0d);
        hashSetTestDriver8.clear();
        java.lang.Object obj15 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 0);
        boolean boolean16 = hashSetTestDriver0.add((java.lang.Object) (byte) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.remove((java.lang.Object) (byte) 10);
        boolean boolean21 = hashSetTestDriver17.add((java.lang.Object) 10.0d);
        java.lang.Object obj23 = hashSetTestDriver17.getMatch((java.lang.Object) 0.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) (byte) 10);
        boolean boolean28 = hashSetTestDriver24.add((java.lang.Object) 10.0d);
        java.lang.Object obj30 = hashSetTestDriver24.getMatch((java.lang.Object) 0.0f);
        boolean boolean32 = hashSetTestDriver24.remove((java.lang.Object) "");
        boolean boolean34 = hashSetTestDriver24.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator35 = hashSetTestDriver24.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver36.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj40 = hashSetTestDriver36.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator41 = hashSetTestDriver36.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator45 = hashSetTestDriver42.iterator();
        java.lang.Object obj46 = hashSetTestDriver36.getMatch((java.lang.Object) iterator45);
        hashSetTestDriver36.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver48.remove((java.lang.Object) (byte) 10);
        boolean boolean52 = hashSetTestDriver48.add((java.lang.Object) 10.0d);
        boolean boolean53 = hashSetTestDriver36.contains((java.lang.Object) hashSetTestDriver48);
        boolean boolean54 = hashSetTestDriver24.add((java.lang.Object) hashSetTestDriver48);
        java.lang.Object obj55 = hashSetTestDriver17.getMatch((java.lang.Object) boolean54);
        boolean boolean56 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test068");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        boolean boolean11 = hashSetTestDriver0.isEmpty();
        int int12 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test069");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray21 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test070");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 10);
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj13 = hashSetTestDriver9.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator14 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = hashSetTestDriver15.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = hashSetTestDriver15.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        java.lang.Object obj25 = hashSetTestDriver15.getMatch((java.lang.Object) iterator24);
        hashSetTestDriver15.clear();
        boolean boolean27 = hashSetTestDriver9.contains((java.lang.Object) hashSetTestDriver15);
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) boolean27);
        int int29 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = hashSetTestDriver30.add((java.lang.Object) 10.0d);
        java.lang.Object obj36 = hashSetTestDriver30.getMatch((java.lang.Object) 0.0f);
        java.lang.Object obj37 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver30);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = hashSetTestDriver38.add((java.lang.Object) 10.0d);
        java.lang.Object obj44 = hashSetTestDriver38.getMatch((java.lang.Object) 0.0f);
        boolean boolean46 = hashSetTestDriver38.remove((java.lang.Object) "");
        int int47 = hashSetTestDriver38.size();
        java.lang.Object[] objArray48 = hashSetTestDriver38.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        boolean boolean51 = hashSetTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean53 = hashSetTestDriver49.add((java.lang.Object) 10.0d);
        java.lang.Object obj55 = hashSetTestDriver49.getMatch((java.lang.Object) 0.0f);
        boolean boolean57 = hashSetTestDriver49.remove((java.lang.Object) "");
        boolean boolean59 = hashSetTestDriver49.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray60 = hashSetTestDriver49.toArray();
        boolean boolean61 = hashSetTestDriver38.contains((java.lang.Object) hashSetTestDriver49);
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        boolean boolean64 = hashSetTestDriver62.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj66 = hashSetTestDriver62.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator67 = hashSetTestDriver62.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver68 = new experiment.util.HashSetTestDriver();
        boolean boolean70 = hashSetTestDriver68.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator71 = hashSetTestDriver68.iterator();
        java.lang.Object obj72 = hashSetTestDriver62.getMatch((java.lang.Object) iterator71);
        java.lang.Object obj74 = hashSetTestDriver62.getMatch((java.lang.Object) 0);
        hashSetTestDriver62.clear();
        boolean boolean76 = hashSetTestDriver62.isEmpty();
        boolean boolean77 = hashSetTestDriver38.equals_CUT((java.lang.Object) hashSetTestDriver62);
        hashSetTestDriver62.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver79 = new experiment.util.HashSetTestDriver();
        boolean boolean81 = hashSetTestDriver79.remove((java.lang.Object) (byte) 10);
        boolean boolean83 = hashSetTestDriver79.add((java.lang.Object) 10.0d);
        java.lang.Object obj85 = hashSetTestDriver79.getMatch((java.lang.Object) 0.0f);
        hashSetTestDriver79.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver87 = new experiment.util.HashSetTestDriver();
        boolean boolean89 = hashSetTestDriver87.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj91 = hashSetTestDriver87.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator92 = hashSetTestDriver87.iterator();
        boolean boolean93 = hashSetTestDriver87.isEmpty();
        java.lang.Object obj94 = hashSetTestDriver79.getMatch((java.lang.Object) boolean93);
        boolean boolean95 = hashSetTestDriver62.equals_CUT((java.lang.Object) hashSetTestDriver79);
        boolean boolean96 = hashSetTestDriver30.remove((java.lang.Object) boolean95);
        java.lang.Object obj98 = hashSetTestDriver30.getMatch((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test071");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        hashSetTestDriver6.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = hashSetTestDriver20.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray25 = hashSetTestDriver20.toArray();
        java.lang.Class<?> wildcardClass26 = hashSetTestDriver20.getClass();
        boolean boolean27 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver20);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj32 = hashSetTestDriver28.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = hashSetTestDriver28.getMatch((java.lang.Object) 10);
        java.lang.Object obj36 = hashSetTestDriver28.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean39 = hashSetTestDriver37.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = hashSetTestDriver37.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator42 = hashSetTestDriver37.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        boolean boolean45 = hashSetTestDriver43.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj47 = hashSetTestDriver43.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator48 = hashSetTestDriver43.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        boolean boolean51 = hashSetTestDriver49.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator52 = hashSetTestDriver49.iterator();
        java.lang.Object obj53 = hashSetTestDriver43.getMatch((java.lang.Object) iterator52);
        hashSetTestDriver43.clear();
        boolean boolean55 = hashSetTestDriver37.contains((java.lang.Object) hashSetTestDriver43);
        boolean boolean56 = hashSetTestDriver28.contains((java.lang.Object) boolean55);
        int int57 = hashSetTestDriver28.size();
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        boolean boolean60 = hashSetTestDriver58.remove((java.lang.Object) (byte) 10);
        boolean boolean62 = hashSetTestDriver58.add((java.lang.Object) 10.0d);
        java.lang.Object obj64 = hashSetTestDriver58.getMatch((java.lang.Object) 0.0f);
        boolean boolean66 = hashSetTestDriver58.remove((java.lang.Object) "");
        int int67 = hashSetTestDriver58.size();
        java.lang.Object[] objArray68 = hashSetTestDriver58.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        boolean boolean71 = hashSetTestDriver69.remove((java.lang.Object) (byte) 10);
        boolean boolean73 = hashSetTestDriver69.add((java.lang.Object) 10.0d);
        java.lang.Object obj75 = hashSetTestDriver69.getMatch((java.lang.Object) 0.0f);
        boolean boolean77 = hashSetTestDriver69.remove((java.lang.Object) "");
        boolean boolean79 = hashSetTestDriver69.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray80 = hashSetTestDriver69.toArray();
        boolean boolean81 = hashSetTestDriver58.contains((java.lang.Object) hashSetTestDriver69);
        experiment.util.HashSetTestDriver hashSetTestDriver82 = new experiment.util.HashSetTestDriver();
        boolean boolean84 = hashSetTestDriver82.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj86 = hashSetTestDriver82.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator87 = hashSetTestDriver82.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver88 = new experiment.util.HashSetTestDriver();
        boolean boolean90 = hashSetTestDriver88.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator91 = hashSetTestDriver88.iterator();
        java.lang.Object obj92 = hashSetTestDriver82.getMatch((java.lang.Object) iterator91);
        java.lang.Object obj94 = hashSetTestDriver82.getMatch((java.lang.Object) 0);
        hashSetTestDriver82.clear();
        boolean boolean96 = hashSetTestDriver82.isEmpty();
        boolean boolean97 = hashSetTestDriver58.equals_CUT((java.lang.Object) hashSetTestDriver82);
        java.lang.Object obj98 = hashSetTestDriver28.getMatch((java.lang.Object) hashSetTestDriver82);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = hashSetTestDriver6.equals_CUT(obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(iterator91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test072");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test073");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashSetTestDriver5.getMatch((java.lang.Object) 10);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver5);
        int int13 = hashSetTestDriver0.size();
        java.lang.Object[] objArray14 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator15 = hashSetTestDriver0.iterator();
        boolean boolean16 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test074");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator6 = hashSetTestDriver3.iterator();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = hashSetTestDriver8.getMatch((java.lang.Object) 10);
        java.lang.Object obj16 = hashSetTestDriver8.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = hashSetTestDriver17.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator22 = hashSetTestDriver17.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = hashSetTestDriver23.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator28 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver29.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator32 = hashSetTestDriver29.iterator();
        java.lang.Object obj33 = hashSetTestDriver23.getMatch((java.lang.Object) iterator32);
        hashSetTestDriver23.clear();
        boolean boolean35 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver23);
        boolean boolean36 = hashSetTestDriver8.contains((java.lang.Object) boolean35);
        int int37 = hashSetTestDriver8.size();
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = hashSetTestDriver38.add((java.lang.Object) 10.0d);
        java.lang.Object obj44 = hashSetTestDriver38.getMatch((java.lang.Object) 0.0f);
        java.lang.Object obj45 = hashSetTestDriver8.getMatch((java.lang.Object) hashSetTestDriver38);
        int int46 = hashSetTestDriver8.size();
        boolean boolean47 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver8);
        boolean boolean49 = hashSetTestDriver0.equals_CUT((java.lang.Object) false);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean52 = hashSetTestDriver50.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj54 = hashSetTestDriver50.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator55 = hashSetTestDriver50.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean58 = hashSetTestDriver56.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj60 = hashSetTestDriver56.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator61 = hashSetTestDriver56.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        boolean boolean64 = hashSetTestDriver62.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator65 = hashSetTestDriver62.iterator();
        java.lang.Object obj66 = hashSetTestDriver56.getMatch((java.lang.Object) iterator65);
        hashSetTestDriver56.clear();
        boolean boolean68 = hashSetTestDriver50.contains((java.lang.Object) hashSetTestDriver56);
        hashSetTestDriver56.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver70 = new experiment.util.HashSetTestDriver();
        boolean boolean72 = hashSetTestDriver70.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj74 = hashSetTestDriver70.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray75 = hashSetTestDriver70.toArray();
        boolean boolean76 = hashSetTestDriver56.add((java.lang.Object) hashSetTestDriver70);
        boolean boolean77 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver56);
        experiment.util.HashSetTestDriver hashSetTestDriver78 = new experiment.util.HashSetTestDriver();
        boolean boolean80 = hashSetTestDriver78.remove((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver81 = new experiment.util.HashSetTestDriver();
        boolean boolean83 = hashSetTestDriver81.remove((java.lang.Object) (byte) 10);
        boolean boolean85 = hashSetTestDriver81.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver86 = new experiment.util.HashSetTestDriver();
        boolean boolean88 = hashSetTestDriver86.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj90 = hashSetTestDriver86.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj92 = hashSetTestDriver86.getMatch((java.lang.Object) 10);
        boolean boolean93 = hashSetTestDriver81.contains((java.lang.Object) hashSetTestDriver86);
        int int94 = hashSetTestDriver81.size();
        java.lang.Object[] objArray95 = hashSetTestDriver81.toArray();
        boolean boolean96 = hashSetTestDriver78.remove((java.lang.Object) hashSetTestDriver81);
        java.lang.Object obj97 = hashSetTestDriver56.getMatch((java.lang.Object) hashSetTestDriver78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray95), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test075");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        java.lang.Object obj12 = hashSetTestDriver0.getMatch((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) 10.0d);
        java.lang.Object obj19 = hashSetTestDriver13.getMatch((java.lang.Object) 0.0f);
        boolean boolean21 = hashSetTestDriver13.remove((java.lang.Object) "");
        int int22 = hashSetTestDriver13.size();
        java.lang.Object[] objArray23 = hashSetTestDriver13.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) (byte) 10);
        boolean boolean28 = hashSetTestDriver24.add((java.lang.Object) 10.0d);
        java.lang.Object obj30 = hashSetTestDriver24.getMatch((java.lang.Object) 0.0f);
        boolean boolean32 = hashSetTestDriver24.remove((java.lang.Object) "");
        boolean boolean34 = hashSetTestDriver24.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray35 = hashSetTestDriver24.toArray();
        boolean boolean36 = hashSetTestDriver13.contains((java.lang.Object) hashSetTestDriver24);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean39 = hashSetTestDriver37.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = hashSetTestDriver37.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator42 = hashSetTestDriver37.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        boolean boolean45 = hashSetTestDriver43.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator46 = hashSetTestDriver43.iterator();
        java.lang.Object obj47 = hashSetTestDriver37.getMatch((java.lang.Object) iterator46);
        java.lang.Object obj49 = hashSetTestDriver37.getMatch((java.lang.Object) 0);
        hashSetTestDriver37.clear();
        boolean boolean51 = hashSetTestDriver37.isEmpty();
        boolean boolean52 = hashSetTestDriver13.equals_CUT((java.lang.Object) hashSetTestDriver37);
        hashSetTestDriver37.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator55 = hashSetTestDriver54.iterator();
        hashSetTestDriver54.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        boolean boolean59 = hashSetTestDriver57.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj61 = hashSetTestDriver57.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator62 = hashSetTestDriver57.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        boolean boolean65 = hashSetTestDriver63.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator66 = hashSetTestDriver63.iterator();
        java.lang.Object obj67 = hashSetTestDriver57.getMatch((java.lang.Object) iterator66);
        java.lang.Object obj69 = hashSetTestDriver57.getMatch((java.lang.Object) 0);
        hashSetTestDriver57.clear();
        java.lang.Class<?> wildcardClass71 = hashSetTestDriver57.getClass();
        boolean boolean72 = hashSetTestDriver54.remove((java.lang.Object) wildcardClass71);
        boolean boolean73 = hashSetTestDriver37.add((java.lang.Object) wildcardClass71);
        experiment.util.HashSetTestDriver hashSetTestDriver74 = new experiment.util.HashSetTestDriver();
        boolean boolean76 = hashSetTestDriver74.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj78 = hashSetTestDriver74.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray79 = hashSetTestDriver74.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver80 = new experiment.util.HashSetTestDriver();
        boolean boolean81 = hashSetTestDriver74.remove((java.lang.Object) hashSetTestDriver80);
        java.lang.Object[] objArray82 = hashSetTestDriver74.toArray();
        experiment.util.Iterator iterator83 = hashSetTestDriver74.iterator();
        boolean boolean84 = hashSetTestDriver37.add((java.lang.Object) hashSetTestDriver74);
        experiment.util.HashSetTestDriver hashSetTestDriver85 = new experiment.util.HashSetTestDriver();
        boolean boolean87 = hashSetTestDriver85.remove((java.lang.Object) (byte) 10);
        boolean boolean89 = hashSetTestDriver85.add((java.lang.Object) 10.0d);
        java.lang.Object obj91 = hashSetTestDriver85.getMatch((java.lang.Object) 0.0f);
        boolean boolean93 = hashSetTestDriver85.remove((java.lang.Object) "");
        java.lang.Object obj94 = hashSetTestDriver37.getMatch((java.lang.Object) hashSetTestDriver85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj95 = hashSetTestDriver0.getMatch(obj94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test076");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        java.lang.Object obj12 = hashSetTestDriver0.getMatch((java.lang.Object) 0);
        hashSetTestDriver0.clear();
        boolean boolean14 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        boolean boolean19 = hashSetTestDriver15.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = hashSetTestDriver20.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = hashSetTestDriver20.getMatch((java.lang.Object) 10);
        boolean boolean27 = hashSetTestDriver15.contains((java.lang.Object) hashSetTestDriver20);
        int int28 = hashSetTestDriver15.size();
        java.lang.Object[] objArray29 = hashSetTestDriver15.toArray();
        experiment.util.Iterator iterator30 = hashSetTestDriver15.iterator();
        boolean boolean31 = hashSetTestDriver0.remove((java.lang.Object) iterator30);
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        boolean boolean34 = hashSetTestDriver32.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj36 = hashSetTestDriver32.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator37 = hashSetTestDriver32.iterator();
        boolean boolean38 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver32);
        hashSetTestDriver32.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator41 = hashSetTestDriver40.iterator();
        java.lang.Object obj43 = hashSetTestDriver40.getMatch((java.lang.Object) 10);
        java.lang.Object[] objArray44 = hashSetTestDriver40.toArray();
        boolean boolean46 = hashSetTestDriver40.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray47 = hashSetTestDriver40.toArray();
        boolean boolean48 = hashSetTestDriver32.contains((java.lang.Object) hashSetTestDriver40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10.0]");
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test077");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        hashSetTestDriver9.clear();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = hashSetTestDriver14.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator19 = hashSetTestDriver14.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator23 = hashSetTestDriver20.iterator();
        java.lang.Object obj24 = hashSetTestDriver14.getMatch((java.lang.Object) iterator23);
        hashSetTestDriver14.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = hashSetTestDriver26.add((java.lang.Object) 10.0d);
        boolean boolean31 = hashSetTestDriver14.contains((java.lang.Object) hashSetTestDriver26);
        boolean boolean32 = hashSetTestDriver0.add((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test078");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashSetTestDriver5.getMatch((java.lang.Object) 10);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver5);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = hashSetTestDriver0.remove(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test079");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray20 = hashSetTestDriver0.toArray();
        int int21 = hashSetTestDriver0.size();
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = hashSetTestDriver0.getMatch(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test080");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) 10.0d);
        boolean boolean12 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) false);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = hashSetTestDriver15.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = hashSetTestDriver15.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        java.lang.Object obj25 = hashSetTestDriver15.getMatch((java.lang.Object) iterator24);
        hashSetTestDriver15.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = hashSetTestDriver27.add((java.lang.Object) 10.0d);
        boolean boolean32 = hashSetTestDriver15.contains((java.lang.Object) hashSetTestDriver27);
        boolean boolean33 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (byte) 10);
        boolean boolean38 = hashSetTestDriver34.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = hashSetTestDriver39.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj45 = hashSetTestDriver39.getMatch((java.lang.Object) 10);
        boolean boolean46 = hashSetTestDriver34.contains((java.lang.Object) hashSetTestDriver39);
        int int47 = hashSetTestDriver34.size();
        java.lang.Object[] objArray48 = hashSetTestDriver34.toArray();
        boolean boolean49 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver34);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean52 = hashSetTestDriver50.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj54 = hashSetTestDriver50.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj56 = hashSetTestDriver50.getMatch((java.lang.Object) 10);
        java.lang.Object[] objArray57 = hashSetTestDriver50.toArray();
        boolean boolean58 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver50);
        java.lang.Class<?> wildcardClass59 = hashSetTestDriver50.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test081");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = hashSetTestDriver0.remove(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test082");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashSetTestDriver5.getMatch((java.lang.Object) 10);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver5);
        boolean boolean13 = hashSetTestDriver5.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = hashSetTestDriver14.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator19 = hashSetTestDriver14.iterator();
        boolean boolean20 = hashSetTestDriver14.isEmpty();
        boolean boolean22 = hashSetTestDriver14.add((java.lang.Object) (-1.0d));
        java.lang.Object obj24 = hashSetTestDriver14.getMatch((java.lang.Object) (-1.0d));
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = hashSetTestDriver25.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator30 = hashSetTestDriver25.iterator();
        experiment.util.Iterator iterator31 = hashSetTestDriver25.iterator();
        boolean boolean32 = hashSetTestDriver14.add((java.lang.Object) hashSetTestDriver25);
        boolean boolean33 = hashSetTestDriver5.equals_CUT((java.lang.Object) boolean32);
        int int34 = hashSetTestDriver5.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test083");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = hashSetTestDriver21.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator26 = hashSetTestDriver21.iterator();
        experiment.util.Iterator iterator27 = hashSetTestDriver21.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = hashSetTestDriver28.add((java.lang.Object) 10.0d);
        boolean boolean33 = hashSetTestDriver21.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean35 = hashSetTestDriver21.equals_CUT((java.lang.Object) false);
        java.lang.Object obj36 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver21);
        boolean boolean37 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test084");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray20 = hashSetTestDriver0.toArray();
        int int21 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test085");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean10 = hashSetTestDriver0.add((java.lang.Object) 100L);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = hashSetTestDriver11.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator16 = hashSetTestDriver11.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        java.lang.Object obj21 = hashSetTestDriver11.getMatch((java.lang.Object) iterator20);
        hashSetTestDriver11.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray26 = hashSetTestDriver23.toArray();
        java.lang.Object obj27 = hashSetTestDriver11.getMatch((java.lang.Object) hashSetTestDriver23);
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver23);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = hashSetTestDriver0.equals_CUT(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test086");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test087");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator8);
        java.lang.Object obj11 = hashSetTestDriver0.getMatch((java.lang.Object) 0L);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) 10.0d);
        java.lang.Object obj19 = hashSetTestDriver13.getMatch((java.lang.Object) (short) -1);
        boolean boolean21 = hashSetTestDriver13.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator22 = hashSetTestDriver13.iterator();
        hashSetTestDriver13.clear();
        java.lang.Object obj24 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = hashSetTestDriver25.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator30 = hashSetTestDriver25.iterator();
        experiment.util.Iterator iterator31 = hashSetTestDriver25.iterator();
        boolean boolean32 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator31);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        boolean boolean35 = hashSetTestDriver33.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = hashSetTestDriver33.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = hashSetTestDriver33.getMatch((java.lang.Object) 10);
        java.lang.Object obj41 = hashSetTestDriver33.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj46 = hashSetTestDriver42.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator47 = hashSetTestDriver42.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver48.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj52 = hashSetTestDriver48.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator53 = hashSetTestDriver48.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        boolean boolean56 = hashSetTestDriver54.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator57 = hashSetTestDriver54.iterator();
        java.lang.Object obj58 = hashSetTestDriver48.getMatch((java.lang.Object) iterator57);
        hashSetTestDriver48.clear();
        boolean boolean60 = hashSetTestDriver42.contains((java.lang.Object) hashSetTestDriver48);
        boolean boolean61 = hashSetTestDriver33.contains((java.lang.Object) boolean60);
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        boolean boolean64 = hashSetTestDriver62.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj66 = hashSetTestDriver62.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator67 = hashSetTestDriver62.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver68 = new experiment.util.HashSetTestDriver();
        boolean boolean70 = hashSetTestDriver68.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator71 = hashSetTestDriver68.iterator();
        java.lang.Object obj72 = hashSetTestDriver62.getMatch((java.lang.Object) iterator71);
        hashSetTestDriver62.clear();
        boolean boolean74 = hashSetTestDriver33.add((java.lang.Object) hashSetTestDriver62);
        boolean boolean75 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test088");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver5.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator13 = hashSetTestDriver10.iterator();
        boolean boolean14 = hashSetTestDriver5.equals_CUT((java.lang.Object) iterator13);
        java.lang.Object obj16 = hashSetTestDriver5.getMatch((java.lang.Object) 0L);
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver5);
        boolean boolean18 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test089");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.equals_CUT((java.lang.Object) 0);
        java.lang.Object[] objArray8 = hashSetTestDriver5.toArray();
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver5);
        experiment.util.Iterator iterator10 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test090");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        hashSetTestDriver0.clear();
        java.lang.Object obj7 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray13 = hashSetTestDriver8.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver14);
        boolean boolean16 = hashSetTestDriver0.contains((java.lang.Object) boolean15);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = hashSetTestDriver17.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = hashSetTestDriver17.getMatch((java.lang.Object) 10);
        java.lang.Object obj25 = hashSetTestDriver17.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj30 = hashSetTestDriver26.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator31 = hashSetTestDriver26.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        boolean boolean34 = hashSetTestDriver32.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj36 = hashSetTestDriver32.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator37 = hashSetTestDriver32.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator41 = hashSetTestDriver38.iterator();
        java.lang.Object obj42 = hashSetTestDriver32.getMatch((java.lang.Object) iterator41);
        hashSetTestDriver32.clear();
        boolean boolean44 = hashSetTestDriver26.contains((java.lang.Object) hashSetTestDriver32);
        boolean boolean45 = hashSetTestDriver17.contains((java.lang.Object) boolean44);
        int int46 = hashSetTestDriver17.size();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.remove((java.lang.Object) (byte) 10);
        boolean boolean51 = hashSetTestDriver47.add((java.lang.Object) 10.0d);
        java.lang.Object obj53 = hashSetTestDriver47.getMatch((java.lang.Object) 0.0f);
        java.lang.Object obj54 = hashSetTestDriver17.getMatch((java.lang.Object) hashSetTestDriver47);
        int int55 = hashSetTestDriver17.size();
        java.lang.Object obj56 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver17);
        java.lang.Object[] objArray57 = hashSetTestDriver17.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test091");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashSetTestDriver5.getMatch((java.lang.Object) 10);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver5);
        experiment.util.Iterator iterator13 = hashSetTestDriver5.iterator();
        boolean boolean14 = hashSetTestDriver5.isEmpty();
        java.lang.Object[] objArray15 = hashSetTestDriver5.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test092");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray11 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = hashSetTestDriver13.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator18 = hashSetTestDriver13.iterator();
        experiment.util.Iterator iterator19 = hashSetTestDriver13.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = hashSetTestDriver20.add((java.lang.Object) 10.0d);
        boolean boolean25 = hashSetTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean27 = hashSetTestDriver13.equals_CUT((java.lang.Object) false);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj32 = hashSetTestDriver28.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator33 = hashSetTestDriver28.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator37 = hashSetTestDriver34.iterator();
        java.lang.Object obj38 = hashSetTestDriver28.getMatch((java.lang.Object) iterator37);
        hashSetTestDriver28.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver40.remove((java.lang.Object) (byte) 10);
        boolean boolean44 = hashSetTestDriver40.add((java.lang.Object) 10.0d);
        boolean boolean45 = hashSetTestDriver28.contains((java.lang.Object) hashSetTestDriver40);
        boolean boolean46 = hashSetTestDriver13.contains((java.lang.Object) hashSetTestDriver40);
        boolean boolean47 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver13);
        hashSetTestDriver13.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test093");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        int int11 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test094");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) (-1.0d));
        boolean boolean10 = hashSetTestDriver0.add((java.lang.Object) 100L);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test095");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator8);
        java.lang.Object obj11 = hashSetTestDriver0.getMatch((java.lang.Object) 0L);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) 10.0d);
        java.lang.Object obj19 = hashSetTestDriver13.getMatch((java.lang.Object) (short) -1);
        boolean boolean21 = hashSetTestDriver13.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator22 = hashSetTestDriver13.iterator();
        hashSetTestDriver13.clear();
        java.lang.Object obj24 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = hashSetTestDriver25.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator30 = hashSetTestDriver25.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean33 = hashSetTestDriver31.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator34 = hashSetTestDriver31.iterator();
        java.lang.Object obj35 = hashSetTestDriver25.getMatch((java.lang.Object) iterator34);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver36.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator39 = hashSetTestDriver36.iterator();
        boolean boolean40 = hashSetTestDriver36.isEmpty();
        boolean boolean41 = hashSetTestDriver25.remove((java.lang.Object) boolean40);
        java.lang.Object[] objArray42 = hashSetTestDriver25.toArray();
        java.lang.Object obj43 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver25);
        java.lang.Object[] objArray44 = hashSetTestDriver25.toArray();
        boolean boolean45 = hashSetTestDriver25.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test096");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashSetTestDriver5.getMatch((java.lang.Object) 10);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver5);
        experiment.util.Iterator iterator13 = hashSetTestDriver5.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = hashSetTestDriver14.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray19 = hashSetTestDriver14.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver14.remove((java.lang.Object) hashSetTestDriver20);
        java.lang.Object[] objArray22 = hashSetTestDriver14.toArray();
        boolean boolean23 = hashSetTestDriver5.contains((java.lang.Object) hashSetTestDriver14);
        boolean boolean24 = hashSetTestDriver5.isEmpty();
        java.lang.Object[] objArray25 = hashSetTestDriver5.toArray();
        java.lang.Class<?> wildcardClass26 = hashSetTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test097");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        int int9 = hashSetTestDriver0.size();
        java.lang.Object[] objArray10 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean15 = hashSetTestDriver11.add((java.lang.Object) 10.0d);
        java.lang.Object obj17 = hashSetTestDriver11.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver11.remove((java.lang.Object) "");
        boolean boolean21 = hashSetTestDriver11.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray22 = hashSetTestDriver11.toArray();
        boolean boolean23 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = hashSetTestDriver24.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator29 = hashSetTestDriver24.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator33 = hashSetTestDriver30.iterator();
        java.lang.Object obj34 = hashSetTestDriver24.getMatch((java.lang.Object) iterator33);
        java.lang.Object obj36 = hashSetTestDriver24.getMatch((java.lang.Object) 0);
        hashSetTestDriver24.clear();
        boolean boolean38 = hashSetTestDriver24.isEmpty();
        boolean boolean39 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver24);
        hashSetTestDriver24.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator42 = hashSetTestDriver41.iterator();
        hashSetTestDriver41.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        boolean boolean46 = hashSetTestDriver44.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj48 = hashSetTestDriver44.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator49 = hashSetTestDriver44.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean52 = hashSetTestDriver50.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator53 = hashSetTestDriver50.iterator();
        java.lang.Object obj54 = hashSetTestDriver44.getMatch((java.lang.Object) iterator53);
        java.lang.Object obj56 = hashSetTestDriver44.getMatch((java.lang.Object) 0);
        hashSetTestDriver44.clear();
        java.lang.Class<?> wildcardClass58 = hashSetTestDriver44.getClass();
        boolean boolean59 = hashSetTestDriver41.remove((java.lang.Object) wildcardClass58);
        boolean boolean60 = hashSetTestDriver24.add((java.lang.Object) wildcardClass58);
        experiment.util.HashSetTestDriver hashSetTestDriver61 = new experiment.util.HashSetTestDriver();
        boolean boolean63 = hashSetTestDriver61.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj65 = hashSetTestDriver61.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray66 = hashSetTestDriver61.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver67 = new experiment.util.HashSetTestDriver();
        boolean boolean68 = hashSetTestDriver61.remove((java.lang.Object) hashSetTestDriver67);
        java.lang.Object[] objArray69 = hashSetTestDriver61.toArray();
        experiment.util.Iterator iterator70 = hashSetTestDriver61.iterator();
        boolean boolean71 = hashSetTestDriver24.add((java.lang.Object) hashSetTestDriver61);
        experiment.util.HashSetTestDriver hashSetTestDriver72 = new experiment.util.HashSetTestDriver();
        boolean boolean74 = hashSetTestDriver72.remove((java.lang.Object) (byte) 10);
        boolean boolean76 = hashSetTestDriver72.add((java.lang.Object) 10.0d);
        java.lang.Object obj78 = hashSetTestDriver72.getMatch((java.lang.Object) 0.0f);
        boolean boolean80 = hashSetTestDriver72.remove((java.lang.Object) "");
        java.lang.Object obj81 = hashSetTestDriver24.getMatch((java.lang.Object) hashSetTestDriver72);
        hashSetTestDriver72.clear();
        boolean boolean83 = hashSetTestDriver72.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test098");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        java.lang.Object obj12 = hashSetTestDriver0.getMatch((java.lang.Object) 0);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.remove((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        boolean boolean21 = hashSetTestDriver14.remove((java.lang.Object) hashSetTestDriver17);
        boolean boolean22 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver17);
        hashSetTestDriver17.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test099");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        java.lang.Object obj12 = hashSetTestDriver0.getMatch((java.lang.Object) 0);
        java.lang.Object obj14 = hashSetTestDriver0.getMatch((java.lang.Object) 10L);
        experiment.util.Iterator iterator15 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = hashSetTestDriver16.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        boolean boolean25 = hashSetTestDriver21.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator29 = hashSetTestDriver26.iterator();
        boolean boolean30 = hashSetTestDriver21.equals_CUT((java.lang.Object) iterator29);
        java.lang.Object obj32 = hashSetTestDriver21.getMatch((java.lang.Object) 0L);
        hashSetTestDriver21.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (byte) 10);
        boolean boolean38 = hashSetTestDriver34.add((java.lang.Object) 10.0d);
        java.lang.Object obj40 = hashSetTestDriver34.getMatch((java.lang.Object) (short) -1);
        boolean boolean42 = hashSetTestDriver34.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator43 = hashSetTestDriver34.iterator();
        hashSetTestDriver34.clear();
        java.lang.Object obj45 = hashSetTestDriver21.getMatch((java.lang.Object) hashSetTestDriver34);
        experiment.util.Iterator iterator46 = hashSetTestDriver34.iterator();
        boolean boolean47 = hashSetTestDriver16.contains((java.lang.Object) iterator46);
        boolean boolean48 = hashSetTestDriver0.remove((java.lang.Object) iterator46);
        java.lang.Object obj49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = hashSetTestDriver0.equals_CUT(obj49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test100");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashSetTestDriver7.add((java.lang.Object) 10.0d);
        boolean boolean12 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) false);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = hashSetTestDriver15.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator20 = hashSetTestDriver15.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        java.lang.Object obj25 = hashSetTestDriver15.getMatch((java.lang.Object) iterator24);
        hashSetTestDriver15.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = hashSetTestDriver27.add((java.lang.Object) 10.0d);
        boolean boolean32 = hashSetTestDriver15.contains((java.lang.Object) hashSetTestDriver27);
        boolean boolean33 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (byte) 10);
        boolean boolean38 = hashSetTestDriver34.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = hashSetTestDriver39.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj45 = hashSetTestDriver39.getMatch((java.lang.Object) 10);
        boolean boolean46 = hashSetTestDriver34.contains((java.lang.Object) hashSetTestDriver39);
        int int47 = hashSetTestDriver34.size();
        java.lang.Object[] objArray48 = hashSetTestDriver34.toArray();
        boolean boolean49 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver34);
        experiment.util.Iterator iterator50 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass51 = iterator50.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test101");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = hashSetTestDriver7.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator12 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = hashSetTestDriver13.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator18 = hashSetTestDriver13.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator22 = hashSetTestDriver19.iterator();
        java.lang.Object obj23 = hashSetTestDriver13.getMatch((java.lang.Object) iterator22);
        hashSetTestDriver13.clear();
        boolean boolean25 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver13);
        hashSetTestDriver13.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj31 = hashSetTestDriver27.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray32 = hashSetTestDriver27.toArray();
        boolean boolean33 = hashSetTestDriver13.add((java.lang.Object) hashSetTestDriver27);
        java.lang.Object obj34 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver35.remove((java.lang.Object) (byte) 10);
        boolean boolean39 = hashSetTestDriver35.add((java.lang.Object) 10.0d);
        hashSetTestDriver35.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.remove((java.lang.Object) (byte) 10);
        boolean boolean45 = hashSetTestDriver41.add((java.lang.Object) 10.0d);
        java.lang.Object obj47 = hashSetTestDriver41.getMatch((java.lang.Object) (short) -1);
        boolean boolean49 = hashSetTestDriver41.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator50 = hashSetTestDriver41.iterator();
        hashSetTestDriver41.clear();
        boolean boolean52 = hashSetTestDriver41.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver53 = new experiment.util.HashSetTestDriver();
        boolean boolean55 = hashSetTestDriver53.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj57 = hashSetTestDriver53.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator58 = hashSetTestDriver53.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver59 = new experiment.util.HashSetTestDriver();
        boolean boolean61 = hashSetTestDriver59.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator62 = hashSetTestDriver59.iterator();
        java.lang.Object obj63 = hashSetTestDriver53.getMatch((java.lang.Object) iterator62);
        java.lang.Object obj65 = hashSetTestDriver53.getMatch((java.lang.Object) 0);
        hashSetTestDriver53.clear();
        boolean boolean67 = hashSetTestDriver53.isEmpty();
        boolean boolean68 = hashSetTestDriver41.add((java.lang.Object) hashSetTestDriver53);
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        boolean boolean71 = hashSetTestDriver69.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj73 = hashSetTestDriver69.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator74 = hashSetTestDriver69.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver75 = new experiment.util.HashSetTestDriver();
        boolean boolean77 = hashSetTestDriver75.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator78 = hashSetTestDriver75.iterator();
        java.lang.Object obj79 = hashSetTestDriver69.getMatch((java.lang.Object) iterator78);
        experiment.util.HashSetTestDriver hashSetTestDriver80 = new experiment.util.HashSetTestDriver();
        boolean boolean82 = hashSetTestDriver80.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator83 = hashSetTestDriver80.iterator();
        boolean boolean84 = hashSetTestDriver80.isEmpty();
        boolean boolean85 = hashSetTestDriver69.remove((java.lang.Object) boolean84);
        java.lang.Object[] objArray86 = hashSetTestDriver69.toArray();
        boolean boolean87 = hashSetTestDriver53.contains((java.lang.Object) objArray86);
        java.lang.Object obj88 = hashSetTestDriver35.getMatch((java.lang.Object) hashSetTestDriver53);
        boolean boolean89 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver35);
        hashSetTestDriver35.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test102");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = hashSetTestDriver7.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator12 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = hashSetTestDriver13.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator18 = hashSetTestDriver13.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator22 = hashSetTestDriver19.iterator();
        java.lang.Object obj23 = hashSetTestDriver13.getMatch((java.lang.Object) iterator22);
        hashSetTestDriver13.clear();
        boolean boolean25 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver13);
        hashSetTestDriver13.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj31 = hashSetTestDriver27.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray32 = hashSetTestDriver27.toArray();
        boolean boolean33 = hashSetTestDriver13.add((java.lang.Object) hashSetTestDriver27);
        java.lang.Object obj34 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver27);
        boolean boolean35 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test103");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = hashSetTestDriver8.add((java.lang.Object) 10.0d);
        java.lang.Object obj14 = hashSetTestDriver8.getMatch((java.lang.Object) 0.0f);
        boolean boolean16 = hashSetTestDriver8.remove((java.lang.Object) "");
        int int17 = hashSetTestDriver8.size();
        java.lang.Object[] objArray18 = hashSetTestDriver8.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = hashSetTestDriver19.add((java.lang.Object) 10.0d);
        java.lang.Object obj25 = hashSetTestDriver19.getMatch((java.lang.Object) 0.0f);
        boolean boolean27 = hashSetTestDriver19.remove((java.lang.Object) "");
        boolean boolean29 = hashSetTestDriver19.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray30 = hashSetTestDriver19.toArray();
        boolean boolean31 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver19);
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        boolean boolean34 = hashSetTestDriver32.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj36 = hashSetTestDriver32.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator37 = hashSetTestDriver32.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator41 = hashSetTestDriver38.iterator();
        java.lang.Object obj42 = hashSetTestDriver32.getMatch((java.lang.Object) iterator41);
        java.lang.Object obj44 = hashSetTestDriver32.getMatch((java.lang.Object) 0);
        hashSetTestDriver32.clear();
        boolean boolean46 = hashSetTestDriver32.isEmpty();
        boolean boolean47 = hashSetTestDriver8.equals_CUT((java.lang.Object) hashSetTestDriver32);
        boolean boolean48 = hashSetTestDriver0.contains((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test104");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test105");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        hashSetTestDriver0.clear();
        int int8 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        boolean boolean13 = hashSetTestDriver9.add((java.lang.Object) 10.0d);
        java.lang.Object obj15 = hashSetTestDriver9.getMatch((java.lang.Object) 0.0f);
        boolean boolean17 = hashSetTestDriver9.remove((java.lang.Object) "");
        int int18 = hashSetTestDriver9.size();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = hashSetTestDriver19.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray24 = hashSetTestDriver19.toArray();
        java.lang.Class<?> wildcardClass25 = hashSetTestDriver19.getClass();
        boolean boolean26 = hashSetTestDriver9.add((java.lang.Object) hashSetTestDriver19);
        boolean boolean27 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver9);
        int int28 = hashSetTestDriver9.size();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver29.remove((java.lang.Object) (byte) 10);
        boolean boolean33 = hashSetTestDriver29.add((java.lang.Object) 10.0d);
        java.lang.Object obj35 = hashSetTestDriver29.getMatch((java.lang.Object) (short) -1);
        boolean boolean37 = hashSetTestDriver29.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator38 = hashSetTestDriver29.iterator();
        hashSetTestDriver29.clear();
        java.lang.Object obj41 = hashSetTestDriver29.getMatch((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj46 = hashSetTestDriver42.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator47 = hashSetTestDriver42.iterator();
        experiment.util.Iterator iterator48 = hashSetTestDriver42.iterator();
        boolean boolean49 = hashSetTestDriver29.contains((java.lang.Object) hashSetTestDriver42);
        java.lang.Object obj50 = hashSetTestDriver9.getMatch((java.lang.Object) hashSetTestDriver42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test106");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        boolean boolean11 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test107");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = hashSetTestDriver19.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator24 = hashSetTestDriver19.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator28 = hashSetTestDriver25.iterator();
        java.lang.Object obj29 = hashSetTestDriver19.getMatch((java.lang.Object) iterator28);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator33 = hashSetTestDriver30.iterator();
        boolean boolean34 = hashSetTestDriver30.isEmpty();
        boolean boolean35 = hashSetTestDriver19.remove((java.lang.Object) boolean34);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator37 = hashSetTestDriver36.iterator();
        boolean boolean38 = hashSetTestDriver19.equals_CUT((java.lang.Object) iterator37);
        boolean boolean39 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver19);
        experiment.util.Iterator iterator40 = hashSetTestDriver19.iterator();
        java.lang.Object obj41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = hashSetTestDriver19.getMatch(obj41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test108");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        hashSetTestDriver0.clear();
        java.lang.Object obj7 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray13 = hashSetTestDriver8.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver14);
        boolean boolean16 = hashSetTestDriver0.contains((java.lang.Object) boolean15);
        java.lang.Object[] objArray17 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = hashSetTestDriver18.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray23 = hashSetTestDriver18.toArray();
        java.lang.Object[] objArray24 = hashSetTestDriver18.toArray();
        boolean boolean25 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test109");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator8);
        java.lang.Object obj11 = hashSetTestDriver0.getMatch((java.lang.Object) 0L);
        hashSetTestDriver0.clear();
        experiment.util.Iterator iterator13 = hashSetTestDriver0.iterator();
        boolean boolean14 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test110");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray11 = hashSetTestDriver0.toArray();
        boolean boolean13 = hashSetTestDriver0.contains((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) 10);
        boolean boolean19 = hashSetTestDriver15.add((java.lang.Object) 10.0d);
        java.lang.Object obj21 = hashSetTestDriver15.getMatch((java.lang.Object) 0.0f);
        boolean boolean23 = hashSetTestDriver15.remove((java.lang.Object) "");
        int int24 = hashSetTestDriver15.size();
        java.lang.Object[] objArray25 = hashSetTestDriver15.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = hashSetTestDriver26.add((java.lang.Object) 10.0d);
        java.lang.Object obj32 = hashSetTestDriver26.getMatch((java.lang.Object) 0.0f);
        boolean boolean34 = hashSetTestDriver26.remove((java.lang.Object) "");
        boolean boolean36 = hashSetTestDriver26.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray37 = hashSetTestDriver26.toArray();
        boolean boolean38 = hashSetTestDriver15.contains((java.lang.Object) hashSetTestDriver26);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = hashSetTestDriver39.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator44 = hashSetTestDriver39.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver45.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator48 = hashSetTestDriver45.iterator();
        java.lang.Object obj49 = hashSetTestDriver39.getMatch((java.lang.Object) iterator48);
        java.lang.Object obj51 = hashSetTestDriver39.getMatch((java.lang.Object) 0);
        hashSetTestDriver39.clear();
        boolean boolean53 = hashSetTestDriver39.isEmpty();
        boolean boolean54 = hashSetTestDriver15.equals_CUT((java.lang.Object) hashSetTestDriver39);
        hashSetTestDriver39.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean58 = hashSetTestDriver56.remove((java.lang.Object) (byte) 10);
        boolean boolean60 = hashSetTestDriver56.add((java.lang.Object) 10.0d);
        java.lang.Object obj62 = hashSetTestDriver56.getMatch((java.lang.Object) 0.0f);
        hashSetTestDriver56.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        boolean boolean66 = hashSetTestDriver64.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj68 = hashSetTestDriver64.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator69 = hashSetTestDriver64.iterator();
        boolean boolean70 = hashSetTestDriver64.isEmpty();
        java.lang.Object obj71 = hashSetTestDriver56.getMatch((java.lang.Object) boolean70);
        boolean boolean72 = hashSetTestDriver39.equals_CUT((java.lang.Object) hashSetTestDriver56);
        experiment.util.Iterator iterator73 = hashSetTestDriver39.iterator();
        boolean boolean74 = hashSetTestDriver0.add((java.lang.Object) iterator73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test111");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = hashSetTestDriver3.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = hashSetTestDriver8.getMatch((java.lang.Object) 10);
        boolean boolean15 = hashSetTestDriver3.contains((java.lang.Object) hashSetTestDriver8);
        int int16 = hashSetTestDriver3.size();
        java.lang.Object[] objArray17 = hashSetTestDriver3.toArray();
        boolean boolean18 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (byte) 10);
        hashSetTestDriver19.clear();
        java.lang.Object obj23 = hashSetTestDriver3.getMatch((java.lang.Object) hashSetTestDriver19);
        hashSetTestDriver19.clear();
        boolean boolean25 = hashSetTestDriver19.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test112");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator14 = hashSetTestDriver11.iterator();
        boolean boolean15 = hashSetTestDriver11.isEmpty();
        boolean boolean16 = hashSetTestDriver0.remove((java.lang.Object) boolean15);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator18 = hashSetTestDriver17.iterator();
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator18);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = hashSetTestDriver20.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator25 = hashSetTestDriver20.iterator();
        experiment.util.Iterator iterator26 = hashSetTestDriver20.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean31 = hashSetTestDriver27.add((java.lang.Object) 10.0d);
        boolean boolean32 = hashSetTestDriver20.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean34 = hashSetTestDriver20.equals_CUT((java.lang.Object) false);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver35.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj39 = hashSetTestDriver35.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator40 = hashSetTestDriver35.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator44 = hashSetTestDriver41.iterator();
        java.lang.Object obj45 = hashSetTestDriver35.getMatch((java.lang.Object) iterator44);
        hashSetTestDriver35.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.remove((java.lang.Object) (byte) 10);
        boolean boolean51 = hashSetTestDriver47.add((java.lang.Object) 10.0d);
        boolean boolean52 = hashSetTestDriver35.contains((java.lang.Object) hashSetTestDriver47);
        boolean boolean53 = hashSetTestDriver20.contains((java.lang.Object) hashSetTestDriver47);
        boolean boolean54 = hashSetTestDriver0.remove((java.lang.Object) boolean53);
        hashSetTestDriver0.clear();
        boolean boolean57 = hashSetTestDriver0.remove((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test113");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) (short) -1);
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        java.lang.Object obj12 = hashSetTestDriver0.getMatch((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = hashSetTestDriver13.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator18 = hashSetTestDriver13.iterator();
        experiment.util.Iterator iterator19 = hashSetTestDriver13.iterator();
        boolean boolean20 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver13);
        boolean boolean21 = hashSetTestDriver13.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test114");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        int int4 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator7 = hashSetTestDriver6.iterator();
        java.lang.Object obj9 = hashSetTestDriver6.getMatch((java.lang.Object) 10);
        boolean boolean10 = hashSetTestDriver0.add((java.lang.Object) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean15 = hashSetTestDriver11.add((java.lang.Object) 10.0d);
        java.lang.Object obj17 = hashSetTestDriver11.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver11.remove((java.lang.Object) "");
        int int20 = hashSetTestDriver11.size();
        java.lang.Object[] objArray21 = hashSetTestDriver11.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashSetTestDriver22.add((java.lang.Object) 10.0d);
        java.lang.Object obj28 = hashSetTestDriver22.getMatch((java.lang.Object) 0.0f);
        boolean boolean30 = hashSetTestDriver22.remove((java.lang.Object) "");
        boolean boolean32 = hashSetTestDriver22.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray33 = hashSetTestDriver22.toArray();
        boolean boolean34 = hashSetTestDriver11.contains((java.lang.Object) hashSetTestDriver22);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver35.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj39 = hashSetTestDriver35.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator40 = hashSetTestDriver35.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator44 = hashSetTestDriver41.iterator();
        java.lang.Object obj45 = hashSetTestDriver35.getMatch((java.lang.Object) iterator44);
        java.lang.Object obj47 = hashSetTestDriver35.getMatch((java.lang.Object) 0);
        hashSetTestDriver35.clear();
        boolean boolean49 = hashSetTestDriver35.isEmpty();
        boolean boolean50 = hashSetTestDriver11.equals_CUT((java.lang.Object) hashSetTestDriver35);
        hashSetTestDriver35.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator53 = hashSetTestDriver52.iterator();
        hashSetTestDriver52.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver55.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj59 = hashSetTestDriver55.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator60 = hashSetTestDriver55.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver61 = new experiment.util.HashSetTestDriver();
        boolean boolean63 = hashSetTestDriver61.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator64 = hashSetTestDriver61.iterator();
        java.lang.Object obj65 = hashSetTestDriver55.getMatch((java.lang.Object) iterator64);
        java.lang.Object obj67 = hashSetTestDriver55.getMatch((java.lang.Object) 0);
        hashSetTestDriver55.clear();
        java.lang.Class<?> wildcardClass69 = hashSetTestDriver55.getClass();
        boolean boolean70 = hashSetTestDriver52.remove((java.lang.Object) wildcardClass69);
        boolean boolean71 = hashSetTestDriver35.add((java.lang.Object) wildcardClass69);
        experiment.util.HashSetTestDriver hashSetTestDriver72 = new experiment.util.HashSetTestDriver();
        boolean boolean74 = hashSetTestDriver72.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj76 = hashSetTestDriver72.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray77 = hashSetTestDriver72.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver78 = new experiment.util.HashSetTestDriver();
        boolean boolean79 = hashSetTestDriver72.remove((java.lang.Object) hashSetTestDriver78);
        java.lang.Object[] objArray80 = hashSetTestDriver72.toArray();
        experiment.util.Iterator iterator81 = hashSetTestDriver72.iterator();
        boolean boolean82 = hashSetTestDriver35.add((java.lang.Object) hashSetTestDriver72);
        experiment.util.HashSetTestDriver hashSetTestDriver83 = new experiment.util.HashSetTestDriver();
        boolean boolean85 = hashSetTestDriver83.remove((java.lang.Object) (byte) 10);
        boolean boolean87 = hashSetTestDriver83.add((java.lang.Object) 10.0d);
        java.lang.Object obj89 = hashSetTestDriver83.getMatch((java.lang.Object) 0.0f);
        boolean boolean91 = hashSetTestDriver83.remove((java.lang.Object) "");
        java.lang.Object obj92 = hashSetTestDriver35.getMatch((java.lang.Object) hashSetTestDriver83);
        hashSetTestDriver83.clear();
        boolean boolean94 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[]");
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test115");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = hashSetTestDriver0.iterator();
        int int12 = hashSetTestDriver0.size();
        boolean boolean14 = hashSetTestDriver0.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test116");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) "");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator11 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator14 = hashSetTestDriver13.iterator();
        hashSetTestDriver13.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = hashSetTestDriver16.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator21 = hashSetTestDriver16.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator25 = hashSetTestDriver22.iterator();
        java.lang.Object obj26 = hashSetTestDriver16.getMatch((java.lang.Object) iterator25);
        java.lang.Object obj28 = hashSetTestDriver16.getMatch((java.lang.Object) 0);
        hashSetTestDriver16.clear();
        java.lang.Class<?> wildcardClass30 = hashSetTestDriver16.getClass();
        boolean boolean31 = hashSetTestDriver13.remove((java.lang.Object) wildcardClass30);
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        boolean boolean34 = hashSetTestDriver32.remove((java.lang.Object) (byte) 10);
        boolean boolean36 = hashSetTestDriver32.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean39 = hashSetTestDriver37.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator40 = hashSetTestDriver37.iterator();
        boolean boolean41 = hashSetTestDriver37.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator45 = hashSetTestDriver42.iterator();
        boolean boolean46 = hashSetTestDriver37.equals_CUT((java.lang.Object) iterator45);
        java.lang.Object obj48 = hashSetTestDriver37.getMatch((java.lang.Object) 0L);
        hashSetTestDriver37.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean52 = hashSetTestDriver50.remove((java.lang.Object) (byte) 10);
        boolean boolean54 = hashSetTestDriver50.add((java.lang.Object) 10.0d);
        java.lang.Object obj56 = hashSetTestDriver50.getMatch((java.lang.Object) (short) -1);
        boolean boolean58 = hashSetTestDriver50.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator59 = hashSetTestDriver50.iterator();
        hashSetTestDriver50.clear();
        java.lang.Object obj61 = hashSetTestDriver37.getMatch((java.lang.Object) hashSetTestDriver50);
        experiment.util.Iterator iterator62 = hashSetTestDriver50.iterator();
        boolean boolean63 = hashSetTestDriver32.contains((java.lang.Object) iterator62);
        boolean boolean64 = hashSetTestDriver13.contains((java.lang.Object) boolean63);
        boolean boolean65 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test117");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        hashSetTestDriver0.clear();
        java.lang.Object obj7 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray13 = hashSetTestDriver8.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver14);
        boolean boolean16 = hashSetTestDriver0.contains((java.lang.Object) boolean15);
        java.lang.Object[] objArray17 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test118");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        hashSetTestDriver0.clear();
        int int8 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        boolean boolean13 = hashSetTestDriver9.add((java.lang.Object) 10.0d);
        java.lang.Object obj15 = hashSetTestDriver9.getMatch((java.lang.Object) (short) -1);
        boolean boolean17 = hashSetTestDriver9.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator18 = hashSetTestDriver9.iterator();
        hashSetTestDriver9.clear();
        boolean boolean20 = hashSetTestDriver9.isEmpty();
        boolean boolean21 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashSetTestDriver22.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj31 = hashSetTestDriver27.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = hashSetTestDriver27.getMatch((java.lang.Object) 10);
        boolean boolean34 = hashSetTestDriver22.contains((java.lang.Object) hashSetTestDriver27);
        int int35 = hashSetTestDriver22.size();
        java.lang.Object[] objArray36 = hashSetTestDriver22.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean39 = hashSetTestDriver37.remove((java.lang.Object) (byte) 10);
        boolean boolean41 = hashSetTestDriver37.add((java.lang.Object) 10.0d);
        java.lang.Object obj43 = hashSetTestDriver37.getMatch((java.lang.Object) 0.0f);
        boolean boolean45 = hashSetTestDriver37.remove((java.lang.Object) "");
        boolean boolean47 = hashSetTestDriver37.equals_CUT((java.lang.Object) '#');
        java.lang.Object[] objArray48 = hashSetTestDriver37.toArray();
        hashSetTestDriver37.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean52 = hashSetTestDriver50.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj54 = hashSetTestDriver50.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator55 = hashSetTestDriver50.iterator();
        experiment.util.Iterator iterator56 = hashSetTestDriver50.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        boolean boolean59 = hashSetTestDriver57.remove((java.lang.Object) (byte) 10);
        boolean boolean61 = hashSetTestDriver57.add((java.lang.Object) 10.0d);
        boolean boolean62 = hashSetTestDriver50.equals_CUT((java.lang.Object) 10.0d);
        boolean boolean64 = hashSetTestDriver50.equals_CUT((java.lang.Object) false);
        experiment.util.HashSetTestDriver hashSetTestDriver65 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver65.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj69 = hashSetTestDriver65.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator70 = hashSetTestDriver65.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver71 = new experiment.util.HashSetTestDriver();
        boolean boolean73 = hashSetTestDriver71.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator74 = hashSetTestDriver71.iterator();
        java.lang.Object obj75 = hashSetTestDriver65.getMatch((java.lang.Object) iterator74);
        hashSetTestDriver65.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver77 = new experiment.util.HashSetTestDriver();
        boolean boolean79 = hashSetTestDriver77.remove((java.lang.Object) (byte) 10);
        boolean boolean81 = hashSetTestDriver77.add((java.lang.Object) 10.0d);
        boolean boolean82 = hashSetTestDriver65.contains((java.lang.Object) hashSetTestDriver77);
        boolean boolean83 = hashSetTestDriver50.contains((java.lang.Object) hashSetTestDriver77);
        boolean boolean84 = hashSetTestDriver37.contains((java.lang.Object) hashSetTestDriver50);
        java.lang.Object obj85 = hashSetTestDriver22.getMatch((java.lang.Object) hashSetTestDriver50);
        boolean boolean86 = hashSetTestDriver9.equals_CUT((java.lang.Object) hashSetTestDriver50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test119");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj13 = hashSetTestDriver9.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator14 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator18 = hashSetTestDriver15.iterator();
        java.lang.Object obj19 = hashSetTestDriver9.getMatch((java.lang.Object) iterator18);
        hashSetTestDriver9.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = hashSetTestDriver21.add((java.lang.Object) 10.0d);
        java.lang.Object obj27 = hashSetTestDriver21.getMatch((java.lang.Object) 0.0f);
        boolean boolean28 = hashSetTestDriver9.equals_CUT((java.lang.Object) 0.0f);
        hashSetTestDriver9.clear();
        boolean boolean31 = hashSetTestDriver9.contains((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass32 = hashSetTestDriver9.getClass();
        java.lang.Object obj33 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator37 = hashSetTestDriver34.iterator();
        boolean boolean38 = hashSetTestDriver34.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator42 = hashSetTestDriver39.iterator();
        boolean boolean43 = hashSetTestDriver34.equals_CUT((java.lang.Object) iterator42);
        java.lang.Object obj45 = hashSetTestDriver34.getMatch((java.lang.Object) 0L);
        hashSetTestDriver34.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.remove((java.lang.Object) (byte) 10);
        boolean boolean51 = hashSetTestDriver47.add((java.lang.Object) 10.0d);
        java.lang.Object obj53 = hashSetTestDriver47.getMatch((java.lang.Object) (short) -1);
        boolean boolean55 = hashSetTestDriver47.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator56 = hashSetTestDriver47.iterator();
        hashSetTestDriver47.clear();
        java.lang.Object obj58 = hashSetTestDriver34.getMatch((java.lang.Object) hashSetTestDriver47);
        experiment.util.Iterator iterator59 = hashSetTestDriver47.iterator();
        java.lang.Object[] objArray60 = hashSetTestDriver47.toArray();
        boolean boolean61 = hashSetTestDriver0.contains((java.lang.Object) objArray60);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test120");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        int int8 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test121");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator6 = hashSetTestDriver3.iterator();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = hashSetTestDriver8.getMatch((java.lang.Object) 10);
        java.lang.Object obj16 = hashSetTestDriver8.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = hashSetTestDriver17.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator22 = hashSetTestDriver17.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = hashSetTestDriver23.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator28 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver29.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator32 = hashSetTestDriver29.iterator();
        java.lang.Object obj33 = hashSetTestDriver23.getMatch((java.lang.Object) iterator32);
        hashSetTestDriver23.clear();
        boolean boolean35 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver23);
        boolean boolean36 = hashSetTestDriver8.contains((java.lang.Object) boolean35);
        int int37 = hashSetTestDriver8.size();
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = hashSetTestDriver38.add((java.lang.Object) 10.0d);
        java.lang.Object obj44 = hashSetTestDriver38.getMatch((java.lang.Object) 0.0f);
        java.lang.Object obj45 = hashSetTestDriver8.getMatch((java.lang.Object) hashSetTestDriver38);
        int int46 = hashSetTestDriver8.size();
        boolean boolean47 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver8);
        boolean boolean49 = hashSetTestDriver0.equals_CUT((java.lang.Object) false);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean52 = hashSetTestDriver50.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj54 = hashSetTestDriver50.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator55 = hashSetTestDriver50.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean58 = hashSetTestDriver56.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj60 = hashSetTestDriver56.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator61 = hashSetTestDriver56.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        boolean boolean64 = hashSetTestDriver62.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator65 = hashSetTestDriver62.iterator();
        java.lang.Object obj66 = hashSetTestDriver56.getMatch((java.lang.Object) iterator65);
        hashSetTestDriver56.clear();
        boolean boolean68 = hashSetTestDriver50.contains((java.lang.Object) hashSetTestDriver56);
        hashSetTestDriver56.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver70 = new experiment.util.HashSetTestDriver();
        boolean boolean72 = hashSetTestDriver70.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj74 = hashSetTestDriver70.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray75 = hashSetTestDriver70.toArray();
        boolean boolean76 = hashSetTestDriver56.add((java.lang.Object) hashSetTestDriver70);
        boolean boolean77 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver56);
        experiment.util.HashSetTestDriver hashSetTestDriver78 = new experiment.util.HashSetTestDriver();
        boolean boolean80 = hashSetTestDriver78.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj82 = hashSetTestDriver78.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator83 = hashSetTestDriver78.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver84 = new experiment.util.HashSetTestDriver();
        boolean boolean86 = hashSetTestDriver84.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator87 = hashSetTestDriver84.iterator();
        java.lang.Object obj88 = hashSetTestDriver78.getMatch((java.lang.Object) iterator87);
        experiment.util.HashSetTestDriver hashSetTestDriver89 = new experiment.util.HashSetTestDriver();
        boolean boolean91 = hashSetTestDriver89.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator92 = hashSetTestDriver89.iterator();
        boolean boolean93 = hashSetTestDriver89.isEmpty();
        boolean boolean94 = hashSetTestDriver78.remove((java.lang.Object) boolean93);
        experiment.util.HashSetTestDriver hashSetTestDriver95 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator96 = hashSetTestDriver95.iterator();
        boolean boolean97 = hashSetTestDriver78.equals_CUT((java.lang.Object) iterator96);
        experiment.util.Iterator iterator98 = hashSetTestDriver78.iterator();
        boolean boolean99 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(iterator83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(iterator87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(iterator96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(iterator98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test122");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = hashSetTestDriver6.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        java.lang.Object obj16 = hashSetTestDriver6.getMatch((java.lang.Object) iterator15);
        hashSetTestDriver6.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = hashSetTestDriver19.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator24 = hashSetTestDriver19.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator28 = hashSetTestDriver25.iterator();
        java.lang.Object obj29 = hashSetTestDriver19.getMatch((java.lang.Object) iterator28);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator33 = hashSetTestDriver30.iterator();
        boolean boolean34 = hashSetTestDriver30.isEmpty();
        boolean boolean35 = hashSetTestDriver19.remove((java.lang.Object) boolean34);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator37 = hashSetTestDriver36.iterator();
        boolean boolean38 = hashSetTestDriver19.equals_CUT((java.lang.Object) iterator37);
        boolean boolean39 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver19);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver40.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj44 = hashSetTestDriver40.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator45 = hashSetTestDriver40.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        boolean boolean48 = hashSetTestDriver46.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator49 = hashSetTestDriver46.iterator();
        java.lang.Object obj50 = hashSetTestDriver40.getMatch((java.lang.Object) iterator49);
        hashSetTestDriver40.clear();
        boolean boolean52 = hashSetTestDriver19.add((java.lang.Object) hashSetTestDriver40);
        boolean boolean53 = hashSetTestDriver19.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        boolean boolean56 = hashSetTestDriver54.remove((java.lang.Object) (byte) 10);
        boolean boolean58 = hashSetTestDriver54.equals_CUT((java.lang.Object) (-1.0f));
        int int59 = hashSetTestDriver54.size();
        boolean boolean60 = hashSetTestDriver19.contains((java.lang.Object) int59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test123");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        java.lang.Object[] objArray15 = hashSetTestDriver12.toArray();
        java.lang.Object obj16 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.remove((java.lang.Object) (byte) 10);
        boolean boolean21 = hashSetTestDriver17.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj26 = hashSetTestDriver22.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj28 = hashSetTestDriver22.getMatch((java.lang.Object) 10);
        boolean boolean29 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver22);
        int int30 = hashSetTestDriver17.size();
        java.lang.Object[] objArray31 = hashSetTestDriver17.toArray();
        java.lang.Object[] objArray32 = hashSetTestDriver17.toArray();
        boolean boolean33 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver17);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean39 = hashSetTestDriver37.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator40 = hashSetTestDriver37.iterator();
        boolean boolean41 = hashSetTestDriver34.remove((java.lang.Object) hashSetTestDriver37);
        boolean boolean42 = hashSetTestDriver17.contains((java.lang.Object) boolean41);
        experiment.util.Iterator iterator43 = hashSetTestDriver17.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator43);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test124");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator13 = hashSetTestDriver8.iterator();
        boolean boolean14 = hashSetTestDriver8.isEmpty();
        java.lang.Object obj15 = hashSetTestDriver0.getMatch((java.lang.Object) boolean14);
        java.lang.Object[] objArray16 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass17 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test125");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        java.lang.Object obj18 = hashSetTestDriver12.getMatch((java.lang.Object) 0.0f);
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        boolean boolean20 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        int int25 = hashSetTestDriver21.size();
        boolean boolean26 = hashSetTestDriver0.equals_CUT((java.lang.Object) int25);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test126");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = hashSetTestDriver5.getMatch((java.lang.Object) 10);
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver5);
        int int13 = hashSetTestDriver0.size();
        java.lang.Object[] objArray14 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator15 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass16 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test127");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator6 = hashSetTestDriver3.iterator();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = hashSetTestDriver8.getMatch((java.lang.Object) 10);
        java.lang.Object obj16 = hashSetTestDriver8.getMatch((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = hashSetTestDriver17.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator22 = hashSetTestDriver17.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = hashSetTestDriver23.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator28 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver29.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator32 = hashSetTestDriver29.iterator();
        java.lang.Object obj33 = hashSetTestDriver23.getMatch((java.lang.Object) iterator32);
        hashSetTestDriver23.clear();
        boolean boolean35 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver23);
        boolean boolean36 = hashSetTestDriver8.contains((java.lang.Object) boolean35);
        int int37 = hashSetTestDriver8.size();
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = hashSetTestDriver38.add((java.lang.Object) 10.0d);
        java.lang.Object obj44 = hashSetTestDriver38.getMatch((java.lang.Object) 0.0f);
        java.lang.Object obj45 = hashSetTestDriver8.getMatch((java.lang.Object) hashSetTestDriver38);
        int int46 = hashSetTestDriver8.size();
        boolean boolean47 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver8);
        boolean boolean48 = hashSetTestDriver8.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        boolean boolean51 = hashSetTestDriver49.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = hashSetTestDriver49.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator54 = hashSetTestDriver49.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver55.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator58 = hashSetTestDriver55.iterator();
        java.lang.Object obj59 = hashSetTestDriver49.getMatch((java.lang.Object) iterator58);
        java.lang.Object obj61 = hashSetTestDriver49.getMatch((java.lang.Object) 0);
        hashSetTestDriver49.clear();
        boolean boolean63 = hashSetTestDriver49.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        boolean boolean66 = hashSetTestDriver64.remove((java.lang.Object) (byte) 10);
        boolean boolean68 = hashSetTestDriver64.add((java.lang.Object) 10.0d);
        java.lang.Object obj70 = hashSetTestDriver64.getMatch((java.lang.Object) (short) -1);
        boolean boolean72 = hashSetTestDriver64.contains((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator73 = hashSetTestDriver64.iterator();
        java.lang.Class<?> wildcardClass74 = iterator73.getClass();
        boolean boolean75 = hashSetTestDriver49.remove((java.lang.Object) wildcardClass74);
        boolean boolean76 = hashSetTestDriver8.remove((java.lang.Object) wildcardClass74);
        experiment.util.Iterator iterator77 = hashSetTestDriver8.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterator77);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1264048269_1024_0.test128");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.equals_CUT((java.lang.Object) 0);
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 10.0d);
        boolean boolean17 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver12);
        experiment.util.Iterator iterator18 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
    }

}
