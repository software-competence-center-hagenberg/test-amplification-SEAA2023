package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_939145594_16_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver3.add((java.lang.Object) 1);
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver3);
        java.lang.Class<?> wildcardClass9 = hashSetTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass5 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass3 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.add((java.lang.Object) 100);
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 0);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver3);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) -1);
        boolean boolean9 = hashSetTestDriver5.add((java.lang.Object) 1);
        int int10 = hashSetTestDriver5.size();
        boolean boolean11 = hashSetTestDriver3.remove((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver13.isEmpty();
        experiment.util.Iterator iterator15 = hashSetTestDriver13.iterator();
        boolean boolean16 = hashSetTestDriver12.contains((java.lang.Object) iterator15);
        boolean boolean17 = hashSetTestDriver5.add((java.lang.Object) hashSetTestDriver12);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = hashSetTestDriver12.add(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver3);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) -1);
        boolean boolean9 = hashSetTestDriver5.add((java.lang.Object) 1);
        int int10 = hashSetTestDriver5.size();
        boolean boolean11 = hashSetTestDriver3.remove((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver13.isEmpty();
        experiment.util.Iterator iterator15 = hashSetTestDriver13.iterator();
        boolean boolean16 = hashSetTestDriver12.contains((java.lang.Object) iterator15);
        boolean boolean17 = hashSetTestDriver5.add((java.lang.Object) hashSetTestDriver12);
        java.lang.Object[] objArray18 = hashSetTestDriver5.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) -1);
        boolean boolean10 = hashSetTestDriver6.add((java.lang.Object) 1);
        java.lang.Object obj11 = hashSetTestDriver3.getMatch((java.lang.Object) hashSetTestDriver6);
        boolean boolean12 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        java.lang.Class<?> wildcardClass13 = hashSetTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver3);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.remove((java.lang.Object) (byte) -1);
        boolean boolean9 = hashSetTestDriver5.add((java.lang.Object) 1);
        int int10 = hashSetTestDriver5.size();
        boolean boolean11 = hashSetTestDriver3.remove((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver13.isEmpty();
        experiment.util.Iterator iterator15 = hashSetTestDriver13.iterator();
        boolean boolean16 = hashSetTestDriver12.contains((java.lang.Object) iterator15);
        boolean boolean17 = hashSetTestDriver5.add((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver18.isEmpty();
        boolean boolean20 = hashSetTestDriver12.equals_CUT((java.lang.Object) hashSetTestDriver18);
        boolean boolean22 = hashSetTestDriver18.add((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass23 = hashSetTestDriver18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver5.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) (byte) 100);
        boolean boolean11 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass13 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.add((java.lang.Object) 100);
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        boolean boolean5 = hashSetTestDriver0.contains((java.lang.Object) (short) 1);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.remove((java.lang.Object) (byte) -1);
        boolean boolean10 = hashSetTestDriver6.add((java.lang.Object) 1);
        java.lang.Object obj11 = hashSetTestDriver3.getMatch((java.lang.Object) hashSetTestDriver6);
        boolean boolean12 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        int int13 = hashSetTestDriver3.size();
        experiment.util.Iterator iterator14 = hashSetTestDriver3.iterator();
        java.lang.Class<?> wildcardClass15 = hashSetTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) -1);
        int int12 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass13 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver5.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) (byte) 100);
        boolean boolean11 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass12 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        boolean boolean5 = hashSetTestDriver0.contains((java.lang.Object) (short) 1);
        java.lang.Object obj7 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
    }

}
