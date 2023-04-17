package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_54676380_32_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass2 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = hashSetTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver4.getClass();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) wildcardClass7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray12 = hashSetTestDriver9.toArray();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver9);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = hashSetTestDriver9.add(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        boolean boolean10 = hashSetTestDriver4.add((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray9 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass13 = hashSetTestDriver10.getClass();
        boolean boolean14 = hashSetTestDriver6.equals_CUT((java.lang.Object) wildcardClass13);
        boolean boolean15 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray19 = hashSetTestDriver16.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass23 = hashSetTestDriver20.getClass();
        boolean boolean24 = hashSetTestDriver16.equals_CUT((java.lang.Object) wildcardClass23);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray28 = hashSetTestDriver25.toArray();
        boolean boolean29 = hashSetTestDriver16.add((java.lang.Object) hashSetTestDriver25);
        boolean boolean30 = hashSetTestDriver6.equals_CUT((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray11 = hashSetTestDriver8.toArray();
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        boolean boolean13 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        boolean boolean14 = hashSetTestDriver8.isEmpty();
        java.lang.Object[] objArray15 = hashSetTestDriver8.toArray();
        boolean boolean16 = hashSetTestDriver8.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        int int2 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray6 = hashSetTestDriver3.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass10 = hashSetTestDriver7.getClass();
        boolean boolean11 = hashSetTestDriver3.equals_CUT((java.lang.Object) wildcardClass10);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray15 = hashSetTestDriver12.toArray();
        boolean boolean16 = hashSetTestDriver3.add((java.lang.Object) hashSetTestDriver12);
        java.lang.Object[] objArray17 = hashSetTestDriver12.toArray();
        boolean boolean18 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.remove((java.lang.Object) 1L);
        int int22 = hashSetTestDriver19.size();
        java.lang.Object obj24 = hashSetTestDriver19.getMatch((java.lang.Object) 0.0f);
        boolean boolean26 = hashSetTestDriver19.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray30 = hashSetTestDriver27.toArray();
        boolean boolean31 = hashSetTestDriver27.isEmpty();
        boolean boolean32 = hashSetTestDriver19.contains((java.lang.Object) hashSetTestDriver27);
        boolean boolean33 = hashSetTestDriver27.isEmpty();
        java.lang.Object[] objArray34 = hashSetTestDriver27.toArray();
        boolean boolean35 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver36.remove((java.lang.Object) 1L);
        int int39 = hashSetTestDriver36.size();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver40.remove((java.lang.Object) 1L);
        hashSetTestDriver40.clear();
        boolean boolean44 = hashSetTestDriver36.equals_CUT((java.lang.Object) hashSetTestDriver40);
        boolean boolean46 = hashSetTestDriver40.remove((java.lang.Object) 1);
        boolean boolean47 = hashSetTestDriver0.remove((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray9 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass13 = hashSetTestDriver10.getClass();
        boolean boolean14 = hashSetTestDriver6.equals_CUT((java.lang.Object) wildcardClass13);
        boolean boolean15 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver16.isEmpty();
        hashSetTestDriver16.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray22 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass26 = hashSetTestDriver23.getClass();
        boolean boolean27 = hashSetTestDriver19.equals_CUT((java.lang.Object) wildcardClass26);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray31 = hashSetTestDriver28.toArray();
        boolean boolean32 = hashSetTestDriver19.add((java.lang.Object) hashSetTestDriver28);
        java.lang.Object[] objArray33 = hashSetTestDriver28.toArray();
        java.lang.Object obj34 = hashSetTestDriver16.getMatch((java.lang.Object) objArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = hashSetTestDriver0.getMatch(obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver4.getClass();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) wildcardClass7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray12 = hashSetTestDriver9.toArray();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver9);
        boolean boolean15 = hashSetTestDriver9.equals_CUT((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass16 = hashSetTestDriver9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray11 = hashSetTestDriver8.toArray();
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        boolean boolean13 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray17 = hashSetTestDriver14.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray19 = hashSetTestDriver18.toArray();
        boolean boolean21 = hashSetTestDriver18.contains((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass22 = hashSetTestDriver18.getClass();
        boolean boolean23 = hashSetTestDriver14.equals_CUT((java.lang.Object) wildcardClass22);
        boolean boolean24 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver14);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.remove((java.lang.Object) 1L);
        hashSetTestDriver25.clear();
        boolean boolean30 = hashSetTestDriver25.equals_CUT((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        boolean boolean33 = hashSetTestDriver25.add((java.lang.Object) objArray32);
        boolean boolean34 = hashSetTestDriver0.contains((java.lang.Object) boolean33);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver4.getClass();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) wildcardClass7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray12 = hashSetTestDriver9.toArray();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver9);
        java.lang.Object[] objArray14 = hashSetTestDriver9.toArray();
        boolean boolean16 = hashSetTestDriver9.add((java.lang.Object) 100);
        hashSetTestDriver9.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray11 = hashSetTestDriver8.toArray();
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        boolean boolean13 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        java.lang.Object[] objArray14 = hashSetTestDriver8.toArray();
        int int15 = hashSetTestDriver8.size();
        java.lang.Class<?> wildcardClass16 = hashSetTestDriver8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator10 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass11 = iterator10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.equals_CUT((java.lang.Object) '#');
        int int12 = hashSetTestDriver9.size();
        boolean boolean13 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver9);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = hashSetTestDriver9.remove(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test018");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) 1L);
        int int12 = hashSetTestDriver9.size();
        java.lang.Object obj14 = hashSetTestDriver9.getMatch((java.lang.Object) 0.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray18 = hashSetTestDriver15.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass22 = hashSetTestDriver19.getClass();
        boolean boolean23 = hashSetTestDriver15.equals_CUT((java.lang.Object) wildcardClass22);
        boolean boolean24 = hashSetTestDriver9.contains((java.lang.Object) hashSetTestDriver15);
        boolean boolean25 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver15);
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = hashSetTestDriver15.equals_CUT(obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        int int4 = hashSetTestDriver0.size();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = hashSetTestDriver0.contains(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test020");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver4.getClass();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) wildcardClass7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray12 = hashSetTestDriver9.toArray();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver9);
        hashSetTestDriver9.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) (short) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray13 = hashSetTestDriver10.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass17 = hashSetTestDriver14.getClass();
        boolean boolean18 = hashSetTestDriver10.equals_CUT((java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) boolean18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test022");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        hashSetTestDriver0.clear();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) objArray7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray12 = hashSetTestDriver9.toArray();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) objArray12);
        java.lang.Class<?> wildcardClass14 = objArray12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test023");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        boolean boolean10 = hashSetTestDriver0.remove((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) 1L);
        int int14 = hashSetTestDriver11.size();
        java.lang.Object obj16 = hashSetTestDriver11.getMatch((java.lang.Object) 0.0f);
        boolean boolean18 = hashSetTestDriver11.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean19 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver20.isEmpty();
        int int22 = hashSetTestDriver20.size();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray26 = hashSetTestDriver23.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass30 = hashSetTestDriver27.getClass();
        boolean boolean31 = hashSetTestDriver23.equals_CUT((java.lang.Object) wildcardClass30);
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        boolean boolean34 = hashSetTestDriver32.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray35 = hashSetTestDriver32.toArray();
        boolean boolean36 = hashSetTestDriver23.add((java.lang.Object) hashSetTestDriver32);
        java.lang.Object[] objArray37 = hashSetTestDriver32.toArray();
        boolean boolean38 = hashSetTestDriver20.equals_CUT((java.lang.Object) hashSetTestDriver32);
        hashSetTestDriver20.clear();
        boolean boolean40 = hashSetTestDriver11.equals_CUT((java.lang.Object) hashSetTestDriver20);
        int int41 = hashSetTestDriver20.size();
        experiment.util.Iterator iterator42 = hashSetTestDriver20.iterator();
        hashSetTestDriver20.clear();
        java.lang.Object obj44 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = hashSetTestDriver20.remove(obj44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(iterator42);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test024");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver4.getClass();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        boolean boolean10 = hashSetTestDriver0.remove((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) 1L);
        int int14 = hashSetTestDriver11.size();
        java.lang.Object obj16 = hashSetTestDriver11.getMatch((java.lang.Object) 0.0f);
        boolean boolean18 = hashSetTestDriver11.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean19 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver20.isEmpty();
        int int22 = hashSetTestDriver20.size();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray26 = hashSetTestDriver23.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass30 = hashSetTestDriver27.getClass();
        boolean boolean31 = hashSetTestDriver23.equals_CUT((java.lang.Object) wildcardClass30);
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        boolean boolean34 = hashSetTestDriver32.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray35 = hashSetTestDriver32.toArray();
        boolean boolean36 = hashSetTestDriver23.add((java.lang.Object) hashSetTestDriver32);
        java.lang.Object[] objArray37 = hashSetTestDriver32.toArray();
        boolean boolean38 = hashSetTestDriver20.equals_CUT((java.lang.Object) hashSetTestDriver32);
        hashSetTestDriver20.clear();
        boolean boolean40 = hashSetTestDriver11.equals_CUT((java.lang.Object) hashSetTestDriver20);
        int int41 = hashSetTestDriver20.size();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray45 = hashSetTestDriver42.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        boolean boolean48 = hashSetTestDriver46.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass49 = hashSetTestDriver46.getClass();
        boolean boolean50 = hashSetTestDriver42.equals_CUT((java.lang.Object) wildcardClass49);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        boolean boolean53 = hashSetTestDriver51.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray54 = hashSetTestDriver51.toArray();
        boolean boolean55 = hashSetTestDriver42.add((java.lang.Object) hashSetTestDriver51);
        boolean boolean57 = hashSetTestDriver51.contains((java.lang.Object) '#');
        boolean boolean59 = hashSetTestDriver51.add((java.lang.Object) 10.0f);
        boolean boolean60 = hashSetTestDriver51.isEmpty();
        boolean boolean61 = hashSetTestDriver51.isEmpty();
        java.lang.Object obj63 = hashSetTestDriver51.getMatch((java.lang.Object) (byte) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        boolean boolean66 = hashSetTestDriver64.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray67 = hashSetTestDriver64.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver68 = new experiment.util.HashSetTestDriver();
        boolean boolean70 = hashSetTestDriver68.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass71 = hashSetTestDriver68.getClass();
        boolean boolean72 = hashSetTestDriver64.equals_CUT((java.lang.Object) wildcardClass71);
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        boolean boolean75 = hashSetTestDriver73.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray76 = hashSetTestDriver73.toArray();
        boolean boolean77 = hashSetTestDriver64.add((java.lang.Object) hashSetTestDriver73);
        int int78 = hashSetTestDriver64.size();
        java.lang.Object[] objArray79 = hashSetTestDriver64.toArray();
        boolean boolean80 = hashSetTestDriver51.remove((java.lang.Object) objArray79);
        java.lang.Object obj81 = hashSetTestDriver20.getMatch((java.lang.Object) objArray79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray13 = hashSetTestDriver10.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass17 = hashSetTestDriver14.getClass();
        boolean boolean18 = hashSetTestDriver10.equals_CUT((java.lang.Object) wildcardClass17);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray22 = hashSetTestDriver19.toArray();
        boolean boolean23 = hashSetTestDriver10.add((java.lang.Object) hashSetTestDriver19);
        boolean boolean25 = hashSetTestDriver19.contains((java.lang.Object) '#');
        boolean boolean27 = hashSetTestDriver19.add((java.lang.Object) 10.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray31 = hashSetTestDriver28.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray33 = hashSetTestDriver32.toArray();
        boolean boolean35 = hashSetTestDriver32.contains((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass36 = hashSetTestDriver32.getClass();
        boolean boolean37 = hashSetTestDriver28.equals_CUT((java.lang.Object) wildcardClass36);
        boolean boolean38 = hashSetTestDriver19.equals_CUT((java.lang.Object) boolean37);
        boolean boolean40 = hashSetTestDriver19.equals_CUT((java.lang.Object) "hi!");
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.remove((java.lang.Object) 1L);
        int int44 = hashSetTestDriver41.size();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver45.remove((java.lang.Object) 1L);
        hashSetTestDriver45.clear();
        boolean boolean49 = hashSetTestDriver41.equals_CUT((java.lang.Object) hashSetTestDriver45);
        boolean boolean51 = hashSetTestDriver41.remove((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        boolean boolean54 = hashSetTestDriver52.remove((java.lang.Object) 1L);
        int int55 = hashSetTestDriver52.size();
        java.lang.Object obj57 = hashSetTestDriver52.getMatch((java.lang.Object) 0.0f);
        boolean boolean59 = hashSetTestDriver52.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean60 = hashSetTestDriver41.remove((java.lang.Object) hashSetTestDriver52);
        boolean boolean61 = hashSetTestDriver19.remove((java.lang.Object) hashSetTestDriver52);
        boolean boolean62 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver19);
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        boolean boolean65 = hashSetTestDriver63.remove((java.lang.Object) 1L);
        int int66 = hashSetTestDriver63.size();
        java.lang.Object obj68 = hashSetTestDriver63.getMatch((java.lang.Object) 0.0f);
        boolean boolean70 = hashSetTestDriver63.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver71 = new experiment.util.HashSetTestDriver();
        boolean boolean73 = hashSetTestDriver71.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray74 = hashSetTestDriver71.toArray();
        boolean boolean75 = hashSetTestDriver71.isEmpty();
        boolean boolean76 = hashSetTestDriver63.contains((java.lang.Object) hashSetTestDriver71);
        boolean boolean77 = hashSetTestDriver71.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver78 = new experiment.util.HashSetTestDriver();
        boolean boolean80 = hashSetTestDriver78.remove((java.lang.Object) 1L);
        int int81 = hashSetTestDriver78.size();
        experiment.util.HashSetTestDriver hashSetTestDriver82 = new experiment.util.HashSetTestDriver();
        boolean boolean84 = hashSetTestDriver82.remove((java.lang.Object) 1L);
        hashSetTestDriver82.clear();
        boolean boolean86 = hashSetTestDriver78.equals_CUT((java.lang.Object) hashSetTestDriver82);
        boolean boolean87 = hashSetTestDriver78.isEmpty();
        boolean boolean88 = hashSetTestDriver71.equals_CUT((java.lang.Object) boolean87);
        hashSetTestDriver71.clear();
        boolean boolean90 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver71);
        experiment.util.Iterator iterator91 = hashSetTestDriver71.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(iterator91);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.remove((java.lang.Object) 1L);
        hashSetTestDriver4.clear();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver4);
        boolean boolean10 = hashSetTestDriver0.remove((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray14 = hashSetTestDriver11.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass18 = hashSetTestDriver15.getClass();
        boolean boolean19 = hashSetTestDriver11.equals_CUT((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = hashSetTestDriver0.getMatch((java.lang.Object) wildcardClass18);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) 1L);
        int int24 = hashSetTestDriver21.size();
        boolean boolean25 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver21);
        boolean boolean26 = hashSetTestDriver21.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver27.isEmpty();
        int int29 = hashSetTestDriver27.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray33 = hashSetTestDriver30.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass37 = hashSetTestDriver34.getClass();
        boolean boolean38 = hashSetTestDriver30.equals_CUT((java.lang.Object) wildcardClass37);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray42 = hashSetTestDriver39.toArray();
        boolean boolean43 = hashSetTestDriver30.add((java.lang.Object) hashSetTestDriver39);
        java.lang.Object[] objArray44 = hashSetTestDriver39.toArray();
        boolean boolean45 = hashSetTestDriver27.equals_CUT((java.lang.Object) hashSetTestDriver39);
        experiment.util.Iterator iterator46 = hashSetTestDriver39.iterator();
        boolean boolean47 = hashSetTestDriver21.equals_CUT((java.lang.Object) iterator46);
        int int48 = hashSetTestDriver21.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray11 = hashSetTestDriver8.toArray();
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        boolean boolean13 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        java.lang.Object[] objArray14 = hashSetTestDriver8.toArray();
        java.lang.Class<?> wildcardClass15 = hashSetTestDriver8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) ' ');
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) 1L);
        int int8 = hashSetTestDriver5.size();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) 1L);
        hashSetTestDriver9.clear();
        boolean boolean13 = hashSetTestDriver5.equals_CUT((java.lang.Object) hashSetTestDriver9);
        boolean boolean14 = hashSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator15 = hashSetTestDriver5.iterator();
        boolean boolean16 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator15);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver17.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.contains((java.lang.Object) 1L);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray25 = hashSetTestDriver22.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray27 = hashSetTestDriver26.toArray();
        boolean boolean29 = hashSetTestDriver26.contains((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass30 = hashSetTestDriver26.getClass();
        boolean boolean31 = hashSetTestDriver22.equals_CUT((java.lang.Object) wildcardClass30);
        boolean boolean32 = hashSetTestDriver19.add((java.lang.Object) boolean31);
        boolean boolean33 = hashSetTestDriver19.isEmpty();
        boolean boolean34 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver19);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver35.contains((java.lang.Object) 1L);
        boolean boolean38 = hashSetTestDriver35.isEmpty();
        hashSetTestDriver35.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver40.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray43 = hashSetTestDriver40.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        boolean boolean46 = hashSetTestDriver44.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass47 = hashSetTestDriver44.getClass();
        boolean boolean48 = hashSetTestDriver40.equals_CUT((java.lang.Object) wildcardClass47);
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        boolean boolean51 = hashSetTestDriver49.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray52 = hashSetTestDriver49.toArray();
        boolean boolean53 = hashSetTestDriver40.add((java.lang.Object) hashSetTestDriver49);
        boolean boolean55 = hashSetTestDriver49.contains((java.lang.Object) '#');
        boolean boolean57 = hashSetTestDriver49.add((java.lang.Object) 10.0f);
        experiment.util.Iterator iterator58 = hashSetTestDriver49.iterator();
        java.lang.Object obj59 = hashSetTestDriver35.getMatch((java.lang.Object) hashSetTestDriver49);
        experiment.util.HashSetTestDriver hashSetTestDriver60 = new experiment.util.HashSetTestDriver();
        boolean boolean62 = hashSetTestDriver60.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray63 = hashSetTestDriver60.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        boolean boolean66 = hashSetTestDriver64.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass67 = hashSetTestDriver64.getClass();
        boolean boolean68 = hashSetTestDriver60.equals_CUT((java.lang.Object) wildcardClass67);
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        boolean boolean71 = hashSetTestDriver69.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray72 = hashSetTestDriver69.toArray();
        boolean boolean73 = hashSetTestDriver60.add((java.lang.Object) hashSetTestDriver69);
        experiment.util.HashSetTestDriver hashSetTestDriver74 = new experiment.util.HashSetTestDriver();
        boolean boolean76 = hashSetTestDriver74.remove((java.lang.Object) 1L);
        int int77 = hashSetTestDriver74.size();
        java.lang.Object obj79 = hashSetTestDriver74.getMatch((java.lang.Object) 0.0f);
        boolean boolean80 = hashSetTestDriver60.add((java.lang.Object) 0.0f);
        boolean boolean81 = hashSetTestDriver35.add((java.lang.Object) boolean80);
        boolean boolean83 = hashSetTestDriver35.equals_CUT((java.lang.Object) (byte) -1);
        boolean boolean84 = hashSetTestDriver17.equals_CUT((java.lang.Object) boolean83);
        java.lang.Object[] objArray85 = hashSetTestDriver17.toArray();
        boolean boolean87 = hashSetTestDriver17.remove((java.lang.Object) 100.0d);
        boolean boolean88 = hashSetTestDriver0.add((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test030");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        hashSetTestDriver0.clear();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) objArray7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray12 = hashSetTestDriver9.toArray();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) objArray12);
        java.lang.Object obj15 = hashSetTestDriver0.getMatch((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.remove((java.lang.Object) 1L);
        int int19 = hashSetTestDriver16.size();
        java.lang.Object obj21 = hashSetTestDriver16.getMatch((java.lang.Object) 0.0f);
        boolean boolean23 = hashSetTestDriver16.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray27 = hashSetTestDriver24.toArray();
        boolean boolean28 = hashSetTestDriver24.isEmpty();
        boolean boolean29 = hashSetTestDriver16.contains((java.lang.Object) hashSetTestDriver24);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray33 = hashSetTestDriver30.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray35 = hashSetTestDriver34.toArray();
        boolean boolean37 = hashSetTestDriver34.contains((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass38 = hashSetTestDriver34.getClass();
        boolean boolean39 = hashSetTestDriver30.equals_CUT((java.lang.Object) wildcardClass38);
        boolean boolean40 = hashSetTestDriver16.contains((java.lang.Object) hashSetTestDriver30);
        hashSetTestDriver16.clear();
        boolean boolean42 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver16);
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        boolean boolean45 = hashSetTestDriver43.remove((java.lang.Object) 1L);
        int int46 = hashSetTestDriver43.size();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.remove((java.lang.Object) 1L);
        hashSetTestDriver47.clear();
        boolean boolean51 = hashSetTestDriver43.equals_CUT((java.lang.Object) hashSetTestDriver47);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        boolean boolean54 = hashSetTestDriver52.remove((java.lang.Object) 1L);
        int int55 = hashSetTestDriver52.size();
        java.lang.Object obj57 = hashSetTestDriver52.getMatch((java.lang.Object) 0.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        boolean boolean60 = hashSetTestDriver58.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray61 = hashSetTestDriver58.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        boolean boolean64 = hashSetTestDriver62.contains((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass65 = hashSetTestDriver62.getClass();
        boolean boolean66 = hashSetTestDriver58.equals_CUT((java.lang.Object) wildcardClass65);
        boolean boolean67 = hashSetTestDriver52.contains((java.lang.Object) hashSetTestDriver58);
        boolean boolean68 = hashSetTestDriver43.equals_CUT((java.lang.Object) hashSetTestDriver58);
        boolean boolean69 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver58);
        experiment.util.HashSetTestDriver hashSetTestDriver70 = new experiment.util.HashSetTestDriver();
        boolean boolean72 = hashSetTestDriver70.equals_CUT((java.lang.Object) '#');
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        boolean boolean75 = hashSetTestDriver73.remove((java.lang.Object) 1L);
        int int76 = hashSetTestDriver73.size();
        java.lang.Object obj78 = hashSetTestDriver73.getMatch((java.lang.Object) 0.0f);
        boolean boolean80 = hashSetTestDriver73.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver81 = new experiment.util.HashSetTestDriver();
        boolean boolean83 = hashSetTestDriver81.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray84 = hashSetTestDriver81.toArray();
        boolean boolean85 = hashSetTestDriver81.isEmpty();
        boolean boolean86 = hashSetTestDriver73.contains((java.lang.Object) hashSetTestDriver81);
        boolean boolean87 = hashSetTestDriver81.isEmpty();
        hashSetTestDriver81.clear();
        boolean boolean89 = hashSetTestDriver70.add((java.lang.Object) hashSetTestDriver81);
        boolean boolean90 = hashSetTestDriver58.remove((java.lang.Object) boolean89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 1L);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) 1L);
        int int6 = hashSetTestDriver3.size();
        java.lang.Object obj8 = hashSetTestDriver3.getMatch((java.lang.Object) 0.0f);
        boolean boolean10 = hashSetTestDriver3.contains((java.lang.Object) '#');
        boolean boolean11 = hashSetTestDriver0.add((java.lang.Object) '#');
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) 1L);
        int int15 = hashSetTestDriver12.size();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.remove((java.lang.Object) 1L);
        hashSetTestDriver16.clear();
        boolean boolean20 = hashSetTestDriver12.equals_CUT((java.lang.Object) hashSetTestDriver16);
        boolean boolean22 = hashSetTestDriver12.remove((java.lang.Object) 0L);
        boolean boolean23 = hashSetTestDriver12.isEmpty();
        boolean boolean25 = hashSetTestDriver12.add((java.lang.Object) 100L);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.remove((java.lang.Object) 1L);
        int int29 = hashSetTestDriver26.size();
        java.lang.Object obj31 = hashSetTestDriver26.getMatch((java.lang.Object) 0.0f);
        boolean boolean33 = hashSetTestDriver26.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray37 = hashSetTestDriver34.toArray();
        boolean boolean38 = hashSetTestDriver34.isEmpty();
        boolean boolean39 = hashSetTestDriver26.contains((java.lang.Object) hashSetTestDriver34);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver40.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray43 = hashSetTestDriver40.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray45 = hashSetTestDriver44.toArray();
        boolean boolean47 = hashSetTestDriver44.contains((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass48 = hashSetTestDriver44.getClass();
        boolean boolean49 = hashSetTestDriver40.equals_CUT((java.lang.Object) wildcardClass48);
        boolean boolean50 = hashSetTestDriver26.contains((java.lang.Object) hashSetTestDriver40);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        boolean boolean53 = hashSetTestDriver51.remove((java.lang.Object) 1L);
        hashSetTestDriver51.clear();
        boolean boolean56 = hashSetTestDriver51.equals_CUT((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray58 = hashSetTestDriver57.toArray();
        boolean boolean59 = hashSetTestDriver51.add((java.lang.Object) objArray58);
        boolean boolean60 = hashSetTestDriver26.contains((java.lang.Object) boolean59);
        java.lang.Class<?> wildcardClass61 = hashSetTestDriver26.getClass();
        boolean boolean62 = hashSetTestDriver12.contains((java.lang.Object) wildcardClass61);
        boolean boolean63 = hashSetTestDriver0.remove((java.lang.Object) wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_54676380_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 0.0f);
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray11 = hashSetTestDriver8.toArray();
        boolean boolean12 = hashSetTestDriver8.isEmpty();
        boolean boolean13 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.contains((java.lang.Object) 1L);
        java.lang.Object[] objArray17 = hashSetTestDriver14.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray19 = hashSetTestDriver18.toArray();
        boolean boolean21 = hashSetTestDriver18.contains((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass22 = hashSetTestDriver18.getClass();
        boolean boolean23 = hashSetTestDriver14.equals_CUT((java.lang.Object) wildcardClass22);
        boolean boolean24 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver14);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.remove((java.lang.Object) 1L);
        int int28 = hashSetTestDriver25.size();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver29.remove((java.lang.Object) 1L);
        hashSetTestDriver29.clear();
        boolean boolean33 = hashSetTestDriver25.equals_CUT((java.lang.Object) hashSetTestDriver29);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.equals_CUT((java.lang.Object) '#');
        int int37 = hashSetTestDriver34.size();
        boolean boolean38 = hashSetTestDriver25.equals_CUT((java.lang.Object) hashSetTestDriver34);
        boolean boolean39 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver34);
        java.lang.Class<?> wildcardClass40 = hashSetTestDriver34.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

}
