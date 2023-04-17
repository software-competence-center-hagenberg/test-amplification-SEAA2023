package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1264048269_128_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test002");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = hashMapTestDriver0.put(obj4, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = hashMapTestDriver0.get(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test006");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        int int10 = hashMapTestDriver5.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = obj16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj28 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver21);
        boolean boolean29 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.Set set30 = hashMapTestDriver12.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = hashMapTestDriver0.get(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) 0);
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = hashMapTestDriver0.containsKey(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver20.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = hashMapTestDriver22.isEmpty();
        java.lang.Object obj26 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj28 = hashMapTestDriver22.remove((java.lang.Object) (short) 1);
        boolean boolean30 = hashMapTestDriver22.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj31 = hashMapTestDriver16.remove((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = hashMapTestDriver0.containsKey(obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.Collection collection12 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj25 = hashMapTestDriver19.remove((java.lang.Object) (short) 1);
        boolean boolean27 = hashMapTestDriver19.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj28 = hashMapTestDriver13.remove((java.lang.Object) 0.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean33 = hashMapTestDriver32.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.remove((java.lang.Object) (byte) 10);
        boolean boolean37 = hashMapTestDriver34.isEmpty();
        java.lang.Object obj38 = hashMapTestDriver29.put((java.lang.Object) hashMapTestDriver32, (java.lang.Object) hashMapTestDriver34);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Object obj40 = hashMapTestDriver29.get(obj39);
        java.lang.Object obj41 = hashMapTestDriver13.get((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj42 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver43.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        boolean boolean47 = hashMapTestDriver46.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj50 = hashMapTestDriver48.remove((java.lang.Object) (byte) 10);
        boolean boolean51 = hashMapTestDriver48.isEmpty();
        java.lang.Object obj52 = hashMapTestDriver43.put((java.lang.Object) hashMapTestDriver46, (java.lang.Object) hashMapTestDriver48);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Object obj54 = hashMapTestDriver43.get(obj53);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        boolean boolean59 = hashMapTestDriver58.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj62 = hashMapTestDriver60.remove((java.lang.Object) (byte) 10);
        boolean boolean63 = hashMapTestDriver60.isEmpty();
        java.lang.Object obj64 = hashMapTestDriver55.put((java.lang.Object) hashMapTestDriver58, (java.lang.Object) hashMapTestDriver60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj65 = hashMapTestDriver0.put(obj54, (java.lang.Object) hashMapTestDriver55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver8);
        boolean boolean14 = hashMapTestDriver3.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj31 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver24);
        boolean boolean32 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) boolean32, (java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = hashMapTestDriver40.isEmpty();
        java.lang.Object obj44 = hashMapTestDriver35.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = hashMapTestDriver35.get(obj45);
        java.lang.Class<?> wildcardClass47 = hashMapTestDriver35.getClass();
        java.lang.Object obj48 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass47);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.get((java.lang.Object) 0);
        experiment.util.Collection collection52 = hashMapTestDriver49.values();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj55 = hashMapTestDriver53.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver56.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.remove((java.lang.Object) (byte) 10);
        boolean boolean61 = hashMapTestDriver58.isEmpty();
        java.lang.Object obj62 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver56, (java.lang.Object) hashMapTestDriver58);
        boolean boolean64 = hashMapTestDriver53.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj67 = hashMapTestDriver65.get((java.lang.Object) 0);
        java.lang.Object obj70 = hashMapTestDriver65.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj73 = hashMapTestDriver71.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        boolean boolean75 = hashMapTestDriver74.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj78 = hashMapTestDriver76.remove((java.lang.Object) (byte) 10);
        boolean boolean79 = hashMapTestDriver76.isEmpty();
        java.lang.Object obj80 = hashMapTestDriver71.put((java.lang.Object) hashMapTestDriver74, (java.lang.Object) hashMapTestDriver76);
        java.lang.Object obj81 = hashMapTestDriver65.get((java.lang.Object) hashMapTestDriver74);
        boolean boolean82 = hashMapTestDriver53.containsKey((java.lang.Object) hashMapTestDriver65);
        java.lang.Object obj83 = hashMapTestDriver0.put((java.lang.Object) collection52, (java.lang.Object) hashMapTestDriver65);
        experiment.util.Collection collection84 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.get((java.lang.Object) 0);
        boolean boolean12 = hashMapTestDriver9.isEmpty();
        experiment.util.Set set13 = hashMapTestDriver9.keySet();
        experiment.util.Set set14 = hashMapTestDriver9.keySet();
        experiment.util.Set set15 = hashMapTestDriver9.entrySet();
        int int16 = hashMapTestDriver9.size();
        boolean boolean17 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver9.remove((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = hashMapTestDriver0.containsKey(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver8);
        boolean boolean14 = hashMapTestDriver3.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj31 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver24);
        boolean boolean32 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) boolean32, (java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = hashMapTestDriver40.isEmpty();
        java.lang.Object obj44 = hashMapTestDriver35.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = hashMapTestDriver35.get(obj45);
        java.lang.Class<?> wildcardClass47 = hashMapTestDriver35.getClass();
        java.lang.Object obj48 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass47);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean52 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj54 = hashMapTestDriver49.get((java.lang.Object) 0);
        java.lang.Object obj56 = hashMapTestDriver0.put((java.lang.Object) 0, (java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass57 = obj56.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        boolean boolean15 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set16 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.get((java.lang.Object) 0);
        experiment.util.Collection collection20 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.get((java.lang.Object) 0);
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        experiment.util.Set set25 = hashMapTestDriver21.keySet();
        experiment.util.Set set26 = hashMapTestDriver21.keySet();
        experiment.util.Set set27 = hashMapTestDriver21.entrySet();
        java.lang.Object obj28 = hashMapTestDriver17.remove((java.lang.Object) set27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = hashMapTestDriver0.get(obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test020");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        int int6 = hashMapTestDriver0.size();
        java.lang.Object obj7 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        experiment.util.Set set12 = hashMapTestDriver8.keySet();
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.Set set14 = hashMapTestDriver8.entrySet();
        int int15 = hashMapTestDriver8.size();
        boolean boolean16 = hashMapTestDriver8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = hashMapTestDriver0.put(obj7, (java.lang.Object) hashMapTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver5.remove((java.lang.Object) (short) 1);
        java.lang.Object obj13 = hashMapTestDriver5.get((java.lang.Object) (-1.0f));
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver14.isEmpty();
        java.lang.Object obj16 = hashMapTestDriver5.get((java.lang.Object) boolean15);
        boolean boolean17 = hashMapTestDriver5.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.get((java.lang.Object) 0);
        java.lang.Object obj23 = hashMapTestDriver18.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.get((java.lang.Object) 0);
        experiment.util.Collection collection27 = hashMapTestDriver24.values();
        int int28 = hashMapTestDriver24.size();
        java.lang.Object obj29 = hashMapTestDriver18.get((java.lang.Object) hashMapTestDriver24);
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = hashMapTestDriver5.put(obj29, obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver7.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver7, (java.lang.Object) hashMapTestDriver9);
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) 1.0d);
        experiment.util.Collection collection16 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        java.lang.Object obj18 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) 10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        int int13 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test024");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver5.remove((java.lang.Object) (short) 1);
        java.lang.Object obj13 = hashMapTestDriver5.get((java.lang.Object) (-1.0f));
        int int14 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) 0);
        boolean boolean18 = hashMapTestDriver15.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver15.keySet();
        experiment.util.Set set20 = hashMapTestDriver15.keySet();
        experiment.util.Set set21 = hashMapTestDriver15.entrySet();
        int int22 = hashMapTestDriver15.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.get((java.lang.Object) 0);
        java.lang.Object obj28 = hashMapTestDriver23.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.get((java.lang.Object) 0);
        boolean boolean32 = hashMapTestDriver29.isEmpty();
        java.lang.Class<?> wildcardClass33 = hashMapTestDriver29.getClass();
        boolean boolean34 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj35 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver29);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.get((java.lang.Object) 0);
        experiment.util.Collection collection39 = hashMapTestDriver36.values();
        hashMapTestDriver36.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj43 = hashMapTestDriver41.get((java.lang.Object) 0);
        experiment.util.Collection collection44 = hashMapTestDriver41.values();
        int int45 = hashMapTestDriver41.size();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.get((java.lang.Object) 0);
        java.lang.Object obj51 = hashMapTestDriver46.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj54 = hashMapTestDriver52.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean56 = hashMapTestDriver55.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj59 = hashMapTestDriver57.remove((java.lang.Object) (byte) 10);
        boolean boolean60 = hashMapTestDriver57.isEmpty();
        java.lang.Object obj61 = hashMapTestDriver52.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) hashMapTestDriver57);
        java.lang.Object obj62 = hashMapTestDriver46.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj63 = hashMapTestDriver36.put((java.lang.Object) hashMapTestDriver41, (java.lang.Object) hashMapTestDriver46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = hashMapTestDriver5.put(obj35, (java.lang.Object) hashMapTestDriver46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = hashMapTestDriver8.get(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass12 = set11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) 0);
        experiment.util.Collection collection8 = hashMapTestDriver5.values();
        int int9 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) 0);
        java.lang.Object obj15 = hashMapTestDriver10.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj26 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj27 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver10);
        int int28 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 100);
        int int14 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass15 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        hashMapTestDriver8.clear();
        hashMapTestDriver8.clear();
        java.lang.Class<?> wildcardClass17 = hashMapTestDriver8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test032");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) 0);
        experiment.util.Collection collection9 = hashMapTestDriver6.values();
        int int10 = hashMapTestDriver6.size();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver6);
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test033");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj17 = hashMapTestDriver11.remove((java.lang.Object) (short) 1);
        java.lang.Object obj19 = hashMapTestDriver11.get((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = hashMapTestDriver0.remove((java.lang.Object) (-1.0f));
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        boolean boolean32 = hashMapTestDriver21.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj35 = hashMapTestDriver33.get((java.lang.Object) 0);
        java.lang.Object obj38 = hashMapTestDriver33.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean43 = hashMapTestDriver42.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) (byte) 10);
        boolean boolean47 = hashMapTestDriver44.isEmpty();
        java.lang.Object obj48 = hashMapTestDriver39.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) hashMapTestDriver44);
        java.lang.Object obj49 = hashMapTestDriver33.get((java.lang.Object) hashMapTestDriver42);
        boolean boolean50 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver33);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj53 = hashMapTestDriver51.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        boolean boolean55 = hashMapTestDriver54.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj58 = hashMapTestDriver56.remove((java.lang.Object) (byte) 10);
        boolean boolean59 = hashMapTestDriver56.isEmpty();
        java.lang.Object obj60 = hashMapTestDriver51.put((java.lang.Object) hashMapTestDriver54, (java.lang.Object) hashMapTestDriver56);
        experiment.util.Set set61 = hashMapTestDriver51.entrySet();
        experiment.util.Set set62 = hashMapTestDriver51.keySet();
        boolean boolean64 = hashMapTestDriver51.containsKey((java.lang.Object) (short) 100);
        boolean boolean65 = hashMapTestDriver33.containsKey((java.lang.Object) boolean64);
        hashMapTestDriver33.clear();
        java.lang.Object obj68 = hashMapTestDriver33.remove((java.lang.Object) ' ');
        java.lang.Object obj69 = hashMapTestDriver0.get((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass70 = obj69.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test034");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) '#');
        int int8 = hashMapTestDriver0.size();
        java.lang.Object obj10 = hashMapTestDriver0.get((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = hashMapTestDriver0.get(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test035");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver8);
        boolean boolean14 = hashMapTestDriver3.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj31 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver24);
        boolean boolean32 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) boolean32, (java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.get((java.lang.Object) 0);
        java.lang.Object obj40 = hashMapTestDriver35.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj43 = hashMapTestDriver41.get((java.lang.Object) 0);
        experiment.util.Collection collection44 = hashMapTestDriver41.values();
        int int45 = hashMapTestDriver41.size();
        java.lang.Object obj46 = hashMapTestDriver35.get((java.lang.Object) hashMapTestDriver41);
        experiment.util.Set set47 = hashMapTestDriver41.keySet();
        boolean boolean48 = hashMapTestDriver0.containsKey((java.lang.Object) set47);
        boolean boolean49 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test036");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        int int6 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.get((java.lang.Object) 0);
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass17 = hashMapTestDriver13.getClass();
        boolean boolean18 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver13);
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set20 = hashMapTestDriver7.keySet();
        hashMapTestDriver7.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test037");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver19);
        boolean boolean25 = hashMapTestDriver14.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj34 = hashMapTestDriver32.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver35.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.remove((java.lang.Object) (byte) 10);
        boolean boolean40 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver32.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver37);
        java.lang.Object obj42 = hashMapTestDriver26.get((java.lang.Object) hashMapTestDriver35);
        boolean boolean43 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver26);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        boolean boolean48 = hashMapTestDriver47.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean52 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver44.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) hashMapTestDriver49);
        experiment.util.Set set54 = hashMapTestDriver44.entrySet();
        experiment.util.Set set55 = hashMapTestDriver44.keySet();
        boolean boolean57 = hashMapTestDriver44.containsKey((java.lang.Object) (short) 100);
        boolean boolean58 = hashMapTestDriver26.containsKey((java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver0.get((java.lang.Object) boolean58);
        experiment.util.Collection collection60 = hashMapTestDriver0.values();
        java.lang.Object obj62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = hashMapTestDriver0.put((java.lang.Object) (-1), obj62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test038");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        boolean boolean15 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set16 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.get((java.lang.Object) 0);
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        experiment.util.Set set21 = hashMapTestDriver17.keySet();
        experiment.util.Set set22 = hashMapTestDriver17.keySet();
        experiment.util.Set set23 = hashMapTestDriver17.entrySet();
        int int24 = hashMapTestDriver17.size();
        boolean boolean25 = hashMapTestDriver17.isEmpty();
        int int26 = hashMapTestDriver17.size();
        experiment.util.Set set27 = hashMapTestDriver17.keySet();
        experiment.util.Set set28 = hashMapTestDriver17.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.get((java.lang.Object) 0);
        boolean boolean32 = hashMapTestDriver29.isEmpty();
        experiment.util.Set set33 = hashMapTestDriver29.keySet();
        experiment.util.Set set34 = hashMapTestDriver29.keySet();
        experiment.util.Set set35 = hashMapTestDriver29.entrySet();
        int int36 = hashMapTestDriver29.size();
        boolean boolean37 = hashMapTestDriver29.isEmpty();
        int int38 = hashMapTestDriver29.size();
        experiment.util.Set set39 = hashMapTestDriver29.keySet();
        experiment.util.Collection collection40 = hashMapTestDriver29.values();
        java.lang.Object obj41 = hashMapTestDriver17.remove((java.lang.Object) collection40);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = hashMapTestDriver0.containsKey(obj41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test039");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set17 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test040");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set17 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        experiment.util.Set set28 = hashMapTestDriver18.entrySet();
        java.lang.Object obj31 = hashMapTestDriver18.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass32 = hashMapTestDriver18.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj35 = hashMapTestDriver33.get((java.lang.Object) 0);
        java.lang.Object obj38 = hashMapTestDriver33.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        hashMapTestDriver33.clear();
        java.lang.Object obj40 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver33);
        int int41 = hashMapTestDriver18.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test041");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.get((java.lang.Object) 0);
        boolean boolean21 = hashMapTestDriver18.isEmpty();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        experiment.util.Set set23 = hashMapTestDriver18.keySet();
        experiment.util.Set set24 = hashMapTestDriver18.entrySet();
        int int25 = hashMapTestDriver18.size();
        boolean boolean26 = hashMapTestDriver18.isEmpty();
        int int27 = hashMapTestDriver18.size();
        java.lang.Object obj29 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.Set set30 = hashMapTestDriver18.keySet();
        java.lang.Object obj31 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj34 = hashMapTestDriver32.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver35.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.remove((java.lang.Object) (byte) 10);
        boolean boolean40 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver32.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver37);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.get((java.lang.Object) 0);
        boolean boolean45 = hashMapTestDriver42.isEmpty();
        experiment.util.Set set46 = hashMapTestDriver42.keySet();
        experiment.util.Set set47 = hashMapTestDriver42.keySet();
        experiment.util.Set set48 = hashMapTestDriver42.entrySet();
        int int49 = hashMapTestDriver42.size();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj52 = hashMapTestDriver50.get((java.lang.Object) 0);
        java.lang.Object obj55 = hashMapTestDriver50.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj58 = hashMapTestDriver56.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        boolean boolean60 = hashMapTestDriver59.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj63 = hashMapTestDriver61.remove((java.lang.Object) (byte) 10);
        boolean boolean64 = hashMapTestDriver61.isEmpty();
        java.lang.Object obj65 = hashMapTestDriver56.put((java.lang.Object) hashMapTestDriver59, (java.lang.Object) hashMapTestDriver61);
        java.lang.Object obj66 = hashMapTestDriver50.get((java.lang.Object) hashMapTestDriver59);
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj69 = hashMapTestDriver67.get((java.lang.Object) 0);
        java.lang.Object obj72 = hashMapTestDriver67.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj75 = hashMapTestDriver73.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        boolean boolean77 = hashMapTestDriver76.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj80 = hashMapTestDriver78.remove((java.lang.Object) (byte) 10);
        boolean boolean81 = hashMapTestDriver78.isEmpty();
        java.lang.Object obj82 = hashMapTestDriver73.put((java.lang.Object) hashMapTestDriver76, (java.lang.Object) hashMapTestDriver78);
        java.lang.Object obj83 = hashMapTestDriver67.get((java.lang.Object) hashMapTestDriver76);
        experiment.util.Set set84 = hashMapTestDriver67.keySet();
        java.lang.Object obj85 = hashMapTestDriver42.put((java.lang.Object) hashMapTestDriver50, (java.lang.Object) set84);
        hashMapTestDriver50.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj89 = hashMapTestDriver87.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver90 = new experiment.util.HashMapTestDriver();
        boolean boolean91 = hashMapTestDriver90.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver92 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj94 = hashMapTestDriver92.remove((java.lang.Object) (byte) 10);
        boolean boolean95 = hashMapTestDriver92.isEmpty();
        java.lang.Object obj96 = hashMapTestDriver87.put((java.lang.Object) hashMapTestDriver90, (java.lang.Object) hashMapTestDriver92);
        experiment.util.Set set97 = hashMapTestDriver87.entrySet();
        java.lang.Object obj98 = hashMapTestDriver37.put((java.lang.Object) hashMapTestDriver50, (java.lang.Object) set97);
        java.lang.Object obj99 = hashMapTestDriver18.get((java.lang.Object) set97);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test042");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver1.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver1.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj12 = hashMapTestDriver6.remove((java.lang.Object) (short) 1);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object obj27 = hashMapTestDriver16.get(obj26);
        java.lang.Object obj28 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver16);
        hashMapTestDriver16.clear();
        boolean boolean30 = hashMapTestDriver16.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test043");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.get((java.lang.Object) 0);
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        experiment.util.Collection collection18 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) 0);
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver29.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver26.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) hashMapTestDriver31);
        java.lang.Object obj37 = hashMapTestDriver31.remove((java.lang.Object) (short) 1);
        java.lang.Object obj39 = hashMapTestDriver31.get((java.lang.Object) (-1.0f));
        java.lang.Object obj40 = hashMapTestDriver20.remove((java.lang.Object) (-1.0f));
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj43 = hashMapTestDriver41.get((java.lang.Object) 0);
        boolean boolean44 = hashMapTestDriver41.isEmpty();
        java.lang.Class<?> wildcardClass45 = hashMapTestDriver41.getClass();
        java.lang.Object obj46 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) wildcardClass45);
        experiment.util.Set set47 = hashMapTestDriver20.keySet();
        hashMapTestDriver20.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test044");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) '#');
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver5.remove((java.lang.Object) (short) 1);
        java.lang.Object obj13 = hashMapTestDriver5.get((java.lang.Object) (-1.0f));
        int int14 = hashMapTestDriver5.size();
        experiment.util.Set set15 = hashMapTestDriver5.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj27 = hashMapTestDriver21.remove((java.lang.Object) (short) 1);
        java.lang.Object obj29 = hashMapTestDriver21.get((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = hashMapTestDriver5.containsKey(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test046");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver1.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver1.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj12 = hashMapTestDriver6.remove((java.lang.Object) (short) 1);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver20.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) (byte) 10);
        boolean boolean25 = hashMapTestDriver22.isEmpty();
        java.lang.Object obj26 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) hashMapTestDriver22);
        boolean boolean28 = hashMapTestDriver17.containsKey((java.lang.Object) '#');
        experiment.util.Collection collection29 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean35 = hashMapTestDriver34.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.remove((java.lang.Object) (byte) 10);
        boolean boolean39 = hashMapTestDriver36.isEmpty();
        java.lang.Object obj40 = hashMapTestDriver31.put((java.lang.Object) hashMapTestDriver34, (java.lang.Object) hashMapTestDriver36);
        java.lang.Object obj42 = hashMapTestDriver36.remove((java.lang.Object) (short) 1);
        boolean boolean44 = hashMapTestDriver36.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj45 = hashMapTestDriver30.remove((java.lang.Object) 0.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        boolean boolean50 = hashMapTestDriver49.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj53 = hashMapTestDriver51.remove((java.lang.Object) (byte) 10);
        boolean boolean54 = hashMapTestDriver51.isEmpty();
        java.lang.Object obj55 = hashMapTestDriver46.put((java.lang.Object) hashMapTestDriver49, (java.lang.Object) hashMapTestDriver51);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Object obj57 = hashMapTestDriver46.get(obj56);
        java.lang.Object obj58 = hashMapTestDriver30.get((java.lang.Object) hashMapTestDriver46);
        java.lang.Object obj59 = hashMapTestDriver17.remove((java.lang.Object) hashMapTestDriver30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = hashMapTestDriver0.remove(obj59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test047");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver5.remove((java.lang.Object) (short) 1);
        boolean boolean13 = hashMapTestDriver5.containsKey((java.lang.Object) 0.0f);
        hashMapTestDriver5.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test048");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver1.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver1.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj12 = hashMapTestDriver6.remove((java.lang.Object) (short) 1);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) 0.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object obj27 = hashMapTestDriver16.get(obj26);
        java.lang.Object obj28 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set29 = hashMapTestDriver16.entrySet();
        java.lang.Class<?> wildcardClass30 = set29.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test049");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass7 = set6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        int int9 = hashMapTestDriver0.size();
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        int int12 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test051");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj28 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver21);
        boolean boolean29 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        boolean boolean31 = hashMapTestDriver0.containsKey((java.lang.Object) (-1.0d));
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj35 = hashMapTestDriver33.remove((java.lang.Object) (byte) 10);
        boolean boolean36 = hashMapTestDriver33.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean41 = hashMapTestDriver40.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.remove((java.lang.Object) (byte) 10);
        boolean boolean45 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj46 = hashMapTestDriver37.put((java.lang.Object) hashMapTestDriver40, (java.lang.Object) hashMapTestDriver42);
        java.lang.Object obj48 = hashMapTestDriver37.remove((java.lang.Object) 1.0d);
        experiment.util.Collection collection49 = hashMapTestDriver37.values();
        hashMapTestDriver37.clear();
        java.lang.Object obj51 = hashMapTestDriver33.get((java.lang.Object) hashMapTestDriver37);
        experiment.util.Collection collection52 = hashMapTestDriver33.values();
        java.lang.Object obj53 = hashMapTestDriver0.get((java.lang.Object) collection52);
        java.lang.Class<?> wildcardClass54 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test052");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) 0);
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver6.getClass();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) '#');
        int int20 = hashMapTestDriver12.size();
        java.lang.Object obj22 = hashMapTestDriver12.get((java.lang.Object) (-1.0d));
        java.lang.Object obj23 = hashMapTestDriver6.get((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test053");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) 0);
        boolean boolean13 = hashMapTestDriver10.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        experiment.util.Set set15 = hashMapTestDriver10.keySet();
        experiment.util.Set set16 = hashMapTestDriver10.entrySet();
        int int17 = hashMapTestDriver10.size();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.get((java.lang.Object) 0);
        java.lang.Object obj23 = hashMapTestDriver18.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean28 = hashMapTestDriver27.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = hashMapTestDriver29.isEmpty();
        java.lang.Object obj33 = hashMapTestDriver24.put((java.lang.Object) hashMapTestDriver27, (java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj34 = hashMapTestDriver18.get((java.lang.Object) hashMapTestDriver27);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.get((java.lang.Object) 0);
        java.lang.Object obj40 = hashMapTestDriver35.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj43 = hashMapTestDriver41.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        boolean boolean45 = hashMapTestDriver44.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) (byte) 10);
        boolean boolean49 = hashMapTestDriver46.isEmpty();
        java.lang.Object obj50 = hashMapTestDriver41.put((java.lang.Object) hashMapTestDriver44, (java.lang.Object) hashMapTestDriver46);
        java.lang.Object obj51 = hashMapTestDriver35.get((java.lang.Object) hashMapTestDriver44);
        experiment.util.Set set52 = hashMapTestDriver35.keySet();
        java.lang.Object obj53 = hashMapTestDriver10.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) set52);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        boolean boolean59 = hashMapTestDriver58.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj62 = hashMapTestDriver60.remove((java.lang.Object) (byte) 10);
        boolean boolean63 = hashMapTestDriver60.isEmpty();
        java.lang.Object obj64 = hashMapTestDriver55.put((java.lang.Object) hashMapTestDriver58, (java.lang.Object) hashMapTestDriver60);
        experiment.util.Set set65 = hashMapTestDriver55.entrySet();
        java.lang.Object obj66 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) set65);
        experiment.util.Set set67 = hashMapTestDriver18.keySet();
        java.lang.Class<?> wildcardClass68 = set67.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test054");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver19);
        boolean boolean25 = hashMapTestDriver14.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj34 = hashMapTestDriver32.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver35.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.remove((java.lang.Object) (byte) 10);
        boolean boolean40 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver32.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver37);
        java.lang.Object obj42 = hashMapTestDriver26.get((java.lang.Object) hashMapTestDriver35);
        boolean boolean43 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver26);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        boolean boolean48 = hashMapTestDriver47.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean52 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver44.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) hashMapTestDriver49);
        experiment.util.Set set54 = hashMapTestDriver44.entrySet();
        experiment.util.Set set55 = hashMapTestDriver44.keySet();
        boolean boolean57 = hashMapTestDriver44.containsKey((java.lang.Object) (short) 100);
        boolean boolean58 = hashMapTestDriver26.containsKey((java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver0.get((java.lang.Object) boolean58);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj62 = hashMapTestDriver60.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        boolean boolean64 = hashMapTestDriver63.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj67 = hashMapTestDriver65.remove((java.lang.Object) (byte) 10);
        boolean boolean68 = hashMapTestDriver65.isEmpty();
        java.lang.Object obj69 = hashMapTestDriver60.put((java.lang.Object) hashMapTestDriver63, (java.lang.Object) hashMapTestDriver65);
        experiment.util.Set set70 = hashMapTestDriver60.entrySet();
        experiment.util.Set set71 = hashMapTestDriver60.keySet();
        boolean boolean73 = hashMapTestDriver60.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj76 = hashMapTestDriver74.get((java.lang.Object) 0);
        experiment.util.Collection collection77 = hashMapTestDriver74.values();
        experiment.util.Collection collection78 = hashMapTestDriver74.values();
        java.lang.Object obj79 = hashMapTestDriver60.remove((java.lang.Object) hashMapTestDriver74);
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj82 = hashMapTestDriver80.get((java.lang.Object) 0);
        java.lang.Object obj85 = hashMapTestDriver80.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver86 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj88 = hashMapTestDriver86.get((java.lang.Object) 0);
        experiment.util.Collection collection89 = hashMapTestDriver86.values();
        int int90 = hashMapTestDriver86.size();
        java.lang.Object obj91 = hashMapTestDriver80.get((java.lang.Object) hashMapTestDriver86);
        experiment.util.Set set92 = hashMapTestDriver86.keySet();
        experiment.util.Collection collection93 = hashMapTestDriver86.values();
        boolean boolean94 = hashMapTestDriver86.isEmpty();
        java.lang.Object obj95 = hashMapTestDriver74.get((java.lang.Object) hashMapTestDriver86);
        boolean boolean97 = hashMapTestDriver74.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj98 = hashMapTestDriver0.remove((java.lang.Object) boolean97);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test055");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test056");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) 1.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj16 = hashMapTestDriver12.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.get((java.lang.Object) 0);
        experiment.util.Collection collection20 = hashMapTestDriver17.values();
        hashMapTestDriver17.clear();
        java.lang.Class<?> wildcardClass22 = hashMapTestDriver17.getClass();
        java.lang.Object obj23 = hashMapTestDriver12.remove((java.lang.Object) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = hashMapTestDriver0.containsKey(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test057");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj6 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.get((java.lang.Object) 0);
        boolean boolean10 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set11 = hashMapTestDriver7.keySet();
        experiment.util.Set set12 = hashMapTestDriver7.keySet();
        experiment.util.Set set13 = hashMapTestDriver7.entrySet();
        int int14 = hashMapTestDriver7.size();
        boolean boolean15 = hashMapTestDriver7.isEmpty();
        int int16 = hashMapTestDriver7.size();
        experiment.util.Set set17 = hashMapTestDriver7.keySet();
        experiment.util.Set set18 = hashMapTestDriver7.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.get((java.lang.Object) 0);
        boolean boolean22 = hashMapTestDriver19.isEmpty();
        experiment.util.Set set23 = hashMapTestDriver19.keySet();
        experiment.util.Set set24 = hashMapTestDriver19.keySet();
        experiment.util.Set set25 = hashMapTestDriver19.entrySet();
        int int26 = hashMapTestDriver19.size();
        boolean boolean27 = hashMapTestDriver19.isEmpty();
        int int28 = hashMapTestDriver19.size();
        experiment.util.Set set29 = hashMapTestDriver19.keySet();
        experiment.util.Collection collection30 = hashMapTestDriver19.values();
        java.lang.Object obj31 = hashMapTestDriver7.remove((java.lang.Object) collection30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = hashMapTestDriver0.put(obj6, obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test058");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        hashMapTestDriver8.clear();
        java.lang.Object obj17 = hashMapTestDriver8.remove((java.lang.Object) 0L);
        hashMapTestDriver8.clear();
        experiment.util.Set set19 = hashMapTestDriver8.keySet();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = hashMapTestDriver8.get(obj20);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test059");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = hashMapTestDriver0.remove(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test060");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.get((java.lang.Object) 0);
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        experiment.util.Collection collection18 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) 0);
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        experiment.util.Collection collection29 = hashMapTestDriver26.values();
        int int30 = hashMapTestDriver26.size();
        java.lang.Object obj31 = hashMapTestDriver20.get((java.lang.Object) hashMapTestDriver26);
        experiment.util.Set set32 = hashMapTestDriver26.keySet();
        experiment.util.Collection collection33 = hashMapTestDriver26.values();
        boolean boolean34 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver14.get((java.lang.Object) hashMapTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass36 = obj35.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test061");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.Collection collection12 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj25 = hashMapTestDriver19.remove((java.lang.Object) (short) 1);
        boolean boolean27 = hashMapTestDriver19.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj28 = hashMapTestDriver13.remove((java.lang.Object) 0.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean33 = hashMapTestDriver32.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.remove((java.lang.Object) (byte) 10);
        boolean boolean37 = hashMapTestDriver34.isEmpty();
        java.lang.Object obj38 = hashMapTestDriver29.put((java.lang.Object) hashMapTestDriver32, (java.lang.Object) hashMapTestDriver34);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Object obj40 = hashMapTestDriver29.get(obj39);
        java.lang.Object obj41 = hashMapTestDriver13.get((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj42 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver13);
        boolean boolean43 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set44 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass45 = set44.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test062");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) 0);
        experiment.util.Collection collection8 = hashMapTestDriver5.values();
        int int9 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) 0);
        java.lang.Object obj15 = hashMapTestDriver10.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj26 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj27 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection28 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test063");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        int int9 = hashMapTestDriver0.size();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        experiment.util.Set set17 = hashMapTestDriver13.keySet();
        experiment.util.Set set18 = hashMapTestDriver13.keySet();
        experiment.util.Set set19 = hashMapTestDriver13.entrySet();
        int int20 = hashMapTestDriver13.size();
        boolean boolean21 = hashMapTestDriver13.isEmpty();
        int int22 = hashMapTestDriver13.size();
        java.lang.Object obj23 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = obj23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test064");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.get((java.lang.Object) 0);
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        experiment.util.Collection collection18 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) 0);
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        experiment.util.Collection collection29 = hashMapTestDriver26.values();
        int int30 = hashMapTestDriver26.size();
        java.lang.Object obj31 = hashMapTestDriver20.get((java.lang.Object) hashMapTestDriver26);
        experiment.util.Set set32 = hashMapTestDriver26.keySet();
        experiment.util.Collection collection33 = hashMapTestDriver26.values();
        boolean boolean34 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver14.get((java.lang.Object) hashMapTestDriver26);
        experiment.util.Collection collection36 = hashMapTestDriver26.values();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.get((java.lang.Object) 0);
        experiment.util.Collection collection40 = hashMapTestDriver37.values();
        hashMapTestDriver37.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.get((java.lang.Object) 0);
        experiment.util.Collection collection45 = hashMapTestDriver42.values();
        int int46 = hashMapTestDriver42.size();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj49 = hashMapTestDriver47.get((java.lang.Object) 0);
        java.lang.Object obj52 = hashMapTestDriver47.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj55 = hashMapTestDriver53.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver56.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.remove((java.lang.Object) (byte) 10);
        boolean boolean61 = hashMapTestDriver58.isEmpty();
        java.lang.Object obj62 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver56, (java.lang.Object) hashMapTestDriver58);
        java.lang.Object obj63 = hashMapTestDriver47.get((java.lang.Object) hashMapTestDriver56);
        java.lang.Object obj64 = hashMapTestDriver37.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) hashMapTestDriver47);
        java.lang.Object obj65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = hashMapTestDriver26.put((java.lang.Object) hashMapTestDriver42, obj65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test065");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver1.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver1.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj12 = hashMapTestDriver6.remove((java.lang.Object) (short) 1);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) 0.0f);
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.get((java.lang.Object) 0);
        java.lang.Object obj22 = hashMapTestDriver17.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.get((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        int int27 = hashMapTestDriver23.size();
        java.lang.Object obj28 = hashMapTestDriver17.get((java.lang.Object) hashMapTestDriver23);
        experiment.util.Set set29 = hashMapTestDriver23.keySet();
        java.lang.Object obj30 = hashMapTestDriver0.get((java.lang.Object) set29);
        boolean boolean31 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test066");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver7.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) (byte) 10);
        boolean boolean12 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver7, (java.lang.Object) hashMapTestDriver9);
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) 1.0d);
        experiment.util.Collection collection16 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        java.lang.Object obj18 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Collection collection19 = hashMapTestDriver0.values();
        experiment.util.Set set20 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        experiment.util.Set set31 = hashMapTestDriver21.entrySet();
        experiment.util.Set set32 = hashMapTestDriver21.keySet();
        boolean boolean34 = hashMapTestDriver21.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.get((java.lang.Object) 0);
        experiment.util.Collection collection38 = hashMapTestDriver35.values();
        experiment.util.Collection collection39 = hashMapTestDriver35.values();
        java.lang.Object obj40 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver35);
        boolean boolean41 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean42 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test067");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 100);
        int int14 = hashMapTestDriver0.size();
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.get((java.lang.Object) 0);
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        boolean boolean26 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = hashMapTestDriver27.isEmpty();
        java.lang.Object obj31 = hashMapTestDriver22.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) hashMapTestDriver27);
        java.lang.Object obj32 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set33 = hashMapTestDriver16.keySet();
        java.lang.Object obj34 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set35 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test068");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass5 = set4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test069");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 100);
        int int14 = hashMapTestDriver0.size();
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.get((java.lang.Object) 0);
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        boolean boolean26 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = hashMapTestDriver27.isEmpty();
        java.lang.Object obj31 = hashMapTestDriver22.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) hashMapTestDriver27);
        java.lang.Object obj32 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set33 = hashMapTestDriver16.keySet();
        java.lang.Object obj34 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver16);
        boolean boolean35 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test070");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        int int6 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.get((java.lang.Object) 0);
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass17 = hashMapTestDriver13.getClass();
        boolean boolean18 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver13);
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.get((java.lang.Object) 0);
        java.lang.Object obj26 = hashMapTestDriver21.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) '#');
        int int29 = hashMapTestDriver21.size();
        experiment.util.Set set30 = hashMapTestDriver21.entrySet();
        java.lang.Object obj31 = hashMapTestDriver0.put((java.lang.Object) 100, (java.lang.Object) set30);
        experiment.util.Set set32 = hashMapTestDriver0.keySet();
        boolean boolean33 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test071");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj28 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver21);
        boolean boolean29 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver33.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) (byte) 10);
        boolean boolean38 = hashMapTestDriver35.isEmpty();
        java.lang.Object obj39 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver33, (java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set40 = hashMapTestDriver30.entrySet();
        experiment.util.Set set41 = hashMapTestDriver30.keySet();
        boolean boolean43 = hashMapTestDriver30.containsKey((java.lang.Object) (short) 100);
        boolean boolean44 = hashMapTestDriver12.containsKey((java.lang.Object) boolean43);
        hashMapTestDriver12.clear();
        java.lang.Object obj47 = hashMapTestDriver12.remove((java.lang.Object) ' ');
        hashMapTestDriver12.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test072");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0);
        java.lang.Object obj18 = hashMapTestDriver13.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.get((java.lang.Object) 0);
        experiment.util.Collection collection22 = hashMapTestDriver19.values();
        int int23 = hashMapTestDriver19.size();
        java.lang.Object obj24 = hashMapTestDriver13.get((java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj25 = hashMapTestDriver11.get((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver19.clear();
        boolean boolean28 = hashMapTestDriver19.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set30 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test073");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set15 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection16 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test074");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj28 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver21);
        boolean boolean29 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.get((java.lang.Object) 0);
        java.lang.Object obj34 = hashMapTestDriver30.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.get((java.lang.Object) 0);
        experiment.util.Collection collection38 = hashMapTestDriver35.values();
        hashMapTestDriver35.clear();
        java.lang.Class<?> wildcardClass40 = hashMapTestDriver35.getClass();
        java.lang.Object obj41 = hashMapTestDriver30.remove((java.lang.Object) wildcardClass40);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection43 = hashMapTestDriver42.values();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.get((java.lang.Object) 0);
        java.lang.Object obj49 = hashMapTestDriver44.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj52 = hashMapTestDriver50.get((java.lang.Object) 0);
        experiment.util.Collection collection53 = hashMapTestDriver50.values();
        int int54 = hashMapTestDriver50.size();
        java.lang.Object obj55 = hashMapTestDriver44.get((java.lang.Object) hashMapTestDriver50);
        java.lang.Object obj56 = hashMapTestDriver42.get((java.lang.Object) hashMapTestDriver50);
        boolean boolean57 = hashMapTestDriver42.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.remove((java.lang.Object) (byte) 10);
        boolean boolean61 = hashMapTestDriver58.isEmpty();
        java.lang.Object obj63 = hashMapTestDriver58.get((java.lang.Object) 0);
        boolean boolean64 = hashMapTestDriver58.isEmpty();
        boolean boolean65 = hashMapTestDriver58.isEmpty();
        boolean boolean66 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver58);
        java.lang.Object obj67 = hashMapTestDriver12.put((java.lang.Object) wildcardClass40, (java.lang.Object) boolean66);
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj70 = hashMapTestDriver68.get((java.lang.Object) 0);
        java.lang.Object obj73 = hashMapTestDriver68.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj75 = hashMapTestDriver68.get((java.lang.Object) '#');
        int int76 = hashMapTestDriver68.size();
        java.lang.Object obj77 = hashMapTestDriver12.remove((java.lang.Object) int76);
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj80 = hashMapTestDriver78.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver81 = new experiment.util.HashMapTestDriver();
        boolean boolean82 = hashMapTestDriver81.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver83 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj85 = hashMapTestDriver83.remove((java.lang.Object) (byte) 10);
        boolean boolean86 = hashMapTestDriver83.isEmpty();
        java.lang.Object obj87 = hashMapTestDriver78.put((java.lang.Object) hashMapTestDriver81, (java.lang.Object) hashMapTestDriver83);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = hashMapTestDriver12.get(obj87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test075");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) '#');
        int int8 = hashMapTestDriver0.size();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test076");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) (byte) 10);
        boolean boolean7 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        java.lang.Object obj17 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver13);
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) 1.0d);
        experiment.util.Collection collection20 = hashMapTestDriver8.values();
        hashMapTestDriver8.clear();
        java.lang.Object obj22 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.get((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        int int27 = hashMapTestDriver23.size();
        java.lang.Object obj28 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver23);
        experiment.util.Collection collection29 = hashMapTestDriver4.values();
        java.lang.Object obj30 = hashMapTestDriver0.get((java.lang.Object) collection29);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test077");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.get((java.lang.Object) 0);
        java.lang.Object obj19 = hashMapTestDriver14.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) 0);
        experiment.util.Collection collection23 = hashMapTestDriver20.values();
        int int24 = hashMapTestDriver20.size();
        java.lang.Object obj25 = hashMapTestDriver14.get((java.lang.Object) hashMapTestDriver20);
        java.lang.Object obj26 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver20);
        hashMapTestDriver20.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.get((java.lang.Object) 0);
        java.lang.Object obj33 = hashMapTestDriver28.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.get((java.lang.Object) 0);
        experiment.util.Collection collection37 = hashMapTestDriver34.values();
        int int38 = hashMapTestDriver34.size();
        java.lang.Object obj39 = hashMapTestDriver28.get((java.lang.Object) hashMapTestDriver34);
        experiment.util.Set set40 = hashMapTestDriver34.keySet();
        java.lang.Object obj41 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) hashMapTestDriver34);
        experiment.util.Collection collection42 = hashMapTestDriver20.values();
        boolean boolean43 = hashMapTestDriver20.isEmpty();
        java.lang.Object obj44 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.get((java.lang.Object) 0);
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        boolean boolean52 = hashMapTestDriver45.containsKey((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = hashMapTestDriver20.put(obj44, (java.lang.Object) boolean52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test078");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj28 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.get((java.lang.Object) 0);
        java.lang.Object obj34 = hashMapTestDriver29.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        int int35 = hashMapTestDriver29.size();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.get((java.lang.Object) 0);
        java.lang.Object obj41 = hashMapTestDriver36.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.get((java.lang.Object) 0);
        boolean boolean45 = hashMapTestDriver42.isEmpty();
        java.lang.Class<?> wildcardClass46 = hashMapTestDriver42.getClass();
        boolean boolean47 = hashMapTestDriver36.containsKey((java.lang.Object) hashMapTestDriver42);
        java.lang.Object obj48 = hashMapTestDriver29.remove((java.lang.Object) hashMapTestDriver36);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj52 = hashMapTestDriver50.get((java.lang.Object) 0);
        java.lang.Object obj55 = hashMapTestDriver50.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj57 = hashMapTestDriver50.get((java.lang.Object) '#');
        int int58 = hashMapTestDriver50.size();
        experiment.util.Set set59 = hashMapTestDriver50.entrySet();
        java.lang.Object obj60 = hashMapTestDriver29.put((java.lang.Object) 100, (java.lang.Object) set59);
        experiment.util.Collection collection61 = hashMapTestDriver29.values();
        java.lang.Object obj62 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = hashMapTestDriver0.get(obj62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test079");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        int int10 = hashMapTestDriver3.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test080");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.get((java.lang.Object) 0);
        boolean boolean7 = hashMapTestDriver4.isEmpty();
        experiment.util.Set set8 = hashMapTestDriver4.keySet();
        experiment.util.Set set9 = hashMapTestDriver4.keySet();
        experiment.util.Set set10 = hashMapTestDriver4.entrySet();
        int int11 = hashMapTestDriver4.size();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj28 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.get((java.lang.Object) 0);
        java.lang.Object obj34 = hashMapTestDriver29.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = hashMapTestDriver40.isEmpty();
        java.lang.Object obj44 = hashMapTestDriver35.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj45 = hashMapTestDriver29.get((java.lang.Object) hashMapTestDriver38);
        experiment.util.Set set46 = hashMapTestDriver29.keySet();
        java.lang.Object obj47 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) set46);
        java.lang.Object obj48 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        experiment.util.Set set49 = hashMapTestDriver12.entrySet();
        experiment.util.Set set50 = hashMapTestDriver12.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test081");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.get((java.lang.Object) 0);
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean17 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        boolean boolean21 = hashMapTestDriver18.isEmpty();
        java.lang.Object obj22 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver18);
        java.lang.Object obj23 = hashMapTestDriver7.get((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set24 = hashMapTestDriver7.keySet();
        experiment.util.Set set25 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver29.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver26.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) hashMapTestDriver31);
        boolean boolean37 = hashMapTestDriver26.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.get((java.lang.Object) 0);
        java.lang.Object obj43 = hashMapTestDriver38.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        boolean boolean48 = hashMapTestDriver47.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean52 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver44.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) hashMapTestDriver49);
        java.lang.Object obj54 = hashMapTestDriver38.get((java.lang.Object) hashMapTestDriver47);
        boolean boolean55 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver38);
        java.lang.Object obj57 = hashMapTestDriver38.get((java.lang.Object) 0);
        experiment.util.Set set58 = hashMapTestDriver38.entrySet();
        java.lang.Object obj59 = hashMapTestDriver0.put((java.lang.Object) set25, (java.lang.Object) set58);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test082");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver1.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver1.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj12 = hashMapTestDriver6.remove((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver6.getClass();
        java.lang.Object obj14 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test083");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.Collection collection12 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj25 = hashMapTestDriver19.remove((java.lang.Object) (short) 1);
        boolean boolean27 = hashMapTestDriver19.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj28 = hashMapTestDriver13.remove((java.lang.Object) 0.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean33 = hashMapTestDriver32.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.remove((java.lang.Object) (byte) 10);
        boolean boolean37 = hashMapTestDriver34.isEmpty();
        java.lang.Object obj38 = hashMapTestDriver29.put((java.lang.Object) hashMapTestDriver32, (java.lang.Object) hashMapTestDriver34);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Object obj40 = hashMapTestDriver29.get(obj39);
        java.lang.Object obj41 = hashMapTestDriver13.get((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj42 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver13);
        int int43 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test084");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver8.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.remove((java.lang.Object) (byte) 10);
        boolean boolean13 = hashMapTestDriver10.isEmpty();
        java.lang.Object obj14 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver10);
        experiment.util.Set set15 = hashMapTestDriver5.entrySet();
        java.lang.Object obj16 = hashMapTestDriver0.remove((java.lang.Object) set15);
        experiment.util.Collection collection17 = hashMapTestDriver0.values();
        experiment.util.Set set18 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test085");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver8);
        boolean boolean14 = hashMapTestDriver3.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj31 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver24);
        boolean boolean32 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) boolean32, (java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.get((java.lang.Object) 0);
        java.lang.Object obj40 = hashMapTestDriver35.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj43 = hashMapTestDriver41.get((java.lang.Object) 0);
        experiment.util.Collection collection44 = hashMapTestDriver41.values();
        int int45 = hashMapTestDriver41.size();
        java.lang.Object obj46 = hashMapTestDriver35.get((java.lang.Object) hashMapTestDriver41);
        experiment.util.Set set47 = hashMapTestDriver41.keySet();
        boolean boolean48 = hashMapTestDriver0.containsKey((java.lang.Object) set47);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj53 = hashMapTestDriver51.get((java.lang.Object) 0);
        java.lang.Object obj56 = hashMapTestDriver51.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj59 = hashMapTestDriver57.get((java.lang.Object) 0);
        experiment.util.Collection collection60 = hashMapTestDriver57.values();
        int int61 = hashMapTestDriver57.size();
        java.lang.Object obj62 = hashMapTestDriver51.get((java.lang.Object) hashMapTestDriver57);
        java.lang.Object obj63 = hashMapTestDriver49.get((java.lang.Object) hashMapTestDriver57);
        boolean boolean64 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set65 = hashMapTestDriver49.entrySet();
        java.lang.Object obj66 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj69 = hashMapTestDriver67.get((java.lang.Object) 0);
        boolean boolean70 = hashMapTestDriver67.isEmpty();
        experiment.util.Set set71 = hashMapTestDriver67.keySet();
        experiment.util.Set set72 = hashMapTestDriver67.keySet();
        experiment.util.Set set73 = hashMapTestDriver67.entrySet();
        experiment.util.Set set74 = hashMapTestDriver67.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj77 = hashMapTestDriver75.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        boolean boolean79 = hashMapTestDriver78.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj82 = hashMapTestDriver80.remove((java.lang.Object) (byte) 10);
        boolean boolean83 = hashMapTestDriver80.isEmpty();
        java.lang.Object obj84 = hashMapTestDriver75.put((java.lang.Object) hashMapTestDriver78, (java.lang.Object) hashMapTestDriver80);
        experiment.util.HashMapTestDriver hashMapTestDriver85 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj87 = hashMapTestDriver85.get((java.lang.Object) 0);
        boolean boolean88 = hashMapTestDriver85.isEmpty();
        experiment.util.Set set89 = hashMapTestDriver85.keySet();
        experiment.util.Set set90 = hashMapTestDriver85.keySet();
        experiment.util.Set set91 = hashMapTestDriver85.entrySet();
        boolean boolean92 = hashMapTestDriver75.containsKey((java.lang.Object) set91);
        java.lang.Object obj93 = hashMapTestDriver49.put((java.lang.Object) hashMapTestDriver67, (java.lang.Object) hashMapTestDriver75);
        experiment.util.HashMapTestDriver hashMapTestDriver94 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj96 = hashMapTestDriver94.remove((java.lang.Object) (byte) 10);
        boolean boolean97 = hashMapTestDriver94.isEmpty();
        int int98 = hashMapTestDriver94.size();
        boolean boolean99 = hashMapTestDriver75.containsKey((java.lang.Object) hashMapTestDriver94);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test086");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        int int12 = hashMapTestDriver0.size();
        java.lang.Object obj13 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.get((java.lang.Object) 0);
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        experiment.util.Set set18 = hashMapTestDriver14.keySet();
        experiment.util.Set set19 = hashMapTestDriver14.keySet();
        experiment.util.Set set20 = hashMapTestDriver14.entrySet();
        java.lang.Class<?> wildcardClass21 = set20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = hashMapTestDriver0.put(obj13, (java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test087");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        boolean boolean15 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        int int17 = hashMapTestDriver0.size();
        int int18 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test088");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) 0);
        java.lang.Object obj15 = hashMapTestDriver10.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        boolean boolean17 = hashMapTestDriver10.containsKey((java.lang.Object) 1.0d);
        java.lang.Object obj18 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection19 = hashMapTestDriver10.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test089");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) 0);
        experiment.util.Collection collection9 = hashMapTestDriver6.values();
        int int10 = hashMapTestDriver6.size();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver6);
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.get((java.lang.Object) 0);
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        experiment.util.Set set18 = hashMapTestDriver14.keySet();
        experiment.util.Set set19 = hashMapTestDriver14.keySet();
        experiment.util.Set set20 = hashMapTestDriver14.entrySet();
        int int21 = hashMapTestDriver14.size();
        boolean boolean22 = hashMapTestDriver14.isEmpty();
        java.lang.Object obj24 = hashMapTestDriver14.remove((java.lang.Object) 0L);
        experiment.util.Set set25 = hashMapTestDriver14.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver29.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver26.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) hashMapTestDriver31);
        experiment.util.Set set36 = hashMapTestDriver26.entrySet();
        java.lang.Object obj39 = hashMapTestDriver26.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        boolean boolean40 = hashMapTestDriver26.isEmpty();
        boolean boolean41 = hashMapTestDriver26.isEmpty();
        hashMapTestDriver26.clear();
        int int43 = hashMapTestDriver26.size();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.get((java.lang.Object) 0);
        experiment.util.Collection collection47 = hashMapTestDriver44.values();
        int int48 = hashMapTestDriver44.size();
        experiment.util.Set set49 = hashMapTestDriver44.entrySet();
        java.lang.Object obj50 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver26, (java.lang.Object) set49);
        java.lang.Object obj51 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set52 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test090");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        int int6 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.get((java.lang.Object) 0);
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass17 = hashMapTestDriver13.getClass();
        boolean boolean18 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver13);
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        java.lang.Object obj21 = hashMapTestDriver7.get((java.lang.Object) '4');
        boolean boolean23 = hashMapTestDriver7.containsKey((java.lang.Object) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test091");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        int int5 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        boolean boolean11 = hashMapTestDriver10.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) (byte) 10);
        boolean boolean15 = hashMapTestDriver12.isEmpty();
        java.lang.Object obj16 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver12);
        java.lang.Object obj18 = hashMapTestDriver12.remove((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver12.getClass();
        java.lang.Object obj20 = hashMapTestDriver6.remove((java.lang.Object) wildcardClass19);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        experiment.util.Set set31 = hashMapTestDriver21.entrySet();
        java.lang.Object obj34 = hashMapTestDriver21.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = hashMapTestDriver0.put(obj20, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test092");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver5.remove((java.lang.Object) (short) 1);
        java.lang.Object obj13 = hashMapTestDriver5.get((java.lang.Object) (-1.0f));
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver14.isEmpty();
        java.lang.Object obj16 = hashMapTestDriver5.get((java.lang.Object) boolean15);
        boolean boolean17 = hashMapTestDriver5.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        boolean boolean29 = hashMapTestDriver18.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.get((java.lang.Object) 0);
        java.lang.Object obj35 = hashMapTestDriver30.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        boolean boolean40 = hashMapTestDriver39.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj43 = hashMapTestDriver41.remove((java.lang.Object) (byte) 10);
        boolean boolean44 = hashMapTestDriver41.isEmpty();
        java.lang.Object obj45 = hashMapTestDriver36.put((java.lang.Object) hashMapTestDriver39, (java.lang.Object) hashMapTestDriver41);
        java.lang.Object obj46 = hashMapTestDriver30.get((java.lang.Object) hashMapTestDriver39);
        boolean boolean47 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver30);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj50 = hashMapTestDriver48.get((java.lang.Object) 0);
        java.lang.Object obj52 = hashMapTestDriver48.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj55 = hashMapTestDriver53.get((java.lang.Object) 0);
        experiment.util.Collection collection56 = hashMapTestDriver53.values();
        hashMapTestDriver53.clear();
        java.lang.Class<?> wildcardClass58 = hashMapTestDriver53.getClass();
        java.lang.Object obj59 = hashMapTestDriver48.remove((java.lang.Object) wildcardClass58);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection61 = hashMapTestDriver60.values();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj64 = hashMapTestDriver62.get((java.lang.Object) 0);
        java.lang.Object obj67 = hashMapTestDriver62.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj70 = hashMapTestDriver68.get((java.lang.Object) 0);
        experiment.util.Collection collection71 = hashMapTestDriver68.values();
        int int72 = hashMapTestDriver68.size();
        java.lang.Object obj73 = hashMapTestDriver62.get((java.lang.Object) hashMapTestDriver68);
        java.lang.Object obj74 = hashMapTestDriver60.get((java.lang.Object) hashMapTestDriver68);
        boolean boolean75 = hashMapTestDriver60.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj78 = hashMapTestDriver76.remove((java.lang.Object) (byte) 10);
        boolean boolean79 = hashMapTestDriver76.isEmpty();
        java.lang.Object obj81 = hashMapTestDriver76.get((java.lang.Object) 0);
        boolean boolean82 = hashMapTestDriver76.isEmpty();
        boolean boolean83 = hashMapTestDriver76.isEmpty();
        boolean boolean84 = hashMapTestDriver60.containsKey((java.lang.Object) hashMapTestDriver76);
        java.lang.Object obj85 = hashMapTestDriver30.put((java.lang.Object) wildcardClass58, (java.lang.Object) boolean84);
        int int86 = hashMapTestDriver30.size();
        experiment.util.Collection collection87 = hashMapTestDriver30.values();
        java.lang.Object obj88 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver30);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test093");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj4 = hashMapTestDriver0.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) 0);
        experiment.util.Collection collection8 = hashMapTestDriver5.values();
        hashMapTestDriver5.clear();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver5.getClass();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test094");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver5.remove((java.lang.Object) (short) 1);
        java.lang.Object obj13 = hashMapTestDriver5.get((java.lang.Object) (-1.0f));
        experiment.util.Collection collection14 = hashMapTestDriver5.values();
        int int15 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver21);
        boolean boolean27 = hashMapTestDriver16.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.get((java.lang.Object) 0);
        java.lang.Object obj33 = hashMapTestDriver28.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        boolean boolean38 = hashMapTestDriver37.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) (byte) 10);
        boolean boolean42 = hashMapTestDriver39.isEmpty();
        java.lang.Object obj43 = hashMapTestDriver34.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) hashMapTestDriver39);
        java.lang.Object obj44 = hashMapTestDriver28.get((java.lang.Object) hashMapTestDriver37);
        boolean boolean45 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean47 = hashMapTestDriver16.containsKey((java.lang.Object) (-1.0d));
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean52 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set53 = hashMapTestDriver49.keySet();
        java.lang.Object obj54 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = hashMapTestDriver5.get(obj54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test095");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        hashMapTestDriver8.clear();
        java.lang.Object obj17 = hashMapTestDriver8.remove((java.lang.Object) 0L);
        hashMapTestDriver8.clear();
        int int19 = hashMapTestDriver8.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test096");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.Collection collection12 = hashMapTestDriver0.values();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test097");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test098");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        int int9 = hashMapTestDriver0.size();
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test099");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver5.remove((java.lang.Object) (short) 1);
        java.lang.Object obj13 = hashMapTestDriver5.get((java.lang.Object) (-1.0f));
        int int14 = hashMapTestDriver5.size();
        int int15 = hashMapTestDriver5.size();
        int int16 = hashMapTestDriver5.size();
        hashMapTestDriver5.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test100");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) 1.0d);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        experiment.util.Set set17 = hashMapTestDriver13.keySet();
        experiment.util.Set set18 = hashMapTestDriver13.keySet();
        experiment.util.Set set19 = hashMapTestDriver13.entrySet();
        int int20 = hashMapTestDriver13.size();
        boolean boolean21 = hashMapTestDriver13.isEmpty();
        int int22 = hashMapTestDriver13.size();
        java.lang.Object obj24 = hashMapTestDriver13.remove((java.lang.Object) (byte) 10);
        experiment.util.Set set25 = hashMapTestDriver13.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        experiment.util.Set set30 = hashMapTestDriver26.keySet();
        experiment.util.Set set31 = hashMapTestDriver26.keySet();
        experiment.util.Set set32 = hashMapTestDriver26.entrySet();
        int int33 = hashMapTestDriver26.size();
        boolean boolean34 = hashMapTestDriver26.isEmpty();
        int int35 = hashMapTestDriver26.size();
        java.lang.Object obj36 = hashMapTestDriver13.remove((java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj37 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver13);
        experiment.util.Set set38 = hashMapTestDriver13.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test101");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.get((java.lang.Object) 0);
        java.lang.Object obj16 = hashMapTestDriver11.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        int int17 = hashMapTestDriver11.size();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.get((java.lang.Object) 0);
        java.lang.Object obj23 = hashMapTestDriver18.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.get((java.lang.Object) 0);
        boolean boolean27 = hashMapTestDriver24.isEmpty();
        java.lang.Class<?> wildcardClass28 = hashMapTestDriver24.getClass();
        boolean boolean29 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver24);
        java.lang.Object obj30 = hashMapTestDriver11.remove((java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj34 = hashMapTestDriver32.get((java.lang.Object) 0);
        java.lang.Object obj37 = hashMapTestDriver32.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj39 = hashMapTestDriver32.get((java.lang.Object) '#');
        int int40 = hashMapTestDriver32.size();
        experiment.util.Set set41 = hashMapTestDriver32.entrySet();
        java.lang.Object obj42 = hashMapTestDriver11.put((java.lang.Object) 100, (java.lang.Object) set41);
        java.lang.Object obj43 = hashMapTestDriver5.get((java.lang.Object) set41);
        experiment.util.Collection collection44 = hashMapTestDriver5.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test102");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) (byte) 10);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver8);
        boolean boolean14 = hashMapTestDriver3.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj31 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver24);
        boolean boolean32 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) boolean32, (java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.remove((java.lang.Object) (byte) 10);
        boolean boolean43 = hashMapTestDriver40.isEmpty();
        java.lang.Object obj44 = hashMapTestDriver35.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = hashMapTestDriver35.get(obj45);
        java.lang.Class<?> wildcardClass47 = hashMapTestDriver35.getClass();
        java.lang.Object obj48 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass47);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.get((java.lang.Object) 0);
        experiment.util.Collection collection52 = hashMapTestDriver49.values();
        int int53 = hashMapTestDriver49.size();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj56 = hashMapTestDriver54.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        boolean boolean58 = hashMapTestDriver57.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) (byte) 10);
        boolean boolean62 = hashMapTestDriver59.isEmpty();
        java.lang.Object obj63 = hashMapTestDriver54.put((java.lang.Object) hashMapTestDriver57, (java.lang.Object) hashMapTestDriver59);
        boolean boolean65 = hashMapTestDriver54.containsKey((java.lang.Object) '#');
        hashMapTestDriver54.clear();
        experiment.util.Set set67 = hashMapTestDriver54.keySet();
        java.lang.Object obj68 = hashMapTestDriver0.put((java.lang.Object) int53, (java.lang.Object) hashMapTestDriver54);
        experiment.util.Collection collection69 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test103");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean8 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test104");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) 0);
        boolean boolean13 = hashMapTestDriver10.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        experiment.util.Set set15 = hashMapTestDriver10.keySet();
        experiment.util.Set set16 = hashMapTestDriver10.entrySet();
        boolean boolean17 = hashMapTestDriver0.containsKey((java.lang.Object) set16);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        boolean boolean21 = hashMapTestDriver18.isEmpty();
        java.lang.Object obj22 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver18);
        experiment.util.Set set23 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test105");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        int int8 = hashMapTestDriver0.size();
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test106");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver19);
        boolean boolean25 = hashMapTestDriver14.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj34 = hashMapTestDriver32.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver35.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.remove((java.lang.Object) (byte) 10);
        boolean boolean40 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver32.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver37);
        java.lang.Object obj42 = hashMapTestDriver26.get((java.lang.Object) hashMapTestDriver35);
        boolean boolean43 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver26);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        boolean boolean48 = hashMapTestDriver47.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) (byte) 10);
        boolean boolean52 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver44.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) hashMapTestDriver49);
        experiment.util.Set set54 = hashMapTestDriver44.entrySet();
        experiment.util.Set set55 = hashMapTestDriver44.keySet();
        boolean boolean57 = hashMapTestDriver44.containsKey((java.lang.Object) (short) 100);
        boolean boolean58 = hashMapTestDriver26.containsKey((java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver0.get((java.lang.Object) boolean58);
        java.lang.Object obj61 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection63 = hashMapTestDriver62.values();
        java.lang.Class<?> wildcardClass64 = collection63.getClass();
        java.lang.Object obj65 = hashMapTestDriver0.get((java.lang.Object) collection63);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test107");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0);
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj28 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver21);
        boolean boolean29 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver33.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) (byte) 10);
        boolean boolean38 = hashMapTestDriver35.isEmpty();
        java.lang.Object obj39 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver33, (java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set40 = hashMapTestDriver30.entrySet();
        experiment.util.Set set41 = hashMapTestDriver30.keySet();
        boolean boolean43 = hashMapTestDriver30.containsKey((java.lang.Object) (short) 100);
        boolean boolean44 = hashMapTestDriver12.containsKey((java.lang.Object) boolean43);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.get((java.lang.Object) 0);
        java.lang.Object obj51 = hashMapTestDriver46.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj54 = hashMapTestDriver52.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean56 = hashMapTestDriver55.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj59 = hashMapTestDriver57.remove((java.lang.Object) (byte) 10);
        boolean boolean60 = hashMapTestDriver57.isEmpty();
        java.lang.Object obj61 = hashMapTestDriver52.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) hashMapTestDriver57);
        java.lang.Object obj62 = hashMapTestDriver46.get((java.lang.Object) hashMapTestDriver55);
        hashMapTestDriver46.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj66 = hashMapTestDriver64.get((java.lang.Object) 0);
        java.lang.Object obj69 = hashMapTestDriver64.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj72 = hashMapTestDriver70.get((java.lang.Object) 0);
        experiment.util.Collection collection73 = hashMapTestDriver70.values();
        int int74 = hashMapTestDriver70.size();
        java.lang.Object obj75 = hashMapTestDriver64.get((java.lang.Object) hashMapTestDriver70);
        java.lang.Object obj76 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver46, (java.lang.Object) hashMapTestDriver70);
        java.lang.Object obj78 = hashMapTestDriver70.remove((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test108");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.get((java.lang.Object) 0);
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        boolean boolean14 = hashMapTestDriver7.containsKey((java.lang.Object) 1.0d);
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) boolean14);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test109");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) 0);
        experiment.util.Collection collection9 = hashMapTestDriver6.values();
        int int10 = hashMapTestDriver6.size();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver6);
        experiment.util.Set set12 = hashMapTestDriver6.keySet();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = hashMapTestDriver6.get(obj13);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = hashMapTestDriver6.remove(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test110");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) 1.0d);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        experiment.util.Set set17 = hashMapTestDriver13.keySet();
        experiment.util.Set set18 = hashMapTestDriver13.keySet();
        experiment.util.Set set19 = hashMapTestDriver13.entrySet();
        int int20 = hashMapTestDriver13.size();
        boolean boolean21 = hashMapTestDriver13.isEmpty();
        int int22 = hashMapTestDriver13.size();
        java.lang.Object obj24 = hashMapTestDriver13.remove((java.lang.Object) (byte) 10);
        experiment.util.Set set25 = hashMapTestDriver13.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        experiment.util.Set set30 = hashMapTestDriver26.keySet();
        experiment.util.Set set31 = hashMapTestDriver26.keySet();
        experiment.util.Set set32 = hashMapTestDriver26.entrySet();
        int int33 = hashMapTestDriver26.size();
        boolean boolean34 = hashMapTestDriver26.isEmpty();
        int int35 = hashMapTestDriver26.size();
        java.lang.Object obj36 = hashMapTestDriver13.remove((java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj37 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver13);
        experiment.util.Set set38 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test111");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        int int10 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver14.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        java.lang.Object obj20 = hashMapTestDriver11.put((java.lang.Object) hashMapTestDriver14, (java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set21 = hashMapTestDriver11.entrySet();
        experiment.util.Set set22 = hashMapTestDriver11.keySet();
        boolean boolean24 = hashMapTestDriver11.containsKey((java.lang.Object) (short) 100);
        experiment.util.Set set25 = hashMapTestDriver11.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj34 = hashMapTestDriver32.get((java.lang.Object) 0);
        experiment.util.Collection collection35 = hashMapTestDriver32.values();
        int int36 = hashMapTestDriver32.size();
        java.lang.Object obj37 = hashMapTestDriver26.get((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set38 = hashMapTestDriver32.keySet();
        boolean boolean39 = hashMapTestDriver11.containsKey((java.lang.Object) set38);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver43.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) (byte) 10);
        boolean boolean48 = hashMapTestDriver45.isEmpty();
        java.lang.Object obj49 = hashMapTestDriver40.put((java.lang.Object) hashMapTestDriver43, (java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj51 = hashMapTestDriver45.remove((java.lang.Object) (short) 1);
        java.lang.Object obj53 = hashMapTestDriver45.get((java.lang.Object) (-1.0f));
        int int54 = hashMapTestDriver45.size();
        experiment.util.Set set55 = hashMapTestDriver45.keySet();
        java.lang.Object obj56 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj58 = hashMapTestDriver0.remove((java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test112");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        int int10 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver14.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) (byte) 10);
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        java.lang.Object obj20 = hashMapTestDriver11.put((java.lang.Object) hashMapTestDriver14, (java.lang.Object) hashMapTestDriver16);
        boolean boolean22 = hashMapTestDriver11.containsKey((java.lang.Object) '#');
        int int23 = hashMapTestDriver11.size();
        boolean boolean24 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver28.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) (byte) 10);
        boolean boolean33 = hashMapTestDriver30.isEmpty();
        java.lang.Object obj34 = hashMapTestDriver25.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) hashMapTestDriver30);
        experiment.util.Set set35 = hashMapTestDriver25.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.get((java.lang.Object) 0);
        java.lang.Object obj43 = hashMapTestDriver38.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.get((java.lang.Object) 0);
        experiment.util.Collection collection47 = hashMapTestDriver44.values();
        int int48 = hashMapTestDriver44.size();
        java.lang.Object obj49 = hashMapTestDriver38.get((java.lang.Object) hashMapTestDriver44);
        java.lang.Object obj50 = hashMapTestDriver36.get((java.lang.Object) hashMapTestDriver44);
        hashMapTestDriver44.clear();
        boolean boolean53 = hashMapTestDriver44.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj54 = hashMapTestDriver25.remove((java.lang.Object) hashMapTestDriver44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = hashMapTestDriver11.containsKey(obj54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test113");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.get((java.lang.Object) 0);
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        experiment.util.Collection collection18 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) 0);
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0);
        experiment.util.Collection collection29 = hashMapTestDriver26.values();
        int int30 = hashMapTestDriver26.size();
        java.lang.Object obj31 = hashMapTestDriver20.get((java.lang.Object) hashMapTestDriver26);
        experiment.util.Set set32 = hashMapTestDriver26.keySet();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Object obj34 = hashMapTestDriver26.get(obj33);
        boolean boolean35 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver26);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test114");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test115");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        experiment.util.Set set15 = hashMapTestDriver0.keySet();
        boolean boolean17 = hashMapTestDriver0.containsKey((java.lang.Object) 1);
        int int18 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test116");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver0.remove((java.lang.Object) 0L);
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        boolean boolean16 = hashMapTestDriver15.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) hashMapTestDriver17);
        experiment.util.Set set22 = hashMapTestDriver12.entrySet();
        java.lang.Object obj25 = hashMapTestDriver12.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        boolean boolean26 = hashMapTestDriver12.isEmpty();
        boolean boolean27 = hashMapTestDriver12.isEmpty();
        hashMapTestDriver12.clear();
        int int29 = hashMapTestDriver12.size();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.get((java.lang.Object) 0);
        experiment.util.Collection collection33 = hashMapTestDriver30.values();
        int int34 = hashMapTestDriver30.size();
        experiment.util.Set set35 = hashMapTestDriver30.entrySet();
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) set35);
        int int37 = hashMapTestDriver12.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test117");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        int int9 = hashMapTestDriver0.size();
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test118");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test119");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        experiment.util.Collection collection17 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        hashMapTestDriver18.clear();
        java.lang.Object obj22 = hashMapTestDriver9.remove((java.lang.Object) hashMapTestDriver18);
        java.lang.Object obj24 = hashMapTestDriver18.get((java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test120");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        boolean boolean7 = hashMapTestDriver0.containsKey((java.lang.Object) 1.0d);
        java.lang.Object obj8 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.get((java.lang.Object) 0);
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver18.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) (byte) 10);
        boolean boolean23 = hashMapTestDriver20.isEmpty();
        java.lang.Object obj24 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver20);
        java.lang.Object obj25 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver18);
        experiment.util.Collection collection26 = hashMapTestDriver18.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) (byte) 10);
        hashMapTestDriver27.clear();
        java.lang.Object obj31 = hashMapTestDriver18.remove((java.lang.Object) hashMapTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = hashMapTestDriver0.put(obj8, (java.lang.Object) hashMapTestDriver27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test121");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        java.lang.Object obj13 = hashMapTestDriver8.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) (byte) 10);
        boolean boolean22 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj24 = hashMapTestDriver8.get((java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.get((java.lang.Object) 0);
        java.lang.Object obj30 = hashMapTestDriver25.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean35 = hashMapTestDriver34.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.remove((java.lang.Object) (byte) 10);
        boolean boolean39 = hashMapTestDriver36.isEmpty();
        java.lang.Object obj40 = hashMapTestDriver31.put((java.lang.Object) hashMapTestDriver34, (java.lang.Object) hashMapTestDriver36);
        java.lang.Object obj41 = hashMapTestDriver25.get((java.lang.Object) hashMapTestDriver34);
        experiment.util.Set set42 = hashMapTestDriver25.keySet();
        java.lang.Object obj43 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) set42);
        hashMapTestDriver8.clear();
        experiment.util.Collection collection45 = hashMapTestDriver8.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test122");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        int int7 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test123");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) (byte) 10);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        java.lang.Object obj17 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver13);
        boolean boolean19 = hashMapTestDriver8.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) 0);
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver29.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) (byte) 10);
        boolean boolean34 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver26.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) hashMapTestDriver31);
        java.lang.Object obj36 = hashMapTestDriver20.get((java.lang.Object) hashMapTestDriver29);
        boolean boolean37 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver20);
        java.lang.Object obj39 = hashMapTestDriver5.put((java.lang.Object) boolean37, (java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver43.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) (byte) 10);
        boolean boolean48 = hashMapTestDriver45.isEmpty();
        java.lang.Object obj49 = hashMapTestDriver40.put((java.lang.Object) hashMapTestDriver43, (java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Object obj51 = hashMapTestDriver40.get(obj50);
        java.lang.Class<?> wildcardClass52 = hashMapTestDriver40.getClass();
        java.lang.Object obj53 = hashMapTestDriver5.remove((java.lang.Object) wildcardClass52);
        java.lang.Object obj54 = hashMapTestDriver0.get((java.lang.Object) wildcardClass52);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        boolean boolean59 = hashMapTestDriver58.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj62 = hashMapTestDriver60.remove((java.lang.Object) (byte) 10);
        boolean boolean63 = hashMapTestDriver60.isEmpty();
        java.lang.Object obj64 = hashMapTestDriver55.put((java.lang.Object) hashMapTestDriver58, (java.lang.Object) hashMapTestDriver60);
        experiment.util.Set set65 = hashMapTestDriver55.entrySet();
        experiment.util.Set set66 = hashMapTestDriver55.entrySet();
        java.lang.Object obj67 = hashMapTestDriver0.remove((java.lang.Object) set66);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test124");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) (byte) 10);
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set17 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) (byte) 10);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        experiment.util.Set set28 = hashMapTestDriver18.entrySet();
        java.lang.Object obj31 = hashMapTestDriver18.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass32 = hashMapTestDriver18.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj35 = hashMapTestDriver33.get((java.lang.Object) 0);
        java.lang.Object obj38 = hashMapTestDriver33.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        hashMapTestDriver33.clear();
        java.lang.Object obj40 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver33);
        experiment.util.Set set41 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test125");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        int int6 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.get((java.lang.Object) 0);
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 10, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0);
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass17 = hashMapTestDriver13.getClass();
        boolean boolean18 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver13);
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set20 = hashMapTestDriver7.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        boolean boolean26 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) (byte) 10);
        boolean boolean30 = hashMapTestDriver27.isEmpty();
        java.lang.Object obj31 = hashMapTestDriver22.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) hashMapTestDriver27);
        java.lang.Object obj33 = hashMapTestDriver27.remove((java.lang.Object) (short) 1);
        boolean boolean35 = hashMapTestDriver27.containsKey((java.lang.Object) 0.0f);
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) 0.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean41 = hashMapTestDriver40.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.remove((java.lang.Object) (byte) 10);
        boolean boolean45 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj46 = hashMapTestDriver37.put((java.lang.Object) hashMapTestDriver40, (java.lang.Object) hashMapTestDriver42);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = hashMapTestDriver37.get(obj47);
        java.lang.Object obj49 = hashMapTestDriver21.get((java.lang.Object) hashMapTestDriver37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = hashMapTestDriver7.remove(obj49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test126");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test127");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) (byte) 10);
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver5.clear();
        experiment.util.Set set11 = hashMapTestDriver5.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        boolean boolean16 = hashMapTestDriver15.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.remove((java.lang.Object) (byte) 10);
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) hashMapTestDriver17);
        boolean boolean23 = hashMapTestDriver12.containsKey((java.lang.Object) '#');
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.get((java.lang.Object) 0);
        java.lang.Object obj29 = hashMapTestDriver24.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver33.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) (byte) 10);
        boolean boolean38 = hashMapTestDriver35.isEmpty();
        java.lang.Object obj39 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver33, (java.lang.Object) hashMapTestDriver35);
        java.lang.Object obj40 = hashMapTestDriver24.get((java.lang.Object) hashMapTestDriver33);
        boolean boolean41 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver24);
        java.lang.Object obj43 = hashMapTestDriver24.get((java.lang.Object) 0);
        java.lang.Object obj44 = hashMapTestDriver5.remove((java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.get((java.lang.Object) 0);
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        boolean boolean52 = hashMapTestDriver45.containsKey((java.lang.Object) 1.0d);
        java.lang.Object obj53 = hashMapTestDriver5.get((java.lang.Object) boolean52);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1264048269_1024_0.test128");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) 0);
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) "hi!", (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        int int12 = hashMapTestDriver8.size();
        java.lang.Object obj13 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        hashMapTestDriver8.clear();
        boolean boolean17 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 10);
        boolean boolean18 = hashMapTestDriver8.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

}
