package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_939145594_32_s {

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

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver3);
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test018");
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
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver13.isEmpty();
        experiment.util.Iterator iterator15 = hashSetTestDriver13.iterator();
        hashSetTestDriver13.clear();
        boolean boolean17 = hashSetTestDriver3.equals_CUT((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.add((java.lang.Object) 100);
        boolean boolean22 = hashSetTestDriver18.remove((java.lang.Object) 0);
        boolean boolean24 = hashSetTestDriver18.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator25 = hashSetTestDriver18.iterator();
        boolean boolean26 = hashSetTestDriver13.remove((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver27.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver29.isEmpty();
        experiment.util.Iterator iterator31 = hashSetTestDriver29.iterator();
        boolean boolean33 = hashSetTestDriver29.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean34 = hashSetTestDriver29.isEmpty();
        boolean boolean35 = hashSetTestDriver27.equals_CUT((java.lang.Object) hashSetTestDriver29);
        boolean boolean36 = hashSetTestDriver13.remove((java.lang.Object) boolean35);
        java.lang.Class<?> wildcardClass37 = hashSetTestDriver13.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        boolean boolean5 = hashSetTestDriver0.contains((java.lang.Object) (short) 1);
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test020");
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
        boolean boolean20 = hashSetTestDriver18.add((java.lang.Object) 100);
        boolean boolean21 = hashSetTestDriver18.isEmpty();
        hashSetTestDriver18.clear();
        boolean boolean23 = hashSetTestDriver12.equals_CUT((java.lang.Object) hashSetTestDriver18);
        boolean boolean25 = hashSetTestDriver12.equals_CUT((java.lang.Object) (-1L));
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver26.contains((java.lang.Object) hashSetTestDriver29);
        boolean boolean32 = hashSetTestDriver26.contains((java.lang.Object) (byte) 1);
        boolean boolean33 = hashSetTestDriver12.add((java.lang.Object) boolean32);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver34.contains((java.lang.Object) hashSetTestDriver37);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.remove((java.lang.Object) (byte) -1);
        boolean boolean43 = hashSetTestDriver39.add((java.lang.Object) 1);
        int int44 = hashSetTestDriver39.size();
        boolean boolean45 = hashSetTestDriver37.remove((java.lang.Object) hashSetTestDriver39);
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean48 = hashSetTestDriver47.isEmpty();
        experiment.util.Iterator iterator49 = hashSetTestDriver47.iterator();
        boolean boolean50 = hashSetTestDriver46.contains((java.lang.Object) iterator49);
        boolean boolean51 = hashSetTestDriver39.add((java.lang.Object) hashSetTestDriver46);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        boolean boolean53 = hashSetTestDriver52.isEmpty();
        boolean boolean54 = hashSetTestDriver46.equals_CUT((java.lang.Object) hashSetTestDriver52);
        boolean boolean55 = hashSetTestDriver12.remove((java.lang.Object) hashSetTestDriver46);
        java.lang.Class<?> wildcardClass56 = hashSetTestDriver12.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.add((java.lang.Object) 100);
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test022");
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
        boolean boolean13 = hashSetTestDriver0.isEmpty();
        boolean boolean14 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass15 = hashSetTestDriver0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test023");
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
        boolean boolean20 = hashSetTestDriver18.add((java.lang.Object) 100);
        boolean boolean21 = hashSetTestDriver18.isEmpty();
        hashSetTestDriver18.clear();
        boolean boolean23 = hashSetTestDriver12.equals_CUT((java.lang.Object) hashSetTestDriver18);
        boolean boolean25 = hashSetTestDriver12.equals_CUT((java.lang.Object) (-1L));
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver26.contains((java.lang.Object) hashSetTestDriver29);
        boolean boolean32 = hashSetTestDriver26.contains((java.lang.Object) (byte) 1);
        boolean boolean33 = hashSetTestDriver12.add((java.lang.Object) boolean32);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver34.contains((java.lang.Object) hashSetTestDriver37);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.remove((java.lang.Object) (byte) -1);
        boolean boolean43 = hashSetTestDriver39.add((java.lang.Object) 1);
        int int44 = hashSetTestDriver39.size();
        boolean boolean45 = hashSetTestDriver37.remove((java.lang.Object) hashSetTestDriver39);
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean48 = hashSetTestDriver47.isEmpty();
        experiment.util.Iterator iterator49 = hashSetTestDriver47.iterator();
        boolean boolean50 = hashSetTestDriver46.contains((java.lang.Object) iterator49);
        boolean boolean51 = hashSetTestDriver39.add((java.lang.Object) hashSetTestDriver46);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        boolean boolean53 = hashSetTestDriver52.isEmpty();
        boolean boolean54 = hashSetTestDriver46.equals_CUT((java.lang.Object) hashSetTestDriver52);
        boolean boolean55 = hashSetTestDriver12.remove((java.lang.Object) hashSetTestDriver46);
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver56.isEmpty();
        experiment.util.Iterator iterator58 = hashSetTestDriver56.iterator();
        boolean boolean60 = hashSetTestDriver56.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean61 = hashSetTestDriver56.isEmpty();
        boolean boolean62 = hashSetTestDriver56.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        boolean boolean65 = hashSetTestDriver63.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver66 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver63.contains((java.lang.Object) hashSetTestDriver66);
        boolean boolean69 = hashSetTestDriver63.contains((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray70 = hashSetTestDriver63.toArray();
        java.lang.Object obj71 = hashSetTestDriver56.getMatch((java.lang.Object) objArray70);
        boolean boolean72 = hashSetTestDriver46.contains((java.lang.Object) hashSetTestDriver56);
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        boolean boolean75 = hashSetTestDriver73.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver76 = new experiment.util.HashSetTestDriver();
        boolean boolean77 = hashSetTestDriver73.contains((java.lang.Object) hashSetTestDriver76);
        boolean boolean78 = hashSetTestDriver56.add((java.lang.Object) boolean77);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test024");
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
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver21.contains((java.lang.Object) hashSetTestDriver24);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.remove((java.lang.Object) (byte) -1);
        boolean boolean30 = hashSetTestDriver26.add((java.lang.Object) 1);
        int int31 = hashSetTestDriver26.size();
        boolean boolean32 = hashSetTestDriver24.remove((java.lang.Object) hashSetTestDriver26);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean35 = hashSetTestDriver34.isEmpty();
        experiment.util.Iterator iterator36 = hashSetTestDriver34.iterator();
        boolean boolean37 = hashSetTestDriver33.contains((java.lang.Object) iterator36);
        boolean boolean38 = hashSetTestDriver26.add((java.lang.Object) hashSetTestDriver33);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.add((java.lang.Object) 100);
        boolean boolean42 = hashSetTestDriver39.isEmpty();
        hashSetTestDriver39.clear();
        boolean boolean44 = hashSetTestDriver33.equals_CUT((java.lang.Object) hashSetTestDriver39);
        boolean boolean46 = hashSetTestDriver33.equals_CUT((java.lang.Object) (-1L));
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean51 = hashSetTestDriver47.contains((java.lang.Object) hashSetTestDriver50);
        boolean boolean53 = hashSetTestDriver47.contains((java.lang.Object) (byte) 1);
        boolean boolean54 = hashSetTestDriver33.add((java.lang.Object) boolean53);
        boolean boolean55 = hashSetTestDriver12.equals_CUT((java.lang.Object) boolean53);
        experiment.util.Iterator iterator56 = hashSetTestDriver12.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator56);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = hashSetTestDriver0.contains(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 1);
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) (short) 10);
        int int7 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = hashSetTestDriver9.iterator();
        boolean boolean12 = hashSetTestDriver8.contains((java.lang.Object) iterator11);
        experiment.util.Iterator iterator13 = hashSetTestDriver8.iterator();
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 1);
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) (short) 10);
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1L);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = hashSetTestDriver9.iterator();
        boolean boolean13 = hashSetTestDriver9.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver14.isEmpty();
        experiment.util.Iterator iterator16 = hashSetTestDriver14.iterator();
        boolean boolean18 = hashSetTestDriver14.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean19 = hashSetTestDriver9.contains((java.lang.Object) (byte) 100);
        boolean boolean20 = hashSetTestDriver9.isEmpty();
        java.lang.Object[] objArray21 = hashSetTestDriver9.toArray();
        boolean boolean22 = hashSetTestDriver9.isEmpty();
        boolean boolean23 = hashSetTestDriver0.remove((java.lang.Object) boolean22);
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass25 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) 1);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver3);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver6.isEmpty();
        experiment.util.Iterator iterator8 = hashSetTestDriver6.iterator();
        boolean boolean10 = hashSetTestDriver6.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = hashSetTestDriver11.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.remove((java.lang.Object) (byte) -1);
        boolean boolean21 = hashSetTestDriver17.add((java.lang.Object) 1);
        java.lang.Object obj22 = hashSetTestDriver14.getMatch((java.lang.Object) hashSetTestDriver17);
        boolean boolean23 = hashSetTestDriver11.remove((java.lang.Object) hashSetTestDriver14);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver24.isEmpty();
        experiment.util.Iterator iterator26 = hashSetTestDriver24.iterator();
        hashSetTestDriver24.clear();
        boolean boolean28 = hashSetTestDriver14.equals_CUT((java.lang.Object) hashSetTestDriver24);
        boolean boolean30 = hashSetTestDriver24.add((java.lang.Object) (-1.0f));
        boolean boolean31 = hashSetTestDriver6.remove((java.lang.Object) (-1.0f));
        boolean boolean32 = hashSetTestDriver0.remove((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test030");
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
        boolean boolean20 = hashSetTestDriver18.add((java.lang.Object) 100);
        boolean boolean21 = hashSetTestDriver18.isEmpty();
        hashSetTestDriver18.clear();
        boolean boolean23 = hashSetTestDriver12.equals_CUT((java.lang.Object) hashSetTestDriver18);
        boolean boolean25 = hashSetTestDriver12.equals_CUT((java.lang.Object) (-1L));
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver26.contains((java.lang.Object) hashSetTestDriver29);
        boolean boolean32 = hashSetTestDriver26.contains((java.lang.Object) (byte) 1);
        boolean boolean33 = hashSetTestDriver12.add((java.lang.Object) boolean32);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver34.contains((java.lang.Object) hashSetTestDriver37);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.remove((java.lang.Object) (byte) -1);
        boolean boolean43 = hashSetTestDriver39.add((java.lang.Object) 1);
        int int44 = hashSetTestDriver39.size();
        boolean boolean45 = hashSetTestDriver37.remove((java.lang.Object) hashSetTestDriver39);
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean48 = hashSetTestDriver47.isEmpty();
        experiment.util.Iterator iterator49 = hashSetTestDriver47.iterator();
        boolean boolean50 = hashSetTestDriver46.contains((java.lang.Object) iterator49);
        boolean boolean51 = hashSetTestDriver39.add((java.lang.Object) hashSetTestDriver46);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        boolean boolean53 = hashSetTestDriver52.isEmpty();
        boolean boolean54 = hashSetTestDriver46.equals_CUT((java.lang.Object) hashSetTestDriver52);
        boolean boolean55 = hashSetTestDriver12.remove((java.lang.Object) hashSetTestDriver46);
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver56.isEmpty();
        experiment.util.Iterator iterator58 = hashSetTestDriver56.iterator();
        boolean boolean60 = hashSetTestDriver56.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean61 = hashSetTestDriver56.isEmpty();
        boolean boolean62 = hashSetTestDriver56.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        boolean boolean65 = hashSetTestDriver63.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver66 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver63.contains((java.lang.Object) hashSetTestDriver66);
        boolean boolean69 = hashSetTestDriver63.contains((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray70 = hashSetTestDriver63.toArray();
        java.lang.Object obj71 = hashSetTestDriver56.getMatch((java.lang.Object) objArray70);
        boolean boolean72 = hashSetTestDriver46.contains((java.lang.Object) hashSetTestDriver56);
        java.lang.Class<?> wildcardClass73 = hashSetTestDriver56.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver3);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver6.isEmpty();
        java.lang.Object[] objArray8 = hashSetTestDriver6.toArray();
        hashSetTestDriver6.clear();
        boolean boolean10 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver11.isEmpty();
        experiment.util.Iterator iterator13 = hashSetTestDriver11.iterator();
        boolean boolean15 = hashSetTestDriver11.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver16.isEmpty();
        experiment.util.Iterator iterator18 = hashSetTestDriver16.iterator();
        boolean boolean20 = hashSetTestDriver16.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean21 = hashSetTestDriver11.contains((java.lang.Object) (byte) 100);
        boolean boolean23 = hashSetTestDriver11.add((java.lang.Object) (byte) 10);
        hashSetTestDriver11.clear();
        boolean boolean25 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver3);
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) (byte) 1);
        int int7 = hashSetTestDriver0.size();
        java.lang.Object[] objArray8 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.remove((java.lang.Object) (byte) -1);
        boolean boolean13 = hashSetTestDriver9.add((java.lang.Object) 1);
        boolean boolean14 = hashSetTestDriver0.contains((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

}
