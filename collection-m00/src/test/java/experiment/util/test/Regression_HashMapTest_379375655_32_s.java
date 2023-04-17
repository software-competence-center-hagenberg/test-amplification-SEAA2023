package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_379375655_32_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test001");
        experiment.util.Map map0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver(map0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test002");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver1.size();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = hashMapTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        boolean boolean3 = hashMapTestDriver1.containsKey((java.lang.Object) (-1));
        int int4 = hashMapTestDriver1.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver9.getClass();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Collection collection12 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver5.put((java.lang.Object) collection12, (java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) int4, obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test006");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        int int3 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver5.getClass();
        boolean boolean7 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        int int8 = hashMapTestDriver4.size();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver11.getClass();
        boolean boolean13 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.Collection collection14 = hashMapTestDriver10.values();
        int int15 = hashMapTestDriver10.size();
        java.lang.Object obj17 = hashMapTestDriver9.put((java.lang.Object) int15, (java.lang.Object) false);
        experiment.util.Collection collection18 = hashMapTestDriver9.values();
        int int19 = hashMapTestDriver9.size();
        java.lang.Object obj20 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver9);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass23 = hashMapTestDriver22.getClass();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        int int25 = hashMapTestDriver21.size();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass29 = hashMapTestDriver28.getClass();
        boolean boolean30 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver28);
        experiment.util.Collection collection31 = hashMapTestDriver27.values();
        int int32 = hashMapTestDriver27.size();
        java.lang.Object obj34 = hashMapTestDriver26.put((java.lang.Object) int32, (java.lang.Object) false);
        experiment.util.Collection collection35 = hashMapTestDriver26.values();
        int int36 = hashMapTestDriver26.size();
        java.lang.Object obj37 = hashMapTestDriver21.get((java.lang.Object) hashMapTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = hashMapTestDriver0.put(obj20, obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver9.getClass();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        int int12 = hashMapTestDriver8.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass16 = hashMapTestDriver15.getClass();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver15);
        experiment.util.Collection collection18 = hashMapTestDriver14.values();
        int int19 = hashMapTestDriver14.size();
        java.lang.Object obj21 = hashMapTestDriver13.put((java.lang.Object) int19, (java.lang.Object) false);
        experiment.util.Collection collection22 = hashMapTestDriver13.values();
        int int23 = hashMapTestDriver13.size();
        java.lang.Object obj24 = hashMapTestDriver8.get((java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass27 = hashMapTestDriver26.getClass();
        boolean boolean28 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver26);
        experiment.util.Collection collection29 = hashMapTestDriver25.values();
        int int30 = hashMapTestDriver25.size();
        hashMapTestDriver25.clear();
        int int32 = hashMapTestDriver25.size();
        java.lang.Class<?> wildcardClass33 = hashMapTestDriver25.getClass();
        java.lang.Object obj34 = hashMapTestDriver8.remove((java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass9 = hashMapTestDriver8.getClass();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        experiment.util.Collection collection11 = hashMapTestDriver7.values();
        java.lang.Object obj13 = hashMapTestDriver7.remove((java.lang.Object) 1.0d);
        experiment.util.Collection collection14 = hashMapTestDriver7.values();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver7, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver9.getClass();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Collection collection12 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver5.put((java.lang.Object) collection12, (java.lang.Object) 100.0f);
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) collection12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) (-1));
        int int8 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver11.getClass();
        boolean boolean13 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.Collection collection14 = hashMapTestDriver10.values();
        int int15 = hashMapTestDriver10.size();
        java.lang.Object obj17 = hashMapTestDriver9.put((java.lang.Object) int15, (java.lang.Object) false);
        java.lang.Object obj19 = hashMapTestDriver5.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set20 = hashMapTestDriver5.entrySet();
        java.lang.Object obj22 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = obj22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = hashMapTestDriver1.remove(obj4);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver2.getClass();
        boolean boolean4 = hashMapTestDriver1.containsKey((java.lang.Object) hashMapTestDriver2);
        experiment.util.Collection collection5 = hashMapTestDriver1.values();
        int int6 = hashMapTestDriver1.size();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) int6, (java.lang.Object) false);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        int int10 = hashMapTestDriver0.size();
        java.lang.Object obj12 = hashMapTestDriver0.remove((java.lang.Object) (short) 0);
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver7.getClass();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        int int11 = hashMapTestDriver6.size();
        java.lang.Object obj13 = hashMapTestDriver5.put((java.lang.Object) int11, (java.lang.Object) false);
        experiment.util.Collection collection14 = hashMapTestDriver5.values();
        int int15 = hashMapTestDriver5.size();
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver18.getClass();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        experiment.util.Collection collection21 = hashMapTestDriver17.values();
        int int22 = hashMapTestDriver17.size();
        hashMapTestDriver17.clear();
        int int24 = hashMapTestDriver17.size();
        java.lang.Class<?> wildcardClass25 = hashMapTestDriver17.getClass();
        java.lang.Object obj26 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass25);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) "");
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = hashMapTestDriver0.remove(obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        int int3 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver6.getClass();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection9 = hashMapTestDriver5.values();
        int int10 = hashMapTestDriver5.size();
        java.lang.Object obj12 = hashMapTestDriver4.put((java.lang.Object) int10, (java.lang.Object) false);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set15 = hashMapTestDriver0.entrySet();
        experiment.util.Set set16 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass9 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver7.getClass();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        int int11 = hashMapTestDriver6.size();
        java.lang.Object obj13 = hashMapTestDriver5.put((java.lang.Object) int11, (java.lang.Object) false);
        experiment.util.Collection collection14 = hashMapTestDriver5.values();
        int int15 = hashMapTestDriver5.size();
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj18 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = hashMapTestDriver0.remove(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test020");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver2.getClass();
        boolean boolean4 = hashMapTestDriver1.containsKey((java.lang.Object) hashMapTestDriver2);
        experiment.util.Collection collection5 = hashMapTestDriver1.values();
        int int6 = hashMapTestDriver1.size();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) int6, (java.lang.Object) false);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = hashMapTestDriver0.get(obj9);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver6.containsKey((java.lang.Object) (-1));
        int int9 = hashMapTestDriver6.size();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver10.containsKey((java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 100.0d);
        boolean boolean15 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver10);
        experiment.util.Set set17 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass20 = hashMapTestDriver19.getClass();
        boolean boolean21 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Collection collection22 = hashMapTestDriver18.values();
        int int23 = hashMapTestDriver18.size();
        hashMapTestDriver18.clear();
        boolean boolean26 = hashMapTestDriver18.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass29 = hashMapTestDriver28.getClass();
        boolean boolean30 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver28);
        experiment.util.Collection collection31 = hashMapTestDriver27.values();
        int int32 = hashMapTestDriver27.size();
        hashMapTestDriver27.clear();
        java.lang.Object obj34 = hashMapTestDriver18.remove((java.lang.Object) hashMapTestDriver27);
        experiment.util.Set set35 = hashMapTestDriver18.entrySet();
        boolean boolean36 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver18);
        java.lang.Object obj37 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean40 = hashMapTestDriver38.containsKey((java.lang.Object) (-1));
        java.lang.Object obj42 = hashMapTestDriver38.remove((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean45 = hashMapTestDriver43.containsKey((java.lang.Object) (-1));
        int int46 = hashMapTestDriver43.size();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass50 = hashMapTestDriver49.getClass();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) hashMapTestDriver49);
        experiment.util.Collection collection52 = hashMapTestDriver48.values();
        int int53 = hashMapTestDriver48.size();
        java.lang.Object obj55 = hashMapTestDriver47.put((java.lang.Object) int53, (java.lang.Object) false);
        java.lang.Object obj57 = hashMapTestDriver43.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set58 = hashMapTestDriver43.entrySet();
        java.lang.Object obj60 = hashMapTestDriver38.put((java.lang.Object) hashMapTestDriver43, (java.lang.Object) 100L);
        hashMapTestDriver43.clear();
        hashMapTestDriver43.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        boolean boolean65 = hashMapTestDriver63.containsKey((java.lang.Object) (-1));
        int int66 = hashMapTestDriver63.size();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        boolean boolean69 = hashMapTestDriver67.containsKey((java.lang.Object) (-1));
        java.lang.Object obj71 = hashMapTestDriver67.remove((java.lang.Object) 100.0d);
        boolean boolean72 = hashMapTestDriver63.containsKey((java.lang.Object) hashMapTestDriver67);
        boolean boolean73 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = hashMapTestDriver18.put(obj37, (java.lang.Object) hashMapTestDriver43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        int int3 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver6.getClass();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection9 = hashMapTestDriver5.values();
        int int10 = hashMapTestDriver5.size();
        java.lang.Object obj12 = hashMapTestDriver4.put((java.lang.Object) int10, (java.lang.Object) false);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set15 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver17.getClass();
        boolean boolean19 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        int int21 = hashMapTestDriver16.size();
        hashMapTestDriver16.clear();
        boolean boolean24 = hashMapTestDriver16.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = hashMapTestDriver0.get((java.lang.Object) boolean24);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver27.containsKey((java.lang.Object) (-1));
        int int30 = hashMapTestDriver27.size();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass34 = hashMapTestDriver33.getClass();
        boolean boolean35 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver33);
        experiment.util.Collection collection36 = hashMapTestDriver32.values();
        int int37 = hashMapTestDriver32.size();
        java.lang.Object obj39 = hashMapTestDriver31.put((java.lang.Object) int37, (java.lang.Object) false);
        java.lang.Object obj41 = hashMapTestDriver27.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection43 = hashMapTestDriver42.values();
        java.lang.Object obj45 = hashMapTestDriver27.put((java.lang.Object) collection43, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = hashMapTestDriver0.put(obj45, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10 + "'", obj25, 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver7.getClass();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        int int11 = hashMapTestDriver6.size();
        java.lang.Object obj13 = hashMapTestDriver5.put((java.lang.Object) int11, (java.lang.Object) false);
        experiment.util.Collection collection14 = hashMapTestDriver5.values();
        int int15 = hashMapTestDriver5.size();
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver18.getClass();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        experiment.util.Collection collection21 = hashMapTestDriver17.values();
        int int22 = hashMapTestDriver17.size();
        hashMapTestDriver17.clear();
        int int24 = hashMapTestDriver17.size();
        java.lang.Class<?> wildcardClass25 = hashMapTestDriver17.getClass();
        java.lang.Object obj26 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = hashMapTestDriver0.isEmpty();
        int int28 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass29 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test024");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        int int3 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver9.getClass();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Collection collection12 = hashMapTestDriver8.values();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass16 = hashMapTestDriver15.getClass();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver15);
        int int18 = hashMapTestDriver14.size();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass22 = hashMapTestDriver21.getClass();
        boolean boolean23 = hashMapTestDriver20.containsKey((java.lang.Object) hashMapTestDriver21);
        experiment.util.Collection collection24 = hashMapTestDriver20.values();
        int int25 = hashMapTestDriver20.size();
        java.lang.Object obj27 = hashMapTestDriver19.put((java.lang.Object) int25, (java.lang.Object) false);
        experiment.util.Collection collection28 = hashMapTestDriver19.values();
        int int29 = hashMapTestDriver19.size();
        java.lang.Object obj30 = hashMapTestDriver14.get((java.lang.Object) hashMapTestDriver19);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass33 = hashMapTestDriver32.getClass();
        boolean boolean34 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        int int36 = hashMapTestDriver31.size();
        hashMapTestDriver31.clear();
        int int38 = hashMapTestDriver31.size();
        java.lang.Class<?> wildcardClass39 = hashMapTestDriver31.getClass();
        java.lang.Object obj40 = hashMapTestDriver14.remove((java.lang.Object) wildcardClass39);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean43 = hashMapTestDriver41.containsKey((java.lang.Object) (-1));
        int int44 = hashMapTestDriver41.size();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass47 = hashMapTestDriver46.getClass();
        boolean boolean48 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver46);
        java.lang.Class<?> wildcardClass49 = hashMapTestDriver45.getClass();
        boolean boolean50 = hashMapTestDriver41.containsKey((java.lang.Object) hashMapTestDriver45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = hashMapTestDriver0.put(obj40, (java.lang.Object) boolean50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = hashMapTestDriver0.containsKey(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        int int3 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean6 = hashMapTestDriver4.containsKey((java.lang.Object) (-1));
        java.lang.Object obj8 = hashMapTestDriver4.remove((java.lang.Object) 100.0d);
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        hashMapTestDriver4.clear();
        hashMapTestDriver4.clear();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass11 = hashMapTestDriver10.getClass();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        int int14 = hashMapTestDriver9.size();
        hashMapTestDriver9.clear();
        java.lang.Object obj16 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set17 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver2.getClass();
        boolean boolean4 = hashMapTestDriver1.containsKey((java.lang.Object) hashMapTestDriver2);
        experiment.util.Collection collection5 = hashMapTestDriver1.values();
        int int6 = hashMapTestDriver1.size();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) int6, (java.lang.Object) false);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver12.getClass();
        boolean boolean14 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.Collection collection15 = hashMapTestDriver11.values();
        experiment.util.Collection collection16 = hashMapTestDriver11.values();
        hashMapTestDriver11.clear();
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver11, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver7.getClass();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        int int11 = hashMapTestDriver6.size();
        java.lang.Object obj13 = hashMapTestDriver5.put((java.lang.Object) int11, (java.lang.Object) false);
        experiment.util.Collection collection14 = hashMapTestDriver5.values();
        int int15 = hashMapTestDriver5.size();
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver18.getClass();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        int int21 = hashMapTestDriver17.size();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver22.containsKey((java.lang.Object) (-1));
        int int25 = hashMapTestDriver22.size();
        java.lang.Object obj26 = hashMapTestDriver17.remove((java.lang.Object) int25);
        java.lang.Object obj27 = hashMapTestDriver5.get((java.lang.Object) int25);
        java.lang.Object obj30 = hashMapTestDriver5.put((java.lang.Object) 0L, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test032");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver7.getClass();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        int int11 = hashMapTestDriver6.size();
        java.lang.Object obj13 = hashMapTestDriver5.put((java.lang.Object) int11, (java.lang.Object) false);
        experiment.util.Collection collection14 = hashMapTestDriver5.values();
        int int15 = hashMapTestDriver5.size();
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver18.getClass();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        experiment.util.Collection collection21 = hashMapTestDriver17.values();
        int int22 = hashMapTestDriver17.size();
        hashMapTestDriver17.clear();
        boolean boolean25 = hashMapTestDriver17.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass28 = hashMapTestDriver27.getClass();
        boolean boolean29 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver27);
        experiment.util.Collection collection30 = hashMapTestDriver26.values();
        int int31 = hashMapTestDriver26.size();
        hashMapTestDriver26.clear();
        java.lang.Object obj33 = hashMapTestDriver17.remove((java.lang.Object) hashMapTestDriver26);
        experiment.util.Set set34 = hashMapTestDriver17.entrySet();
        hashMapTestDriver17.clear();
        boolean boolean36 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver17);
        experiment.util.Set set37 = hashMapTestDriver17.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean40 = hashMapTestDriver38.containsKey((java.lang.Object) (-1));
        java.lang.Object obj42 = hashMapTestDriver38.remove((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean45 = hashMapTestDriver43.containsKey((java.lang.Object) (-1));
        int int46 = hashMapTestDriver43.size();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass50 = hashMapTestDriver49.getClass();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) hashMapTestDriver49);
        experiment.util.Collection collection52 = hashMapTestDriver48.values();
        int int53 = hashMapTestDriver48.size();
        java.lang.Object obj55 = hashMapTestDriver47.put((java.lang.Object) int53, (java.lang.Object) false);
        java.lang.Object obj57 = hashMapTestDriver43.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set58 = hashMapTestDriver43.entrySet();
        java.lang.Object obj60 = hashMapTestDriver38.put((java.lang.Object) hashMapTestDriver43, (java.lang.Object) 100L);
        boolean boolean62 = hashMapTestDriver38.containsKey((java.lang.Object) (byte) 0);
        java.lang.Object obj63 = hashMapTestDriver17.get((java.lang.Object) hashMapTestDriver38);
        experiment.util.Collection collection64 = hashMapTestDriver17.values();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
    }

}
