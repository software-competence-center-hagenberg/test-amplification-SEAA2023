package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_379375655_64_s {

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

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test033");
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
        java.lang.Object obj29 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean32 = hashMapTestDriver30.containsKey((java.lang.Object) (-1));
        java.lang.Object obj34 = hashMapTestDriver30.remove((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        boolean boolean37 = hashMapTestDriver35.containsKey((java.lang.Object) (-1));
        int int38 = hashMapTestDriver35.size();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass42 = hashMapTestDriver41.getClass();
        boolean boolean43 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver41);
        experiment.util.Collection collection44 = hashMapTestDriver40.values();
        int int45 = hashMapTestDriver40.size();
        java.lang.Object obj47 = hashMapTestDriver39.put((java.lang.Object) int45, (java.lang.Object) false);
        java.lang.Object obj49 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set50 = hashMapTestDriver35.entrySet();
        java.lang.Object obj52 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) 100L);
        boolean boolean54 = hashMapTestDriver30.containsKey((java.lang.Object) (byte) 0);
        hashMapTestDriver30.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass58 = hashMapTestDriver57.getClass();
        boolean boolean59 = hashMapTestDriver56.containsKey((java.lang.Object) hashMapTestDriver57);
        experiment.util.Collection collection60 = hashMapTestDriver56.values();
        int int61 = hashMapTestDriver56.size();
        boolean boolean62 = hashMapTestDriver56.isEmpty();
        java.lang.Object obj63 = hashMapTestDriver30.remove((java.lang.Object) hashMapTestDriver56);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass66 = hashMapTestDriver65.getClass();
        boolean boolean67 = hashMapTestDriver64.containsKey((java.lang.Object) hashMapTestDriver65);
        experiment.util.Collection collection68 = hashMapTestDriver64.values();
        int int69 = hashMapTestDriver64.size();
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass72 = hashMapTestDriver71.getClass();
        boolean boolean73 = hashMapTestDriver70.containsKey((java.lang.Object) hashMapTestDriver71);
        experiment.util.Collection collection74 = hashMapTestDriver70.values();
        int int75 = hashMapTestDriver70.size();
        hashMapTestDriver70.clear();
        int int77 = hashMapTestDriver70.size();
        java.lang.Class<?> wildcardClass78 = hashMapTestDriver70.getClass();
        java.lang.Object obj79 = hashMapTestDriver64.get((java.lang.Object) wildcardClass78);
        boolean boolean80 = hashMapTestDriver64.isEmpty();
        java.lang.Object obj81 = hashMapTestDriver30.get((java.lang.Object) boolean80);
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver83 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass84 = hashMapTestDriver83.getClass();
        boolean boolean85 = hashMapTestDriver82.containsKey((java.lang.Object) hashMapTestDriver83);
        experiment.util.Collection collection86 = hashMapTestDriver82.values();
        experiment.util.Collection collection87 = hashMapTestDriver82.values();
        experiment.util.Collection collection88 = hashMapTestDriver82.values();
        int int89 = hashMapTestDriver82.size();
        experiment.util.HashMapTestDriver hashMapTestDriver90 = new experiment.util.HashMapTestDriver();
        boolean boolean92 = hashMapTestDriver90.containsKey((java.lang.Object) (-1));
        java.lang.Object obj94 = hashMapTestDriver90.remove((java.lang.Object) 100.0d);
        boolean boolean96 = hashMapTestDriver90.containsKey((java.lang.Object) 1.0f);
        boolean boolean97 = hashMapTestDriver82.containsKey((java.lang.Object) boolean96);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj98 = hashMapTestDriver0.put(obj81, (java.lang.Object) boolean96);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test034");
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
        java.lang.Object obj29 = hashMapTestDriver0.remove((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass30 = hashMapTestDriver0.getClass();
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
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test035");
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
        boolean boolean24 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 0);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass28 = hashMapTestDriver27.getClass();
        boolean boolean29 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver27);
        experiment.util.Collection collection30 = hashMapTestDriver26.values();
        int int31 = hashMapTestDriver26.size();
        boolean boolean32 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj33 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver26);
        java.lang.Class<?> wildcardClass34 = hashMapTestDriver26.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test036");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test037");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver7.getClass();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        int int11 = hashMapTestDriver6.size();
        hashMapTestDriver6.clear();
        int int13 = hashMapTestDriver6.size();
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver6.getClass();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) wildcardClass14);
        experiment.util.Set set16 = hashMapTestDriver0.entrySet();
        experiment.util.Set set17 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass20 = hashMapTestDriver19.getClass();
        boolean boolean21 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Collection collection22 = hashMapTestDriver18.values();
        int int23 = hashMapTestDriver18.size();
        experiment.util.Set set24 = hashMapTestDriver18.keySet();
        experiment.util.Collection collection25 = hashMapTestDriver18.values();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        boolean boolean28 = hashMapTestDriver26.containsKey((java.lang.Object) (-1));
        int int29 = hashMapTestDriver26.size();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass33 = hashMapTestDriver32.getClass();
        boolean boolean34 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        int int36 = hashMapTestDriver31.size();
        java.lang.Object obj38 = hashMapTestDriver30.put((java.lang.Object) int36, (java.lang.Object) false);
        java.lang.Object obj40 = hashMapTestDriver26.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set41 = hashMapTestDriver26.entrySet();
        java.lang.Class<?> wildcardClass42 = hashMapTestDriver26.getClass();
        java.lang.Object obj43 = hashMapTestDriver18.remove((java.lang.Object) hashMapTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = hashMapTestDriver0.get(obj43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test038");
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
        java.lang.Object obj30 = hashMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.Set set31 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        boolean boolean33 = hashMapTestDriver0.isEmpty();
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
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test039");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) 100.0d);
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver7.containsKey((java.lang.Object) (-1));
        java.lang.Object obj11 = hashMapTestDriver7.remove((java.lang.Object) 100.0d);
        boolean boolean13 = hashMapTestDriver7.containsKey((java.lang.Object) 1.0f);
        experiment.util.Set set14 = hashMapTestDriver7.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) set14);
        java.lang.Class<?> wildcardClass16 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test040");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int4 = hashMapTestDriver0.size();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj6 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass9 = hashMapTestDriver8.getClass();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        int int11 = hashMapTestDriver7.size();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver13.getClass();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        experiment.util.Collection collection16 = hashMapTestDriver12.values();
        int int17 = hashMapTestDriver12.size();
        hashMapTestDriver12.clear();
        boolean boolean20 = hashMapTestDriver12.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass23 = hashMapTestDriver22.getClass();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.Collection collection25 = hashMapTestDriver21.values();
        int int26 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        java.lang.Object obj28 = hashMapTestDriver12.remove((java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj30 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = hashMapTestDriver0.put(obj6, (java.lang.Object) hashMapTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test041");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver7.getClass();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        int int11 = hashMapTestDriver6.size();
        hashMapTestDriver6.clear();
        int int13 = hashMapTestDriver6.size();
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver6.getClass();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) wildcardClass14);
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver17.containsKey((java.lang.Object) (-1));
        java.lang.Object obj21 = hashMapTestDriver17.remove((java.lang.Object) 100.0d);
        experiment.util.Set set22 = hashMapTestDriver17.entrySet();
        int int23 = hashMapTestDriver17.size();
        java.lang.Object obj24 = hashMapTestDriver0.remove((java.lang.Object) int23);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test042");
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
        boolean boolean41 = hashMapTestDriver14.isEmpty();
        java.lang.Object obj43 = hashMapTestDriver14.remove((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass46 = hashMapTestDriver45.getClass();
        boolean boolean47 = hashMapTestDriver44.containsKey((java.lang.Object) hashMapTestDriver45);
        int int48 = hashMapTestDriver44.size();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass52 = hashMapTestDriver51.getClass();
        boolean boolean53 = hashMapTestDriver50.containsKey((java.lang.Object) hashMapTestDriver51);
        experiment.util.Collection collection54 = hashMapTestDriver50.values();
        int int55 = hashMapTestDriver50.size();
        java.lang.Object obj57 = hashMapTestDriver49.put((java.lang.Object) int55, (java.lang.Object) false);
        experiment.util.Collection collection58 = hashMapTestDriver49.values();
        int int59 = hashMapTestDriver49.size();
        java.lang.Object obj60 = hashMapTestDriver44.get((java.lang.Object) hashMapTestDriver49);
        int int61 = hashMapTestDriver49.size();
        java.lang.Object obj62 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver49);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test043");
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
        experiment.util.Set set17 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.Collection collection19 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass22 = hashMapTestDriver21.getClass();
        boolean boolean23 = hashMapTestDriver20.containsKey((java.lang.Object) hashMapTestDriver21);
        experiment.util.Collection collection24 = hashMapTestDriver20.values();
        int int25 = hashMapTestDriver20.size();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass28 = hashMapTestDriver27.getClass();
        boolean boolean29 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver27);
        experiment.util.Collection collection30 = hashMapTestDriver26.values();
        int int31 = hashMapTestDriver26.size();
        hashMapTestDriver26.clear();
        int int33 = hashMapTestDriver26.size();
        java.lang.Class<?> wildcardClass34 = hashMapTestDriver26.getClass();
        java.lang.Object obj35 = hashMapTestDriver20.get((java.lang.Object) wildcardClass34);
        boolean boolean36 = hashMapTestDriver20.isEmpty();
        java.lang.Object obj37 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver20);
        int int38 = hashMapTestDriver0.size();
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
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test044");
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
        experiment.util.Set set28 = hashMapTestDriver0.keySet();
        boolean boolean29 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass30 = hashMapTestDriver0.getClass();
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
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver2.getClass();
        boolean boolean4 = hashMapTestDriver1.containsKey((java.lang.Object) hashMapTestDriver2);
        experiment.util.Collection collection5 = hashMapTestDriver1.values();
        int int6 = hashMapTestDriver1.size();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) int6, (java.lang.Object) false);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver10.containsKey((java.lang.Object) (-1));
        int int13 = hashMapTestDriver10.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass17 = hashMapTestDriver16.getClass();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.Collection collection19 = hashMapTestDriver15.values();
        int int20 = hashMapTestDriver15.size();
        java.lang.Object obj22 = hashMapTestDriver14.put((java.lang.Object) int20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMapTestDriver10.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set25 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass28 = hashMapTestDriver27.getClass();
        boolean boolean29 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver27);
        int int30 = hashMapTestDriver26.size();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        boolean boolean33 = hashMapTestDriver31.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass36 = hashMapTestDriver35.getClass();
        boolean boolean37 = hashMapTestDriver34.containsKey((java.lang.Object) hashMapTestDriver35);
        experiment.util.Collection collection38 = hashMapTestDriver34.values();
        java.lang.Object obj40 = hashMapTestDriver31.put((java.lang.Object) collection38, (java.lang.Object) 100.0f);
        java.lang.Object obj41 = hashMapTestDriver26.remove((java.lang.Object) collection38);
        java.lang.Object obj42 = hashMapTestDriver10.get((java.lang.Object) collection38);
        java.lang.Object obj43 = hashMapTestDriver0.get((java.lang.Object) collection38);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test046");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver1.getClass();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        int int8 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test047");
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
        experiment.util.Set set16 = hashMapTestDriver0.entrySet();
        boolean boolean17 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set18 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass19 = set18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test048");
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
        experiment.util.Collection collection26 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver27.containsKey((java.lang.Object) (-1));
        int int30 = hashMapTestDriver27.size();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        boolean boolean33 = hashMapTestDriver31.containsKey((java.lang.Object) (-1));
        java.lang.Object obj35 = hashMapTestDriver31.remove((java.lang.Object) 100.0d);
        boolean boolean36 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver31.clear();
        hashMapTestDriver31.clear();
        experiment.util.Set set39 = hashMapTestDriver31.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass42 = hashMapTestDriver41.getClass();
        boolean boolean43 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver41);
        experiment.util.Collection collection44 = hashMapTestDriver40.values();
        int int45 = hashMapTestDriver40.size();
        hashMapTestDriver40.clear();
        boolean boolean48 = hashMapTestDriver40.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass51 = hashMapTestDriver50.getClass();
        boolean boolean52 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver50);
        experiment.util.Collection collection53 = hashMapTestDriver49.values();
        int int54 = hashMapTestDriver49.size();
        hashMapTestDriver49.clear();
        java.lang.Object obj56 = hashMapTestDriver40.remove((java.lang.Object) hashMapTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver31, obj56);
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
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test049");
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
        experiment.util.Collection collection18 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver19.containsKey((java.lang.Object) (-1));
        int int22 = hashMapTestDriver19.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass26 = hashMapTestDriver25.getClass();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.Collection collection28 = hashMapTestDriver24.values();
        int int29 = hashMapTestDriver24.size();
        java.lang.Object obj31 = hashMapTestDriver23.put((java.lang.Object) int29, (java.lang.Object) false);
        java.lang.Object obj33 = hashMapTestDriver19.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        java.lang.Object obj37 = hashMapTestDriver19.put((java.lang.Object) collection35, (java.lang.Object) (byte) 10);
        boolean boolean38 = hashMapTestDriver10.containsKey((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        boolean boolean41 = hashMapTestDriver39.containsKey((java.lang.Object) (-1));
        java.lang.Object obj43 = hashMapTestDriver39.remove((java.lang.Object) 100.0d);
        int int44 = hashMapTestDriver39.size();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass47 = hashMapTestDriver46.getClass();
        boolean boolean48 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver46);
        int int49 = hashMapTestDriver45.size();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass53 = hashMapTestDriver52.getClass();
        boolean boolean54 = hashMapTestDriver51.containsKey((java.lang.Object) hashMapTestDriver52);
        experiment.util.Collection collection55 = hashMapTestDriver51.values();
        int int56 = hashMapTestDriver51.size();
        java.lang.Object obj58 = hashMapTestDriver50.put((java.lang.Object) int56, (java.lang.Object) false);
        experiment.util.Collection collection59 = hashMapTestDriver50.values();
        int int60 = hashMapTestDriver50.size();
        java.lang.Object obj61 = hashMapTestDriver45.get((java.lang.Object) hashMapTestDriver50);
        boolean boolean62 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj63 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver45);
        int int64 = hashMapTestDriver10.size();
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
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        int int3 = hashMapTestDriver0.size();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test051");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test052");
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
        experiment.util.Set set17 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver18.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass23 = hashMapTestDriver22.getClass();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.Collection collection25 = hashMapTestDriver21.values();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) collection25, (java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass30 = hashMapTestDriver29.getClass();
        boolean boolean31 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        experiment.util.Collection collection32 = hashMapTestDriver28.values();
        int int33 = hashMapTestDriver28.size();
        experiment.util.Set set34 = hashMapTestDriver28.keySet();
        experiment.util.Collection collection35 = hashMapTestDriver28.values();
        boolean boolean36 = hashMapTestDriver28.isEmpty();
        java.lang.Object obj37 = hashMapTestDriver0.put((java.lang.Object) collection25, (java.lang.Object) boolean36);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test053");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver6.getClass();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection9 = hashMapTestDriver5.values();
        int int10 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver11.containsKey((java.lang.Object) (-1));
        int int14 = hashMapTestDriver11.size();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        boolean boolean17 = hashMapTestDriver15.containsKey((java.lang.Object) (-1));
        java.lang.Object obj19 = hashMapTestDriver15.remove((java.lang.Object) 100.0d);
        boolean boolean20 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj21 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver15);
        experiment.util.Set set22 = hashMapTestDriver15.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass25 = hashMapTestDriver24.getClass();
        boolean boolean26 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver24);
        experiment.util.Collection collection27 = hashMapTestDriver23.values();
        int int28 = hashMapTestDriver23.size();
        hashMapTestDriver23.clear();
        boolean boolean31 = hashMapTestDriver23.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass34 = hashMapTestDriver33.getClass();
        boolean boolean35 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver33);
        experiment.util.Collection collection36 = hashMapTestDriver32.values();
        int int37 = hashMapTestDriver32.size();
        hashMapTestDriver32.clear();
        java.lang.Object obj39 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set40 = hashMapTestDriver23.entrySet();
        boolean boolean41 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.Set set42 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean45 = hashMapTestDriver43.containsKey((java.lang.Object) (-1));
        int int46 = hashMapTestDriver43.size();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        boolean boolean49 = hashMapTestDriver47.containsKey((java.lang.Object) (-1));
        java.lang.Object obj51 = hashMapTestDriver47.remove((java.lang.Object) 100.0d);
        boolean boolean52 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver47);
        hashMapTestDriver47.clear();
        hashMapTestDriver47.clear();
        java.lang.Object obj55 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver47);
        boolean boolean56 = hashMapTestDriver23.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass59 = hashMapTestDriver58.getClass();
        boolean boolean60 = hashMapTestDriver57.containsKey((java.lang.Object) hashMapTestDriver58);
        int int61 = hashMapTestDriver57.size();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean64 = hashMapTestDriver62.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass67 = hashMapTestDriver66.getClass();
        boolean boolean68 = hashMapTestDriver65.containsKey((java.lang.Object) hashMapTestDriver66);
        experiment.util.Collection collection69 = hashMapTestDriver65.values();
        java.lang.Object obj71 = hashMapTestDriver62.put((java.lang.Object) collection69, (java.lang.Object) 100.0f);
        java.lang.Object obj72 = hashMapTestDriver57.remove((java.lang.Object) collection69);
        java.lang.Object obj73 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) hashMapTestDriver57);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test054");
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
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass39 = hashMapTestDriver38.getClass();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) hashMapTestDriver38);
        experiment.util.Collection collection41 = hashMapTestDriver37.values();
        int int42 = hashMapTestDriver37.size();
        hashMapTestDriver37.clear();
        int int44 = hashMapTestDriver37.size();
        java.lang.Object obj45 = hashMapTestDriver5.remove((java.lang.Object) hashMapTestDriver37);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver47.getClass();
        boolean boolean49 = hashMapTestDriver46.containsKey((java.lang.Object) hashMapTestDriver47);
        int int50 = hashMapTestDriver46.size();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        boolean boolean53 = hashMapTestDriver51.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass56 = hashMapTestDriver55.getClass();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) hashMapTestDriver55);
        experiment.util.Collection collection58 = hashMapTestDriver54.values();
        java.lang.Object obj60 = hashMapTestDriver51.put((java.lang.Object) collection58, (java.lang.Object) 100.0f);
        java.lang.Object obj61 = hashMapTestDriver46.remove((java.lang.Object) collection58);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass64 = hashMapTestDriver63.getClass();
        boolean boolean65 = hashMapTestDriver62.containsKey((java.lang.Object) hashMapTestDriver63);
        experiment.util.Collection collection66 = hashMapTestDriver62.values();
        int int67 = hashMapTestDriver62.size();
        hashMapTestDriver62.clear();
        boolean boolean70 = hashMapTestDriver62.containsKey((java.lang.Object) (-1));
        java.lang.Object obj71 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver46, (java.lang.Object) boolean70);
        experiment.util.Set set72 = hashMapTestDriver46.keySet();
        hashMapTestDriver46.clear();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test055");
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
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass31 = hashMapTestDriver30.getClass();
        boolean boolean32 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver30);
        experiment.util.Collection collection33 = hashMapTestDriver29.values();
        int int34 = hashMapTestDriver29.size();
        hashMapTestDriver29.clear();
        int int36 = hashMapTestDriver29.size();
        java.lang.Object obj37 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver29);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean40 = hashMapTestDriver38.containsKey((java.lang.Object) (-1));
        int int41 = hashMapTestDriver38.size();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver42.containsKey((java.lang.Object) (-1));
        java.lang.Object obj46 = hashMapTestDriver42.remove((java.lang.Object) 100.0d);
        boolean boolean47 = hashMapTestDriver38.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass50 = hashMapTestDriver49.getClass();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) hashMapTestDriver49);
        experiment.util.Collection collection52 = hashMapTestDriver48.values();
        int int53 = hashMapTestDriver48.size();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass56 = hashMapTestDriver55.getClass();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) hashMapTestDriver55);
        experiment.util.Collection collection58 = hashMapTestDriver54.values();
        java.lang.Object obj59 = hashMapTestDriver38.put((java.lang.Object) hashMapTestDriver48, (java.lang.Object) hashMapTestDriver54);
        java.lang.Object obj60 = hashMapTestDriver29.get((java.lang.Object) hashMapTestDriver54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass61 = obj60.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test056");
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
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver18.getClass();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        experiment.util.Collection collection21 = hashMapTestDriver17.values();
        int int22 = hashMapTestDriver17.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver23.containsKey((java.lang.Object) (-1));
        int int26 = hashMapTestDriver23.size();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver27.containsKey((java.lang.Object) (-1));
        java.lang.Object obj31 = hashMapTestDriver27.remove((java.lang.Object) 100.0d);
        boolean boolean32 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver27);
        java.lang.Object obj33 = hashMapTestDriver17.get((java.lang.Object) hashMapTestDriver27);
        experiment.util.Set set34 = hashMapTestDriver27.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass37 = hashMapTestDriver36.getClass();
        boolean boolean38 = hashMapTestDriver35.containsKey((java.lang.Object) hashMapTestDriver36);
        experiment.util.Collection collection39 = hashMapTestDriver35.values();
        int int40 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        boolean boolean43 = hashMapTestDriver35.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass46 = hashMapTestDriver45.getClass();
        boolean boolean47 = hashMapTestDriver44.containsKey((java.lang.Object) hashMapTestDriver45);
        experiment.util.Collection collection48 = hashMapTestDriver44.values();
        int int49 = hashMapTestDriver44.size();
        hashMapTestDriver44.clear();
        java.lang.Object obj51 = hashMapTestDriver35.remove((java.lang.Object) hashMapTestDriver44);
        experiment.util.Set set52 = hashMapTestDriver35.entrySet();
        boolean boolean53 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set54 = hashMapTestDriver35.entrySet();
        int int55 = hashMapTestDriver35.size();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        boolean boolean58 = hashMapTestDriver56.containsKey((java.lang.Object) (-1));
        java.lang.Object obj60 = hashMapTestDriver56.remove((java.lang.Object) 100.0d);
        experiment.util.Set set61 = hashMapTestDriver56.entrySet();
        int int62 = hashMapTestDriver56.size();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass66 = hashMapTestDriver65.getClass();
        boolean boolean67 = hashMapTestDriver64.containsKey((java.lang.Object) hashMapTestDriver65);
        experiment.util.Collection collection68 = hashMapTestDriver64.values();
        int int69 = hashMapTestDriver64.size();
        java.lang.Object obj71 = hashMapTestDriver63.put((java.lang.Object) int69, (java.lang.Object) false);
        experiment.util.Collection collection72 = hashMapTestDriver63.values();
        experiment.util.Set set73 = hashMapTestDriver63.entrySet();
        experiment.util.Set set74 = hashMapTestDriver63.entrySet();
        boolean boolean75 = hashMapTestDriver56.containsKey((java.lang.Object) set74);
        int int76 = hashMapTestDriver56.size();
        boolean boolean77 = hashMapTestDriver35.containsKey((java.lang.Object) hashMapTestDriver56);
        java.lang.Object obj79 = hashMapTestDriver0.put((java.lang.Object) boolean77, (java.lang.Object) (short) -1);
        boolean boolean80 = hashMapTestDriver0.isEmpty();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test057");
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
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test058");
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
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver28.containsKey((java.lang.Object) (-1));
        int int31 = hashMapTestDriver28.size();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass35 = hashMapTestDriver34.getClass();
        boolean boolean36 = hashMapTestDriver33.containsKey((java.lang.Object) hashMapTestDriver34);
        experiment.util.Collection collection37 = hashMapTestDriver33.values();
        int int38 = hashMapTestDriver33.size();
        java.lang.Object obj40 = hashMapTestDriver32.put((java.lang.Object) int38, (java.lang.Object) false);
        java.lang.Object obj42 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) 10);
        experiment.util.Set set43 = hashMapTestDriver28.entrySet();
        java.lang.Class<?> wildcardClass44 = hashMapTestDriver28.getClass();
        java.lang.Object obj45 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass44);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver47.getClass();
        boolean boolean49 = hashMapTestDriver46.containsKey((java.lang.Object) hashMapTestDriver47);
        experiment.util.Collection collection50 = hashMapTestDriver46.values();
        int int51 = hashMapTestDriver46.size();
        hashMapTestDriver46.clear();
        boolean boolean54 = hashMapTestDriver46.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass57 = hashMapTestDriver56.getClass();
        boolean boolean58 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.Collection collection59 = hashMapTestDriver55.values();
        int int60 = hashMapTestDriver55.size();
        hashMapTestDriver55.clear();
        java.lang.Object obj62 = hashMapTestDriver46.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.Set set63 = hashMapTestDriver46.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        boolean boolean66 = hashMapTestDriver64.containsKey((java.lang.Object) (-1));
        int int67 = hashMapTestDriver64.size();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        boolean boolean70 = hashMapTestDriver68.containsKey((java.lang.Object) (-1));
        java.lang.Object obj72 = hashMapTestDriver68.remove((java.lang.Object) 100.0d);
        boolean boolean73 = hashMapTestDriver64.containsKey((java.lang.Object) hashMapTestDriver68);
        hashMapTestDriver68.clear();
        java.lang.Object obj75 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver46, (java.lang.Object) hashMapTestDriver68);
        java.lang.Class<?> wildcardClass76 = hashMapTestDriver68.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test059");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) (-1));
        int int3 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean6 = hashMapTestDriver4.containsKey((java.lang.Object) (-1));
        java.lang.Object obj8 = hashMapTestDriver4.remove((java.lang.Object) 100.0d);
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test060");
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
        java.lang.Object obj14 = hashMapTestDriver8.remove((java.lang.Object) 1.0d);
        experiment.util.Set set15 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver17.getClass();
        boolean boolean19 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        boolean boolean21 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass24 = hashMapTestDriver23.getClass();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.Collection collection26 = hashMapTestDriver22.values();
        int int27 = hashMapTestDriver22.size();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver28.containsKey((java.lang.Object) (-1));
        int int31 = hashMapTestDriver28.size();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver32.containsKey((java.lang.Object) (-1));
        java.lang.Object obj36 = hashMapTestDriver32.remove((java.lang.Object) 100.0d);
        boolean boolean37 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver32);
        java.lang.Object obj38 = hashMapTestDriver22.get((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set39 = hashMapTestDriver32.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass42 = hashMapTestDriver41.getClass();
        boolean boolean43 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver41);
        experiment.util.Collection collection44 = hashMapTestDriver40.values();
        int int45 = hashMapTestDriver40.size();
        hashMapTestDriver40.clear();
        boolean boolean48 = hashMapTestDriver40.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass51 = hashMapTestDriver50.getClass();
        boolean boolean52 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver50);
        experiment.util.Collection collection53 = hashMapTestDriver49.values();
        int int54 = hashMapTestDriver49.size();
        hashMapTestDriver49.clear();
        java.lang.Object obj56 = hashMapTestDriver40.remove((java.lang.Object) hashMapTestDriver49);
        experiment.util.Set set57 = hashMapTestDriver40.entrySet();
        boolean boolean58 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver40);
        experiment.util.Set set59 = hashMapTestDriver40.entrySet();
        boolean boolean60 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver40);
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass63 = hashMapTestDriver62.getClass();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) hashMapTestDriver62);
        experiment.util.Collection collection65 = hashMapTestDriver61.values();
        int int66 = hashMapTestDriver61.size();
        experiment.util.Set set67 = hashMapTestDriver61.keySet();
        experiment.util.Set set68 = hashMapTestDriver61.keySet();
        java.lang.Object obj69 = hashMapTestDriver40.remove((java.lang.Object) set68);
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass72 = hashMapTestDriver71.getClass();
        boolean boolean73 = hashMapTestDriver70.containsKey((java.lang.Object) hashMapTestDriver71);
        int int74 = hashMapTestDriver70.size();
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass78 = hashMapTestDriver77.getClass();
        boolean boolean79 = hashMapTestDriver76.containsKey((java.lang.Object) hashMapTestDriver77);
        experiment.util.Collection collection80 = hashMapTestDriver76.values();
        int int81 = hashMapTestDriver76.size();
        java.lang.Object obj83 = hashMapTestDriver75.put((java.lang.Object) int81, (java.lang.Object) false);
        experiment.util.Collection collection84 = hashMapTestDriver75.values();
        int int85 = hashMapTestDriver75.size();
        java.lang.Object obj86 = hashMapTestDriver70.get((java.lang.Object) hashMapTestDriver75);
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver88 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass89 = hashMapTestDriver88.getClass();
        boolean boolean90 = hashMapTestDriver87.containsKey((java.lang.Object) hashMapTestDriver88);
        experiment.util.Collection collection91 = hashMapTestDriver87.values();
        int int92 = hashMapTestDriver87.size();
        hashMapTestDriver87.clear();
        int int94 = hashMapTestDriver87.size();
        java.lang.Class<?> wildcardClass95 = hashMapTestDriver87.getClass();
        java.lang.Object obj96 = hashMapTestDriver70.remove((java.lang.Object) wildcardClass95);
        boolean boolean97 = hashMapTestDriver70.isEmpty();
        int int98 = hashMapTestDriver70.size();
        java.lang.Object obj99 = hashMapTestDriver0.put((java.lang.Object) set68, (java.lang.Object) hashMapTestDriver70);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test061");
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
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test062");
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
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass39 = hashMapTestDriver38.getClass();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) hashMapTestDriver38);
        experiment.util.Collection collection41 = hashMapTestDriver37.values();
        int int42 = hashMapTestDriver37.size();
        hashMapTestDriver37.clear();
        int int44 = hashMapTestDriver37.size();
        java.lang.Object obj45 = hashMapTestDriver5.remove((java.lang.Object) hashMapTestDriver37);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver47.getClass();
        boolean boolean49 = hashMapTestDriver46.containsKey((java.lang.Object) hashMapTestDriver47);
        int int50 = hashMapTestDriver46.size();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        boolean boolean53 = hashMapTestDriver51.containsKey((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass56 = hashMapTestDriver55.getClass();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) hashMapTestDriver55);
        experiment.util.Collection collection58 = hashMapTestDriver54.values();
        java.lang.Object obj60 = hashMapTestDriver51.put((java.lang.Object) collection58, (java.lang.Object) 100.0f);
        java.lang.Object obj61 = hashMapTestDriver46.remove((java.lang.Object) collection58);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass64 = hashMapTestDriver63.getClass();
        boolean boolean65 = hashMapTestDriver62.containsKey((java.lang.Object) hashMapTestDriver63);
        experiment.util.Collection collection66 = hashMapTestDriver62.values();
        int int67 = hashMapTestDriver62.size();
        hashMapTestDriver62.clear();
        boolean boolean70 = hashMapTestDriver62.containsKey((java.lang.Object) (-1));
        java.lang.Object obj71 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver46, (java.lang.Object) boolean70);
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        boolean boolean74 = hashMapTestDriver72.containsKey((java.lang.Object) (-1));
        java.lang.Object obj76 = hashMapTestDriver72.remove((java.lang.Object) 100.0d);
        boolean boolean78 = hashMapTestDriver72.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        boolean boolean81 = hashMapTestDriver79.containsKey((java.lang.Object) (-1));
        java.lang.Object obj83 = hashMapTestDriver79.remove((java.lang.Object) 100.0d);
        boolean boolean85 = hashMapTestDriver79.containsKey((java.lang.Object) 1.0f);
        experiment.util.Set set86 = hashMapTestDriver79.keySet();
        java.lang.Object obj87 = hashMapTestDriver72.get((java.lang.Object) set86);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = hashMapTestDriver5.remove(obj87);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test063");
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
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass39 = hashMapTestDriver38.getClass();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) hashMapTestDriver38);
        int int41 = hashMapTestDriver37.size();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass45 = hashMapTestDriver44.getClass();
        boolean boolean46 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver44);
        experiment.util.Collection collection47 = hashMapTestDriver43.values();
        int int48 = hashMapTestDriver43.size();
        java.lang.Object obj50 = hashMapTestDriver42.put((java.lang.Object) int48, (java.lang.Object) false);
        experiment.util.Collection collection51 = hashMapTestDriver42.values();
        int int52 = hashMapTestDriver42.size();
        java.lang.Object obj53 = hashMapTestDriver37.get((java.lang.Object) hashMapTestDriver42);
        java.lang.Object obj55 = hashMapTestDriver37.get((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass58 = hashMapTestDriver57.getClass();
        boolean boolean59 = hashMapTestDriver56.containsKey((java.lang.Object) hashMapTestDriver57);
        experiment.util.Collection collection60 = hashMapTestDriver56.values();
        int int61 = hashMapTestDriver56.size();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean64 = hashMapTestDriver62.containsKey((java.lang.Object) (-1));
        int int65 = hashMapTestDriver62.size();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        boolean boolean68 = hashMapTestDriver66.containsKey((java.lang.Object) (-1));
        java.lang.Object obj70 = hashMapTestDriver66.remove((java.lang.Object) 100.0d);
        boolean boolean71 = hashMapTestDriver62.containsKey((java.lang.Object) hashMapTestDriver66);
        java.lang.Object obj72 = hashMapTestDriver56.get((java.lang.Object) hashMapTestDriver66);
        experiment.util.Set set73 = hashMapTestDriver66.entrySet();
        java.lang.Object obj74 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver66);
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass77 = hashMapTestDriver76.getClass();
        boolean boolean78 = hashMapTestDriver75.containsKey((java.lang.Object) hashMapTestDriver76);
        experiment.util.Collection collection79 = hashMapTestDriver75.values();
        java.lang.Object obj80 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver75);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = hashMapTestDriver18.containsKey(obj80);
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
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_379375655_1024_0.test064");
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
        experiment.util.Set set37 = hashMapTestDriver18.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean40 = hashMapTestDriver38.containsKey((java.lang.Object) (-1));
        int int41 = hashMapTestDriver38.size();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver42.containsKey((java.lang.Object) (-1));
        java.lang.Object obj46 = hashMapTestDriver42.remove((java.lang.Object) 100.0d);
        boolean boolean47 = hashMapTestDriver38.containsKey((java.lang.Object) hashMapTestDriver42);
        hashMapTestDriver42.clear();
        hashMapTestDriver42.clear();
        java.lang.Object obj50 = hashMapTestDriver18.remove((java.lang.Object) hashMapTestDriver42);
        boolean boolean52 = hashMapTestDriver18.containsKey((java.lang.Object) false);
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
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

}
