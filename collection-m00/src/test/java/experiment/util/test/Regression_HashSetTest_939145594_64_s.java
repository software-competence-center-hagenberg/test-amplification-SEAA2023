package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_939145594_64_s {

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

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test033");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver5.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) (byte) 100);
        boolean boolean12 = hashSetTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver13.isEmpty();
        experiment.util.Iterator iterator15 = hashSetTestDriver13.iterator();
        boolean boolean17 = hashSetTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean18 = hashSetTestDriver13.isEmpty();
        boolean boolean19 = hashSetTestDriver13.isEmpty();
        java.lang.Object[] objArray20 = hashSetTestDriver13.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) (byte) -1);
        boolean boolean24 = hashSetTestDriver13.equals_CUT((java.lang.Object) (byte) -1);
        int int25 = hashSetTestDriver13.size();
        hashSetTestDriver13.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver27.isEmpty();
        experiment.util.Iterator iterator29 = hashSetTestDriver27.iterator();
        boolean boolean31 = hashSetTestDriver27.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean32 = hashSetTestDriver27.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        boolean boolean34 = hashSetTestDriver33.isEmpty();
        experiment.util.Iterator iterator35 = hashSetTestDriver33.iterator();
        boolean boolean37 = hashSetTestDriver33.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean38 = hashSetTestDriver27.equals_CUT((java.lang.Object) hashSetTestDriver33);
        boolean boolean40 = hashSetTestDriver33.add((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver41.isEmpty();
        experiment.util.Iterator iterator43 = hashSetTestDriver41.iterator();
        boolean boolean45 = hashSetTestDriver41.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean46 = hashSetTestDriver41.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean48 = hashSetTestDriver47.isEmpty();
        experiment.util.Iterator iterator49 = hashSetTestDriver47.iterator();
        boolean boolean51 = hashSetTestDriver47.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean52 = hashSetTestDriver41.equals_CUT((java.lang.Object) hashSetTestDriver47);
        boolean boolean54 = hashSetTestDriver47.add((java.lang.Object) 1);
        boolean boolean55 = hashSetTestDriver33.add((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver56.isEmpty();
        boolean boolean58 = hashSetTestDriver33.equals_CUT((java.lang.Object) boolean57);
        boolean boolean59 = hashSetTestDriver13.remove((java.lang.Object) boolean58);
        experiment.util.HashSetTestDriver hashSetTestDriver60 = new experiment.util.HashSetTestDriver();
        boolean boolean62 = hashSetTestDriver60.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        boolean boolean64 = hashSetTestDriver60.contains((java.lang.Object) hashSetTestDriver63);
        boolean boolean66 = hashSetTestDriver60.contains((java.lang.Object) (byte) 1);
        int int67 = hashSetTestDriver60.size();
        java.lang.Object[] objArray68 = hashSetTestDriver60.toArray();
        java.lang.Object obj69 = hashSetTestDriver13.getMatch((java.lang.Object) hashSetTestDriver60);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = hashSetTestDriver0.equals_CUT(obj69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test034");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test035");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver1.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) iterator3);
        int int5 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test036");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver3);
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) (byte) 1);
        int int7 = hashSetTestDriver0.size();
        java.lang.Object[] objArray8 = hashSetTestDriver0.toArray();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass11 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test037");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = hashSetTestDriver3.add((java.lang.Object) 1);
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver3);
        int int9 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.add((java.lang.Object) 100);
        boolean boolean13 = hashSetTestDriver0.remove((java.lang.Object) boolean12);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver15.isEmpty();
        experiment.util.Iterator iterator17 = hashSetTestDriver15.iterator();
        boolean boolean19 = hashSetTestDriver15.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean20 = hashSetTestDriver15.isEmpty();
        boolean boolean21 = hashSetTestDriver15.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver22.contains((java.lang.Object) hashSetTestDriver25);
        boolean boolean28 = hashSetTestDriver22.contains((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray29 = hashSetTestDriver22.toArray();
        java.lang.Object obj30 = hashSetTestDriver15.getMatch((java.lang.Object) objArray29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = hashSetTestDriver0.equals_CUT(obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test038");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver6.isEmpty();
        experiment.util.Iterator iterator8 = hashSetTestDriver6.iterator();
        boolean boolean10 = hashSetTestDriver6.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean11 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver12.isEmpty();
        experiment.util.Iterator iterator14 = hashSetTestDriver12.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.remove((java.lang.Object) (byte) -1);
        boolean boolean22 = hashSetTestDriver18.add((java.lang.Object) 1);
        java.lang.Object obj23 = hashSetTestDriver15.getMatch((java.lang.Object) hashSetTestDriver18);
        boolean boolean24 = hashSetTestDriver12.remove((java.lang.Object) hashSetTestDriver15);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver25.isEmpty();
        experiment.util.Iterator iterator27 = hashSetTestDriver25.iterator();
        hashSetTestDriver25.clear();
        boolean boolean29 = hashSetTestDriver15.equals_CUT((java.lang.Object) hashSetTestDriver25);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.add((java.lang.Object) 100);
        boolean boolean34 = hashSetTestDriver30.remove((java.lang.Object) 0);
        boolean boolean36 = hashSetTestDriver30.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator37 = hashSetTestDriver30.iterator();
        boolean boolean38 = hashSetTestDriver25.remove((java.lang.Object) hashSetTestDriver30);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver40.isEmpty();
        experiment.util.Iterator iterator42 = hashSetTestDriver40.iterator();
        boolean boolean43 = hashSetTestDriver39.contains((java.lang.Object) iterator42);
        java.lang.Object obj45 = hashSetTestDriver39.getMatch((java.lang.Object) 100);
        boolean boolean46 = hashSetTestDriver39.isEmpty();
        boolean boolean47 = hashSetTestDriver25.contains((java.lang.Object) boolean46);
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver49.isEmpty();
        experiment.util.Iterator iterator51 = hashSetTestDriver49.iterator();
        boolean boolean52 = hashSetTestDriver48.contains((java.lang.Object) iterator51);
        experiment.util.Iterator iterator53 = hashSetTestDriver48.iterator();
        boolean boolean54 = hashSetTestDriver25.contains((java.lang.Object) hashSetTestDriver48);
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver55.add((java.lang.Object) 100);
        boolean boolean59 = hashSetTestDriver55.remove((java.lang.Object) 0);
        boolean boolean61 = hashSetTestDriver55.add((java.lang.Object) (byte) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        boolean boolean63 = hashSetTestDriver55.contains((java.lang.Object) hashSetTestDriver62);
        hashSetTestDriver55.clear();
        boolean boolean65 = hashSetTestDriver25.equals_CUT((java.lang.Object) hashSetTestDriver55);
        java.lang.Object obj66 = hashSetTestDriver0.getMatch((java.lang.Object) boolean65);
        java.lang.Object[] objArray67 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test039");
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
        boolean boolean25 = hashSetTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test040");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = hashSetTestDriver0.contains(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test041");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.add((java.lang.Object) 100);
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.add((java.lang.Object) 100);
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) 100);
        java.lang.Object[] objArray9 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass10 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test042");
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
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver14.isEmpty();
        experiment.util.Iterator iterator16 = hashSetTestDriver14.iterator();
        boolean boolean18 = hashSetTestDriver14.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean19 = hashSetTestDriver14.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver20.isEmpty();
        experiment.util.Iterator iterator22 = hashSetTestDriver20.iterator();
        boolean boolean24 = hashSetTestDriver20.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean25 = hashSetTestDriver14.equals_CUT((java.lang.Object) hashSetTestDriver20);
        boolean boolean27 = hashSetTestDriver20.add((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver28.isEmpty();
        experiment.util.Iterator iterator30 = hashSetTestDriver28.iterator();
        boolean boolean32 = hashSetTestDriver28.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean33 = hashSetTestDriver28.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean35 = hashSetTestDriver34.isEmpty();
        experiment.util.Iterator iterator36 = hashSetTestDriver34.iterator();
        boolean boolean38 = hashSetTestDriver34.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean39 = hashSetTestDriver28.equals_CUT((java.lang.Object) hashSetTestDriver34);
        boolean boolean41 = hashSetTestDriver34.add((java.lang.Object) 1);
        boolean boolean42 = hashSetTestDriver20.add((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver43.isEmpty();
        boolean boolean45 = hashSetTestDriver20.equals_CUT((java.lang.Object) boolean44);
        boolean boolean46 = hashSetTestDriver0.remove((java.lang.Object) boolean45);
        int int47 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver49.isEmpty();
        experiment.util.Iterator iterator51 = hashSetTestDriver49.iterator();
        boolean boolean52 = hashSetTestDriver48.contains((java.lang.Object) iterator51);
        java.lang.Object obj54 = hashSetTestDriver48.getMatch((java.lang.Object) 100);
        boolean boolean56 = hashSetTestDriver48.remove((java.lang.Object) '4');
        java.lang.Object[] objArray57 = hashSetTestDriver48.toArray();
        boolean boolean58 = hashSetTestDriver0.contains((java.lang.Object) objArray57);
        java.lang.Class<?> wildcardClass59 = objArray57.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test043");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver5.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver11.contains((java.lang.Object) hashSetTestDriver14);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.remove((java.lang.Object) (byte) -1);
        boolean boolean20 = hashSetTestDriver16.add((java.lang.Object) 1);
        int int21 = hashSetTestDriver16.size();
        boolean boolean22 = hashSetTestDriver14.remove((java.lang.Object) hashSetTestDriver16);
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver24.isEmpty();
        experiment.util.Iterator iterator26 = hashSetTestDriver24.iterator();
        boolean boolean27 = hashSetTestDriver23.contains((java.lang.Object) iterator26);
        boolean boolean28 = hashSetTestDriver16.add((java.lang.Object) hashSetTestDriver23);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver29.isEmpty();
        boolean boolean31 = hashSetTestDriver23.equals_CUT((java.lang.Object) hashSetTestDriver29);
        hashSetTestDriver23.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        boolean boolean35 = hashSetTestDriver33.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver33.contains((java.lang.Object) hashSetTestDriver36);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.remove((java.lang.Object) (byte) -1);
        boolean boolean42 = hashSetTestDriver38.add((java.lang.Object) 1);
        int int43 = hashSetTestDriver38.size();
        boolean boolean44 = hashSetTestDriver36.remove((java.lang.Object) hashSetTestDriver38);
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver46.isEmpty();
        experiment.util.Iterator iterator48 = hashSetTestDriver46.iterator();
        boolean boolean49 = hashSetTestDriver45.contains((java.lang.Object) iterator48);
        boolean boolean50 = hashSetTestDriver38.add((java.lang.Object) hashSetTestDriver45);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        boolean boolean52 = hashSetTestDriver51.isEmpty();
        boolean boolean53 = hashSetTestDriver45.equals_CUT((java.lang.Object) hashSetTestDriver51);
        boolean boolean54 = hashSetTestDriver23.remove((java.lang.Object) boolean53);
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver55.remove((java.lang.Object) (byte) -1);
        boolean boolean59 = hashSetTestDriver55.add((java.lang.Object) 1);
        boolean boolean61 = hashSetTestDriver55.add((java.lang.Object) (short) 10);
        boolean boolean63 = hashSetTestDriver55.equals_CUT((java.lang.Object) 1L);
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        boolean boolean65 = hashSetTestDriver64.isEmpty();
        experiment.util.Iterator iterator66 = hashSetTestDriver64.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver67 = new experiment.util.HashSetTestDriver();
        boolean boolean69 = hashSetTestDriver67.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver70 = new experiment.util.HashSetTestDriver();
        boolean boolean72 = hashSetTestDriver70.remove((java.lang.Object) (byte) -1);
        boolean boolean74 = hashSetTestDriver70.add((java.lang.Object) 1);
        java.lang.Object obj75 = hashSetTestDriver67.getMatch((java.lang.Object) hashSetTestDriver70);
        boolean boolean76 = hashSetTestDriver64.remove((java.lang.Object) hashSetTestDriver67);
        experiment.util.HashSetTestDriver hashSetTestDriver77 = new experiment.util.HashSetTestDriver();
        boolean boolean78 = hashSetTestDriver77.isEmpty();
        experiment.util.Iterator iterator79 = hashSetTestDriver77.iterator();
        hashSetTestDriver77.clear();
        boolean boolean81 = hashSetTestDriver67.equals_CUT((java.lang.Object) hashSetTestDriver77);
        java.lang.Object obj82 = hashSetTestDriver55.getMatch((java.lang.Object) hashSetTestDriver77);
        boolean boolean83 = hashSetTestDriver23.add((java.lang.Object) hashSetTestDriver55);
        boolean boolean84 = hashSetTestDriver23.isEmpty();
        boolean boolean85 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test044");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray8 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test045");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = hashSetTestDriver7.iterator();
        boolean boolean11 = hashSetTestDriver7.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver12.isEmpty();
        experiment.util.Iterator iterator14 = hashSetTestDriver12.iterator();
        boolean boolean16 = hashSetTestDriver12.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean17 = hashSetTestDriver7.contains((java.lang.Object) (byte) 100);
        boolean boolean18 = hashSetTestDriver7.isEmpty();
        java.lang.Object[] objArray19 = hashSetTestDriver7.toArray();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) (byte) -1);
        boolean boolean25 = hashSetTestDriver21.remove((java.lang.Object) 'a');
        boolean boolean26 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver21);
        hashSetTestDriver21.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test046");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.add((java.lang.Object) 100);
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 0);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = hashSetTestDriver0.add(obj7);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) -1);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 1);
        java.lang.Object obj17 = hashSetTestDriver9.getMatch((java.lang.Object) hashSetTestDriver12);
        int int18 = hashSetTestDriver9.size();
        java.lang.Object[] objArray19 = hashSetTestDriver9.toArray();
        java.lang.Object obj20 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver21.isEmpty();
        experiment.util.Iterator iterator23 = hashSetTestDriver21.iterator();
        boolean boolean25 = hashSetTestDriver21.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean26 = hashSetTestDriver21.isEmpty();
        boolean boolean27 = hashSetTestDriver21.isEmpty();
        java.lang.Object[] objArray28 = hashSetTestDriver21.toArray();
        java.lang.Object[] objArray29 = hashSetTestDriver21.toArray();
        java.lang.Object obj30 = hashSetTestDriver0.getMatch((java.lang.Object) objArray29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test047");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver1.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) iterator3);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) (byte) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver11);
        boolean boolean13 = hashSetTestDriver8.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver14.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver16.isEmpty();
        experiment.util.Iterator iterator18 = hashSetTestDriver16.iterator();
        boolean boolean20 = hashSetTestDriver16.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean21 = hashSetTestDriver16.isEmpty();
        boolean boolean22 = hashSetTestDriver14.equals_CUT((java.lang.Object) hashSetTestDriver16);
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver23.isEmpty();
        experiment.util.Iterator iterator25 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver29.remove((java.lang.Object) (byte) -1);
        boolean boolean33 = hashSetTestDriver29.add((java.lang.Object) 1);
        java.lang.Object obj34 = hashSetTestDriver26.getMatch((java.lang.Object) hashSetTestDriver29);
        boolean boolean35 = hashSetTestDriver23.remove((java.lang.Object) hashSetTestDriver26);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver36.isEmpty();
        experiment.util.Iterator iterator38 = hashSetTestDriver36.iterator();
        hashSetTestDriver36.clear();
        boolean boolean40 = hashSetTestDriver26.equals_CUT((java.lang.Object) hashSetTestDriver36);
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.add((java.lang.Object) 100);
        boolean boolean45 = hashSetTestDriver41.remove((java.lang.Object) 0);
        boolean boolean47 = hashSetTestDriver41.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator48 = hashSetTestDriver41.iterator();
        boolean boolean49 = hashSetTestDriver36.remove((java.lang.Object) hashSetTestDriver41);
        boolean boolean50 = hashSetTestDriver14.contains((java.lang.Object) hashSetTestDriver41);
        boolean boolean51 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver41);
        boolean boolean52 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver41);
        int int53 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass54 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test048");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.add((java.lang.Object) 100);
        boolean boolean4 = hashSetTestDriver0.remove((java.lang.Object) 0);
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator7 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.remove((java.lang.Object) (byte) -1);
        boolean boolean17 = hashSetTestDriver13.add((java.lang.Object) 1);
        int int18 = hashSetTestDriver13.size();
        boolean boolean19 = hashSetTestDriver11.remove((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver21.isEmpty();
        experiment.util.Iterator iterator23 = hashSetTestDriver21.iterator();
        boolean boolean24 = hashSetTestDriver20.contains((java.lang.Object) iterator23);
        boolean boolean25 = hashSetTestDriver13.add((java.lang.Object) hashSetTestDriver20);
        boolean boolean26 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver20);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver27.isEmpty();
        experiment.util.Iterator iterator29 = hashSetTestDriver27.iterator();
        boolean boolean31 = hashSetTestDriver27.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean32 = hashSetTestDriver27.isEmpty();
        java.lang.Object[] objArray33 = hashSetTestDriver27.toArray();
        boolean boolean34 = hashSetTestDriver0.contains((java.lang.Object) objArray33);
        java.lang.Class<?> wildcardClass35 = objArray33.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test049");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver1.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) iterator3);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 100);
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.add((java.lang.Object) 100);
        boolean boolean12 = hashSetTestDriver8.remove((java.lang.Object) 0);
        boolean boolean14 = hashSetTestDriver8.add((java.lang.Object) (byte) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver15);
        hashSetTestDriver8.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        boolean boolean19 = hashSetTestDriver8.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test050");
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
        boolean boolean14 = hashSetTestDriver12.add((java.lang.Object) 100);
        boolean boolean16 = hashSetTestDriver12.remove((java.lang.Object) 0);
        boolean boolean18 = hashSetTestDriver12.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj19 = hashSetTestDriver3.getMatch((java.lang.Object) 10.0d);
        hashSetTestDriver3.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test051");
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
        java.lang.Object obj14 = hashSetTestDriver8.getMatch((java.lang.Object) 100);
        boolean boolean15 = hashSetTestDriver8.isEmpty();
        boolean boolean16 = hashSetTestDriver0.remove((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test052");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test053");
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
        boolean boolean19 = hashSetTestDriver18.isEmpty();
        experiment.util.Iterator iterator20 = hashSetTestDriver18.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) (byte) -1);
        boolean boolean28 = hashSetTestDriver24.add((java.lang.Object) 1);
        java.lang.Object obj29 = hashSetTestDriver21.getMatch((java.lang.Object) hashSetTestDriver24);
        boolean boolean30 = hashSetTestDriver18.remove((java.lang.Object) hashSetTestDriver21);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver31.isEmpty();
        experiment.util.Iterator iterator33 = hashSetTestDriver31.iterator();
        hashSetTestDriver31.clear();
        boolean boolean35 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver31);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver36.add((java.lang.Object) 100);
        boolean boolean40 = hashSetTestDriver36.remove((java.lang.Object) 0);
        boolean boolean42 = hashSetTestDriver36.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator43 = hashSetTestDriver36.iterator();
        boolean boolean44 = hashSetTestDriver31.remove((java.lang.Object) hashSetTestDriver36);
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver46.isEmpty();
        experiment.util.Iterator iterator48 = hashSetTestDriver46.iterator();
        boolean boolean49 = hashSetTestDriver45.contains((java.lang.Object) iterator48);
        java.lang.Object obj51 = hashSetTestDriver45.getMatch((java.lang.Object) 100);
        boolean boolean52 = hashSetTestDriver45.isEmpty();
        boolean boolean53 = hashSetTestDriver31.contains((java.lang.Object) boolean52);
        boolean boolean54 = hashSetTestDriver31.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver55.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        boolean boolean59 = hashSetTestDriver55.contains((java.lang.Object) hashSetTestDriver58);
        experiment.util.HashSetTestDriver hashSetTestDriver60 = new experiment.util.HashSetTestDriver();
        boolean boolean62 = hashSetTestDriver60.remove((java.lang.Object) (byte) -1);
        boolean boolean64 = hashSetTestDriver60.add((java.lang.Object) 1);
        int int65 = hashSetTestDriver60.size();
        boolean boolean66 = hashSetTestDriver58.remove((java.lang.Object) hashSetTestDriver60);
        experiment.util.HashSetTestDriver hashSetTestDriver67 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver68 = new experiment.util.HashSetTestDriver();
        boolean boolean69 = hashSetTestDriver68.isEmpty();
        experiment.util.Iterator iterator70 = hashSetTestDriver68.iterator();
        boolean boolean71 = hashSetTestDriver67.contains((java.lang.Object) iterator70);
        boolean boolean72 = hashSetTestDriver60.add((java.lang.Object) hashSetTestDriver67);
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        boolean boolean75 = hashSetTestDriver73.add((java.lang.Object) 100);
        boolean boolean76 = hashSetTestDriver73.isEmpty();
        hashSetTestDriver73.clear();
        boolean boolean78 = hashSetTestDriver67.equals_CUT((java.lang.Object) hashSetTestDriver73);
        experiment.util.Iterator iterator79 = hashSetTestDriver67.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver80 = new experiment.util.HashSetTestDriver();
        boolean boolean82 = hashSetTestDriver80.remove((java.lang.Object) (byte) -1);
        boolean boolean84 = hashSetTestDriver80.add((java.lang.Object) 1);
        int int85 = hashSetTestDriver80.size();
        boolean boolean86 = hashSetTestDriver67.equals_CUT((java.lang.Object) hashSetTestDriver80);
        boolean boolean87 = hashSetTestDriver31.contains((java.lang.Object) hashSetTestDriver67);
        experiment.util.Iterator iterator88 = hashSetTestDriver31.iterator();
        boolean boolean89 = hashSetTestDriver13.equals_CUT((java.lang.Object) iterator88);
        java.lang.Object[] objArray90 = hashSetTestDriver13.toArray();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(iterator88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test054");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver1.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) iterator3);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 100);
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.add((java.lang.Object) 100);
        boolean boolean12 = hashSetTestDriver8.remove((java.lang.Object) 0);
        boolean boolean14 = hashSetTestDriver8.add((java.lang.Object) (byte) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver15);
        hashSetTestDriver8.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver19.isEmpty();
        experiment.util.Iterator iterator21 = hashSetTestDriver19.iterator();
        boolean boolean23 = hashSetTestDriver19.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean24 = hashSetTestDriver19.isEmpty();
        boolean boolean25 = hashSetTestDriver19.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver26.isEmpty();
        experiment.util.Iterator iterator28 = hashSetTestDriver26.iterator();
        boolean boolean30 = hashSetTestDriver26.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver31.isEmpty();
        experiment.util.Iterator iterator33 = hashSetTestDriver31.iterator();
        boolean boolean35 = hashSetTestDriver31.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean36 = hashSetTestDriver26.contains((java.lang.Object) (byte) 100);
        boolean boolean37 = hashSetTestDriver26.isEmpty();
        java.lang.Object[] objArray38 = hashSetTestDriver26.toArray();
        boolean boolean39 = hashSetTestDriver19.equals_CUT((java.lang.Object) hashSetTestDriver26);
        experiment.util.Iterator iterator40 = hashSetTestDriver19.iterator();
        java.lang.Object obj41 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver19);
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.add((java.lang.Object) 100);
        boolean boolean45 = hashSetTestDriver42.isEmpty();
        hashSetTestDriver42.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.add((java.lang.Object) 100);
        boolean boolean50 = hashSetTestDriver42.remove((java.lang.Object) 100);
        experiment.util.Iterator iterator51 = hashSetTestDriver42.iterator();
        boolean boolean52 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver42);
        experiment.util.HashSetTestDriver hashSetTestDriver53 = new experiment.util.HashSetTestDriver();
        boolean boolean55 = hashSetTestDriver53.remove((java.lang.Object) (byte) -1);
        boolean boolean57 = hashSetTestDriver53.add((java.lang.Object) 1);
        boolean boolean59 = hashSetTestDriver53.add((java.lang.Object) (short) 10);
        boolean boolean61 = hashSetTestDriver53.equals_CUT((java.lang.Object) 1L);
        boolean boolean62 = hashSetTestDriver42.add((java.lang.Object) hashSetTestDriver53);
        java.lang.Class<?> wildcardClass63 = hashSetTestDriver53.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test055");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver1.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) iterator3);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 100);
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.add((java.lang.Object) 100);
        boolean boolean12 = hashSetTestDriver8.remove((java.lang.Object) 0);
        boolean boolean14 = hashSetTestDriver8.add((java.lang.Object) (byte) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver15);
        hashSetTestDriver8.clear();
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver19.isEmpty();
        experiment.util.Iterator iterator21 = hashSetTestDriver19.iterator();
        boolean boolean23 = hashSetTestDriver19.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean24 = hashSetTestDriver19.isEmpty();
        boolean boolean25 = hashSetTestDriver19.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver26.isEmpty();
        experiment.util.Iterator iterator28 = hashSetTestDriver26.iterator();
        boolean boolean30 = hashSetTestDriver26.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver31.isEmpty();
        experiment.util.Iterator iterator33 = hashSetTestDriver31.iterator();
        boolean boolean35 = hashSetTestDriver31.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean36 = hashSetTestDriver26.contains((java.lang.Object) (byte) 100);
        boolean boolean37 = hashSetTestDriver26.isEmpty();
        java.lang.Object[] objArray38 = hashSetTestDriver26.toArray();
        boolean boolean39 = hashSetTestDriver19.equals_CUT((java.lang.Object) hashSetTestDriver26);
        experiment.util.Iterator iterator40 = hashSetTestDriver19.iterator();
        java.lang.Object obj41 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver19);
        experiment.util.Iterator iterator42 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(iterator42);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test056");
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
        hashSetTestDriver12.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver22.contains((java.lang.Object) hashSetTestDriver25);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.remove((java.lang.Object) (byte) -1);
        boolean boolean31 = hashSetTestDriver27.add((java.lang.Object) 1);
        int int32 = hashSetTestDriver27.size();
        boolean boolean33 = hashSetTestDriver25.remove((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver35.isEmpty();
        experiment.util.Iterator iterator37 = hashSetTestDriver35.iterator();
        boolean boolean38 = hashSetTestDriver34.contains((java.lang.Object) iterator37);
        boolean boolean39 = hashSetTestDriver27.add((java.lang.Object) hashSetTestDriver34);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver40.isEmpty();
        boolean boolean42 = hashSetTestDriver34.equals_CUT((java.lang.Object) hashSetTestDriver40);
        boolean boolean43 = hashSetTestDriver12.remove((java.lang.Object) boolean42);
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        boolean boolean46 = hashSetTestDriver44.remove((java.lang.Object) (byte) -1);
        boolean boolean48 = hashSetTestDriver44.add((java.lang.Object) 1);
        boolean boolean50 = hashSetTestDriver44.add((java.lang.Object) (short) 10);
        boolean boolean52 = hashSetTestDriver44.equals_CUT((java.lang.Object) 1L);
        experiment.util.HashSetTestDriver hashSetTestDriver53 = new experiment.util.HashSetTestDriver();
        boolean boolean54 = hashSetTestDriver53.isEmpty();
        experiment.util.Iterator iterator55 = hashSetTestDriver53.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean58 = hashSetTestDriver56.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver59 = new experiment.util.HashSetTestDriver();
        boolean boolean61 = hashSetTestDriver59.remove((java.lang.Object) (byte) -1);
        boolean boolean63 = hashSetTestDriver59.add((java.lang.Object) 1);
        java.lang.Object obj64 = hashSetTestDriver56.getMatch((java.lang.Object) hashSetTestDriver59);
        boolean boolean65 = hashSetTestDriver53.remove((java.lang.Object) hashSetTestDriver56);
        experiment.util.HashSetTestDriver hashSetTestDriver66 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver66.isEmpty();
        experiment.util.Iterator iterator68 = hashSetTestDriver66.iterator();
        hashSetTestDriver66.clear();
        boolean boolean70 = hashSetTestDriver56.equals_CUT((java.lang.Object) hashSetTestDriver66);
        java.lang.Object obj71 = hashSetTestDriver44.getMatch((java.lang.Object) hashSetTestDriver66);
        boolean boolean72 = hashSetTestDriver12.add((java.lang.Object) hashSetTestDriver44);
        boolean boolean74 = hashSetTestDriver12.add((java.lang.Object) 100);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test057");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver8.isEmpty();
        experiment.util.Iterator iterator10 = hashSetTestDriver8.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = hashSetTestDriver14.add((java.lang.Object) 1);
        java.lang.Object obj19 = hashSetTestDriver11.getMatch((java.lang.Object) hashSetTestDriver14);
        boolean boolean20 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver11);
        int int21 = hashSetTestDriver11.size();
        experiment.util.Iterator iterator22 = hashSetTestDriver11.iterator();
        java.lang.Object obj23 = hashSetTestDriver0.getMatch((java.lang.Object) iterator22);
        java.lang.Object[] objArray24 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test058");
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
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver28.isEmpty();
        experiment.util.Iterator iterator30 = hashSetTestDriver28.iterator();
        boolean boolean31 = hashSetTestDriver27.contains((java.lang.Object) iterator30);
        java.lang.Object obj33 = hashSetTestDriver27.getMatch((java.lang.Object) 100);
        boolean boolean34 = hashSetTestDriver27.isEmpty();
        boolean boolean35 = hashSetTestDriver13.contains((java.lang.Object) boolean34);
        boolean boolean36 = hashSetTestDriver13.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean39 = hashSetTestDriver37.remove((java.lang.Object) (byte) -1);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver37.contains((java.lang.Object) hashSetTestDriver40);
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.remove((java.lang.Object) (byte) -1);
        boolean boolean46 = hashSetTestDriver42.add((java.lang.Object) 1);
        int int47 = hashSetTestDriver42.size();
        boolean boolean48 = hashSetTestDriver40.remove((java.lang.Object) hashSetTestDriver42);
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        boolean boolean51 = hashSetTestDriver50.isEmpty();
        experiment.util.Iterator iterator52 = hashSetTestDriver50.iterator();
        boolean boolean53 = hashSetTestDriver49.contains((java.lang.Object) iterator52);
        boolean boolean54 = hashSetTestDriver42.add((java.lang.Object) hashSetTestDriver49);
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver55.add((java.lang.Object) 100);
        boolean boolean58 = hashSetTestDriver55.isEmpty();
        hashSetTestDriver55.clear();
        boolean boolean60 = hashSetTestDriver49.equals_CUT((java.lang.Object) hashSetTestDriver55);
        experiment.util.Iterator iterator61 = hashSetTestDriver49.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        boolean boolean64 = hashSetTestDriver62.remove((java.lang.Object) (byte) -1);
        boolean boolean66 = hashSetTestDriver62.add((java.lang.Object) 1);
        int int67 = hashSetTestDriver62.size();
        boolean boolean68 = hashSetTestDriver49.equals_CUT((java.lang.Object) hashSetTestDriver62);
        boolean boolean69 = hashSetTestDriver13.contains((java.lang.Object) hashSetTestDriver49);
        experiment.util.HashSetTestDriver hashSetTestDriver70 = new experiment.util.HashSetTestDriver();
        boolean boolean72 = hashSetTestDriver70.remove((java.lang.Object) (byte) -1);
        boolean boolean74 = hashSetTestDriver70.remove((java.lang.Object) 'a');
        java.lang.Object obj75 = hashSetTestDriver49.getMatch((java.lang.Object) boolean74);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test059");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray8 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.remove((java.lang.Object) (byte) -1);
        boolean boolean16 = hashSetTestDriver12.add((java.lang.Object) 1);
        java.lang.Object obj17 = hashSetTestDriver9.getMatch((java.lang.Object) hashSetTestDriver12);
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver9);
        java.lang.Object[] objArray19 = hashSetTestDriver9.toArray();
        experiment.util.Iterator iterator20 = hashSetTestDriver9.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100]");
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test060");
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
        boolean boolean34 = hashSetTestDriver12.isEmpty();
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = hashSetTestDriver12.getMatch(obj35);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test061");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver5.isEmpty();
        experiment.util.Iterator iterator7 = hashSetTestDriver5.iterator();
        boolean boolean9 = hashSetTestDriver5.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) (byte) 100);
        boolean boolean12 = hashSetTestDriver0.add((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver13.isEmpty();
        experiment.util.Iterator iterator15 = hashSetTestDriver13.iterator();
        boolean boolean17 = hashSetTestDriver13.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean18 = hashSetTestDriver13.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver19.isEmpty();
        experiment.util.Iterator iterator21 = hashSetTestDriver19.iterator();
        boolean boolean23 = hashSetTestDriver19.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean24 = hashSetTestDriver13.equals_CUT((java.lang.Object) hashSetTestDriver19);
        boolean boolean26 = hashSetTestDriver19.add((java.lang.Object) 1);
        java.lang.Object[] objArray27 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver29.isEmpty();
        experiment.util.Iterator iterator31 = hashSetTestDriver29.iterator();
        boolean boolean32 = hashSetTestDriver28.contains((java.lang.Object) iterator31);
        java.lang.Object obj34 = hashSetTestDriver28.getMatch((java.lang.Object) 100);
        boolean boolean35 = hashSetTestDriver28.isEmpty();
        experiment.util.Iterator iterator36 = hashSetTestDriver28.iterator();
        boolean boolean37 = hashSetTestDriver19.add((java.lang.Object) hashSetTestDriver28);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean39 = hashSetTestDriver38.isEmpty();
        experiment.util.Iterator iterator40 = hashSetTestDriver38.iterator();
        boolean boolean42 = hashSetTestDriver38.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean43 = hashSetTestDriver38.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        boolean boolean45 = hashSetTestDriver44.isEmpty();
        experiment.util.Iterator iterator46 = hashSetTestDriver44.iterator();
        boolean boolean48 = hashSetTestDriver44.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean49 = hashSetTestDriver44.isEmpty();
        java.lang.Object[] objArray50 = hashSetTestDriver44.toArray();
        boolean boolean51 = hashSetTestDriver38.add((java.lang.Object) objArray50);
        boolean boolean52 = hashSetTestDriver28.remove((java.lang.Object) boolean51);
        boolean boolean53 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean51);
        java.lang.Class<?> wildcardClass54 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test062");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver8.isEmpty();
        java.lang.Object[] objArray10 = hashSetTestDriver8.toArray();
        boolean boolean11 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test063");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver7.isEmpty();
        experiment.util.Iterator iterator9 = hashSetTestDriver7.iterator();
        boolean boolean11 = hashSetTestDriver7.equals_CUT((java.lang.Object) (byte) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver12.isEmpty();
        experiment.util.Iterator iterator14 = hashSetTestDriver12.iterator();
        boolean boolean16 = hashSetTestDriver12.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean17 = hashSetTestDriver7.contains((java.lang.Object) (byte) 100);
        boolean boolean18 = hashSetTestDriver7.isEmpty();
        java.lang.Object[] objArray19 = hashSetTestDriver7.toArray();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.remove((java.lang.Object) (byte) -1);
        boolean boolean25 = hashSetTestDriver21.remove((java.lang.Object) 'a');
        boolean boolean26 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver21);
        java.lang.Object obj28 = hashSetTestDriver21.getMatch((java.lang.Object) 1.0d);
        hashSetTestDriver21.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_939145594_1024_0.test064");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver1.isEmpty();
        experiment.util.Iterator iterator3 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) iterator3);
        java.lang.Object obj6 = hashSetTestDriver0.getMatch((java.lang.Object) 0L);
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver9.isEmpty();
        experiment.util.Iterator iterator11 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.add((java.lang.Object) 100);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.remove((java.lang.Object) (byte) -1);
        boolean boolean19 = hashSetTestDriver15.add((java.lang.Object) 1);
        java.lang.Object obj20 = hashSetTestDriver12.getMatch((java.lang.Object) hashSetTestDriver15);
        boolean boolean21 = hashSetTestDriver9.remove((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver22.isEmpty();
        experiment.util.Iterator iterator24 = hashSetTestDriver22.iterator();
        hashSetTestDriver22.clear();
        boolean boolean26 = hashSetTestDriver12.equals_CUT((java.lang.Object) hashSetTestDriver22);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.add((java.lang.Object) 100);
        boolean boolean31 = hashSetTestDriver27.remove((java.lang.Object) 0);
        boolean boolean33 = hashSetTestDriver27.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator34 = hashSetTestDriver27.iterator();
        boolean boolean35 = hashSetTestDriver22.remove((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver37.isEmpty();
        experiment.util.Iterator iterator39 = hashSetTestDriver37.iterator();
        boolean boolean40 = hashSetTestDriver36.contains((java.lang.Object) iterator39);
        java.lang.Object obj42 = hashSetTestDriver36.getMatch((java.lang.Object) 100);
        boolean boolean43 = hashSetTestDriver36.isEmpty();
        boolean boolean44 = hashSetTestDriver22.contains((java.lang.Object) boolean43);
        boolean boolean45 = hashSetTestDriver22.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver46.isEmpty();
        experiment.util.Iterator iterator48 = hashSetTestDriver46.iterator();
        boolean boolean50 = hashSetTestDriver46.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean51 = hashSetTestDriver46.isEmpty();
        boolean boolean52 = hashSetTestDriver46.isEmpty();
        java.lang.Object[] objArray53 = hashSetTestDriver46.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        boolean boolean56 = hashSetTestDriver54.remove((java.lang.Object) (byte) -1);
        boolean boolean57 = hashSetTestDriver46.equals_CUT((java.lang.Object) (byte) -1);
        int int58 = hashSetTestDriver46.size();
        hashSetTestDriver46.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver60 = new experiment.util.HashSetTestDriver();
        boolean boolean61 = hashSetTestDriver60.isEmpty();
        experiment.util.Iterator iterator62 = hashSetTestDriver60.iterator();
        boolean boolean64 = hashSetTestDriver60.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean65 = hashSetTestDriver60.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver66 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver66.isEmpty();
        experiment.util.Iterator iterator68 = hashSetTestDriver66.iterator();
        boolean boolean70 = hashSetTestDriver66.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean71 = hashSetTestDriver60.equals_CUT((java.lang.Object) hashSetTestDriver66);
        boolean boolean73 = hashSetTestDriver66.add((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver74 = new experiment.util.HashSetTestDriver();
        boolean boolean75 = hashSetTestDriver74.isEmpty();
        experiment.util.Iterator iterator76 = hashSetTestDriver74.iterator();
        boolean boolean78 = hashSetTestDriver74.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean79 = hashSetTestDriver74.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver80 = new experiment.util.HashSetTestDriver();
        boolean boolean81 = hashSetTestDriver80.isEmpty();
        experiment.util.Iterator iterator82 = hashSetTestDriver80.iterator();
        boolean boolean84 = hashSetTestDriver80.equals_CUT((java.lang.Object) (byte) 100);
        boolean boolean85 = hashSetTestDriver74.equals_CUT((java.lang.Object) hashSetTestDriver80);
        boolean boolean87 = hashSetTestDriver80.add((java.lang.Object) 1);
        boolean boolean88 = hashSetTestDriver66.add((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver89 = new experiment.util.HashSetTestDriver();
        boolean boolean90 = hashSetTestDriver89.isEmpty();
        boolean boolean91 = hashSetTestDriver66.equals_CUT((java.lang.Object) boolean90);
        boolean boolean92 = hashSetTestDriver46.remove((java.lang.Object) boolean91);
        java.lang.Object[] objArray93 = hashSetTestDriver46.toArray();
        boolean boolean94 = hashSetTestDriver22.remove((java.lang.Object) hashSetTestDriver46);
        boolean boolean95 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver22);
        boolean boolean96 = hashSetTestDriver22.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

}
