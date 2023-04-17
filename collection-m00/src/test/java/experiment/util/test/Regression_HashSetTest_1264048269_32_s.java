package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1264048269_32_s {

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

}
