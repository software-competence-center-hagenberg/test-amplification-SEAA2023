package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_2070236138_32_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test002");
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
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = hashSetTestDriver0.getMatch(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
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
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        boolean boolean5 = hashSetTestDriver0.add((java.lang.Object) 1.0d);
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass8 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        int int5 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        boolean boolean8 = hashSetTestDriver0.add((java.lang.Object) true);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) (byte) 0);
        boolean boolean6 = hashSetTestDriver0.add((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = hashSetTestDriver0.getMatch(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator2 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver1.add((java.lang.Object) 0);
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) boolean4);
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = hashSetTestDriver0.remove(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) '4');
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass9 = iterator8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        int int6 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        hashSetTestDriver7.clear();
        boolean boolean11 = hashSetTestDriver7.contains((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator12 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = hashSetTestDriver13.equals_CUT(obj15);
        experiment.util.Iterator iterator17 = hashSetTestDriver13.iterator();
        boolean boolean18 = hashSetTestDriver7.equals_CUT((java.lang.Object) iterator17);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray5 = hashSetTestDriver4.toArray();
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = hashSetTestDriver4.equals_CUT(obj6);
        java.lang.Object obj9 = hashSetTestDriver4.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray10 = hashSetTestDriver4.toArray();
        int int11 = hashSetTestDriver4.size();
        java.lang.Object obj13 = hashSetTestDriver4.getMatch((java.lang.Object) (byte) 1);
        int int14 = hashSetTestDriver4.size();
        experiment.util.Iterator iterator15 = hashSetTestDriver4.iterator();
        experiment.util.Iterator iterator16 = hashSetTestDriver4.iterator();
        boolean boolean17 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = hashSetTestDriver6.equals_CUT(obj8);
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        boolean boolean11 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator10);
        int int12 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = hashSetTestDriver13.equals_CUT(obj15);
        boolean boolean18 = hashSetTestDriver13.add((java.lang.Object) 1.0d);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) boolean18);
        boolean boolean20 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray21 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass22 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = hashSetTestDriver0.equals_CUT(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        int int7 = hashSetTestDriver0.size();
        java.lang.Object obj9 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = hashSetTestDriver11.equals_CUT(obj13);
        java.lang.Object obj16 = hashSetTestDriver11.getMatch((java.lang.Object) (-1));
        int int17 = hashSetTestDriver11.size();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator20 = hashSetTestDriver19.iterator();
        boolean boolean22 = hashSetTestDriver19.add((java.lang.Object) 0);
        boolean boolean23 = hashSetTestDriver18.remove((java.lang.Object) boolean22);
        java.lang.Object[] objArray24 = hashSetTestDriver18.toArray();
        java.lang.Object obj25 = hashSetTestDriver11.getMatch((java.lang.Object) hashSetTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = hashSetTestDriver0.getMatch(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test018");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator7 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass8 = iterator7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        int int7 = hashSetTestDriver0.size();
        java.lang.Object obj9 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        int int10 = hashSetTestDriver0.size();
        experiment.util.Iterator iterator11 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator12 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass13 = iterator12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test020");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = hashSetTestDriver6.equals_CUT(obj8);
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        boolean boolean11 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator10);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator13 = hashSetTestDriver12.iterator();
        int int14 = hashSetTestDriver12.size();
        boolean boolean15 = hashSetTestDriver0.contains((java.lang.Object) int14);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = hashSetTestDriver16.equals_CUT(obj18);
        java.lang.Object obj21 = hashSetTestDriver16.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray22 = hashSetTestDriver16.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator25 = hashSetTestDriver24.iterator();
        boolean boolean27 = hashSetTestDriver24.add((java.lang.Object) 0);
        boolean boolean28 = hashSetTestDriver23.remove((java.lang.Object) boolean27);
        java.lang.Object[] objArray29 = hashSetTestDriver23.toArray();
        boolean boolean30 = hashSetTestDriver16.remove((java.lang.Object) hashSetTestDriver23);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        java.lang.Object obj33 = hashSetTestDriver16.getMatch((java.lang.Object) hashSetTestDriver31);
        boolean boolean34 = hashSetTestDriver16.isEmpty();
        boolean boolean35 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean34);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator9 = hashSetTestDriver8.iterator();
        boolean boolean11 = hashSetTestDriver8.add((java.lang.Object) 0);
        boolean boolean12 = hashSetTestDriver7.remove((java.lang.Object) boolean11);
        java.lang.Object[] objArray13 = hashSetTestDriver7.toArray();
        boolean boolean14 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        java.lang.Object obj17 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver15);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = hashSetTestDriver15.add(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test022");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = hashSetTestDriver6.equals_CUT(obj8);
        experiment.util.Iterator iterator10 = hashSetTestDriver6.iterator();
        boolean boolean11 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator10);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator13 = hashSetTestDriver12.iterator();
        int int14 = hashSetTestDriver12.size();
        boolean boolean15 = hashSetTestDriver0.contains((java.lang.Object) int14);
        boolean boolean16 = hashSetTestDriver0.isEmpty();
        int int17 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray19 = hashSetTestDriver18.toArray();
        hashSetTestDriver18.clear();
        boolean boolean22 = hashSetTestDriver18.contains((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator23 = hashSetTestDriver18.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray25 = hashSetTestDriver24.toArray();
        java.lang.Object obj26 = new java.lang.Object();
        boolean boolean27 = hashSetTestDriver24.equals_CUT(obj26);
        experiment.util.Iterator iterator28 = hashSetTestDriver24.iterator();
        boolean boolean29 = hashSetTestDriver18.equals_CUT((java.lang.Object) iterator28);
        int int30 = hashSetTestDriver18.size();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray32 = hashSetTestDriver31.toArray();
        java.lang.Object obj33 = new java.lang.Object();
        boolean boolean34 = hashSetTestDriver31.equals_CUT(obj33);
        boolean boolean36 = hashSetTestDriver31.add((java.lang.Object) 1.0d);
        java.lang.Object obj37 = hashSetTestDriver18.getMatch((java.lang.Object) boolean36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = hashSetTestDriver0.contains(obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test023");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass8 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test024");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) (byte) 1);
        int int8 = hashSetTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        int int5 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator8 = hashSetTestDriver7.iterator();
        boolean boolean10 = hashSetTestDriver7.add((java.lang.Object) 0);
        boolean boolean11 = hashSetTestDriver6.remove((java.lang.Object) boolean10);
        java.lang.Object[] objArray12 = hashSetTestDriver6.toArray();
        int int13 = hashSetTestDriver6.size();
        experiment.util.Iterator iterator14 = hashSetTestDriver6.iterator();
        boolean boolean15 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = hashSetTestDriver16.equals_CUT(obj18);
        java.lang.Object obj21 = hashSetTestDriver16.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray22 = hashSetTestDriver16.toArray();
        int int23 = hashSetTestDriver16.size();
        java.lang.Object obj25 = hashSetTestDriver16.getMatch((java.lang.Object) (byte) 1);
        int int26 = hashSetTestDriver16.size();
        experiment.util.Iterator iterator27 = hashSetTestDriver16.iterator();
        experiment.util.Iterator iterator28 = hashSetTestDriver16.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray30 = hashSetTestDriver29.toArray();
        hashSetTestDriver29.clear();
        boolean boolean33 = hashSetTestDriver29.contains((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator34 = hashSetTestDriver29.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = hashSetTestDriver35.equals_CUT(obj37);
        experiment.util.Iterator iterator39 = hashSetTestDriver35.iterator();
        boolean boolean40 = hashSetTestDriver29.equals_CUT((java.lang.Object) iterator39);
        boolean boolean41 = hashSetTestDriver16.remove((java.lang.Object) boolean40);
        boolean boolean42 = hashSetTestDriver0.remove((java.lang.Object) boolean40);
        java.lang.Class<?> wildcardClass43 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = hashSetTestDriver6.equals_CUT(obj8);
        java.lang.Object obj11 = hashSetTestDriver6.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray12 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        hashSetTestDriver13.clear();
        hashSetTestDriver13.clear();
        java.lang.Object[] objArray17 = hashSetTestDriver13.toArray();
        boolean boolean18 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver13);
        boolean boolean19 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver13);
        boolean boolean20 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator3 = hashSetTestDriver2.iterator();
        hashSetTestDriver2.clear();
        boolean boolean6 = hashSetTestDriver2.contains((java.lang.Object) (byte) 0);
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator9 = hashSetTestDriver8.iterator();
        boolean boolean11 = hashSetTestDriver8.add((java.lang.Object) 0);
        boolean boolean12 = hashSetTestDriver7.remove((java.lang.Object) boolean11);
        java.lang.Object[] objArray13 = hashSetTestDriver7.toArray();
        boolean boolean14 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver7);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        hashSetTestDriver16.clear();
        boolean boolean20 = hashSetTestDriver16.equals_CUT((java.lang.Object) 10.0f);
        int int21 = hashSetTestDriver16.size();
        hashSetTestDriver16.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator24 = hashSetTestDriver23.iterator();
        boolean boolean25 = hashSetTestDriver16.equals_CUT((java.lang.Object) hashSetTestDriver23);
        boolean boolean26 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver16);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) '4');
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        int int4 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test030");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        int int7 = hashSetTestDriver0.size();
        java.lang.Object obj9 = hashSetTestDriver0.getMatch((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray10 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator11 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        boolean boolean7 = hashSetTestDriver3.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = hashSetTestDriver8.equals_CUT(obj10);
        java.lang.Object obj13 = hashSetTestDriver8.getMatch((java.lang.Object) (-1));
        int int14 = hashSetTestDriver8.size();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator17 = hashSetTestDriver16.iterator();
        boolean boolean19 = hashSetTestDriver16.add((java.lang.Object) 0);
        boolean boolean20 = hashSetTestDriver15.remove((java.lang.Object) boolean19);
        java.lang.Object[] objArray21 = hashSetTestDriver15.toArray();
        java.lang.Object obj22 = hashSetTestDriver8.getMatch((java.lang.Object) hashSetTestDriver15);
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray24 = hashSetTestDriver23.toArray();
        hashSetTestDriver23.clear();
        boolean boolean26 = hashSetTestDriver23.isEmpty();
        boolean boolean27 = hashSetTestDriver23.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        boolean boolean30 = hashSetTestDriver28.remove((java.lang.Object) '4');
        java.lang.Object[] objArray31 = hashSetTestDriver28.toArray();
        java.lang.Object obj32 = hashSetTestDriver23.getMatch((java.lang.Object) hashSetTestDriver28);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator34 = hashSetTestDriver33.iterator();
        hashSetTestDriver33.clear();
        hashSetTestDriver33.clear();
        boolean boolean37 = hashSetTestDriver23.remove((java.lang.Object) hashSetTestDriver33);
        boolean boolean38 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver23);
        boolean boolean39 = hashSetTestDriver3.equals_CUT((java.lang.Object) hashSetTestDriver8);
        int int40 = hashSetTestDriver3.size();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

}
