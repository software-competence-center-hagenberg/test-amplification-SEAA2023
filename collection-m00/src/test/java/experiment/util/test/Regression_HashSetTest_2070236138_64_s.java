package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_2070236138_64_s {

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

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test033");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = hashSetTestDriver1.equals_CUT(obj3);
        java.lang.Object obj6 = hashSetTestDriver1.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray7 = hashSetTestDriver1.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator10 = hashSetTestDriver9.iterator();
        boolean boolean12 = hashSetTestDriver9.add((java.lang.Object) 0);
        boolean boolean13 = hashSetTestDriver8.remove((java.lang.Object) boolean12);
        java.lang.Object[] objArray14 = hashSetTestDriver8.toArray();
        boolean boolean15 = hashSetTestDriver1.remove((java.lang.Object) hashSetTestDriver8);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        java.lang.Object obj18 = hashSetTestDriver1.getMatch((java.lang.Object) hashSetTestDriver16);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver1);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray21 = hashSetTestDriver20.toArray();
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = hashSetTestDriver20.equals_CUT(obj22);
        java.lang.Object obj25 = hashSetTestDriver20.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray26 = hashSetTestDriver20.toArray();
        int int27 = hashSetTestDriver20.size();
        java.lang.Object obj29 = hashSetTestDriver20.getMatch((java.lang.Object) (byte) 1);
        int int30 = hashSetTestDriver20.size();
        java.lang.Object obj31 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver20);
        java.lang.Class<?> wildcardClass32 = hashSetTestDriver20.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test034");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator3 = hashSetTestDriver2.iterator();
        hashSetTestDriver2.clear();
        boolean boolean6 = hashSetTestDriver2.contains((java.lang.Object) (byte) 0);
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray9 = hashSetTestDriver0.toArray();
        boolean boolean10 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test035");
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
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator14 = hashSetTestDriver13.iterator();
        hashSetTestDriver13.clear();
        boolean boolean17 = hashSetTestDriver13.contains((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = hashSetTestDriver13.toArray();
        boolean boolean19 = hashSetTestDriver13.isEmpty();
        java.lang.Object obj20 = hashSetTestDriver0.getMatch((java.lang.Object) boolean19);
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator22 = hashSetTestDriver21.iterator();
        hashSetTestDriver21.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.remove((java.lang.Object) '4');
        boolean boolean27 = hashSetTestDriver21.remove((java.lang.Object) hashSetTestDriver24);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray29 = hashSetTestDriver28.toArray();
        hashSetTestDriver28.clear();
        hashSetTestDriver28.clear();
        experiment.util.Iterator iterator32 = hashSetTestDriver28.iterator();
        java.lang.Object obj33 = hashSetTestDriver21.getMatch((java.lang.Object) iterator32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = hashSetTestDriver0.equals_CUT(obj33);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test036");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        boolean boolean7 = hashSetTestDriver3.isEmpty();
        java.lang.Object[] objArray8 = hashSetTestDriver3.toArray();
        hashSetTestDriver3.clear();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test037");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator3 = hashSetTestDriver2.iterator();
        hashSetTestDriver2.clear();
        boolean boolean6 = hashSetTestDriver2.contains((java.lang.Object) (byte) 0);
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray9 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray11 = hashSetTestDriver10.toArray();
        java.lang.Object obj12 = new java.lang.Object();
        boolean boolean13 = hashSetTestDriver10.equals_CUT(obj12);
        java.lang.Object obj15 = hashSetTestDriver10.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray16 = hashSetTestDriver10.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator19 = hashSetTestDriver18.iterator();
        boolean boolean21 = hashSetTestDriver18.add((java.lang.Object) 0);
        boolean boolean22 = hashSetTestDriver17.remove((java.lang.Object) boolean21);
        java.lang.Object[] objArray23 = hashSetTestDriver17.toArray();
        boolean boolean24 = hashSetTestDriver10.remove((java.lang.Object) hashSetTestDriver17);
        hashSetTestDriver10.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray27 = hashSetTestDriver26.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator29 = hashSetTestDriver28.iterator();
        hashSetTestDriver28.clear();
        boolean boolean32 = hashSetTestDriver28.contains((java.lang.Object) (byte) 0);
        boolean boolean33 = hashSetTestDriver26.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator34 = hashSetTestDriver26.iterator();
        int int35 = hashSetTestDriver26.size();
        boolean boolean36 = hashSetTestDriver10.equals_CUT((java.lang.Object) int35);
        boolean boolean37 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver10);
        boolean boolean38 = hashSetTestDriver10.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test038");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver3.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test039");
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
        boolean boolean16 = hashSetTestDriver6.isEmpty();
        hashSetTestDriver6.clear();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test040");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        boolean boolean7 = hashSetTestDriver3.isEmpty();
        java.lang.Object[] objArray8 = hashSetTestDriver3.toArray();
        java.lang.Object[] objArray9 = hashSetTestDriver3.toArray();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test041");
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
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = hashSetTestDriver18.equals_CUT(obj20);
        java.lang.Object obj23 = hashSetTestDriver18.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray24 = hashSetTestDriver18.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator27 = hashSetTestDriver26.iterator();
        boolean boolean29 = hashSetTestDriver26.add((java.lang.Object) 0);
        boolean boolean30 = hashSetTestDriver25.remove((java.lang.Object) boolean29);
        java.lang.Object[] objArray31 = hashSetTestDriver25.toArray();
        boolean boolean32 = hashSetTestDriver18.remove((java.lang.Object) hashSetTestDriver25);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray34 = hashSetTestDriver33.toArray();
        java.lang.Object obj35 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver33);
        hashSetTestDriver33.clear();
        boolean boolean37 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver33);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator39 = hashSetTestDriver38.iterator();
        int int40 = hashSetTestDriver38.size();
        boolean boolean41 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver38);
        hashSetTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test042");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator7 = hashSetTestDriver6.iterator();
        boolean boolean9 = hashSetTestDriver6.add((java.lang.Object) 0);
        boolean boolean10 = hashSetTestDriver5.remove((java.lang.Object) boolean9);
        java.lang.Object[] objArray11 = hashSetTestDriver5.toArray();
        int int12 = hashSetTestDriver5.size();
        experiment.util.Iterator iterator13 = hashSetTestDriver5.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray15 = hashSetTestDriver14.toArray();
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = hashSetTestDriver14.equals_CUT(obj16);
        java.lang.Object obj19 = hashSetTestDriver14.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray20 = hashSetTestDriver14.toArray();
        int int21 = hashSetTestDriver14.size();
        java.lang.Object obj23 = hashSetTestDriver14.getMatch((java.lang.Object) (byte) 1);
        hashSetTestDriver14.clear();
        boolean boolean25 = hashSetTestDriver5.equals_CUT((java.lang.Object) hashSetTestDriver14);
        boolean boolean26 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver14);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test043");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) "hi!");
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test044");
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
        boolean boolean41 = hashSetTestDriver3.contains((java.lang.Object) '4');
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test045");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        boolean boolean5 = hashSetTestDriver3.remove((java.lang.Object) '4');
        boolean boolean6 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver3);
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = hashSetTestDriver7.equals_CUT(obj9);
        java.lang.Object obj12 = hashSetTestDriver7.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray13 = hashSetTestDriver7.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator16 = hashSetTestDriver15.iterator();
        boolean boolean18 = hashSetTestDriver15.add((java.lang.Object) 0);
        boolean boolean19 = hashSetTestDriver14.remove((java.lang.Object) boolean18);
        java.lang.Object[] objArray20 = hashSetTestDriver14.toArray();
        boolean boolean21 = hashSetTestDriver7.remove((java.lang.Object) hashSetTestDriver14);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray23 = hashSetTestDriver22.toArray();
        java.lang.Object obj24 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver22);
        experiment.util.Iterator iterator25 = hashSetTestDriver22.iterator();
        java.lang.Class<?> wildcardClass26 = iterator25.getClass();
        boolean boolean27 = hashSetTestDriver3.add((java.lang.Object) iterator25);
        java.lang.Class<?> wildcardClass28 = hashSetTestDriver3.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test046");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator3 = hashSetTestDriver2.iterator();
        hashSetTestDriver2.clear();
        boolean boolean6 = hashSetTestDriver2.contains((java.lang.Object) (byte) 0);
        boolean boolean7 = hashSetTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray9 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator12 = hashSetTestDriver11.iterator();
        boolean boolean14 = hashSetTestDriver11.add((java.lang.Object) 0);
        boolean boolean15 = hashSetTestDriver10.remove((java.lang.Object) boolean14);
        experiment.util.Iterator iterator16 = hashSetTestDriver10.iterator();
        hashSetTestDriver10.clear();
        java.lang.Object obj18 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test047");
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
        hashSetTestDriver15.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = hashSetTestDriver19.equals_CUT(obj21);
        java.lang.Object obj24 = hashSetTestDriver19.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray25 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator28 = hashSetTestDriver27.iterator();
        boolean boolean30 = hashSetTestDriver27.add((java.lang.Object) 0);
        boolean boolean31 = hashSetTestDriver26.remove((java.lang.Object) boolean30);
        java.lang.Object[] objArray32 = hashSetTestDriver26.toArray();
        boolean boolean33 = hashSetTestDriver19.remove((java.lang.Object) hashSetTestDriver26);
        hashSetTestDriver19.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = hashSetTestDriver35.equals_CUT(obj37);
        java.lang.Object obj40 = hashSetTestDriver35.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray41 = hashSetTestDriver35.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator44 = hashSetTestDriver43.iterator();
        boolean boolean46 = hashSetTestDriver43.add((java.lang.Object) 0);
        boolean boolean47 = hashSetTestDriver42.remove((java.lang.Object) boolean46);
        java.lang.Object[] objArray48 = hashSetTestDriver42.toArray();
        boolean boolean49 = hashSetTestDriver35.remove((java.lang.Object) hashSetTestDriver42);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray51 = hashSetTestDriver50.toArray();
        java.lang.Object obj52 = hashSetTestDriver35.getMatch((java.lang.Object) hashSetTestDriver50);
        experiment.util.Iterator iterator53 = hashSetTestDriver50.iterator();
        java.lang.Class<?> wildcardClass54 = iterator53.getClass();
        boolean boolean55 = hashSetTestDriver19.contains((java.lang.Object) wildcardClass54);
        java.lang.Object[] objArray56 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray58 = hashSetTestDriver57.toArray();
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = hashSetTestDriver57.equals_CUT(obj59);
        java.lang.Object obj62 = hashSetTestDriver57.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray63 = hashSetTestDriver57.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray65 = hashSetTestDriver64.toArray();
        hashSetTestDriver64.clear();
        hashSetTestDriver64.clear();
        java.lang.Object[] objArray68 = hashSetTestDriver64.toArray();
        boolean boolean69 = hashSetTestDriver57.contains((java.lang.Object) hashSetTestDriver64);
        hashSetTestDriver57.clear();
        boolean boolean71 = hashSetTestDriver19.add((java.lang.Object) hashSetTestDriver57);
        boolean boolean72 = hashSetTestDriver15.equals_CUT((java.lang.Object) hashSetTestDriver57);
        java.lang.Class<?> wildcardClass73 = hashSetTestDriver15.getClass();
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
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test048");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator2 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver1.add((java.lang.Object) 0);
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) boolean4);
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray9 = hashSetTestDriver8.toArray();
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = hashSetTestDriver8.equals_CUT(obj10);
        java.lang.Object obj13 = hashSetTestDriver8.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray14 = hashSetTestDriver8.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator17 = hashSetTestDriver16.iterator();
        boolean boolean19 = hashSetTestDriver16.add((java.lang.Object) 0);
        boolean boolean20 = hashSetTestDriver15.remove((java.lang.Object) boolean19);
        java.lang.Object[] objArray21 = hashSetTestDriver15.toArray();
        boolean boolean22 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver15);
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray24 = hashSetTestDriver23.toArray();
        java.lang.Object obj25 = hashSetTestDriver8.getMatch((java.lang.Object) hashSetTestDriver23);
        hashSetTestDriver23.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray28 = hashSetTestDriver27.toArray();
        hashSetTestDriver27.clear();
        hashSetTestDriver27.clear();
        experiment.util.Iterator iterator31 = hashSetTestDriver27.iterator();
        java.lang.Class<?> wildcardClass32 = iterator31.getClass();
        boolean boolean33 = hashSetTestDriver23.equals_CUT((java.lang.Object) wildcardClass32);
        boolean boolean34 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean33);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test049");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        int int6 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test050");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator2 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test051");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray6 = hashSetTestDriver5.toArray();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = hashSetTestDriver5.equals_CUT(obj7);
        java.lang.Object obj10 = hashSetTestDriver5.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray11 = hashSetTestDriver5.toArray();
        int int12 = hashSetTestDriver5.size();
        java.lang.Object obj14 = hashSetTestDriver5.getMatch((java.lang.Object) (byte) 1);
        int int15 = hashSetTestDriver5.size();
        experiment.util.Iterator iterator16 = hashSetTestDriver5.iterator();
        experiment.util.Iterator iterator17 = hashSetTestDriver5.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator19 = hashSetTestDriver18.iterator();
        hashSetTestDriver18.clear();
        boolean boolean22 = hashSetTestDriver18.contains((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = hashSetTestDriver18.toArray();
        boolean boolean24 = hashSetTestDriver18.isEmpty();
        java.lang.Object obj25 = hashSetTestDriver5.getMatch((java.lang.Object) boolean24);
        boolean boolean27 = hashSetTestDriver5.equals_CUT((java.lang.Object) 10);
        boolean boolean28 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        java.lang.Class<?> wildcardClass29 = hashSetTestDriver5.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test052");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator2 = hashSetTestDriver1.iterator();
        boolean boolean4 = hashSetTestDriver1.add((java.lang.Object) 0);
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) boolean4);
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        hashSetTestDriver7.clear();
        hashSetTestDriver7.clear();
        boolean boolean11 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver7);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test053");
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
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = hashSetTestDriver18.equals_CUT(obj20);
        java.lang.Object obj23 = hashSetTestDriver18.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray24 = hashSetTestDriver18.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator27 = hashSetTestDriver26.iterator();
        boolean boolean29 = hashSetTestDriver26.add((java.lang.Object) 0);
        boolean boolean30 = hashSetTestDriver25.remove((java.lang.Object) boolean29);
        java.lang.Object[] objArray31 = hashSetTestDriver25.toArray();
        boolean boolean32 = hashSetTestDriver18.remove((java.lang.Object) hashSetTestDriver25);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray34 = hashSetTestDriver33.toArray();
        java.lang.Object obj35 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver33);
        hashSetTestDriver33.clear();
        boolean boolean37 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver33);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray39 = hashSetTestDriver38.toArray();
        hashSetTestDriver38.clear();
        boolean boolean42 = hashSetTestDriver38.equals_CUT((java.lang.Object) 10.0f);
        int int43 = hashSetTestDriver38.size();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator46 = hashSetTestDriver45.iterator();
        boolean boolean48 = hashSetTestDriver45.add((java.lang.Object) 0);
        boolean boolean49 = hashSetTestDriver44.remove((java.lang.Object) boolean48);
        java.lang.Object[] objArray50 = hashSetTestDriver44.toArray();
        int int51 = hashSetTestDriver44.size();
        experiment.util.Iterator iterator52 = hashSetTestDriver44.iterator();
        boolean boolean53 = hashSetTestDriver38.remove((java.lang.Object) hashSetTestDriver44);
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray55 = hashSetTestDriver54.toArray();
        java.lang.Object obj56 = new java.lang.Object();
        boolean boolean57 = hashSetTestDriver54.equals_CUT(obj56);
        java.lang.Object obj59 = hashSetTestDriver54.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray60 = hashSetTestDriver54.toArray();
        int int61 = hashSetTestDriver54.size();
        java.lang.Object obj63 = hashSetTestDriver54.getMatch((java.lang.Object) (byte) 1);
        int int64 = hashSetTestDriver54.size();
        experiment.util.Iterator iterator65 = hashSetTestDriver54.iterator();
        experiment.util.Iterator iterator66 = hashSetTestDriver54.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver67 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray68 = hashSetTestDriver67.toArray();
        hashSetTestDriver67.clear();
        boolean boolean71 = hashSetTestDriver67.contains((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator72 = hashSetTestDriver67.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray74 = hashSetTestDriver73.toArray();
        java.lang.Object obj75 = new java.lang.Object();
        boolean boolean76 = hashSetTestDriver73.equals_CUT(obj75);
        experiment.util.Iterator iterator77 = hashSetTestDriver73.iterator();
        boolean boolean78 = hashSetTestDriver67.equals_CUT((java.lang.Object) iterator77);
        boolean boolean79 = hashSetTestDriver54.remove((java.lang.Object) boolean78);
        boolean boolean80 = hashSetTestDriver38.remove((java.lang.Object) boolean78);
        boolean boolean81 = hashSetTestDriver33.contains((java.lang.Object) boolean78);
        java.lang.Class<?> wildcardClass82 = hashSetTestDriver33.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test054");
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
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = hashSetTestDriver18.equals_CUT(obj20);
        java.lang.Object obj23 = hashSetTestDriver18.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray24 = hashSetTestDriver18.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator27 = hashSetTestDriver26.iterator();
        boolean boolean29 = hashSetTestDriver26.add((java.lang.Object) 0);
        boolean boolean30 = hashSetTestDriver25.remove((java.lang.Object) boolean29);
        java.lang.Object[] objArray31 = hashSetTestDriver25.toArray();
        boolean boolean32 = hashSetTestDriver18.remove((java.lang.Object) hashSetTestDriver25);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray34 = hashSetTestDriver33.toArray();
        java.lang.Object obj35 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver33);
        hashSetTestDriver33.clear();
        boolean boolean37 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver33);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator39 = hashSetTestDriver38.iterator();
        int int40 = hashSetTestDriver38.size();
        boolean boolean41 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver38);
        boolean boolean42 = hashSetTestDriver38.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test055");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = iterator6.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test056");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        int int6 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator9 = hashSetTestDriver8.iterator();
        boolean boolean11 = hashSetTestDriver8.add((java.lang.Object) 0);
        boolean boolean12 = hashSetTestDriver7.remove((java.lang.Object) boolean11);
        java.lang.Object[] objArray13 = hashSetTestDriver7.toArray();
        java.lang.Object obj14 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        hashSetTestDriver15.clear();
        boolean boolean18 = hashSetTestDriver15.isEmpty();
        boolean boolean19 = hashSetTestDriver15.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.remove((java.lang.Object) '4');
        java.lang.Object[] objArray23 = hashSetTestDriver20.toArray();
        java.lang.Object obj24 = hashSetTestDriver15.getMatch((java.lang.Object) hashSetTestDriver20);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator26 = hashSetTestDriver25.iterator();
        hashSetTestDriver25.clear();
        hashSetTestDriver25.clear();
        boolean boolean29 = hashSetTestDriver15.remove((java.lang.Object) hashSetTestDriver25);
        boolean boolean30 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver15);
        java.lang.Class<?> wildcardClass31 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test057");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray7 = hashSetTestDriver6.toArray();
        hashSetTestDriver6.clear();
        boolean boolean10 = hashSetTestDriver6.equals_CUT((java.lang.Object) 10.0f);
        boolean boolean11 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray13 = hashSetTestDriver12.toArray();
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = hashSetTestDriver12.equals_CUT(obj14);
        java.lang.Object obj17 = hashSetTestDriver12.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray18 = hashSetTestDriver12.toArray();
        int int19 = hashSetTestDriver12.size();
        java.lang.Object obj21 = hashSetTestDriver12.getMatch((java.lang.Object) (byte) 1);
        int int22 = hashSetTestDriver12.size();
        experiment.util.Iterator iterator23 = hashSetTestDriver12.iterator();
        experiment.util.Iterator iterator24 = hashSetTestDriver12.iterator();
        boolean boolean25 = hashSetTestDriver12.isEmpty();
        boolean boolean26 = hashSetTestDriver6.add((java.lang.Object) boolean25);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray28 = hashSetTestDriver27.toArray();
        hashSetTestDriver27.clear();
        boolean boolean31 = hashSetTestDriver27.contains((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator32 = hashSetTestDriver27.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray34 = hashSetTestDriver33.toArray();
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = hashSetTestDriver33.equals_CUT(obj35);
        experiment.util.Iterator iterator37 = hashSetTestDriver33.iterator();
        boolean boolean38 = hashSetTestDriver27.equals_CUT((java.lang.Object) iterator37);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator40 = hashSetTestDriver39.iterator();
        int int41 = hashSetTestDriver39.size();
        boolean boolean42 = hashSetTestDriver27.contains((java.lang.Object) int41);
        boolean boolean43 = hashSetTestDriver27.isEmpty();
        int int44 = hashSetTestDriver27.size();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray46 = hashSetTestDriver45.toArray();
        java.lang.Object obj47 = new java.lang.Object();
        boolean boolean48 = hashSetTestDriver45.equals_CUT(obj47);
        java.lang.Object obj50 = hashSetTestDriver45.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray51 = hashSetTestDriver45.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver53 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator54 = hashSetTestDriver53.iterator();
        boolean boolean56 = hashSetTestDriver53.add((java.lang.Object) 0);
        boolean boolean57 = hashSetTestDriver52.remove((java.lang.Object) boolean56);
        java.lang.Object[] objArray58 = hashSetTestDriver52.toArray();
        boolean boolean59 = hashSetTestDriver45.remove((java.lang.Object) hashSetTestDriver52);
        experiment.util.HashSetTestDriver hashSetTestDriver60 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray61 = hashSetTestDriver60.toArray();
        java.lang.Object obj62 = hashSetTestDriver45.getMatch((java.lang.Object) hashSetTestDriver60);
        hashSetTestDriver60.clear();
        boolean boolean64 = hashSetTestDriver27.equals_CUT((java.lang.Object) hashSetTestDriver60);
        experiment.util.HashSetTestDriver hashSetTestDriver65 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator66 = hashSetTestDriver65.iterator();
        int int67 = hashSetTestDriver65.size();
        boolean boolean68 = hashSetTestDriver27.remove((java.lang.Object) hashSetTestDriver65);
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray70 = hashSetTestDriver69.toArray();
        java.lang.Object obj71 = new java.lang.Object();
        boolean boolean72 = hashSetTestDriver69.equals_CUT(obj71);
        java.lang.Object obj74 = hashSetTestDriver69.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray75 = hashSetTestDriver69.toArray();
        int int76 = hashSetTestDriver69.size();
        int int77 = hashSetTestDriver69.size();
        boolean boolean78 = hashSetTestDriver27.contains((java.lang.Object) int77);
        boolean boolean79 = hashSetTestDriver6.equals_CUT((java.lang.Object) boolean78);
        experiment.util.HashSetTestDriver hashSetTestDriver80 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray81 = hashSetTestDriver80.toArray();
        java.lang.Object obj82 = new java.lang.Object();
        boolean boolean83 = hashSetTestDriver80.equals_CUT(obj82);
        java.lang.Object obj85 = hashSetTestDriver80.getMatch((java.lang.Object) (-1));
        int int86 = hashSetTestDriver80.size();
        experiment.util.HashSetTestDriver hashSetTestDriver87 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver88 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator89 = hashSetTestDriver88.iterator();
        boolean boolean91 = hashSetTestDriver88.add((java.lang.Object) 0);
        boolean boolean92 = hashSetTestDriver87.remove((java.lang.Object) boolean91);
        java.lang.Object[] objArray93 = hashSetTestDriver87.toArray();
        java.lang.Object obj94 = hashSetTestDriver80.getMatch((java.lang.Object) hashSetTestDriver87);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = hashSetTestDriver6.remove(obj94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(iterator89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[]");
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test058");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray2 = hashSetTestDriver1.toArray();
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = hashSetTestDriver1.equals_CUT(obj3);
        java.lang.Object obj6 = hashSetTestDriver1.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray7 = hashSetTestDriver1.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator10 = hashSetTestDriver9.iterator();
        boolean boolean12 = hashSetTestDriver9.add((java.lang.Object) 0);
        boolean boolean13 = hashSetTestDriver8.remove((java.lang.Object) boolean12);
        java.lang.Object[] objArray14 = hashSetTestDriver8.toArray();
        boolean boolean15 = hashSetTestDriver1.remove((java.lang.Object) hashSetTestDriver8);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray17 = hashSetTestDriver16.toArray();
        java.lang.Object obj18 = hashSetTestDriver1.getMatch((java.lang.Object) hashSetTestDriver16);
        java.lang.Object obj19 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver1);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray21 = hashSetTestDriver20.toArray();
        java.lang.Object obj22 = new java.lang.Object();
        boolean boolean23 = hashSetTestDriver20.equals_CUT(obj22);
        java.lang.Object obj25 = hashSetTestDriver20.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray26 = hashSetTestDriver20.toArray();
        int int27 = hashSetTestDriver20.size();
        java.lang.Object obj29 = hashSetTestDriver20.getMatch((java.lang.Object) (byte) 1);
        int int30 = hashSetTestDriver20.size();
        java.lang.Object obj31 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver20);
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator33 = hashSetTestDriver32.iterator();
        hashSetTestDriver32.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver35.remove((java.lang.Object) '4');
        boolean boolean38 = hashSetTestDriver32.remove((java.lang.Object) hashSetTestDriver35);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray40 = hashSetTestDriver39.toArray();
        hashSetTestDriver39.clear();
        hashSetTestDriver39.clear();
        experiment.util.Iterator iterator43 = hashSetTestDriver39.iterator();
        java.lang.Object obj44 = hashSetTestDriver32.getMatch((java.lang.Object) iterator43);
        boolean boolean45 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver32);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test059");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        int int6 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator9 = hashSetTestDriver8.iterator();
        boolean boolean11 = hashSetTestDriver8.add((java.lang.Object) 0);
        boolean boolean12 = hashSetTestDriver7.remove((java.lang.Object) boolean11);
        java.lang.Object[] objArray13 = hashSetTestDriver7.toArray();
        java.lang.Object obj14 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray16 = hashSetTestDriver15.toArray();
        hashSetTestDriver15.clear();
        boolean boolean18 = hashSetTestDriver15.isEmpty();
        boolean boolean19 = hashSetTestDriver15.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.remove((java.lang.Object) '4');
        java.lang.Object[] objArray23 = hashSetTestDriver20.toArray();
        java.lang.Object obj24 = hashSetTestDriver15.getMatch((java.lang.Object) hashSetTestDriver20);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator26 = hashSetTestDriver25.iterator();
        hashSetTestDriver25.clear();
        hashSetTestDriver25.clear();
        boolean boolean29 = hashSetTestDriver15.remove((java.lang.Object) hashSetTestDriver25);
        boolean boolean30 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver15);
        int int31 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray33 = hashSetTestDriver32.toArray();
        java.lang.Object obj34 = new java.lang.Object();
        boolean boolean35 = hashSetTestDriver32.equals_CUT(obj34);
        java.lang.Object obj37 = hashSetTestDriver32.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray38 = hashSetTestDriver32.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator41 = hashSetTestDriver40.iterator();
        boolean boolean43 = hashSetTestDriver40.add((java.lang.Object) 0);
        boolean boolean44 = hashSetTestDriver39.remove((java.lang.Object) boolean43);
        java.lang.Object[] objArray45 = hashSetTestDriver39.toArray();
        boolean boolean46 = hashSetTestDriver32.remove((java.lang.Object) hashSetTestDriver39);
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray48 = hashSetTestDriver47.toArray();
        java.lang.Object obj49 = hashSetTestDriver32.getMatch((java.lang.Object) hashSetTestDriver47);
        boolean boolean50 = hashSetTestDriver32.isEmpty();
        boolean boolean51 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver32);
        java.lang.Object obj52 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = hashSetTestDriver0.contains(obj52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test060");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.contains((java.lang.Object) (byte) 1);
        java.lang.Object[] objArray8 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test061");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray8 = hashSetTestDriver7.toArray();
        hashSetTestDriver7.clear();
        hashSetTestDriver7.clear();
        java.lang.Object[] objArray11 = hashSetTestDriver7.toArray();
        boolean boolean12 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver7);
        boolean boolean13 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray14 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test062");
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
        hashSetTestDriver15.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray20 = hashSetTestDriver19.toArray();
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = hashSetTestDriver19.equals_CUT(obj21);
        java.lang.Object obj24 = hashSetTestDriver19.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray25 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator28 = hashSetTestDriver27.iterator();
        boolean boolean30 = hashSetTestDriver27.add((java.lang.Object) 0);
        boolean boolean31 = hashSetTestDriver26.remove((java.lang.Object) boolean30);
        java.lang.Object[] objArray32 = hashSetTestDriver26.toArray();
        boolean boolean33 = hashSetTestDriver19.remove((java.lang.Object) hashSetTestDriver26);
        hashSetTestDriver19.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray36 = hashSetTestDriver35.toArray();
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = hashSetTestDriver35.equals_CUT(obj37);
        java.lang.Object obj40 = hashSetTestDriver35.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray41 = hashSetTestDriver35.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver43 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator44 = hashSetTestDriver43.iterator();
        boolean boolean46 = hashSetTestDriver43.add((java.lang.Object) 0);
        boolean boolean47 = hashSetTestDriver42.remove((java.lang.Object) boolean46);
        java.lang.Object[] objArray48 = hashSetTestDriver42.toArray();
        boolean boolean49 = hashSetTestDriver35.remove((java.lang.Object) hashSetTestDriver42);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray51 = hashSetTestDriver50.toArray();
        java.lang.Object obj52 = hashSetTestDriver35.getMatch((java.lang.Object) hashSetTestDriver50);
        experiment.util.Iterator iterator53 = hashSetTestDriver50.iterator();
        java.lang.Class<?> wildcardClass54 = iterator53.getClass();
        boolean boolean55 = hashSetTestDriver19.contains((java.lang.Object) wildcardClass54);
        java.lang.Object[] objArray56 = hashSetTestDriver19.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray58 = hashSetTestDriver57.toArray();
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = hashSetTestDriver57.equals_CUT(obj59);
        java.lang.Object obj62 = hashSetTestDriver57.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray63 = hashSetTestDriver57.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray65 = hashSetTestDriver64.toArray();
        hashSetTestDriver64.clear();
        hashSetTestDriver64.clear();
        java.lang.Object[] objArray68 = hashSetTestDriver64.toArray();
        boolean boolean69 = hashSetTestDriver57.contains((java.lang.Object) hashSetTestDriver64);
        hashSetTestDriver57.clear();
        boolean boolean71 = hashSetTestDriver19.add((java.lang.Object) hashSetTestDriver57);
        boolean boolean72 = hashSetTestDriver15.equals_CUT((java.lang.Object) hashSetTestDriver57);
        boolean boolean74 = hashSetTestDriver15.contains((java.lang.Object) 10.0d);
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
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test063");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray1 = hashSetTestDriver0.toArray();
        java.lang.Object obj2 = new java.lang.Object();
        boolean boolean3 = hashSetTestDriver0.equals_CUT(obj2);
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) "hi!");
        boolean boolean10 = hashSetTestDriver0.equals_CUT((java.lang.Object) 1);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray12 = hashSetTestDriver11.toArray();
        java.lang.Object obj13 = new java.lang.Object();
        boolean boolean14 = hashSetTestDriver11.equals_CUT(obj13);
        java.lang.Object obj16 = hashSetTestDriver11.getMatch((java.lang.Object) (-1));
        java.lang.Object[] objArray17 = hashSetTestDriver11.toArray();
        boolean boolean19 = hashSetTestDriver11.equals_CUT((java.lang.Object) "hi!");
        boolean boolean21 = hashSetTestDriver11.equals_CUT((java.lang.Object) 1);
        boolean boolean22 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver11);
        boolean boolean23 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_2070236138_1024_0.test064");
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
        boolean boolean12 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object[] objArray14 = hashSetTestDriver13.toArray();
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = hashSetTestDriver13.equals_CUT(obj15);
        experiment.util.Iterator iterator17 = hashSetTestDriver13.iterator();
        java.lang.Object obj18 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver13);
        hashSetTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj18);
    }

}
