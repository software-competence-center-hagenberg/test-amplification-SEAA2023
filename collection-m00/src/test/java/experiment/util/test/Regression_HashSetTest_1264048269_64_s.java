package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1264048269_64_s {

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

}
