package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1256357748_64_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test001");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = hashSetTestDriver0.add(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass8 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean8 = hashSetTestDriver5.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator9 = hashSetTestDriver5.iterator();
        experiment.util.Iterator iterator10 = hashSetTestDriver5.iterator();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        java.lang.Class<?> wildcardClass12 = hashSetTestDriver5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        experiment.util.Iterator iterator11 = hashSetTestDriver6.iterator();
        boolean boolean12 = hashSetTestDriver0.add((java.lang.Object) iterator11);
        java.lang.Class<?> wildcardClass13 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean7 = hashSetTestDriver4.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator8 = hashSetTestDriver4.iterator();
        experiment.util.Iterator iterator9 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator14 = hashSetTestDriver10.iterator();
        boolean boolean16 = hashSetTestDriver10.equals_CUT((java.lang.Object) (-1L));
        boolean boolean17 = hashSetTestDriver4.remove((java.lang.Object) (-1L));
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator19 = hashSetTestDriver4.iterator();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator19);
        java.lang.Object obj22 = hashSetTestDriver0.getMatch((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean5 = hashSetTestDriver2.contains((java.lang.Object) (-1.0f));
        boolean boolean7 = hashSetTestDriver2.add((java.lang.Object) "hi!");
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) boolean7);
        java.lang.Object[] objArray9 = hashSetTestDriver0.toArray();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = hashSetTestDriver0.remove(obj10);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean8 = hashSetTestDriver5.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator9 = hashSetTestDriver5.iterator();
        experiment.util.Iterator iterator10 = hashSetTestDriver5.iterator();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        experiment.util.Iterator iterator16 = hashSetTestDriver12.iterator();
        java.lang.Object[] objArray17 = hashSetTestDriver12.toArray();
        boolean boolean18 = hashSetTestDriver5.equals_CUT((java.lang.Object) hashSetTestDriver12);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = hashSetTestDriver5.getMatch(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean14 = hashSetTestDriver11.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator15 = hashSetTestDriver11.iterator();
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean20 = hashSetTestDriver17.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator21 = hashSetTestDriver17.iterator();
        int int22 = hashSetTestDriver17.size();
        boolean boolean24 = hashSetTestDriver17.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray25 = hashSetTestDriver17.toArray();
        boolean boolean26 = hashSetTestDriver11.equals_CUT((java.lang.Object) objArray25);
        boolean boolean27 = hashSetTestDriver6.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean27);
        boolean boolean29 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        java.lang.Object obj7 = hashSetTestDriver0.getMatch((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass8 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean14 = hashSetTestDriver11.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator15 = hashSetTestDriver11.iterator();
        java.lang.Object[] objArray16 = hashSetTestDriver11.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean20 = hashSetTestDriver17.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator21 = hashSetTestDriver17.iterator();
        int int22 = hashSetTestDriver17.size();
        boolean boolean24 = hashSetTestDriver17.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray25 = hashSetTestDriver17.toArray();
        boolean boolean26 = hashSetTestDriver11.equals_CUT((java.lang.Object) objArray25);
        boolean boolean27 = hashSetTestDriver6.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean28 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean27);
        java.lang.Class<?> wildcardClass29 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = hashSetTestDriver0.getMatch(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean8 = hashSetTestDriver5.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator9 = hashSetTestDriver5.iterator();
        experiment.util.Iterator iterator10 = hashSetTestDriver5.iterator();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        experiment.util.Iterator iterator16 = hashSetTestDriver12.iterator();
        java.lang.Object[] objArray17 = hashSetTestDriver12.toArray();
        boolean boolean18 = hashSetTestDriver5.equals_CUT((java.lang.Object) hashSetTestDriver12);
        experiment.util.Iterator iterator19 = hashSetTestDriver12.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray21 = hashSetTestDriver20.toArray();
        boolean boolean23 = hashSetTestDriver20.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator24 = hashSetTestDriver20.iterator();
        boolean boolean26 = hashSetTestDriver20.equals_CUT((java.lang.Object) (-1L));
        boolean boolean27 = hashSetTestDriver20.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray29 = hashSetTestDriver28.toArray();
        boolean boolean31 = hashSetTestDriver28.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver28.clear();
        boolean boolean34 = hashSetTestDriver28.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        boolean boolean38 = hashSetTestDriver35.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator39 = hashSetTestDriver35.iterator();
        boolean boolean41 = hashSetTestDriver35.remove((java.lang.Object) '4');
        boolean boolean42 = hashSetTestDriver28.contains((java.lang.Object) hashSetTestDriver35);
        java.lang.Object[] objArray43 = hashSetTestDriver35.toArray();
        java.lang.Object obj44 = hashSetTestDriver20.getMatch((java.lang.Object) hashSetTestDriver35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = hashSetTestDriver12.add(obj44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean10 = hashSetTestDriver7.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator11 = hashSetTestDriver7.iterator();
        boolean boolean13 = hashSetTestDriver7.remove((java.lang.Object) '4');
        boolean boolean14 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver7);
        experiment.util.Iterator iterator15 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass16 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test018");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator6 = hashSetTestDriver3.iterator();
        experiment.util.Iterator iterator7 = hashSetTestDriver3.iterator();
        java.lang.Object[] objArray8 = hashSetTestDriver3.toArray();
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) objArray8);
        int int10 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver6.clear();
        boolean boolean12 = hashSetTestDriver6.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean16 = hashSetTestDriver13.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator17 = hashSetTestDriver13.iterator();
        boolean boolean19 = hashSetTestDriver13.remove((java.lang.Object) '4');
        boolean boolean20 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver13);
        java.lang.Class<?> wildcardClass21 = hashSetTestDriver6.getClass();
        java.lang.Object obj22 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray24 = hashSetTestDriver23.toArray();
        boolean boolean26 = hashSetTestDriver23.contains((java.lang.Object) (-1.0f));
        int int27 = hashSetTestDriver23.size();
        boolean boolean29 = hashSetTestDriver23.equals_CUT((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray31 = hashSetTestDriver30.toArray();
        boolean boolean33 = hashSetTestDriver30.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator34 = hashSetTestDriver30.iterator();
        int int35 = hashSetTestDriver30.size();
        boolean boolean37 = hashSetTestDriver30.contains((java.lang.Object) 100.0f);
        java.lang.Object obj38 = hashSetTestDriver23.getMatch((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = hashSetTestDriver6.getMatch(obj38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test020");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass1 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        int int4 = hashSetTestDriver0.size();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) '4');
        int int7 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test022");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test023");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        boolean boolean12 = hashSetTestDriver6.equals_CUT((java.lang.Object) (-1L));
        boolean boolean13 = hashSetTestDriver0.remove((java.lang.Object) (-1L));
        hashSetTestDriver0.clear();
        experiment.util.Iterator iterator15 = hashSetTestDriver0.iterator();
        int int16 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean20 = hashSetTestDriver17.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver17.clear();
        boolean boolean23 = hashSetTestDriver17.contains((java.lang.Object) 'a');
        java.lang.Object[] objArray24 = hashSetTestDriver17.toArray();
        boolean boolean25 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver17);
        int int26 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test024");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean8 = hashSetTestDriver5.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator9 = hashSetTestDriver5.iterator();
        experiment.util.Iterator iterator10 = hashSetTestDriver5.iterator();
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        int int12 = hashSetTestDriver5.size();
        java.lang.Class<?> wildcardClass13 = hashSetTestDriver5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver0.clear();
        int int5 = hashSetTestDriver0.size();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = hashSetTestDriver0.equals_CUT(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        java.lang.Object[] objArray11 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        boolean boolean15 = hashSetTestDriver12.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray16 = hashSetTestDriver12.toArray();
        boolean boolean17 = hashSetTestDriver6.equals_CUT((java.lang.Object) hashSetTestDriver12);
        experiment.util.Iterator iterator18 = hashSetTestDriver6.iterator();
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver6);
        java.lang.Class<?> wildcardClass20 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver6.clear();
        boolean boolean12 = hashSetTestDriver6.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean16 = hashSetTestDriver13.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator17 = hashSetTestDriver13.iterator();
        boolean boolean19 = hashSetTestDriver13.remove((java.lang.Object) '4');
        boolean boolean20 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver13);
        java.lang.Class<?> wildcardClass21 = hashSetTestDriver6.getClass();
        java.lang.Object obj22 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver6);
        boolean boolean23 = hashSetTestDriver6.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean10 = hashSetTestDriver7.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator11 = hashSetTestDriver7.iterator();
        boolean boolean13 = hashSetTestDriver7.remove((java.lang.Object) '4');
        boolean boolean14 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver7);
        java.lang.Object[] objArray15 = hashSetTestDriver7.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        boolean boolean19 = hashSetTestDriver16.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator20 = hashSetTestDriver16.iterator();
        int int21 = hashSetTestDriver16.size();
        boolean boolean23 = hashSetTestDriver16.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray24 = hashSetTestDriver16.toArray();
        hashSetTestDriver16.clear();
        boolean boolean26 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver16);
        boolean boolean28 = hashSetTestDriver7.equals_CUT((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator33 = hashSetTestDriver29.iterator();
        boolean boolean35 = hashSetTestDriver29.remove((java.lang.Object) '4');
        boolean boolean37 = hashSetTestDriver29.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator38 = hashSetTestDriver29.iterator();
        boolean boolean39 = hashSetTestDriver7.contains((java.lang.Object) iterator38);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test030");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.remove((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator10 = hashSetTestDriver7.iterator();
        experiment.util.Iterator iterator11 = hashSetTestDriver7.iterator();
        java.lang.Object[] objArray12 = hashSetTestDriver7.toArray();
        boolean boolean13 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver7);
        java.lang.Object obj15 = hashSetTestDriver7.getMatch((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean5 = hashSetTestDriver2.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator6 = hashSetTestDriver2.iterator();
        int int7 = hashSetTestDriver2.size();
        boolean boolean9 = hashSetTestDriver2.contains((java.lang.Object) 100.0f);
        boolean boolean11 = hashSetTestDriver2.equals_CUT((java.lang.Object) (byte) 10);
        boolean boolean12 = hashSetTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashSetTestDriver0.add((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        boolean boolean12 = hashSetTestDriver6.equals_CUT((java.lang.Object) (-1L));
        boolean boolean13 = hashSetTestDriver0.remove((java.lang.Object) (-1L));
        hashSetTestDriver0.clear();
        experiment.util.Iterator iterator15 = hashSetTestDriver0.iterator();
        int int16 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean20 = hashSetTestDriver17.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver17.clear();
        boolean boolean23 = hashSetTestDriver17.contains((java.lang.Object) 'a');
        java.lang.Object[] objArray24 = hashSetTestDriver17.toArray();
        boolean boolean25 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver17);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray27 = hashSetTestDriver26.toArray();
        boolean boolean29 = hashSetTestDriver26.contains((java.lang.Object) (-1.0f));
        boolean boolean30 = hashSetTestDriver26.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        boolean boolean34 = hashSetTestDriver31.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator35 = hashSetTestDriver31.iterator();
        experiment.util.Iterator iterator36 = hashSetTestDriver31.iterator();
        boolean boolean37 = hashSetTestDriver26.remove((java.lang.Object) hashSetTestDriver31);
        java.lang.Class<?> wildcardClass38 = hashSetTestDriver26.getClass();
        boolean boolean39 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver26);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test033");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver9.clear();
        boolean boolean15 = hashSetTestDriver9.contains((java.lang.Object) 'a');
        boolean boolean16 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver9);
        experiment.util.Iterator iterator17 = hashSetTestDriver9.iterator();
        int int18 = hashSetTestDriver9.size();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean22 = hashSetTestDriver19.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator23 = hashSetTestDriver19.iterator();
        boolean boolean24 = hashSetTestDriver9.equals_CUT((java.lang.Object) hashSetTestDriver19);
        experiment.util.Iterator iterator25 = hashSetTestDriver9.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test034");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver9.clear();
        boolean boolean15 = hashSetTestDriver9.contains((java.lang.Object) 'a');
        boolean boolean16 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver9);
        experiment.util.Iterator iterator17 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray19 = hashSetTestDriver18.toArray();
        boolean boolean21 = hashSetTestDriver18.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator22 = hashSetTestDriver18.iterator();
        boolean boolean24 = hashSetTestDriver18.add((java.lang.Object) ' ');
        boolean boolean25 = hashSetTestDriver9.contains((java.lang.Object) boolean24);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray27 = hashSetTestDriver26.toArray();
        boolean boolean29 = hashSetTestDriver26.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator30 = hashSetTestDriver26.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        boolean boolean34 = hashSetTestDriver31.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator35 = hashSetTestDriver31.iterator();
        java.lang.Object[] objArray36 = hashSetTestDriver31.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray38 = hashSetTestDriver37.toArray();
        boolean boolean40 = hashSetTestDriver37.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator41 = hashSetTestDriver37.iterator();
        int int42 = hashSetTestDriver37.size();
        boolean boolean44 = hashSetTestDriver37.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray45 = hashSetTestDriver37.toArray();
        boolean boolean46 = hashSetTestDriver31.equals_CUT((java.lang.Object) objArray45);
        boolean boolean47 = hashSetTestDriver26.equals_CUT((java.lang.Object) hashSetTestDriver31);
        boolean boolean48 = hashSetTestDriver9.add((java.lang.Object) hashSetTestDriver31);
        hashSetTestDriver9.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test035");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean4 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver2);
        java.lang.Class<?> wildcardClass5 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test036");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver0.clear();
        int int5 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        java.lang.Object[] objArray11 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        boolean boolean15 = hashSetTestDriver12.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray16 = hashSetTestDriver12.toArray();
        boolean boolean17 = hashSetTestDriver6.equals_CUT((java.lang.Object) hashSetTestDriver12);
        java.lang.Object obj18 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean22 = hashSetTestDriver19.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator23 = hashSetTestDriver19.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        boolean boolean27 = hashSetTestDriver24.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator28 = hashSetTestDriver24.iterator();
        java.lang.Object[] objArray29 = hashSetTestDriver24.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray31 = hashSetTestDriver30.toArray();
        boolean boolean33 = hashSetTestDriver30.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator34 = hashSetTestDriver30.iterator();
        int int35 = hashSetTestDriver30.size();
        boolean boolean37 = hashSetTestDriver30.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray38 = hashSetTestDriver30.toArray();
        boolean boolean39 = hashSetTestDriver24.equals_CUT((java.lang.Object) objArray38);
        boolean boolean40 = hashSetTestDriver19.equals_CUT((java.lang.Object) hashSetTestDriver24);
        boolean boolean41 = hashSetTestDriver0.add((java.lang.Object) boolean40);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test037");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean7 = hashSetTestDriver4.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator8 = hashSetTestDriver4.iterator();
        experiment.util.Iterator iterator9 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator14 = hashSetTestDriver10.iterator();
        boolean boolean16 = hashSetTestDriver10.equals_CUT((java.lang.Object) (-1L));
        boolean boolean17 = hashSetTestDriver4.remove((java.lang.Object) (-1L));
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator19 = hashSetTestDriver4.iterator();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator19);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean24 = hashSetTestDriver21.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator25 = hashSetTestDriver21.iterator();
        boolean boolean27 = hashSetTestDriver21.add((java.lang.Object) ' ');
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver21);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        int int33 = hashSetTestDriver29.size();
        boolean boolean34 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver29);
        boolean boolean36 = hashSetTestDriver21.contains((java.lang.Object) 0.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray38 = hashSetTestDriver37.toArray();
        boolean boolean40 = hashSetTestDriver37.contains((java.lang.Object) (-1.0f));
        int int41 = hashSetTestDriver37.size();
        boolean boolean43 = hashSetTestDriver37.equals_CUT((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray45 = hashSetTestDriver44.toArray();
        boolean boolean47 = hashSetTestDriver44.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator48 = hashSetTestDriver44.iterator();
        int int49 = hashSetTestDriver44.size();
        boolean boolean51 = hashSetTestDriver44.contains((java.lang.Object) 100.0f);
        java.lang.Object obj52 = hashSetTestDriver37.getMatch((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = hashSetTestDriver21.equals_CUT(obj52);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test038");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        int int11 = hashSetTestDriver6.size();
        java.lang.Object[] objArray12 = hashSetTestDriver6.toArray();
        boolean boolean13 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver6);
        boolean boolean14 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test039");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1L));
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean11 = hashSetTestDriver8.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator12 = hashSetTestDriver8.iterator();
        int int13 = hashSetTestDriver8.size();
        int int14 = hashSetTestDriver8.size();
        boolean boolean15 = hashSetTestDriver0.add((java.lang.Object) int14);
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass18 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test040");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        int int5 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        java.lang.Object[] objArray11 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        boolean boolean15 = hashSetTestDriver12.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray16 = hashSetTestDriver12.toArray();
        boolean boolean17 = hashSetTestDriver6.equals_CUT((java.lang.Object) hashSetTestDriver12);
        experiment.util.Iterator iterator18 = hashSetTestDriver6.iterator();
        boolean boolean19 = hashSetTestDriver0.add((java.lang.Object) iterator18);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test041");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        boolean boolean8 = hashSetTestDriver5.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator9 = hashSetTestDriver5.iterator();
        java.lang.Object[] objArray10 = hashSetTestDriver5.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        boolean boolean14 = hashSetTestDriver11.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray15 = hashSetTestDriver11.toArray();
        boolean boolean16 = hashSetTestDriver5.equals_CUT((java.lang.Object) hashSetTestDriver11);
        boolean boolean17 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver11);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test042");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray3 = hashSetTestDriver2.toArray();
        boolean boolean5 = hashSetTestDriver2.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator6 = hashSetTestDriver2.iterator();
        java.lang.Object[] objArray7 = hashSetTestDriver2.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean11 = hashSetTestDriver8.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator12 = hashSetTestDriver8.iterator();
        int int13 = hashSetTestDriver8.size();
        boolean boolean15 = hashSetTestDriver8.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray16 = hashSetTestDriver8.toArray();
        boolean boolean17 = hashSetTestDriver2.equals_CUT((java.lang.Object) objArray16);
        boolean boolean18 = hashSetTestDriver0.add((java.lang.Object) boolean17);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean22 = hashSetTestDriver19.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator23 = hashSetTestDriver19.iterator();
        int int24 = hashSetTestDriver19.size();
        boolean boolean26 = hashSetTestDriver19.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray27 = hashSetTestDriver19.toArray();
        hashSetTestDriver19.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        int int33 = hashSetTestDriver29.size();
        boolean boolean35 = hashSetTestDriver29.equals_CUT((java.lang.Object) '4');
        boolean boolean36 = hashSetTestDriver19.remove((java.lang.Object) hashSetTestDriver29);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray38 = hashSetTestDriver37.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray40 = hashSetTestDriver39.toArray();
        boolean boolean41 = hashSetTestDriver37.add((java.lang.Object) hashSetTestDriver39);
        java.lang.Object obj42 = hashSetTestDriver19.getMatch((java.lang.Object) hashSetTestDriver39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = hashSetTestDriver0.getMatch(obj42);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test043");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean7 = hashSetTestDriver4.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator8 = hashSetTestDriver4.iterator();
        experiment.util.Iterator iterator9 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator14 = hashSetTestDriver10.iterator();
        boolean boolean16 = hashSetTestDriver10.equals_CUT((java.lang.Object) (-1L));
        boolean boolean17 = hashSetTestDriver4.remove((java.lang.Object) (-1L));
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator19 = hashSetTestDriver4.iterator();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator19);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean24 = hashSetTestDriver21.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator25 = hashSetTestDriver21.iterator();
        boolean boolean27 = hashSetTestDriver21.add((java.lang.Object) ' ');
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver21);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        int int33 = hashSetTestDriver29.size();
        boolean boolean34 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver29);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        boolean boolean38 = hashSetTestDriver35.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator39 = hashSetTestDriver35.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray41 = hashSetTestDriver40.toArray();
        boolean boolean43 = hashSetTestDriver40.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator44 = hashSetTestDriver40.iterator();
        java.lang.Object[] objArray45 = hashSetTestDriver40.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray47 = hashSetTestDriver46.toArray();
        boolean boolean49 = hashSetTestDriver46.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator50 = hashSetTestDriver46.iterator();
        int int51 = hashSetTestDriver46.size();
        boolean boolean53 = hashSetTestDriver46.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray54 = hashSetTestDriver46.toArray();
        boolean boolean55 = hashSetTestDriver40.equals_CUT((java.lang.Object) objArray54);
        boolean boolean56 = hashSetTestDriver35.equals_CUT((java.lang.Object) hashSetTestDriver40);
        boolean boolean57 = hashSetTestDriver21.remove((java.lang.Object) hashSetTestDriver35);
        hashSetTestDriver35.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test044");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean7 = hashSetTestDriver4.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator8 = hashSetTestDriver4.iterator();
        experiment.util.Iterator iterator9 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator14 = hashSetTestDriver10.iterator();
        boolean boolean16 = hashSetTestDriver10.equals_CUT((java.lang.Object) (-1L));
        boolean boolean17 = hashSetTestDriver4.remove((java.lang.Object) (-1L));
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator19 = hashSetTestDriver4.iterator();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator19);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean24 = hashSetTestDriver21.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator25 = hashSetTestDriver21.iterator();
        boolean boolean27 = hashSetTestDriver21.add((java.lang.Object) ' ');
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver21);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        int int33 = hashSetTestDriver29.size();
        boolean boolean34 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver29);
        boolean boolean36 = hashSetTestDriver21.contains((java.lang.Object) 0.0f);
        hashSetTestDriver21.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test045");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver6.clear();
        boolean boolean12 = hashSetTestDriver6.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean16 = hashSetTestDriver13.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator17 = hashSetTestDriver13.iterator();
        boolean boolean19 = hashSetTestDriver13.remove((java.lang.Object) '4');
        boolean boolean20 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean24 = hashSetTestDriver21.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator25 = hashSetTestDriver21.iterator();
        int int26 = hashSetTestDriver21.size();
        boolean boolean28 = hashSetTestDriver21.contains((java.lang.Object) 100.0f);
        boolean boolean30 = hashSetTestDriver21.equals_CUT((java.lang.Object) (byte) 10);
        boolean boolean31 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver21);
        boolean boolean32 = hashSetTestDriver0.contains((java.lang.Object) boolean31);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray34 = hashSetTestDriver33.toArray();
        boolean boolean36 = hashSetTestDriver33.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator37 = hashSetTestDriver33.iterator();
        boolean boolean39 = hashSetTestDriver33.equals_CUT((java.lang.Object) (-1L));
        boolean boolean40 = hashSetTestDriver33.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray42 = hashSetTestDriver41.toArray();
        boolean boolean44 = hashSetTestDriver41.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator45 = hashSetTestDriver41.iterator();
        java.lang.Object[] objArray46 = hashSetTestDriver41.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray48 = hashSetTestDriver47.toArray();
        boolean boolean50 = hashSetTestDriver47.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray51 = hashSetTestDriver47.toArray();
        boolean boolean52 = hashSetTestDriver41.equals_CUT((java.lang.Object) hashSetTestDriver47);
        experiment.util.Iterator iterator53 = hashSetTestDriver41.iterator();
        java.lang.Object[] objArray54 = hashSetTestDriver41.toArray();
        boolean boolean55 = hashSetTestDriver33.remove((java.lang.Object) hashSetTestDriver41);
        hashSetTestDriver41.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray58 = hashSetTestDriver57.toArray();
        boolean boolean60 = hashSetTestDriver57.contains((java.lang.Object) (-1.0f));
        int int61 = hashSetTestDriver57.size();
        boolean boolean63 = hashSetTestDriver57.equals_CUT((java.lang.Object) '4');
        boolean boolean64 = hashSetTestDriver57.isEmpty();
        hashSetTestDriver57.clear();
        java.lang.Object obj66 = hashSetTestDriver41.getMatch((java.lang.Object) hashSetTestDriver57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = hashSetTestDriver0.equals_CUT(obj66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test046");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) ' ');
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test047");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver9.clear();
        boolean boolean15 = hashSetTestDriver9.contains((java.lang.Object) 'a');
        boolean boolean16 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver9);
        experiment.util.Iterator iterator17 = hashSetTestDriver9.iterator();
        int int18 = hashSetTestDriver9.size();
        java.lang.Object[] objArray19 = hashSetTestDriver9.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test048");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray10 = hashSetTestDriver6.toArray();
        boolean boolean11 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver6);
        experiment.util.Iterator iterator12 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray13 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator14 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test049");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver6.clear();
        boolean boolean12 = hashSetTestDriver6.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        boolean boolean16 = hashSetTestDriver13.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator17 = hashSetTestDriver13.iterator();
        boolean boolean19 = hashSetTestDriver13.remove((java.lang.Object) '4');
        boolean boolean20 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver13);
        java.lang.Class<?> wildcardClass21 = hashSetTestDriver6.getClass();
        java.lang.Object obj22 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver6);
        int int23 = hashSetTestDriver6.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test050");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray8 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator14 = hashSetTestDriver10.iterator();
        int int15 = hashSetTestDriver10.size();
        int int16 = hashSetTestDriver10.size();
        hashSetTestDriver10.clear();
        boolean boolean18 = hashSetTestDriver10.isEmpty();
        boolean boolean19 = hashSetTestDriver0.add((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test051");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean7 = hashSetTestDriver4.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator8 = hashSetTestDriver4.iterator();
        experiment.util.Iterator iterator9 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator14 = hashSetTestDriver10.iterator();
        boolean boolean16 = hashSetTestDriver10.equals_CUT((java.lang.Object) (-1L));
        boolean boolean17 = hashSetTestDriver4.remove((java.lang.Object) (-1L));
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator19 = hashSetTestDriver4.iterator();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator19);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean24 = hashSetTestDriver21.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator25 = hashSetTestDriver21.iterator();
        boolean boolean27 = hashSetTestDriver21.add((java.lang.Object) ' ');
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver21);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        int int33 = hashSetTestDriver29.size();
        boolean boolean34 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver29);
        hashSetTestDriver21.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray37 = hashSetTestDriver36.toArray();
        boolean boolean39 = hashSetTestDriver36.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator40 = hashSetTestDriver36.iterator();
        boolean boolean42 = hashSetTestDriver36.remove((java.lang.Object) '4');
        boolean boolean44 = hashSetTestDriver36.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator45 = hashSetTestDriver36.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray47 = hashSetTestDriver46.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray49 = hashSetTestDriver48.toArray();
        boolean boolean50 = hashSetTestDriver46.add((java.lang.Object) hashSetTestDriver48);
        boolean boolean51 = hashSetTestDriver36.contains((java.lang.Object) hashSetTestDriver48);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray53 = hashSetTestDriver52.toArray();
        boolean boolean55 = hashSetTestDriver52.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator56 = hashSetTestDriver52.iterator();
        boolean boolean58 = hashSetTestDriver52.equals_CUT((java.lang.Object) (-1L));
        boolean boolean59 = hashSetTestDriver52.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver60 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray61 = hashSetTestDriver60.toArray();
        boolean boolean63 = hashSetTestDriver60.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator64 = hashSetTestDriver60.iterator();
        java.lang.Object[] objArray65 = hashSetTestDriver60.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver66 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray67 = hashSetTestDriver66.toArray();
        boolean boolean69 = hashSetTestDriver66.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray70 = hashSetTestDriver66.toArray();
        boolean boolean71 = hashSetTestDriver60.equals_CUT((java.lang.Object) hashSetTestDriver66);
        experiment.util.Iterator iterator72 = hashSetTestDriver60.iterator();
        java.lang.Object[] objArray73 = hashSetTestDriver60.toArray();
        boolean boolean74 = hashSetTestDriver52.remove((java.lang.Object) hashSetTestDriver60);
        boolean boolean75 = hashSetTestDriver48.equals_CUT((java.lang.Object) boolean74);
        java.lang.Object obj76 = hashSetTestDriver21.getMatch((java.lang.Object) hashSetTestDriver48);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test052");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1L));
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean11 = hashSetTestDriver8.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator12 = hashSetTestDriver8.iterator();
        java.lang.Object[] objArray13 = hashSetTestDriver8.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        boolean boolean17 = hashSetTestDriver14.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray18 = hashSetTestDriver14.toArray();
        boolean boolean19 = hashSetTestDriver8.equals_CUT((java.lang.Object) hashSetTestDriver14);
        experiment.util.Iterator iterator20 = hashSetTestDriver8.iterator();
        java.lang.Object[] objArray21 = hashSetTestDriver8.toArray();
        boolean boolean22 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver8);
        hashSetTestDriver8.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        boolean boolean27 = hashSetTestDriver24.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver24.clear();
        int int29 = hashSetTestDriver24.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray31 = hashSetTestDriver30.toArray();
        boolean boolean33 = hashSetTestDriver30.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator34 = hashSetTestDriver30.iterator();
        java.lang.Object[] objArray35 = hashSetTestDriver30.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray37 = hashSetTestDriver36.toArray();
        boolean boolean39 = hashSetTestDriver36.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray40 = hashSetTestDriver36.toArray();
        boolean boolean41 = hashSetTestDriver30.equals_CUT((java.lang.Object) hashSetTestDriver36);
        java.lang.Object obj42 = hashSetTestDriver24.getMatch((java.lang.Object) hashSetTestDriver36);
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray44 = hashSetTestDriver43.toArray();
        boolean boolean46 = hashSetTestDriver43.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator47 = hashSetTestDriver43.iterator();
        java.lang.Object[] objArray48 = hashSetTestDriver43.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray50 = hashSetTestDriver49.toArray();
        boolean boolean52 = hashSetTestDriver49.contains((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray53 = hashSetTestDriver49.toArray();
        boolean boolean54 = hashSetTestDriver43.equals_CUT((java.lang.Object) hashSetTestDriver49);
        experiment.util.Iterator iterator55 = hashSetTestDriver43.iterator();
        boolean boolean56 = hashSetTestDriver24.equals_CUT((java.lang.Object) iterator55);
        boolean boolean57 = hashSetTestDriver8.equals_CUT((java.lang.Object) boolean56);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test053");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean11 = hashSetTestDriver8.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator12 = hashSetTestDriver8.iterator();
        int int13 = hashSetTestDriver8.size();
        boolean boolean15 = hashSetTestDriver8.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray16 = hashSetTestDriver8.toArray();
        boolean boolean17 = hashSetTestDriver8.isEmpty();
        int int18 = hashSetTestDriver8.size();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        boolean boolean22 = hashSetTestDriver19.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray24 = hashSetTestDriver23.toArray();
        boolean boolean26 = hashSetTestDriver23.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator27 = hashSetTestDriver23.iterator();
        experiment.util.Iterator iterator28 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator33 = hashSetTestDriver29.iterator();
        boolean boolean35 = hashSetTestDriver29.equals_CUT((java.lang.Object) (-1L));
        boolean boolean36 = hashSetTestDriver23.remove((java.lang.Object) (-1L));
        hashSetTestDriver23.clear();
        experiment.util.Iterator iterator38 = hashSetTestDriver23.iterator();
        boolean boolean39 = hashSetTestDriver19.equals_CUT((java.lang.Object) iterator38);
        boolean boolean41 = hashSetTestDriver19.add((java.lang.Object) 0);
        boolean boolean42 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver19);
        boolean boolean43 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver8);
        java.lang.Class<?> wildcardClass44 = hashSetTestDriver8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test054");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver0.clear();
        boolean boolean6 = hashSetTestDriver0.contains((java.lang.Object) 'a');
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        boolean boolean10 = hashSetTestDriver7.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator11 = hashSetTestDriver7.iterator();
        boolean boolean13 = hashSetTestDriver7.remove((java.lang.Object) '4');
        boolean boolean14 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver7);
        java.lang.Object[] objArray15 = hashSetTestDriver7.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        boolean boolean19 = hashSetTestDriver16.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator20 = hashSetTestDriver16.iterator();
        int int21 = hashSetTestDriver16.size();
        boolean boolean23 = hashSetTestDriver16.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray24 = hashSetTestDriver16.toArray();
        hashSetTestDriver16.clear();
        boolean boolean26 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver16);
        boolean boolean28 = hashSetTestDriver7.equals_CUT((java.lang.Object) '4');
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray34 = hashSetTestDriver33.toArray();
        boolean boolean36 = hashSetTestDriver33.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator37 = hashSetTestDriver33.iterator();
        experiment.util.Iterator iterator38 = hashSetTestDriver33.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray40 = hashSetTestDriver39.toArray();
        boolean boolean42 = hashSetTestDriver39.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator43 = hashSetTestDriver39.iterator();
        boolean boolean45 = hashSetTestDriver39.equals_CUT((java.lang.Object) (-1L));
        boolean boolean46 = hashSetTestDriver33.remove((java.lang.Object) (-1L));
        hashSetTestDriver33.clear();
        experiment.util.Iterator iterator48 = hashSetTestDriver33.iterator();
        boolean boolean49 = hashSetTestDriver29.equals_CUT((java.lang.Object) iterator48);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray51 = hashSetTestDriver50.toArray();
        boolean boolean53 = hashSetTestDriver50.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator54 = hashSetTestDriver50.iterator();
        boolean boolean56 = hashSetTestDriver50.add((java.lang.Object) ' ');
        boolean boolean57 = hashSetTestDriver29.contains((java.lang.Object) hashSetTestDriver50);
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray59 = hashSetTestDriver58.toArray();
        boolean boolean61 = hashSetTestDriver58.contains((java.lang.Object) (-1.0f));
        int int62 = hashSetTestDriver58.size();
        boolean boolean63 = hashSetTestDriver50.equals_CUT((java.lang.Object) hashSetTestDriver58);
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray65 = hashSetTestDriver64.toArray();
        boolean boolean67 = hashSetTestDriver64.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator68 = hashSetTestDriver64.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray70 = hashSetTestDriver69.toArray();
        boolean boolean72 = hashSetTestDriver69.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator73 = hashSetTestDriver69.iterator();
        java.lang.Object[] objArray74 = hashSetTestDriver69.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver75 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray76 = hashSetTestDriver75.toArray();
        boolean boolean78 = hashSetTestDriver75.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator79 = hashSetTestDriver75.iterator();
        int int80 = hashSetTestDriver75.size();
        boolean boolean82 = hashSetTestDriver75.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray83 = hashSetTestDriver75.toArray();
        boolean boolean84 = hashSetTestDriver69.equals_CUT((java.lang.Object) objArray83);
        boolean boolean85 = hashSetTestDriver64.equals_CUT((java.lang.Object) hashSetTestDriver69);
        boolean boolean86 = hashSetTestDriver50.remove((java.lang.Object) hashSetTestDriver64);
        java.lang.Class<?> wildcardClass87 = hashSetTestDriver50.getClass();
        boolean boolean88 = hashSetTestDriver7.contains((java.lang.Object) wildcardClass87);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test055");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver9.clear();
        boolean boolean15 = hashSetTestDriver9.contains((java.lang.Object) 'a');
        boolean boolean16 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray18 = hashSetTestDriver17.toArray();
        boolean boolean20 = hashSetTestDriver17.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator21 = hashSetTestDriver17.iterator();
        boolean boolean23 = hashSetTestDriver17.equals_CUT((java.lang.Object) (-1L));
        boolean boolean24 = hashSetTestDriver17.isEmpty();
        boolean boolean25 = hashSetTestDriver0.remove((java.lang.Object) boolean24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test056");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean7 = hashSetTestDriver4.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator8 = hashSetTestDriver4.iterator();
        experiment.util.Iterator iterator9 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator14 = hashSetTestDriver10.iterator();
        boolean boolean16 = hashSetTestDriver10.equals_CUT((java.lang.Object) (-1L));
        boolean boolean17 = hashSetTestDriver4.remove((java.lang.Object) (-1L));
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator19 = hashSetTestDriver4.iterator();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator19);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean24 = hashSetTestDriver21.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator25 = hashSetTestDriver21.iterator();
        boolean boolean27 = hashSetTestDriver21.add((java.lang.Object) ' ');
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver21);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        int int33 = hashSetTestDriver29.size();
        boolean boolean34 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver29);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        boolean boolean38 = hashSetTestDriver35.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator39 = hashSetTestDriver35.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray41 = hashSetTestDriver40.toArray();
        boolean boolean43 = hashSetTestDriver40.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator44 = hashSetTestDriver40.iterator();
        java.lang.Object[] objArray45 = hashSetTestDriver40.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray47 = hashSetTestDriver46.toArray();
        boolean boolean49 = hashSetTestDriver46.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator50 = hashSetTestDriver46.iterator();
        int int51 = hashSetTestDriver46.size();
        boolean boolean53 = hashSetTestDriver46.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray54 = hashSetTestDriver46.toArray();
        boolean boolean55 = hashSetTestDriver40.equals_CUT((java.lang.Object) objArray54);
        boolean boolean56 = hashSetTestDriver35.equals_CUT((java.lang.Object) hashSetTestDriver40);
        boolean boolean57 = hashSetTestDriver21.remove((java.lang.Object) hashSetTestDriver35);
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray59 = hashSetTestDriver58.toArray();
        boolean boolean61 = hashSetTestDriver58.contains((java.lang.Object) (-1.0f));
        boolean boolean63 = hashSetTestDriver58.add((java.lang.Object) "hi!");
        boolean boolean65 = hashSetTestDriver58.add((java.lang.Object) 0.0f);
        boolean boolean66 = hashSetTestDriver35.contains((java.lang.Object) hashSetTestDriver58);
        java.lang.Object[] objArray67 = hashSetTestDriver35.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test057");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1L));
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        boolean boolean11 = hashSetTestDriver8.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator12 = hashSetTestDriver8.iterator();
        int int13 = hashSetTestDriver8.size();
        int int14 = hashSetTestDriver8.size();
        boolean boolean15 = hashSetTestDriver0.add((java.lang.Object) int14);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator19 = hashSetTestDriver16.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray21 = hashSetTestDriver20.toArray();
        boolean boolean23 = hashSetTestDriver20.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator24 = hashSetTestDriver20.iterator();
        boolean boolean26 = hashSetTestDriver20.add((java.lang.Object) ' ');
        hashSetTestDriver20.clear();
        boolean boolean28 = hashSetTestDriver16.equals_CUT((java.lang.Object) hashSetTestDriver20);
        boolean boolean29 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver16);
        boolean boolean31 = hashSetTestDriver0.add((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test058");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray8 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray10 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test059");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        boolean boolean7 = hashSetTestDriver4.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator8 = hashSetTestDriver4.iterator();
        experiment.util.Iterator iterator9 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        boolean boolean13 = hashSetTestDriver10.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator14 = hashSetTestDriver10.iterator();
        boolean boolean16 = hashSetTestDriver10.equals_CUT((java.lang.Object) (-1L));
        boolean boolean17 = hashSetTestDriver4.remove((java.lang.Object) (-1L));
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator19 = hashSetTestDriver4.iterator();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator19);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray22 = hashSetTestDriver21.toArray();
        boolean boolean24 = hashSetTestDriver21.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator25 = hashSetTestDriver21.iterator();
        boolean boolean27 = hashSetTestDriver21.add((java.lang.Object) ' ');
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver21);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        int int33 = hashSetTestDriver29.size();
        boolean boolean34 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver29);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        boolean boolean38 = hashSetTestDriver35.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator39 = hashSetTestDriver35.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray41 = hashSetTestDriver40.toArray();
        boolean boolean43 = hashSetTestDriver40.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator44 = hashSetTestDriver40.iterator();
        java.lang.Object[] objArray45 = hashSetTestDriver40.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray47 = hashSetTestDriver46.toArray();
        boolean boolean49 = hashSetTestDriver46.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator50 = hashSetTestDriver46.iterator();
        int int51 = hashSetTestDriver46.size();
        boolean boolean53 = hashSetTestDriver46.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray54 = hashSetTestDriver46.toArray();
        boolean boolean55 = hashSetTestDriver40.equals_CUT((java.lang.Object) objArray54);
        boolean boolean56 = hashSetTestDriver35.equals_CUT((java.lang.Object) hashSetTestDriver40);
        boolean boolean57 = hashSetTestDriver21.remove((java.lang.Object) hashSetTestDriver35);
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray59 = hashSetTestDriver58.toArray();
        boolean boolean61 = hashSetTestDriver58.contains((java.lang.Object) (-1.0f));
        boolean boolean63 = hashSetTestDriver58.add((java.lang.Object) "hi!");
        boolean boolean65 = hashSetTestDriver58.add((java.lang.Object) 0.0f);
        boolean boolean66 = hashSetTestDriver35.contains((java.lang.Object) hashSetTestDriver58);
        experiment.util.Iterator iterator67 = hashSetTestDriver35.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(iterator67);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test060");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        boolean boolean5 = hashSetTestDriver0.add((java.lang.Object) "hi!");
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator13 = hashSetTestDriver9.iterator();
        boolean boolean15 = hashSetTestDriver9.remove((java.lang.Object) '4');
        boolean boolean17 = hashSetTestDriver9.equals_CUT((java.lang.Object) (-1.0f));
        boolean boolean18 = hashSetTestDriver0.contains((java.lang.Object) boolean17);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = hashSetTestDriver0.equals_CUT(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test061");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        boolean boolean9 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        java.lang.Class<?> wildcardClass12 = hashSetTestDriver10.getClass();
        boolean boolean13 = hashSetTestDriver0.equals_CUT((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test062");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        int int6 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator11 = hashSetTestDriver8.iterator();
        experiment.util.Iterator iterator12 = hashSetTestDriver8.iterator();
        hashSetTestDriver8.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        boolean boolean17 = hashSetTestDriver14.contains((java.lang.Object) (-1.0f));
        int int18 = hashSetTestDriver14.size();
        boolean boolean20 = hashSetTestDriver14.equals_CUT((java.lang.Object) '4');
        boolean boolean21 = hashSetTestDriver8.contains((java.lang.Object) boolean20);
        boolean boolean22 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver8);
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray24 = hashSetTestDriver23.toArray();
        boolean boolean26 = hashSetTestDriver23.contains((java.lang.Object) (-1.0f));
        boolean boolean27 = hashSetTestDriver23.isEmpty();
        hashSetTestDriver23.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        boolean boolean32 = hashSetTestDriver29.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator33 = hashSetTestDriver29.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray35 = hashSetTestDriver34.toArray();
        boolean boolean37 = hashSetTestDriver34.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator38 = hashSetTestDriver34.iterator();
        java.lang.Object[] objArray39 = hashSetTestDriver34.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray41 = hashSetTestDriver40.toArray();
        boolean boolean43 = hashSetTestDriver40.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator44 = hashSetTestDriver40.iterator();
        int int45 = hashSetTestDriver40.size();
        boolean boolean47 = hashSetTestDriver40.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray48 = hashSetTestDriver40.toArray();
        boolean boolean49 = hashSetTestDriver34.equals_CUT((java.lang.Object) objArray48);
        boolean boolean50 = hashSetTestDriver29.equals_CUT((java.lang.Object) hashSetTestDriver34);
        boolean boolean51 = hashSetTestDriver23.equals_CUT((java.lang.Object) boolean50);
        boolean boolean52 = hashSetTestDriver0.remove((java.lang.Object) boolean51);
        java.lang.Object obj53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = hashSetTestDriver0.add(obj53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test063");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        boolean boolean9 = hashSetTestDriver6.contains((java.lang.Object) (-1.0f));
        int int10 = hashSetTestDriver6.size();
        boolean boolean12 = hashSetTestDriver6.equals_CUT((java.lang.Object) '4');
        boolean boolean13 = hashSetTestDriver0.contains((java.lang.Object) boolean12);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        boolean boolean17 = hashSetTestDriver14.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator18 = hashSetTestDriver14.iterator();
        int int19 = hashSetTestDriver14.size();
        boolean boolean21 = hashSetTestDriver14.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray22 = hashSetTestDriver14.toArray();
        hashSetTestDriver14.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        boolean boolean27 = hashSetTestDriver24.contains((java.lang.Object) (-1.0f));
        int int28 = hashSetTestDriver24.size();
        boolean boolean30 = hashSetTestDriver24.equals_CUT((java.lang.Object) '4');
        boolean boolean31 = hashSetTestDriver14.remove((java.lang.Object) hashSetTestDriver24);
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray33 = hashSetTestDriver32.toArray();
        boolean boolean35 = hashSetTestDriver32.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator36 = hashSetTestDriver32.iterator();
        int int37 = hashSetTestDriver32.size();
        boolean boolean39 = hashSetTestDriver32.contains((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator40 = hashSetTestDriver32.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray42 = hashSetTestDriver41.toArray();
        boolean boolean44 = hashSetTestDriver41.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver41.clear();
        boolean boolean47 = hashSetTestDriver41.contains((java.lang.Object) 'a');
        boolean boolean48 = hashSetTestDriver32.equals_CUT((java.lang.Object) hashSetTestDriver41);
        experiment.util.Iterator iterator49 = hashSetTestDriver41.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray51 = hashSetTestDriver50.toArray();
        boolean boolean53 = hashSetTestDriver50.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator54 = hashSetTestDriver50.iterator();
        boolean boolean56 = hashSetTestDriver50.add((java.lang.Object) ' ');
        boolean boolean57 = hashSetTestDriver41.contains((java.lang.Object) boolean56);
        java.lang.Object obj58 = hashSetTestDriver14.getMatch((java.lang.Object) hashSetTestDriver41);
        java.lang.Object obj59 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver14);
        java.lang.Object[] objArray60 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1256357748_1024_0.test064");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        boolean boolean3 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray10 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver9.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator13 = hashSetTestDriver9.iterator();
        int int14 = hashSetTestDriver9.size();
        boolean boolean16 = hashSetTestDriver9.contains((java.lang.Object) 100.0f);
        experiment.util.Iterator iterator17 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray19 = hashSetTestDriver18.toArray();
        boolean boolean21 = hashSetTestDriver18.contains((java.lang.Object) (-1.0f));
        hashSetTestDriver18.clear();
        boolean boolean24 = hashSetTestDriver18.contains((java.lang.Object) 'a');
        boolean boolean25 = hashSetTestDriver9.equals_CUT((java.lang.Object) hashSetTestDriver18);
        experiment.util.Iterator iterator26 = hashSetTestDriver18.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray28 = hashSetTestDriver27.toArray();
        boolean boolean30 = hashSetTestDriver27.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator31 = hashSetTestDriver27.iterator();
        boolean boolean33 = hashSetTestDriver27.add((java.lang.Object) ' ');
        boolean boolean34 = hashSetTestDriver18.contains((java.lang.Object) boolean33);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        boolean boolean38 = hashSetTestDriver35.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator39 = hashSetTestDriver35.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray41 = hashSetTestDriver40.toArray();
        boolean boolean43 = hashSetTestDriver40.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator44 = hashSetTestDriver40.iterator();
        java.lang.Object[] objArray45 = hashSetTestDriver40.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray47 = hashSetTestDriver46.toArray();
        boolean boolean49 = hashSetTestDriver46.contains((java.lang.Object) (-1.0f));
        experiment.util.Iterator iterator50 = hashSetTestDriver46.iterator();
        int int51 = hashSetTestDriver46.size();
        boolean boolean53 = hashSetTestDriver46.contains((java.lang.Object) 100.0f);
        java.lang.Object[] objArray54 = hashSetTestDriver46.toArray();
        boolean boolean55 = hashSetTestDriver40.equals_CUT((java.lang.Object) objArray54);
        boolean boolean56 = hashSetTestDriver35.equals_CUT((java.lang.Object) hashSetTestDriver40);
        boolean boolean57 = hashSetTestDriver18.add((java.lang.Object) hashSetTestDriver40);
        boolean boolean58 = hashSetTestDriver18.isEmpty();
        boolean boolean59 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean58);
        boolean boolean60 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

}
