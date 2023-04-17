package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_2070236138_128_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test002");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) ' ');
        experiment.util.Collection collection8 = hashMapTestDriver5.values();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) collection8, (java.lang.Object) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) ' ');
        experiment.util.Collection collection14 = hashMapTestDriver11.values();
        java.lang.Class<?> wildcardClass15 = hashMapTestDriver11.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean22 = hashMapTestDriver19.containsKey((java.lang.Object) true);
        experiment.util.Set set23 = hashMapTestDriver19.entrySet();
        java.lang.Object obj24 = hashMapTestDriver16.remove((java.lang.Object) set23);
        java.lang.Object obj27 = hashMapTestDriver16.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver11, obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass4 = collection3.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test006");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) true);
        experiment.util.Set set12 = hashMapTestDriver8.entrySet();
        experiment.util.Set set13 = hashMapTestDriver8.entrySet();
        int int14 = hashMapTestDriver8.size();
        int int15 = hashMapTestDriver8.size();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, obj16);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        java.lang.Object obj27 = hashMapTestDriver19.remove((java.lang.Object) set26);
        java.lang.Object obj30 = hashMapTestDriver19.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = hashMapTestDriver8.put((java.lang.Object) 10.0f, obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = hashMapTestDriver0.remove((java.lang.Object) boolean16);
        experiment.util.Set set18 = hashMapTestDriver0.keySet();
        experiment.util.Set set19 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        boolean boolean23 = hashMapTestDriver20.containsKey((java.lang.Object) true);
        experiment.util.Set set24 = hashMapTestDriver20.entrySet();
        experiment.util.Set set25 = hashMapTestDriver20.entrySet();
        int int26 = hashMapTestDriver20.size();
        hashMapTestDriver20.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj31 = hashMapTestDriver28.get(obj30);
        java.lang.Class<?> wildcardClass32 = hashMapTestDriver28.getClass();
        java.lang.Object obj33 = hashMapTestDriver20.remove((java.lang.Object) wildcardClass32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = hashMapTestDriver0.remove(obj33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        int int9 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) true);
        experiment.util.Set set12 = hashMapTestDriver8.entrySet();
        experiment.util.Set set13 = hashMapTestDriver8.entrySet();
        int int14 = hashMapTestDriver8.size();
        int int15 = hashMapTestDriver8.size();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, obj16);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) (short) 10, obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        int int13 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        experiment.util.Collection collection19 = hashMapTestDriver15.values();
        boolean boolean20 = hashMapTestDriver15.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean20);
        java.lang.Class<?> wildcardClass22 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        int int7 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) ' ');
        experiment.util.Collection collection8 = hashMapTestDriver5.values();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) collection8, (java.lang.Object) 10);
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) true);
        experiment.util.Set set19 = hashMapTestDriver15.entrySet();
        java.lang.Object obj20 = hashMapTestDriver12.remove((java.lang.Object) set19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = hashMapTestDriver0.get(obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass8 = collection7.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) ' ');
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        experiment.util.Collection collection12 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        boolean boolean19 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        boolean boolean24 = hashMapTestDriver20.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = hashMapTestDriver8.remove((java.lang.Object) boolean24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = hashMapTestDriver0.containsKey(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) true);
        experiment.util.Set set10 = hashMapTestDriver6.entrySet();
        experiment.util.Set set11 = hashMapTestDriver6.entrySet();
        int int12 = hashMapTestDriver6.size();
        hashMapTestDriver6.clear();
        experiment.util.Set set14 = hashMapTestDriver6.entrySet();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver6, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = hashMapTestDriver9.get(obj11);
        int int13 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) collection17, (java.lang.Object) 10);
        experiment.util.Set set20 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMapTestDriver21.get(obj23);
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMapTestDriver21.remove(obj26);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj26);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        experiment.util.Set set34 = hashMapTestDriver30.keySet();
        java.lang.Object obj36 = hashMapTestDriver30.get((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = hashMapTestDriver0.remove(obj36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        experiment.util.Collection collection8 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        experiment.util.Set set14 = hashMapTestDriver9.entrySet();
        boolean boolean15 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver9);
        int int16 = hashMapTestDriver9.size();
        java.lang.Object obj18 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) ' ');
        experiment.util.Collection collection22 = hashMapTestDriver19.values();
        experiment.util.Collection collection23 = hashMapTestDriver19.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        experiment.util.Set set28 = hashMapTestDriver24.entrySet();
        experiment.util.Set set29 = hashMapTestDriver24.entrySet();
        boolean boolean30 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj36 = hashMapTestDriver19.remove((java.lang.Object) boolean35);
        experiment.util.Set set37 = hashMapTestDriver19.keySet();
        java.lang.Object obj38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver19, obj38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test020");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        int int8 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = hashMapTestDriver11.get(obj13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver15);
        experiment.util.Collection collection20 = hashMapTestDriver11.values();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) true);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.Set set26 = hashMapTestDriver21.entrySet();
        int int27 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        boolean boolean29 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean30 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        java.lang.Class<?> wildcardClass31 = hashMapTestDriver21.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = hashMapTestDriver0.remove((java.lang.Object) boolean16);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = hashMapTestDriver0.remove(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass9 = set8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) true);
        experiment.util.Set set16 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver9.remove((java.lang.Object) set16);
        java.lang.Object obj20 = hashMapTestDriver9.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set21 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean26 = hashMapTestDriver22.containsKey((java.lang.Object) (byte) 10);
        boolean boolean27 = hashMapTestDriver22.isEmpty();
        boolean boolean28 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test024");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        int int13 = hashMapTestDriver0.size();
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        experiment.util.Set set15 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) set7);
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver0.values();
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj6 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = hashMapTestDriver0.put(obj6, (java.lang.Object) hashMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        int int19 = hashMapTestDriver13.size();
        experiment.util.Set set20 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) true);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.Set set26 = hashMapTestDriver21.entrySet();
        int int27 = hashMapTestDriver21.size();
        int int28 = hashMapTestDriver21.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver21, obj29);
        java.lang.Object obj31 = hashMapTestDriver0.put((java.lang.Object) wildcardClass12, (java.lang.Object) hashMapTestDriver13);
        java.lang.Class<?> wildcardClass32 = hashMapTestDriver13.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        java.lang.Object obj13 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass12);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object obj21 = hashMapTestDriver18.get(obj20);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) ' ');
        experiment.util.Collection collection25 = hashMapTestDriver22.values();
        boolean boolean26 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) ' ');
        experiment.util.Collection collection30 = hashMapTestDriver27.values();
        experiment.util.Collection collection31 = hashMapTestDriver27.values();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean35 = hashMapTestDriver32.containsKey((java.lang.Object) true);
        experiment.util.Set set36 = hashMapTestDriver32.entrySet();
        experiment.util.Set set37 = hashMapTestDriver32.entrySet();
        boolean boolean38 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set39 = hashMapTestDriver27.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection41 = hashMapTestDriver40.values();
        boolean boolean43 = hashMapTestDriver40.containsKey((java.lang.Object) true);
        experiment.util.Set set44 = hashMapTestDriver40.entrySet();
        experiment.util.Set set45 = hashMapTestDriver40.entrySet();
        int int46 = hashMapTestDriver40.size();
        int int47 = hashMapTestDriver40.size();
        boolean boolean48 = hashMapTestDriver40.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) ' ');
        experiment.util.Collection collection52 = hashMapTestDriver49.values();
        experiment.util.Collection collection53 = hashMapTestDriver49.values();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection55 = hashMapTestDriver54.values();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) true);
        experiment.util.Set set58 = hashMapTestDriver54.entrySet();
        experiment.util.Set set59 = hashMapTestDriver54.entrySet();
        boolean boolean60 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver54);
        boolean boolean61 = hashMapTestDriver40.containsKey((java.lang.Object) boolean60);
        java.lang.Object obj62 = hashMapTestDriver22.put((java.lang.Object) hashMapTestDriver27, (java.lang.Object) hashMapTestDriver40);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection64 = hashMapTestDriver63.values();
        boolean boolean66 = hashMapTestDriver63.containsKey((java.lang.Object) true);
        experiment.util.Set set67 = hashMapTestDriver63.entrySet();
        java.lang.Object obj68 = hashMapTestDriver40.remove((java.lang.Object) set67);
        java.lang.Object obj69 = hashMapTestDriver0.put((java.lang.Object) boolean17, (java.lang.Object) hashMapTestDriver40);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) true);
        experiment.util.Set set12 = hashMapTestDriver8.entrySet();
        experiment.util.Set set13 = hashMapTestDriver8.entrySet();
        int int14 = hashMapTestDriver8.size();
        int int15 = hashMapTestDriver8.size();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, obj16);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        boolean boolean21 = hashMapTestDriver18.containsKey((java.lang.Object) true);
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver0.get((java.lang.Object) set22);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test032");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        int int8 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test033");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        java.lang.Object obj13 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass12);
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        experiment.util.Collection collection19 = hashMapTestDriver15.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        boolean boolean23 = hashMapTestDriver20.containsKey((java.lang.Object) true);
        experiment.util.Set set24 = hashMapTestDriver20.entrySet();
        experiment.util.Set set25 = hashMapTestDriver20.entrySet();
        boolean boolean26 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver20);
        experiment.util.Set set27 = hashMapTestDriver20.keySet();
        java.lang.Object obj28 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver20);
        boolean boolean30 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test034");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        experiment.util.Collection collection6 = hashMapTestDriver3.values();
        experiment.util.Collection collection7 = hashMapTestDriver3.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) true);
        experiment.util.Set set12 = hashMapTestDriver8.entrySet();
        experiment.util.Set set13 = hashMapTestDriver8.entrySet();
        boolean boolean14 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.entrySet();
        boolean boolean19 = hashMapTestDriver15.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = hashMapTestDriver3.remove((java.lang.Object) boolean19);
        experiment.util.Set set21 = hashMapTestDriver3.keySet();
        java.lang.Object obj22 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver3);
        boolean boolean23 = hashMapTestDriver3.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test035");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) set7);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = hashMapTestDriver11.get(obj13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver15);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) ' ');
        experiment.util.Collection collection23 = hashMapTestDriver20.values();
        experiment.util.Collection collection24 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean28 = hashMapTestDriver25.containsKey((java.lang.Object) true);
        experiment.util.Set set29 = hashMapTestDriver25.entrySet();
        experiment.util.Set set30 = hashMapTestDriver25.entrySet();
        boolean boolean31 = hashMapTestDriver20.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set32 = hashMapTestDriver20.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        boolean boolean36 = hashMapTestDriver33.containsKey((java.lang.Object) true);
        experiment.util.Set set37 = hashMapTestDriver33.entrySet();
        experiment.util.Set set38 = hashMapTestDriver33.entrySet();
        int int39 = hashMapTestDriver33.size();
        int int40 = hashMapTestDriver33.size();
        boolean boolean41 = hashMapTestDriver33.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.remove((java.lang.Object) ' ');
        experiment.util.Collection collection45 = hashMapTestDriver42.values();
        experiment.util.Collection collection46 = hashMapTestDriver42.values();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection48 = hashMapTestDriver47.values();
        boolean boolean50 = hashMapTestDriver47.containsKey((java.lang.Object) true);
        experiment.util.Set set51 = hashMapTestDriver47.entrySet();
        experiment.util.Set set52 = hashMapTestDriver47.entrySet();
        boolean boolean53 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver47);
        boolean boolean54 = hashMapTestDriver33.containsKey((java.lang.Object) boolean53);
        java.lang.Object obj55 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) hashMapTestDriver33);
        experiment.util.Collection collection56 = hashMapTestDriver15.values();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection58 = hashMapTestDriver57.values();
        boolean boolean60 = hashMapTestDriver57.containsKey((java.lang.Object) true);
        experiment.util.Set set61 = hashMapTestDriver57.entrySet();
        experiment.util.Set set62 = hashMapTestDriver57.entrySet();
        int int63 = hashMapTestDriver57.size();
        experiment.util.Set set64 = hashMapTestDriver57.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection66 = hashMapTestDriver65.values();
        boolean boolean68 = hashMapTestDriver65.containsKey((java.lang.Object) true);
        experiment.util.Set set69 = hashMapTestDriver65.entrySet();
        experiment.util.Set set70 = hashMapTestDriver65.entrySet();
        int int71 = hashMapTestDriver65.size();
        int int72 = hashMapTestDriver65.size();
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Object obj74 = hashMapTestDriver57.put((java.lang.Object) hashMapTestDriver65, obj73);
        java.lang.Object obj75 = hashMapTestDriver0.put((java.lang.Object) collection56, obj73);
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj78 = hashMapTestDriver76.remove((java.lang.Object) ' ');
        experiment.util.Collection collection79 = hashMapTestDriver76.values();
        experiment.util.Collection collection80 = hashMapTestDriver76.values();
        experiment.util.HashMapTestDriver hashMapTestDriver81 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection82 = hashMapTestDriver81.values();
        boolean boolean84 = hashMapTestDriver81.containsKey((java.lang.Object) true);
        experiment.util.Set set85 = hashMapTestDriver81.entrySet();
        experiment.util.Set set86 = hashMapTestDriver81.entrySet();
        boolean boolean87 = hashMapTestDriver76.containsKey((java.lang.Object) hashMapTestDriver81);
        experiment.util.Set set88 = hashMapTestDriver76.keySet();
        hashMapTestDriver76.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver90 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection91 = hashMapTestDriver90.values();
        boolean boolean93 = hashMapTestDriver90.containsKey((java.lang.Object) true);
        java.lang.Object obj94 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver76, (java.lang.Object) true);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test036");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = hashMapTestDriver0.remove((java.lang.Object) boolean16);
        experiment.util.Set set18 = hashMapTestDriver0.keySet();
        experiment.util.Set set19 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = hashMapTestDriver0.remove(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test037");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        int int8 = hashMapTestDriver0.size();
        experiment.util.Set set9 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test038");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        int int19 = hashMapTestDriver13.size();
        experiment.util.Set set20 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) true);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.Set set26 = hashMapTestDriver21.entrySet();
        int int27 = hashMapTestDriver21.size();
        int int28 = hashMapTestDriver21.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver21, obj29);
        java.lang.Object obj31 = hashMapTestDriver0.put((java.lang.Object) wildcardClass12, (java.lang.Object) hashMapTestDriver13);
        boolean boolean33 = hashMapTestDriver13.containsKey((java.lang.Object) 10);
        hashMapTestDriver13.clear();
        hashMapTestDriver13.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test039");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        int int13 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        experiment.util.Collection collection19 = hashMapTestDriver15.values();
        boolean boolean20 = hashMapTestDriver15.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean20);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.remove((java.lang.Object) ' ');
        experiment.util.Collection collection28 = hashMapTestDriver25.values();
        experiment.util.Collection collection29 = hashMapTestDriver25.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        experiment.util.Set set34 = hashMapTestDriver30.entrySet();
        experiment.util.Set set35 = hashMapTestDriver30.entrySet();
        boolean boolean36 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver30);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.Set set39 = hashMapTestDriver37.entrySet();
        boolean boolean41 = hashMapTestDriver37.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj42 = hashMapTestDriver25.remove((java.lang.Object) boolean41);
        experiment.util.Set set43 = hashMapTestDriver25.keySet();
        java.lang.Object obj44 = hashMapTestDriver22.get((java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection46 = hashMapTestDriver45.values();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = hashMapTestDriver45.get(obj47);
        int int49 = hashMapTestDriver45.size();
        experiment.util.Set set50 = hashMapTestDriver45.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection52 = hashMapTestDriver51.values();
        boolean boolean54 = hashMapTestDriver51.containsKey((java.lang.Object) true);
        java.lang.Object obj56 = hashMapTestDriver51.get((java.lang.Object) 1.0d);
        java.lang.Object obj59 = hashMapTestDriver51.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection61 = hashMapTestDriver60.values();
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Object obj63 = hashMapTestDriver60.get(obj62);
        int int64 = hashMapTestDriver60.size();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj67 = hashMapTestDriver65.remove((java.lang.Object) ' ');
        experiment.util.Collection collection68 = hashMapTestDriver65.values();
        java.lang.Object obj70 = hashMapTestDriver60.put((java.lang.Object) collection68, (java.lang.Object) 10);
        experiment.util.Set set71 = hashMapTestDriver60.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection73 = hashMapTestDriver72.values();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Object obj75 = hashMapTestDriver72.get(obj74);
        boolean boolean76 = hashMapTestDriver72.isEmpty();
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Class<?> wildcardClass78 = obj77.getClass();
        java.lang.Object obj79 = hashMapTestDriver72.remove(obj77);
        java.lang.Object obj80 = hashMapTestDriver51.put((java.lang.Object) hashMapTestDriver60, obj77);
        hashMapTestDriver60.clear();
        boolean boolean82 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver60);
        java.lang.Object obj83 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) boolean82);
        experiment.util.HashMapTestDriver hashMapTestDriver84 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection85 = hashMapTestDriver84.values();
        java.lang.Object obj86 = new java.lang.Object();
        java.lang.Object obj87 = hashMapTestDriver84.get(obj86);
        boolean boolean88 = hashMapTestDriver84.isEmpty();
        java.lang.Object obj89 = new java.lang.Object();
        java.lang.Class<?> wildcardClass90 = obj89.getClass();
        java.lang.Object obj91 = hashMapTestDriver84.remove(obj89);
        java.lang.Class<?> wildcardClass92 = hashMapTestDriver84.getClass();
        boolean boolean93 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass92);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test040");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test041");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) set7);
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Collection collection18 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean22 = hashMapTestDriver19.containsKey((java.lang.Object) true);
        experiment.util.Set set23 = hashMapTestDriver19.entrySet();
        experiment.util.Set set24 = hashMapTestDriver19.entrySet();
        int int25 = hashMapTestDriver19.size();
        experiment.util.Set set26 = hashMapTestDriver19.entrySet();
        java.lang.Object obj27 = hashMapTestDriver0.put((java.lang.Object) collection18, (java.lang.Object) set26);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean32 = hashMapTestDriver29.containsKey((java.lang.Object) true);
        experiment.util.Set set33 = hashMapTestDriver29.entrySet();
        experiment.util.Set set34 = hashMapTestDriver29.entrySet();
        int int35 = hashMapTestDriver29.size();
        experiment.util.Set set36 = hashMapTestDriver29.entrySet();
        int int37 = hashMapTestDriver29.size();
        hashMapTestDriver29.clear();
        boolean boolean39 = hashMapTestDriver29.isEmpty();
        boolean boolean40 = hashMapTestDriver0.containsKey((java.lang.Object) boolean39);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test042");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean13 = hashMapTestDriver10.containsKey((java.lang.Object) true);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.Set set15 = hashMapTestDriver10.entrySet();
        int int16 = hashMapTestDriver10.size();
        hashMapTestDriver10.clear();
        boolean boolean18 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver10);
        hashMapTestDriver10.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test043");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        int int13 = hashMapTestDriver0.size();
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass15 = set14.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test044");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        int int12 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMapTestDriver13.get(obj15);
        boolean boolean17 = hashMapTestDriver13.isEmpty();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = hashMapTestDriver13.remove(obj18);
        java.lang.Object obj21 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver13);
        int int22 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        boolean boolean26 = hashMapTestDriver23.containsKey((java.lang.Object) true);
        experiment.util.Set set27 = hashMapTestDriver23.entrySet();
        experiment.util.Set set28 = hashMapTestDriver23.entrySet();
        int int29 = hashMapTestDriver23.size();
        experiment.util.Set set30 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Object obj34 = hashMapTestDriver31.get(obj33);
        java.lang.Class<?> wildcardClass35 = hashMapTestDriver31.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        int int42 = hashMapTestDriver36.size();
        experiment.util.Set set43 = hashMapTestDriver36.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection45 = hashMapTestDriver44.values();
        boolean boolean47 = hashMapTestDriver44.containsKey((java.lang.Object) true);
        experiment.util.Set set48 = hashMapTestDriver44.entrySet();
        experiment.util.Set set49 = hashMapTestDriver44.entrySet();
        int int50 = hashMapTestDriver44.size();
        int int51 = hashMapTestDriver44.size();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Object obj53 = hashMapTestDriver36.put((java.lang.Object) hashMapTestDriver44, obj52);
        java.lang.Object obj54 = hashMapTestDriver23.put((java.lang.Object) wildcardClass35, (java.lang.Object) hashMapTestDriver36);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.remove((java.lang.Object) ' ');
        experiment.util.Collection collection61 = hashMapTestDriver58.values();
        experiment.util.Collection collection62 = hashMapTestDriver58.values();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection64 = hashMapTestDriver63.values();
        boolean boolean66 = hashMapTestDriver63.containsKey((java.lang.Object) true);
        experiment.util.Set set67 = hashMapTestDriver63.entrySet();
        experiment.util.Set set68 = hashMapTestDriver63.entrySet();
        boolean boolean69 = hashMapTestDriver58.containsKey((java.lang.Object) hashMapTestDriver63);
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection71 = hashMapTestDriver70.values();
        experiment.util.Set set72 = hashMapTestDriver70.entrySet();
        boolean boolean74 = hashMapTestDriver70.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj75 = hashMapTestDriver58.remove((java.lang.Object) boolean74);
        experiment.util.Set set76 = hashMapTestDriver58.keySet();
        java.lang.Object obj77 = hashMapTestDriver55.get((java.lang.Object) hashMapTestDriver58);
        java.lang.Object obj78 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj81 = hashMapTestDriver79.remove((java.lang.Object) ' ');
        experiment.util.Collection collection82 = hashMapTestDriver79.values();
        experiment.util.Set set83 = hashMapTestDriver79.entrySet();
        java.lang.Object obj84 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) set83);
        int int85 = hashMapTestDriver55.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (-1L));
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) true);
        experiment.util.Set set16 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver9.remove((java.lang.Object) set16);
        java.lang.Object obj20 = hashMapTestDriver9.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set21 = hashMapTestDriver9.entrySet();
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver9);
        java.lang.Class<?> wildcardClass23 = hashMapTestDriver9.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test046");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass1 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test047");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = hashMapTestDriver9.get(obj11);
        int int13 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) collection17, (java.lang.Object) 10);
        experiment.util.Set set20 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMapTestDriver21.get(obj23);
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMapTestDriver21.remove(obj26);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj26);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) ' ');
        experiment.util.Collection collection33 = hashMapTestDriver30.values();
        experiment.util.Collection collection34 = hashMapTestDriver30.values();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        boolean boolean38 = hashMapTestDriver35.containsKey((java.lang.Object) true);
        experiment.util.Set set39 = hashMapTestDriver35.entrySet();
        experiment.util.Set set40 = hashMapTestDriver35.entrySet();
        boolean boolean41 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set42 = hashMapTestDriver35.keySet();
        java.lang.Object obj43 = hashMapTestDriver9.get((java.lang.Object) set42);
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10 + "'", obj43, 10);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test048");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test049");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        int int9 = hashMapTestDriver4.size();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean14 = hashMapTestDriver10.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection15 = hashMapTestDriver10.values();
        boolean boolean16 = hashMapTestDriver10.isEmpty();
        boolean boolean17 = hashMapTestDriver10.isEmpty();
        experiment.util.Set set18 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        java.lang.Object obj27 = hashMapTestDriver19.remove((java.lang.Object) set26);
        java.lang.Object obj30 = hashMapTestDriver19.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set31 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean35 = hashMapTestDriver32.containsKey((java.lang.Object) true);
        experiment.util.Set set36 = hashMapTestDriver32.entrySet();
        experiment.util.Collection collection37 = hashMapTestDriver32.values();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection39 = hashMapTestDriver38.values();
        boolean boolean41 = hashMapTestDriver38.containsKey((java.lang.Object) true);
        experiment.util.Set set42 = hashMapTestDriver38.entrySet();
        experiment.util.Set set43 = hashMapTestDriver38.entrySet();
        int int44 = hashMapTestDriver38.size();
        experiment.util.Set set45 = hashMapTestDriver38.entrySet();
        java.lang.Object obj46 = hashMapTestDriver19.put((java.lang.Object) collection37, (java.lang.Object) set45);
        int int47 = hashMapTestDriver19.size();
        java.lang.Object obj48 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set49 = hashMapTestDriver4.entrySet();
        experiment.util.Set set50 = hashMapTestDriver4.keySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) set7);
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Collection collection18 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean22 = hashMapTestDriver19.containsKey((java.lang.Object) true);
        experiment.util.Set set23 = hashMapTestDriver19.entrySet();
        experiment.util.Set set24 = hashMapTestDriver19.entrySet();
        int int25 = hashMapTestDriver19.size();
        experiment.util.Set set26 = hashMapTestDriver19.entrySet();
        java.lang.Object obj27 = hashMapTestDriver0.put((java.lang.Object) collection18, (java.lang.Object) set26);
        int int28 = hashMapTestDriver0.size();
        experiment.util.Collection collection29 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass31 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test051");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        int int11 = hashMapTestDriver5.size();
        experiment.util.Set set12 = hashMapTestDriver5.entrySet();
        int int13 = hashMapTestDriver5.size();
        hashMapTestDriver5.clear();
        boolean boolean15 = hashMapTestDriver5.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver5.values();
        int int17 = hashMapTestDriver5.size();
        experiment.util.Set set18 = hashMapTestDriver5.keySet();
        java.lang.Object obj19 = hashMapTestDriver0.remove((java.lang.Object) set18);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test052");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = hashMapTestDriver9.get(obj11);
        int int13 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) collection17, (java.lang.Object) 10);
        experiment.util.Set set20 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMapTestDriver21.get(obj23);
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMapTestDriver21.remove(obj26);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj26);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) ' ');
        experiment.util.Collection collection33 = hashMapTestDriver30.values();
        experiment.util.Collection collection34 = hashMapTestDriver30.values();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        boolean boolean38 = hashMapTestDriver35.containsKey((java.lang.Object) true);
        experiment.util.Set set39 = hashMapTestDriver35.entrySet();
        experiment.util.Set set40 = hashMapTestDriver35.entrySet();
        boolean boolean41 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set42 = hashMapTestDriver35.keySet();
        java.lang.Object obj43 = hashMapTestDriver9.get((java.lang.Object) set42);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection45 = hashMapTestDriver44.values();
        boolean boolean47 = hashMapTestDriver44.containsKey((java.lang.Object) true);
        experiment.util.Set set48 = hashMapTestDriver44.entrySet();
        experiment.util.Set set49 = hashMapTestDriver44.entrySet();
        int int50 = hashMapTestDriver44.size();
        experiment.util.Set set51 = hashMapTestDriver44.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Object obj55 = hashMapTestDriver52.get(obj54);
        java.lang.Class<?> wildcardClass56 = hashMapTestDriver52.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection58 = hashMapTestDriver57.values();
        boolean boolean60 = hashMapTestDriver57.containsKey((java.lang.Object) true);
        experiment.util.Set set61 = hashMapTestDriver57.entrySet();
        experiment.util.Set set62 = hashMapTestDriver57.entrySet();
        int int63 = hashMapTestDriver57.size();
        experiment.util.Set set64 = hashMapTestDriver57.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection66 = hashMapTestDriver65.values();
        boolean boolean68 = hashMapTestDriver65.containsKey((java.lang.Object) true);
        experiment.util.Set set69 = hashMapTestDriver65.entrySet();
        experiment.util.Set set70 = hashMapTestDriver65.entrySet();
        int int71 = hashMapTestDriver65.size();
        int int72 = hashMapTestDriver65.size();
        java.lang.Object obj73 = new java.lang.Object();
        java.lang.Object obj74 = hashMapTestDriver57.put((java.lang.Object) hashMapTestDriver65, obj73);
        java.lang.Object obj75 = hashMapTestDriver44.put((java.lang.Object) wildcardClass56, (java.lang.Object) hashMapTestDriver57);
        boolean boolean77 = hashMapTestDriver57.containsKey((java.lang.Object) 10);
        hashMapTestDriver57.clear();
        java.lang.Object obj79 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver57);
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj82 = hashMapTestDriver80.remove((java.lang.Object) ' ');
        experiment.util.Collection collection83 = hashMapTestDriver80.values();
        experiment.util.Collection collection84 = hashMapTestDriver80.values();
        experiment.util.HashMapTestDriver hashMapTestDriver85 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection86 = hashMapTestDriver85.values();
        boolean boolean88 = hashMapTestDriver85.containsKey((java.lang.Object) true);
        experiment.util.Set set89 = hashMapTestDriver85.entrySet();
        experiment.util.Set set90 = hashMapTestDriver85.entrySet();
        boolean boolean91 = hashMapTestDriver80.containsKey((java.lang.Object) hashMapTestDriver85);
        experiment.util.Set set92 = hashMapTestDriver80.entrySet();
        java.lang.Object obj93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj94 = hashMapTestDriver9.put((java.lang.Object) set92, obj93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10 + "'", obj43, 10);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(set92);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test053");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) (short) 1);
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass8 = set7.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test054");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test055");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass6 = set5.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test056");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test057");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) ' ');
        experiment.util.Collection collection8 = hashMapTestDriver5.values();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) collection8, (java.lang.Object) 10);
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) true);
        java.lang.Object obj17 = hashMapTestDriver12.get((java.lang.Object) 1.0d);
        java.lang.Object obj20 = hashMapTestDriver12.put((java.lang.Object) ' ', (java.lang.Object) 0);
        hashMapTestDriver12.clear();
        boolean boolean22 = hashMapTestDriver12.isEmpty();
        boolean boolean23 = hashMapTestDriver0.containsKey((java.lang.Object) boolean22);
        java.lang.Class<?> wildcardClass24 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test058");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) set7);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test059");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) true);
        java.lang.Object obj11 = hashMapTestDriver6.get((java.lang.Object) 1.0d);
        hashMapTestDriver6.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) ' ');
        experiment.util.Collection collection16 = hashMapTestDriver13.values();
        experiment.util.Collection collection17 = hashMapTestDriver13.values();
        boolean boolean18 = hashMapTestDriver13.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver13.values();
        java.lang.Object obj20 = hashMapTestDriver6.get((java.lang.Object) collection19);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMapTestDriver21.get(obj23);
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMapTestDriver21.remove(obj26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) collection19, obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test060");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set21 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        experiment.util.Set set27 = hashMapTestDriver22.entrySet();
        int int28 = hashMapTestDriver22.size();
        int int29 = hashMapTestDriver22.size();
        boolean boolean30 = hashMapTestDriver22.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) ' ');
        experiment.util.Collection collection34 = hashMapTestDriver31.values();
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        boolean boolean42 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver36);
        boolean boolean43 = hashMapTestDriver22.containsKey((java.lang.Object) boolean42);
        java.lang.Object obj44 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver9.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) ' ');
        experiment.util.Collection collection49 = hashMapTestDriver46.values();
        experiment.util.Collection collection50 = hashMapTestDriver46.values();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection52 = hashMapTestDriver51.values();
        boolean boolean54 = hashMapTestDriver51.containsKey((java.lang.Object) true);
        experiment.util.Set set55 = hashMapTestDriver51.entrySet();
        experiment.util.Set set56 = hashMapTestDriver51.entrySet();
        boolean boolean57 = hashMapTestDriver46.containsKey((java.lang.Object) hashMapTestDriver51);
        experiment.util.Set set58 = hashMapTestDriver51.keySet();
        boolean boolean59 = hashMapTestDriver51.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection61 = hashMapTestDriver60.values();
        boolean boolean63 = hashMapTestDriver60.containsKey((java.lang.Object) true);
        experiment.util.Set set64 = hashMapTestDriver60.entrySet();
        experiment.util.Set set65 = hashMapTestDriver60.entrySet();
        int int66 = hashMapTestDriver60.size();
        experiment.util.Set set67 = hashMapTestDriver60.entrySet();
        experiment.util.Set set68 = hashMapTestDriver60.entrySet();
        java.lang.Object obj70 = hashMapTestDriver51.put((java.lang.Object) set68, (java.lang.Object) (byte) -1);
        java.lang.Object obj71 = hashMapTestDriver9.get((java.lang.Object) (byte) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver72.remove((java.lang.Object) ' ');
        experiment.util.Collection collection75 = hashMapTestDriver72.values();
        experiment.util.Collection collection76 = hashMapTestDriver72.values();
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection78 = hashMapTestDriver77.values();
        boolean boolean80 = hashMapTestDriver77.containsKey((java.lang.Object) true);
        experiment.util.Set set81 = hashMapTestDriver77.entrySet();
        experiment.util.Set set82 = hashMapTestDriver77.entrySet();
        boolean boolean83 = hashMapTestDriver72.containsKey((java.lang.Object) hashMapTestDriver77);
        int int84 = hashMapTestDriver77.size();
        experiment.util.HashMapTestDriver hashMapTestDriver85 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection86 = hashMapTestDriver85.values();
        java.lang.Object obj87 = new java.lang.Object();
        java.lang.Object obj88 = hashMapTestDriver85.get(obj87);
        boolean boolean89 = hashMapTestDriver85.isEmpty();
        java.lang.Object obj90 = new java.lang.Object();
        java.lang.Class<?> wildcardClass91 = obj90.getClass();
        java.lang.Object obj92 = hashMapTestDriver85.remove(obj90);
        java.lang.Object obj93 = hashMapTestDriver77.get((java.lang.Object) hashMapTestDriver85);
        java.lang.Object obj95 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver85, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test061");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        int int7 = hashMapTestDriver0.size();
        int int8 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test062");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) ' ');
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        experiment.util.Collection collection12 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        boolean boolean19 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver13);
        experiment.util.Set set20 = hashMapTestDriver8.keySet();
        java.lang.Class<?> wildcardClass21 = hashMapTestDriver8.getClass();
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass21);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        boolean boolean26 = hashMapTestDriver23.containsKey((java.lang.Object) true);
        experiment.util.Set set27 = hashMapTestDriver23.entrySet();
        java.lang.Object obj29 = hashMapTestDriver23.get((java.lang.Object) 1.0f);
        java.lang.Object obj30 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver23);
        experiment.util.Set set31 = hashMapTestDriver23.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test063");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test064");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver5.keySet();
        boolean boolean13 = hashMapTestDriver5.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        int int20 = hashMapTestDriver14.size();
        experiment.util.Set set21 = hashMapTestDriver14.entrySet();
        experiment.util.Set set22 = hashMapTestDriver14.entrySet();
        java.lang.Object obj24 = hashMapTestDriver5.put((java.lang.Object) set22, (java.lang.Object) (byte) -1);
        int int25 = hashMapTestDriver5.size();
        int int26 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) ' ');
        experiment.util.Collection collection30 = hashMapTestDriver27.values();
        experiment.util.Collection collection31 = hashMapTestDriver27.values();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean35 = hashMapTestDriver32.containsKey((java.lang.Object) true);
        experiment.util.Set set36 = hashMapTestDriver32.entrySet();
        experiment.util.Set set37 = hashMapTestDriver32.entrySet();
        boolean boolean38 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set39 = hashMapTestDriver27.keySet();
        int int40 = hashMapTestDriver27.size();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.remove((java.lang.Object) ' ');
        experiment.util.Collection collection45 = hashMapTestDriver42.values();
        experiment.util.Collection collection46 = hashMapTestDriver42.values();
        boolean boolean47 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj48 = hashMapTestDriver27.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean47);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        experiment.util.Set set51 = hashMapTestDriver49.entrySet();
        boolean boolean53 = hashMapTestDriver49.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection54 = hashMapTestDriver49.values();
        boolean boolean55 = hashMapTestDriver49.isEmpty();
        experiment.util.Collection collection56 = hashMapTestDriver49.values();
        boolean boolean57 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver49);
        int int58 = hashMapTestDriver27.size();
        java.lang.Object obj59 = hashMapTestDriver5.get((java.lang.Object) int58);
        boolean boolean60 = hashMapTestDriver5.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test065");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        int int6 = hashMapTestDriver0.size();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) true);
        boolean boolean19 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver9);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test066");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = hashMapTestDriver9.get(obj11);
        int int13 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) collection17, (java.lang.Object) 10);
        experiment.util.Set set20 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMapTestDriver21.get(obj23);
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMapTestDriver21.remove(obj26);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj26);
        hashMapTestDriver9.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        int int42 = hashMapTestDriver36.size();
        java.lang.Object obj44 = hashMapTestDriver36.get((java.lang.Object) (-1L));
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) true);
        experiment.util.Set set52 = hashMapTestDriver48.entrySet();
        java.lang.Object obj53 = hashMapTestDriver45.remove((java.lang.Object) set52);
        java.lang.Object obj56 = hashMapTestDriver45.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set57 = hashMapTestDriver45.entrySet();
        boolean boolean58 = hashMapTestDriver36.containsKey((java.lang.Object) hashMapTestDriver45);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) ' ');
        experiment.util.Collection collection62 = hashMapTestDriver59.values();
        experiment.util.Collection collection63 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection65 = hashMapTestDriver64.values();
        boolean boolean67 = hashMapTestDriver64.containsKey((java.lang.Object) true);
        experiment.util.Set set68 = hashMapTestDriver64.entrySet();
        experiment.util.Set set69 = hashMapTestDriver64.entrySet();
        boolean boolean70 = hashMapTestDriver59.containsKey((java.lang.Object) hashMapTestDriver64);
        experiment.util.Set set71 = hashMapTestDriver59.entrySet();
        java.lang.Class<?> wildcardClass72 = set71.getClass();
        java.lang.Object obj73 = hashMapTestDriver31.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) set71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = hashMapTestDriver9.remove(obj73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test067");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) ' ');
        experiment.util.Collection collection8 = hashMapTestDriver5.values();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) collection8, (java.lang.Object) 10);
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        boolean boolean12 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test068");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        int int13 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        experiment.util.Collection collection19 = hashMapTestDriver15.values();
        boolean boolean20 = hashMapTestDriver15.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean20);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean26 = hashMapTestDriver22.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection27 = hashMapTestDriver22.values();
        boolean boolean28 = hashMapTestDriver22.isEmpty();
        experiment.util.Collection collection29 = hashMapTestDriver22.values();
        boolean boolean30 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        int int42 = hashMapTestDriver36.size();
        java.lang.Object obj44 = hashMapTestDriver36.get((java.lang.Object) (-1L));
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) true);
        experiment.util.Set set52 = hashMapTestDriver48.entrySet();
        java.lang.Object obj53 = hashMapTestDriver45.remove((java.lang.Object) set52);
        java.lang.Object obj56 = hashMapTestDriver45.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set57 = hashMapTestDriver45.entrySet();
        boolean boolean58 = hashMapTestDriver36.containsKey((java.lang.Object) hashMapTestDriver45);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) ' ');
        experiment.util.Collection collection62 = hashMapTestDriver59.values();
        experiment.util.Collection collection63 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection65 = hashMapTestDriver64.values();
        boolean boolean67 = hashMapTestDriver64.containsKey((java.lang.Object) true);
        experiment.util.Set set68 = hashMapTestDriver64.entrySet();
        experiment.util.Set set69 = hashMapTestDriver64.entrySet();
        boolean boolean70 = hashMapTestDriver59.containsKey((java.lang.Object) hashMapTestDriver64);
        experiment.util.Set set71 = hashMapTestDriver59.entrySet();
        java.lang.Class<?> wildcardClass72 = set71.getClass();
        java.lang.Object obj73 = hashMapTestDriver31.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) set71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = hashMapTestDriver0.remove(obj73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test069");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        java.lang.Object obj13 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass12);
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = hashMapTestDriver0.put(obj15, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test070");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) true);
        experiment.util.Set set12 = hashMapTestDriver8.entrySet();
        experiment.util.Set set13 = hashMapTestDriver8.entrySet();
        int int14 = hashMapTestDriver8.size();
        int int15 = hashMapTestDriver8.size();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, obj16);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        boolean boolean21 = hashMapTestDriver18.containsKey((java.lang.Object) true);
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver0.get((java.lang.Object) set22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = obj23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test071");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = hashMapTestDriver9.get(obj11);
        int int13 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) collection17, (java.lang.Object) 10);
        experiment.util.Set set20 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMapTestDriver21.get(obj23);
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMapTestDriver21.remove(obj26);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj26);
        hashMapTestDriver9.clear();
        java.lang.Class<?> wildcardClass31 = hashMapTestDriver9.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test072");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean13 = hashMapTestDriver10.containsKey((java.lang.Object) true);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.Set set15 = hashMapTestDriver10.entrySet();
        int int16 = hashMapTestDriver10.size();
        hashMapTestDriver10.clear();
        boolean boolean18 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) ' ');
        experiment.util.Collection collection22 = hashMapTestDriver19.values();
        experiment.util.Collection collection23 = hashMapTestDriver19.values();
        int int24 = hashMapTestDriver19.size();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.remove((java.lang.Object) ' ');
        experiment.util.Collection collection28 = hashMapTestDriver25.values();
        experiment.util.Collection collection29 = hashMapTestDriver25.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        experiment.util.Set set34 = hashMapTestDriver30.entrySet();
        experiment.util.Set set35 = hashMapTestDriver30.entrySet();
        boolean boolean36 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver30);
        experiment.util.Collection collection37 = hashMapTestDriver25.values();
        java.lang.Object obj38 = hashMapTestDriver10.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver25);
        int int39 = hashMapTestDriver19.size();
        java.lang.Class<?> wildcardClass40 = hashMapTestDriver19.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test073");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) set7);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass11 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test074");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        boolean boolean22 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) ' ');
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        experiment.util.Collection collection27 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        boolean boolean31 = hashMapTestDriver28.containsKey((java.lang.Object) true);
        experiment.util.Set set32 = hashMapTestDriver28.entrySet();
        experiment.util.Set set33 = hashMapTestDriver28.entrySet();
        boolean boolean34 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver28);
        experiment.util.Set set35 = hashMapTestDriver23.keySet();
        int int36 = hashMapTestDriver23.size();
        experiment.util.Set set37 = hashMapTestDriver23.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        boolean boolean44 = hashMapTestDriver41.containsKey((java.lang.Object) true);
        experiment.util.Set set45 = hashMapTestDriver41.entrySet();
        java.lang.Object obj46 = hashMapTestDriver38.remove((java.lang.Object) set45);
        experiment.util.Collection collection47 = hashMapTestDriver38.values();
        java.lang.Object obj48 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) collection47);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        experiment.util.Set set51 = hashMapTestDriver49.entrySet();
        boolean boolean53 = hashMapTestDriver49.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection54 = hashMapTestDriver49.values();
        boolean boolean55 = hashMapTestDriver49.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj58 = hashMapTestDriver56.remove((java.lang.Object) ' ');
        experiment.util.Collection collection59 = hashMapTestDriver56.values();
        experiment.util.Collection collection60 = hashMapTestDriver56.values();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection62 = hashMapTestDriver61.values();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) true);
        experiment.util.Set set65 = hashMapTestDriver61.entrySet();
        experiment.util.Set set66 = hashMapTestDriver61.entrySet();
        boolean boolean67 = hashMapTestDriver56.containsKey((java.lang.Object) hashMapTestDriver61);
        experiment.util.Set set68 = hashMapTestDriver56.keySet();
        experiment.util.Set set69 = hashMapTestDriver56.keySet();
        experiment.util.Collection collection70 = hashMapTestDriver56.values();
        java.lang.Object obj71 = hashMapTestDriver49.get((java.lang.Object) collection70);
        boolean boolean72 = hashMapTestDriver49.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection74 = hashMapTestDriver73.values();
        boolean boolean76 = hashMapTestDriver73.containsKey((java.lang.Object) true);
        experiment.util.Set set77 = hashMapTestDriver73.entrySet();
        experiment.util.Set set78 = hashMapTestDriver73.entrySet();
        int int79 = hashMapTestDriver73.size();
        experiment.util.Set set80 = hashMapTestDriver73.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver81 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection82 = hashMapTestDriver81.values();
        boolean boolean84 = hashMapTestDriver81.containsKey((java.lang.Object) true);
        experiment.util.Set set85 = hashMapTestDriver81.entrySet();
        experiment.util.Set set86 = hashMapTestDriver81.entrySet();
        int int87 = hashMapTestDriver81.size();
        int int88 = hashMapTestDriver81.size();
        java.lang.Object obj89 = new java.lang.Object();
        java.lang.Object obj90 = hashMapTestDriver73.put((java.lang.Object) hashMapTestDriver81, obj89);
        experiment.util.HashMapTestDriver hashMapTestDriver91 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection92 = hashMapTestDriver91.values();
        boolean boolean94 = hashMapTestDriver91.containsKey((java.lang.Object) true);
        experiment.util.Set set95 = hashMapTestDriver91.keySet();
        java.lang.Object obj96 = hashMapTestDriver73.get((java.lang.Object) set95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj97 = hashMapTestDriver23.put((java.lang.Object) hashMapTestDriver49, obj96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test075");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        int int12 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMapTestDriver13.get(obj15);
        boolean boolean17 = hashMapTestDriver13.isEmpty();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = hashMapTestDriver13.remove(obj18);
        java.lang.Object obj21 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver13);
        int int22 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        boolean boolean26 = hashMapTestDriver23.containsKey((java.lang.Object) true);
        experiment.util.Set set27 = hashMapTestDriver23.entrySet();
        experiment.util.Set set28 = hashMapTestDriver23.entrySet();
        int int29 = hashMapTestDriver23.size();
        experiment.util.Set set30 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Object obj34 = hashMapTestDriver31.get(obj33);
        java.lang.Class<?> wildcardClass35 = hashMapTestDriver31.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        int int42 = hashMapTestDriver36.size();
        experiment.util.Set set43 = hashMapTestDriver36.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection45 = hashMapTestDriver44.values();
        boolean boolean47 = hashMapTestDriver44.containsKey((java.lang.Object) true);
        experiment.util.Set set48 = hashMapTestDriver44.entrySet();
        experiment.util.Set set49 = hashMapTestDriver44.entrySet();
        int int50 = hashMapTestDriver44.size();
        int int51 = hashMapTestDriver44.size();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Object obj53 = hashMapTestDriver36.put((java.lang.Object) hashMapTestDriver44, obj52);
        java.lang.Object obj54 = hashMapTestDriver23.put((java.lang.Object) wildcardClass35, (java.lang.Object) hashMapTestDriver36);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.remove((java.lang.Object) ' ');
        experiment.util.Collection collection61 = hashMapTestDriver58.values();
        experiment.util.Collection collection62 = hashMapTestDriver58.values();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection64 = hashMapTestDriver63.values();
        boolean boolean66 = hashMapTestDriver63.containsKey((java.lang.Object) true);
        experiment.util.Set set67 = hashMapTestDriver63.entrySet();
        experiment.util.Set set68 = hashMapTestDriver63.entrySet();
        boolean boolean69 = hashMapTestDriver58.containsKey((java.lang.Object) hashMapTestDriver63);
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection71 = hashMapTestDriver70.values();
        experiment.util.Set set72 = hashMapTestDriver70.entrySet();
        boolean boolean74 = hashMapTestDriver70.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj75 = hashMapTestDriver58.remove((java.lang.Object) boolean74);
        experiment.util.Set set76 = hashMapTestDriver58.keySet();
        java.lang.Object obj77 = hashMapTestDriver55.get((java.lang.Object) hashMapTestDriver58);
        java.lang.Object obj78 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj81 = hashMapTestDriver79.remove((java.lang.Object) ' ');
        experiment.util.Collection collection82 = hashMapTestDriver79.values();
        experiment.util.Set set83 = hashMapTestDriver79.entrySet();
        java.lang.Object obj84 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) set83);
        boolean boolean85 = hashMapTestDriver55.isEmpty();
        hashMapTestDriver55.clear();
        experiment.util.Set set87 = hashMapTestDriver55.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(set87);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test076");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) true);
        java.lang.Object obj12 = hashMapTestDriver7.get((java.lang.Object) 1.0d);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = hashMapTestDriver14.get(obj16);
        int int18 = hashMapTestDriver14.size();
        experiment.util.Set set19 = hashMapTestDriver14.keySet();
        int int20 = hashMapTestDriver14.size();
        experiment.util.Set set21 = hashMapTestDriver14.keySet();
        java.lang.Object obj22 = hashMapTestDriver7.remove((java.lang.Object) set21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = hashMapTestDriver0.get(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test077");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set21 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        experiment.util.Set set27 = hashMapTestDriver22.entrySet();
        int int28 = hashMapTestDriver22.size();
        int int29 = hashMapTestDriver22.size();
        boolean boolean30 = hashMapTestDriver22.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) ' ');
        experiment.util.Collection collection34 = hashMapTestDriver31.values();
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        boolean boolean42 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver36);
        boolean boolean43 = hashMapTestDriver22.containsKey((java.lang.Object) boolean42);
        java.lang.Object obj44 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = obj44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test078");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        int int6 = hashMapTestDriver0.size();
        int int7 = hashMapTestDriver0.size();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        int int10 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test079");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = hashMapTestDriver9.get(obj11);
        int int13 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) collection17, (java.lang.Object) 10);
        experiment.util.Set set20 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMapTestDriver21.get(obj23);
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMapTestDriver21.remove(obj26);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj26);
        hashMapTestDriver9.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Object obj34 = hashMapTestDriver31.get(obj33);
        int int35 = hashMapTestDriver31.size();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.remove((java.lang.Object) ' ');
        experiment.util.Collection collection39 = hashMapTestDriver36.values();
        java.lang.Object obj41 = hashMapTestDriver31.put((java.lang.Object) collection39, (java.lang.Object) 10);
        experiment.util.Set set42 = hashMapTestDriver31.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver43.remove((java.lang.Object) ' ');
        experiment.util.Collection collection46 = hashMapTestDriver43.values();
        experiment.util.Collection collection47 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) true);
        experiment.util.Set set52 = hashMapTestDriver48.entrySet();
        experiment.util.Set set53 = hashMapTestDriver48.entrySet();
        boolean boolean54 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver48);
        int int55 = hashMapTestDriver48.size();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection57 = hashMapTestDriver56.values();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Object obj59 = hashMapTestDriver56.get(obj58);
        boolean boolean60 = hashMapTestDriver56.isEmpty();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        java.lang.Object obj63 = hashMapTestDriver56.remove(obj61);
        java.lang.Object obj64 = hashMapTestDriver48.get((java.lang.Object) hashMapTestDriver56);
        java.lang.Object obj65 = hashMapTestDriver9.put((java.lang.Object) set42, (java.lang.Object) hashMapTestDriver56);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection67 = hashMapTestDriver66.values();
        boolean boolean69 = hashMapTestDriver66.containsKey((java.lang.Object) true);
        experiment.util.Set set70 = hashMapTestDriver66.entrySet();
        experiment.util.Set set71 = hashMapTestDriver66.entrySet();
        int int72 = hashMapTestDriver66.size();
        experiment.util.Set set73 = hashMapTestDriver66.entrySet();
        int int74 = hashMapTestDriver66.size();
        hashMapTestDriver66.clear();
        boolean boolean76 = hashMapTestDriver66.isEmpty();
        java.lang.Object obj77 = hashMapTestDriver9.get((java.lang.Object) boolean76);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test080");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass5);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) true);
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver7);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test081");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass7 = set6.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test082");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test083");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test084");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = hashMapTestDriver0.containsKey(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test085");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set21 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        experiment.util.Set set27 = hashMapTestDriver22.entrySet();
        int int28 = hashMapTestDriver22.size();
        int int29 = hashMapTestDriver22.size();
        boolean boolean30 = hashMapTestDriver22.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) ' ');
        experiment.util.Collection collection34 = hashMapTestDriver31.values();
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        boolean boolean42 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver36);
        boolean boolean43 = hashMapTestDriver22.containsKey((java.lang.Object) boolean42);
        java.lang.Object obj44 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver22);
        int int45 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection47 = hashMapTestDriver46.values();
        experiment.util.Set set48 = hashMapTestDriver46.entrySet();
        boolean boolean50 = hashMapTestDriver46.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection51 = hashMapTestDriver46.values();
        boolean boolean52 = hashMapTestDriver46.isEmpty();
        boolean boolean53 = hashMapTestDriver46.isEmpty();
        experiment.util.Set set54 = hashMapTestDriver46.entrySet();
        boolean boolean55 = hashMapTestDriver9.containsKey((java.lang.Object) set54);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test086");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        experiment.util.Set set8 = hashMapTestDriver3.entrySet();
        int int9 = hashMapTestDriver3.size();
        java.lang.Object obj11 = hashMapTestDriver3.get((java.lang.Object) (-1L));
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test087");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        int int19 = hashMapTestDriver13.size();
        experiment.util.Set set20 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) true);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.Set set26 = hashMapTestDriver21.entrySet();
        int int27 = hashMapTestDriver21.size();
        int int28 = hashMapTestDriver21.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver21, obj29);
        java.lang.Object obj31 = hashMapTestDriver0.put((java.lang.Object) wildcardClass12, (java.lang.Object) hashMapTestDriver13);
        boolean boolean33 = hashMapTestDriver13.containsKey((java.lang.Object) 10);
        hashMapTestDriver13.clear();
        int int35 = hashMapTestDriver13.size();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        int int42 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection45 = hashMapTestDriver44.values();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Object obj47 = hashMapTestDriver44.get(obj46);
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver44.getClass();
        java.lang.Object obj49 = hashMapTestDriver36.remove((java.lang.Object) wildcardClass48);
        java.lang.Object obj50 = hashMapTestDriver13.get((java.lang.Object) wildcardClass48);
        boolean boolean51 = hashMapTestDriver13.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test088");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) set7);
        java.lang.Class<?> wildcardClass9 = set7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test089");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        int int21 = hashMapTestDriver14.size();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = hashMapTestDriver22.get(obj24);
        boolean boolean26 = hashMapTestDriver22.isEmpty();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = hashMapTestDriver22.remove(obj27);
        java.lang.Object obj30 = hashMapTestDriver14.get((java.lang.Object) hashMapTestDriver22);
        int int31 = hashMapTestDriver14.size();
        java.lang.Object obj32 = hashMapTestDriver0.remove((java.lang.Object) int31);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test090");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) ' ');
        experiment.util.Collection collection10 = hashMapTestDriver7.values();
        experiment.util.Collection collection11 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) true);
        experiment.util.Set set16 = hashMapTestDriver12.entrySet();
        experiment.util.Set set17 = hashMapTestDriver12.entrySet();
        boolean boolean18 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.Set set19 = hashMapTestDriver12.keySet();
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) set19);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = hashMapTestDriver0.containsKey(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test091");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) true);
        experiment.util.Set set11 = hashMapTestDriver7.entrySet();
        experiment.util.Set set12 = hashMapTestDriver7.entrySet();
        int int13 = hashMapTestDriver7.size();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        experiment.util.Set set15 = hashMapTestDriver7.entrySet();
        boolean boolean16 = hashMapTestDriver0.containsKey((java.lang.Object) set15);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test092");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        int int19 = hashMapTestDriver13.size();
        experiment.util.Set set20 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) true);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.Set set26 = hashMapTestDriver21.entrySet();
        int int27 = hashMapTestDriver21.size();
        int int28 = hashMapTestDriver21.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver21, obj29);
        java.lang.Object obj31 = hashMapTestDriver0.put((java.lang.Object) wildcardClass12, (java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj34 = hashMapTestDriver32.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) ' ');
        experiment.util.Collection collection38 = hashMapTestDriver35.values();
        experiment.util.Collection collection39 = hashMapTestDriver35.values();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection41 = hashMapTestDriver40.values();
        boolean boolean43 = hashMapTestDriver40.containsKey((java.lang.Object) true);
        experiment.util.Set set44 = hashMapTestDriver40.entrySet();
        experiment.util.Set set45 = hashMapTestDriver40.entrySet();
        boolean boolean46 = hashMapTestDriver35.containsKey((java.lang.Object) hashMapTestDriver40);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection48 = hashMapTestDriver47.values();
        experiment.util.Set set49 = hashMapTestDriver47.entrySet();
        boolean boolean51 = hashMapTestDriver47.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj52 = hashMapTestDriver35.remove((java.lang.Object) boolean51);
        experiment.util.Set set53 = hashMapTestDriver35.keySet();
        java.lang.Object obj54 = hashMapTestDriver32.get((java.lang.Object) hashMapTestDriver35);
        java.lang.Object obj55 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set56 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass57 = set56.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test093");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) ' ');
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        experiment.util.Collection collection12 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        boolean boolean19 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver13);
        experiment.util.Set set20 = hashMapTestDriver8.keySet();
        java.lang.Class<?> wildcardClass21 = hashMapTestDriver8.getClass();
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass21);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        boolean boolean26 = hashMapTestDriver23.containsKey((java.lang.Object) true);
        experiment.util.Set set27 = hashMapTestDriver23.entrySet();
        java.lang.Object obj29 = hashMapTestDriver23.get((java.lang.Object) 1.0f);
        java.lang.Object obj30 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Object obj34 = hashMapTestDriver31.get(obj33);
        int int35 = hashMapTestDriver31.size();
        experiment.util.Set set36 = hashMapTestDriver31.keySet();
        int int37 = hashMapTestDriver31.size();
        int int38 = hashMapTestDriver31.size();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Object obj42 = hashMapTestDriver39.get(obj41);
        int int43 = hashMapTestDriver39.size();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) ' ');
        experiment.util.Collection collection47 = hashMapTestDriver44.values();
        java.lang.Object obj49 = hashMapTestDriver39.put((java.lang.Object) collection47, (java.lang.Object) 10);
        boolean boolean50 = hashMapTestDriver31.containsKey((java.lang.Object) 10);
        boolean boolean51 = hashMapTestDriver31.isEmpty();
        int int52 = hashMapTestDriver31.size();
        java.lang.Object obj53 = hashMapTestDriver0.remove((java.lang.Object) int52);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test094");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set22 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        boolean boolean27 = hashMapTestDriver23.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection28 = hashMapTestDriver23.values();
        boolean boolean29 = hashMapTestDriver23.isEmpty();
        experiment.util.Collection collection30 = hashMapTestDriver23.values();
        experiment.util.Set set31 = hashMapTestDriver23.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean35 = hashMapTestDriver32.containsKey((java.lang.Object) true);
        java.lang.Object obj37 = hashMapTestDriver32.get((java.lang.Object) 1.0d);
        hashMapTestDriver32.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) ' ');
        experiment.util.Collection collection42 = hashMapTestDriver39.values();
        experiment.util.Collection collection43 = hashMapTestDriver39.values();
        boolean boolean44 = hashMapTestDriver39.isEmpty();
        experiment.util.Collection collection45 = hashMapTestDriver39.values();
        java.lang.Object obj46 = hashMapTestDriver32.get((java.lang.Object) collection45);
        java.lang.Object obj47 = hashMapTestDriver23.get((java.lang.Object) collection45);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) ' ');
        experiment.util.Collection collection52 = hashMapTestDriver49.values();
        boolean boolean53 = hashMapTestDriver48.containsKey((java.lang.Object) collection52);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj56 = hashMapTestDriver54.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection58 = hashMapTestDriver57.values();
        boolean boolean60 = hashMapTestDriver57.containsKey((java.lang.Object) true);
        experiment.util.Set set61 = hashMapTestDriver57.entrySet();
        java.lang.Object obj62 = hashMapTestDriver54.remove((java.lang.Object) set61);
        java.lang.Object obj65 = hashMapTestDriver54.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set66 = hashMapTestDriver54.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection68 = hashMapTestDriver67.values();
        boolean boolean70 = hashMapTestDriver67.containsKey((java.lang.Object) true);
        experiment.util.Set set71 = hashMapTestDriver67.entrySet();
        experiment.util.Collection collection72 = hashMapTestDriver67.values();
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection74 = hashMapTestDriver73.values();
        boolean boolean76 = hashMapTestDriver73.containsKey((java.lang.Object) true);
        experiment.util.Set set77 = hashMapTestDriver73.entrySet();
        experiment.util.Set set78 = hashMapTestDriver73.entrySet();
        int int79 = hashMapTestDriver73.size();
        experiment.util.Set set80 = hashMapTestDriver73.entrySet();
        java.lang.Object obj81 = hashMapTestDriver54.put((java.lang.Object) collection72, (java.lang.Object) set80);
        int int82 = hashMapTestDriver54.size();
        experiment.util.Set set83 = hashMapTestDriver54.keySet();
        java.lang.Object obj84 = hashMapTestDriver48.get((java.lang.Object) hashMapTestDriver54);
        experiment.util.HashMapTestDriver hashMapTestDriver85 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection86 = hashMapTestDriver85.values();
        java.lang.Object obj87 = new java.lang.Object();
        java.lang.Object obj88 = hashMapTestDriver85.get(obj87);
        boolean boolean89 = hashMapTestDriver85.isEmpty();
        java.lang.Object obj90 = new java.lang.Object();
        java.lang.Class<?> wildcardClass91 = obj90.getClass();
        java.lang.Object obj92 = hashMapTestDriver85.remove(obj90);
        experiment.util.Collection collection93 = hashMapTestDriver85.values();
        experiment.util.Collection collection94 = hashMapTestDriver85.values();
        java.lang.Object obj95 = hashMapTestDriver54.remove((java.lang.Object) hashMapTestDriver85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver23, obj95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test095");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver5.keySet();
        java.lang.Class<?> wildcardClass13 = set12.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test096");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        int int6 = hashMapTestDriver0.size();
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        int int12 = hashMapTestDriver8.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) ' ');
        experiment.util.Collection collection16 = hashMapTestDriver13.values();
        java.lang.Object obj18 = hashMapTestDriver8.put((java.lang.Object) collection16, (java.lang.Object) 10);
        boolean boolean19 = hashMapTestDriver0.containsKey((java.lang.Object) 10);
        boolean boolean20 = hashMapTestDriver0.isEmpty();
        int int21 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        java.lang.Object obj27 = hashMapTestDriver22.get((java.lang.Object) 1.0d);
        java.lang.Object obj30 = hashMapTestDriver22.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Object obj34 = hashMapTestDriver31.get(obj33);
        int int35 = hashMapTestDriver31.size();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.remove((java.lang.Object) ' ');
        experiment.util.Collection collection39 = hashMapTestDriver36.values();
        java.lang.Object obj41 = hashMapTestDriver31.put((java.lang.Object) collection39, (java.lang.Object) 10);
        experiment.util.Set set42 = hashMapTestDriver31.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection44 = hashMapTestDriver43.values();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = hashMapTestDriver43.get(obj45);
        boolean boolean47 = hashMapTestDriver43.isEmpty();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = hashMapTestDriver43.remove(obj48);
        java.lang.Object obj51 = hashMapTestDriver22.put((java.lang.Object) hashMapTestDriver31, obj48);
        experiment.util.Set set52 = hashMapTestDriver31.keySet();
        java.lang.Object obj53 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver31);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test097");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        int int8 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = hashMapTestDriver11.get(obj13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver15);
        experiment.util.Collection collection20 = hashMapTestDriver11.values();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) true);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.Set set26 = hashMapTestDriver21.entrySet();
        int int27 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        boolean boolean29 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean30 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Object obj35 = hashMapTestDriver32.get(obj34);
        int int36 = hashMapTestDriver32.size();
        boolean boolean37 = hashMapTestDriver32.isEmpty();
        experiment.util.Set set38 = hashMapTestDriver32.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        experiment.util.Set set41 = hashMapTestDriver39.entrySet();
        boolean boolean43 = hashMapTestDriver39.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection44 = hashMapTestDriver39.values();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection46 = hashMapTestDriver45.values();
        boolean boolean48 = hashMapTestDriver45.containsKey((java.lang.Object) true);
        boolean boolean49 = hashMapTestDriver39.containsKey((java.lang.Object) true);
        experiment.util.Set set50 = hashMapTestDriver39.entrySet();
        java.lang.Object obj51 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver32, (java.lang.Object) set50);
        experiment.util.Set set52 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test098");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver5.keySet();
        boolean boolean13 = hashMapTestDriver5.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        int int20 = hashMapTestDriver14.size();
        experiment.util.Set set21 = hashMapTestDriver14.entrySet();
        experiment.util.Set set22 = hashMapTestDriver14.entrySet();
        java.lang.Object obj24 = hashMapTestDriver5.put((java.lang.Object) set22, (java.lang.Object) (byte) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean29 = hashMapTestDriver25.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection30 = hashMapTestDriver25.values();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) ' ');
        experiment.util.Collection collection34 = hashMapTestDriver31.values();
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        boolean boolean42 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver36);
        boolean boolean43 = hashMapTestDriver25.containsKey((java.lang.Object) boolean42);
        experiment.util.Collection collection44 = hashMapTestDriver25.values();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) ' ');
        experiment.util.Collection collection48 = hashMapTestDriver45.values();
        experiment.util.Collection collection49 = hashMapTestDriver45.values();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection51 = hashMapTestDriver50.values();
        boolean boolean53 = hashMapTestDriver50.containsKey((java.lang.Object) true);
        experiment.util.Set set54 = hashMapTestDriver50.entrySet();
        experiment.util.Set set55 = hashMapTestDriver50.entrySet();
        boolean boolean56 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver50);
        experiment.util.Set set57 = hashMapTestDriver45.keySet();
        int int58 = hashMapTestDriver45.size();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj62 = hashMapTestDriver60.remove((java.lang.Object) ' ');
        experiment.util.Collection collection63 = hashMapTestDriver60.values();
        experiment.util.Collection collection64 = hashMapTestDriver60.values();
        boolean boolean65 = hashMapTestDriver60.isEmpty();
        java.lang.Object obj66 = hashMapTestDriver45.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean65);
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection68 = hashMapTestDriver67.values();
        experiment.util.Set set69 = hashMapTestDriver67.entrySet();
        boolean boolean71 = hashMapTestDriver67.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection72 = hashMapTestDriver67.values();
        boolean boolean73 = hashMapTestDriver67.isEmpty();
        experiment.util.Collection collection74 = hashMapTestDriver67.values();
        boolean boolean75 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver67);
        experiment.util.Set set76 = hashMapTestDriver45.entrySet();
        java.lang.Object obj77 = hashMapTestDriver25.get((java.lang.Object) set76);
        java.lang.Object obj78 = hashMapTestDriver5.remove((java.lang.Object) set76);
        experiment.util.Set set79 = hashMapTestDriver5.entrySet();
        java.lang.Class<?> wildcardClass80 = hashMapTestDriver5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test099");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver1.remove((java.lang.Object) ' ');
        experiment.util.Collection collection4 = hashMapTestDriver1.values();
        boolean boolean5 = hashMapTestDriver0.containsKey((java.lang.Object) collection4);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        java.lang.Object obj14 = hashMapTestDriver6.remove((java.lang.Object) set13);
        java.lang.Object obj17 = hashMapTestDriver6.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set18 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean22 = hashMapTestDriver19.containsKey((java.lang.Object) true);
        experiment.util.Set set23 = hashMapTestDriver19.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver19.values();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean28 = hashMapTestDriver25.containsKey((java.lang.Object) true);
        experiment.util.Set set29 = hashMapTestDriver25.entrySet();
        experiment.util.Set set30 = hashMapTestDriver25.entrySet();
        int int31 = hashMapTestDriver25.size();
        experiment.util.Set set32 = hashMapTestDriver25.entrySet();
        java.lang.Object obj33 = hashMapTestDriver6.put((java.lang.Object) collection24, (java.lang.Object) set32);
        int int34 = hashMapTestDriver6.size();
        experiment.util.Set set35 = hashMapTestDriver6.keySet();
        java.lang.Object obj36 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver6);
        experiment.util.Set set37 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass39 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test100");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test101");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) ' ');
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        experiment.util.Collection collection12 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        boolean boolean19 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver13);
        int int20 = hashMapTestDriver13.size();
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) ' ');
        experiment.util.Collection collection25 = hashMapTestDriver22.values();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        boolean boolean28 = hashMapTestDriver22.containsKey((java.lang.Object) wildcardClass27);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean35 = hashMapTestDriver32.containsKey((java.lang.Object) true);
        experiment.util.Set set36 = hashMapTestDriver32.entrySet();
        java.lang.Object obj37 = hashMapTestDriver29.remove((java.lang.Object) set36);
        experiment.util.Collection collection38 = hashMapTestDriver29.values();
        experiment.util.Collection collection39 = hashMapTestDriver29.values();
        int int40 = hashMapTestDriver29.size();
        experiment.util.Collection collection41 = hashMapTestDriver29.values();
        java.lang.Object obj42 = hashMapTestDriver13.put((java.lang.Object) wildcardClass27, (java.lang.Object) hashMapTestDriver29);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver43.remove((java.lang.Object) ' ');
        experiment.util.Collection collection46 = hashMapTestDriver43.values();
        experiment.util.Collection collection47 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) true);
        experiment.util.Set set52 = hashMapTestDriver48.entrySet();
        experiment.util.Set set53 = hashMapTestDriver48.entrySet();
        boolean boolean54 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver48);
        int int55 = hashMapTestDriver48.size();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection57 = hashMapTestDriver56.values();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Object obj59 = hashMapTestDriver56.get(obj58);
        boolean boolean60 = hashMapTestDriver56.isEmpty();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        java.lang.Object obj63 = hashMapTestDriver56.remove(obj61);
        java.lang.Object obj64 = hashMapTestDriver48.get((java.lang.Object) hashMapTestDriver56);
        int int65 = hashMapTestDriver48.size();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj68 = hashMapTestDriver66.remove((java.lang.Object) ' ');
        experiment.util.Collection collection69 = hashMapTestDriver66.values();
        experiment.util.Collection collection70 = hashMapTestDriver66.values();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection72 = hashMapTestDriver71.values();
        boolean boolean74 = hashMapTestDriver71.containsKey((java.lang.Object) true);
        experiment.util.Set set75 = hashMapTestDriver71.entrySet();
        experiment.util.Set set76 = hashMapTestDriver71.entrySet();
        boolean boolean77 = hashMapTestDriver66.containsKey((java.lang.Object) hashMapTestDriver71);
        experiment.util.Set set78 = hashMapTestDriver66.entrySet();
        java.lang.Class<?> wildcardClass79 = set78.getClass();
        java.lang.Object obj80 = hashMapTestDriver48.remove((java.lang.Object) set78);
        boolean boolean81 = hashMapTestDriver48.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection83 = hashMapTestDriver82.values();
        boolean boolean85 = hashMapTestDriver82.containsKey((java.lang.Object) true);
        experiment.util.Set set86 = hashMapTestDriver82.entrySet();
        experiment.util.Set set87 = hashMapTestDriver82.entrySet();
        int int88 = hashMapTestDriver82.size();
        experiment.util.Set set89 = hashMapTestDriver82.entrySet();
        int int90 = hashMapTestDriver82.size();
        hashMapTestDriver82.clear();
        boolean boolean92 = hashMapTestDriver82.isEmpty();
        experiment.util.Collection collection93 = hashMapTestDriver82.values();
        java.lang.Object obj94 = hashMapTestDriver29.put((java.lang.Object) boolean81, (java.lang.Object) hashMapTestDriver82);
        boolean boolean96 = hashMapTestDriver82.containsKey((java.lang.Object) "");
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test102");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        int int12 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMapTestDriver13.get(obj15);
        boolean boolean17 = hashMapTestDriver13.isEmpty();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = hashMapTestDriver13.remove(obj18);
        java.lang.Object obj21 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver13);
        int int22 = hashMapTestDriver5.size();
        experiment.util.Set set23 = hashMapTestDriver5.entrySet();
        boolean boolean24 = hashMapTestDriver5.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test103");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        int int19 = hashMapTestDriver13.size();
        experiment.util.Set set20 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) true);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.Set set26 = hashMapTestDriver21.entrySet();
        int int27 = hashMapTestDriver21.size();
        int int28 = hashMapTestDriver21.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver21, obj29);
        java.lang.Object obj31 = hashMapTestDriver0.put((java.lang.Object) wildcardClass12, (java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean35 = hashMapTestDriver32.containsKey((java.lang.Object) true);
        experiment.util.Set set36 = hashMapTestDriver32.entrySet();
        experiment.util.Set set37 = hashMapTestDriver32.entrySet();
        int int38 = hashMapTestDriver32.size();
        hashMapTestDriver32.clear();
        experiment.util.Set set40 = hashMapTestDriver32.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj43 = hashMapTestDriver41.remove((java.lang.Object) ' ');
        experiment.util.Collection collection44 = hashMapTestDriver41.values();
        experiment.util.Collection collection45 = hashMapTestDriver41.values();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection47 = hashMapTestDriver46.values();
        boolean boolean49 = hashMapTestDriver46.containsKey((java.lang.Object) true);
        experiment.util.Set set50 = hashMapTestDriver46.entrySet();
        experiment.util.Set set51 = hashMapTestDriver46.entrySet();
        boolean boolean52 = hashMapTestDriver41.containsKey((java.lang.Object) hashMapTestDriver46);
        java.lang.Object obj53 = hashMapTestDriver32.get((java.lang.Object) hashMapTestDriver41);
        hashMapTestDriver41.clear();
        int int55 = hashMapTestDriver41.size();
        boolean boolean56 = hashMapTestDriver13.containsKey((java.lang.Object) int55);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test104");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        int int8 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = hashMapTestDriver12.get(obj14);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) ' ');
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        boolean boolean20 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.Collection collection21 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        experiment.util.Set set27 = hashMapTestDriver22.entrySet();
        int int28 = hashMapTestDriver22.size();
        hashMapTestDriver22.clear();
        boolean boolean30 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) ' ');
        experiment.util.Collection collection34 = hashMapTestDriver31.values();
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        boolean boolean42 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver36);
        experiment.util.Set set43 = hashMapTestDriver31.keySet();
        int int44 = hashMapTestDriver31.size();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) ' ');
        experiment.util.Collection collection49 = hashMapTestDriver46.values();
        experiment.util.Collection collection50 = hashMapTestDriver46.values();
        boolean boolean51 = hashMapTestDriver46.isEmpty();
        java.lang.Object obj52 = hashMapTestDriver31.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean51);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj55 = hashMapTestDriver53.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj58 = hashMapTestDriver56.remove((java.lang.Object) ' ');
        experiment.util.Collection collection59 = hashMapTestDriver56.values();
        experiment.util.Collection collection60 = hashMapTestDriver56.values();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection62 = hashMapTestDriver61.values();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) true);
        experiment.util.Set set65 = hashMapTestDriver61.entrySet();
        experiment.util.Set set66 = hashMapTestDriver61.entrySet();
        boolean boolean67 = hashMapTestDriver56.containsKey((java.lang.Object) hashMapTestDriver61);
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection69 = hashMapTestDriver68.values();
        experiment.util.Set set70 = hashMapTestDriver68.entrySet();
        boolean boolean72 = hashMapTestDriver68.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj73 = hashMapTestDriver56.remove((java.lang.Object) boolean72);
        experiment.util.Set set74 = hashMapTestDriver56.keySet();
        java.lang.Object obj75 = hashMapTestDriver53.get((java.lang.Object) hashMapTestDriver56);
        boolean boolean76 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver53);
        java.lang.Object obj77 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver31);
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection79 = hashMapTestDriver78.values();
        experiment.util.Set set80 = hashMapTestDriver78.entrySet();
        boolean boolean82 = hashMapTestDriver78.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection83 = hashMapTestDriver78.values();
        boolean boolean84 = hashMapTestDriver78.isEmpty();
        experiment.util.Collection collection85 = hashMapTestDriver78.values();
        boolean boolean86 = hashMapTestDriver12.containsKey((java.lang.Object) collection85);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test105");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        hashMapTestDriver9.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Object obj26 = hashMapTestDriver23.get(obj25);
        int int27 = hashMapTestDriver23.size();
        experiment.util.Set set28 = hashMapTestDriver23.keySet();
        experiment.util.Set set29 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection35 = hashMapTestDriver30.values();
        java.lang.Object obj36 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = hashMapTestDriver9.remove(obj36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test106");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test107");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean13 = hashMapTestDriver10.containsKey((java.lang.Object) true);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.Set set15 = hashMapTestDriver10.entrySet();
        int int16 = hashMapTestDriver10.size();
        hashMapTestDriver10.clear();
        boolean boolean18 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = hashMapTestDriver10.get(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test108");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) true);
        experiment.util.Set set7 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) set7);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean13 = hashMapTestDriver10.containsKey((java.lang.Object) true);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.Set set15 = hashMapTestDriver10.entrySet();
        int int16 = hashMapTestDriver10.size();
        hashMapTestDriver10.clear();
        experiment.util.Set set18 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) ' ');
        experiment.util.Collection collection22 = hashMapTestDriver19.values();
        experiment.util.Collection collection23 = hashMapTestDriver19.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        experiment.util.Set set28 = hashMapTestDriver24.entrySet();
        experiment.util.Set set29 = hashMapTestDriver24.entrySet();
        boolean boolean30 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver24);
        java.lang.Object obj31 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set32 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        boolean boolean36 = hashMapTestDriver33.containsKey((java.lang.Object) true);
        experiment.util.Set set37 = hashMapTestDriver33.entrySet();
        experiment.util.Set set38 = hashMapTestDriver33.entrySet();
        int int39 = hashMapTestDriver33.size();
        experiment.util.Set set40 = hashMapTestDriver33.entrySet();
        int int41 = hashMapTestDriver33.size();
        hashMapTestDriver33.clear();
        boolean boolean43 = hashMapTestDriver33.isEmpty();
        experiment.util.Collection collection44 = hashMapTestDriver33.values();
        int int45 = hashMapTestDriver33.size();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean52 = hashMapTestDriver49.containsKey((java.lang.Object) true);
        experiment.util.Set set53 = hashMapTestDriver49.entrySet();
        java.lang.Object obj54 = hashMapTestDriver46.remove((java.lang.Object) set53);
        experiment.util.Collection collection55 = hashMapTestDriver46.values();
        experiment.util.Collection collection56 = hashMapTestDriver46.values();
        experiment.util.Set set57 = hashMapTestDriver46.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection59 = hashMapTestDriver58.values();
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Object obj61 = hashMapTestDriver58.get(obj60);
        java.lang.Object obj62 = hashMapTestDriver33.put((java.lang.Object) set57, obj60);
        java.lang.Object obj63 = hashMapTestDriver0.put((java.lang.Object) set32, (java.lang.Object) set57);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test109");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        hashMapTestDriver9.clear();
        boolean boolean24 = hashMapTestDriver9.containsKey((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test110");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) ' ');
        experiment.util.Collection collection8 = hashMapTestDriver5.values();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) collection8, (java.lang.Object) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        boolean boolean14 = hashMapTestDriver11.containsKey((java.lang.Object) true);
        experiment.util.Set set15 = hashMapTestDriver11.entrySet();
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj20 = hashMapTestDriver18.remove((java.lang.Object) ' ');
        experiment.util.Collection collection21 = hashMapTestDriver18.values();
        experiment.util.Collection collection22 = hashMapTestDriver18.values();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        boolean boolean26 = hashMapTestDriver23.containsKey((java.lang.Object) true);
        experiment.util.Set set27 = hashMapTestDriver23.entrySet();
        experiment.util.Set set28 = hashMapTestDriver23.entrySet();
        boolean boolean29 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj35 = hashMapTestDriver18.remove((java.lang.Object) boolean34);
        experiment.util.Set set36 = hashMapTestDriver18.keySet();
        experiment.util.Set set37 = hashMapTestDriver18.keySet();
        int int38 = hashMapTestDriver18.size();
        java.lang.Object obj39 = hashMapTestDriver11.remove((java.lang.Object) int38);
        boolean boolean40 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Object obj44 = hashMapTestDriver41.get(obj43);
        int int45 = hashMapTestDriver41.size();
        experiment.util.Set set46 = hashMapTestDriver41.keySet();
        int int47 = hashMapTestDriver41.size();
        int int48 = hashMapTestDriver41.size();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean52 = hashMapTestDriver49.containsKey((java.lang.Object) true);
        experiment.util.Set set53 = hashMapTestDriver49.entrySet();
        experiment.util.Set set54 = hashMapTestDriver49.entrySet();
        int int55 = hashMapTestDriver49.size();
        experiment.util.Set set56 = hashMapTestDriver49.entrySet();
        int int57 = hashMapTestDriver49.size();
        hashMapTestDriver49.clear();
        boolean boolean59 = hashMapTestDriver49.isEmpty();
        experiment.util.Collection collection60 = hashMapTestDriver49.values();
        int int61 = hashMapTestDriver49.size();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj64 = hashMapTestDriver62.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection66 = hashMapTestDriver65.values();
        boolean boolean68 = hashMapTestDriver65.containsKey((java.lang.Object) true);
        experiment.util.Set set69 = hashMapTestDriver65.entrySet();
        java.lang.Object obj70 = hashMapTestDriver62.remove((java.lang.Object) set69);
        experiment.util.Collection collection71 = hashMapTestDriver62.values();
        experiment.util.Collection collection72 = hashMapTestDriver62.values();
        experiment.util.Set set73 = hashMapTestDriver62.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection75 = hashMapTestDriver74.values();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Object obj77 = hashMapTestDriver74.get(obj76);
        java.lang.Object obj78 = hashMapTestDriver49.put((java.lang.Object) set73, obj76);
        java.lang.Object obj79 = hashMapTestDriver11.put((java.lang.Object) int48, obj76);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test111");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        java.lang.Object obj13 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass12);
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        experiment.util.Collection collection19 = hashMapTestDriver15.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        boolean boolean23 = hashMapTestDriver20.containsKey((java.lang.Object) true);
        experiment.util.Set set24 = hashMapTestDriver20.entrySet();
        experiment.util.Set set25 = hashMapTestDriver20.entrySet();
        boolean boolean26 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver20);
        experiment.util.Set set27 = hashMapTestDriver20.keySet();
        java.lang.Object obj28 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver20);
        hashMapTestDriver20.clear();
        experiment.util.Collection collection30 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) ' ');
        experiment.util.Collection collection34 = hashMapTestDriver31.values();
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        boolean boolean42 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver36);
        experiment.util.Set set43 = hashMapTestDriver31.keySet();
        int int44 = hashMapTestDriver31.size();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) ' ');
        experiment.util.Collection collection49 = hashMapTestDriver46.values();
        experiment.util.Collection collection50 = hashMapTestDriver46.values();
        boolean boolean51 = hashMapTestDriver46.isEmpty();
        java.lang.Object obj52 = hashMapTestDriver31.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean51);
        java.lang.Object obj54 = hashMapTestDriver31.get((java.lang.Object) 1);
        java.lang.Object obj55 = hashMapTestDriver20.remove((java.lang.Object) hashMapTestDriver31);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test112");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        int int8 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean13 = hashMapTestDriver10.containsKey((java.lang.Object) true);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.Set set15 = hashMapTestDriver10.entrySet();
        int int16 = hashMapTestDriver10.size();
        java.lang.Object obj18 = hashMapTestDriver10.get((java.lang.Object) (-1L));
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        java.lang.Object obj27 = hashMapTestDriver19.remove((java.lang.Object) set26);
        java.lang.Object obj30 = hashMapTestDriver19.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set31 = hashMapTestDriver19.entrySet();
        boolean boolean32 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = hashMapTestDriver33.get(obj35);
        int int37 = hashMapTestDriver33.size();
        experiment.util.Set set38 = hashMapTestDriver33.keySet();
        java.lang.Object obj39 = hashMapTestDriver0.put((java.lang.Object) boolean32, (java.lang.Object) hashMapTestDriver33);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test113");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test114");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) ' ');
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        experiment.util.Collection collection12 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        boolean boolean19 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver13);
        int int20 = hashMapTestDriver13.size();
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver13);
        experiment.util.Set set22 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test115");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        int int12 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMapTestDriver13.get(obj15);
        boolean boolean17 = hashMapTestDriver13.isEmpty();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = hashMapTestDriver13.remove(obj18);
        java.lang.Object obj21 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver13);
        int int22 = hashMapTestDriver13.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test116");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set21 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        experiment.util.Set set27 = hashMapTestDriver22.entrySet();
        int int28 = hashMapTestDriver22.size();
        int int29 = hashMapTestDriver22.size();
        boolean boolean30 = hashMapTestDriver22.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) ' ');
        experiment.util.Collection collection34 = hashMapTestDriver31.values();
        experiment.util.Collection collection35 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        boolean boolean42 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver36);
        boolean boolean43 = hashMapTestDriver22.containsKey((java.lang.Object) boolean42);
        java.lang.Object obj44 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver22);
        experiment.util.Set set45 = hashMapTestDriver4.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean52 = hashMapTestDriver49.containsKey((java.lang.Object) true);
        experiment.util.Set set53 = hashMapTestDriver49.entrySet();
        java.lang.Object obj54 = hashMapTestDriver46.remove((java.lang.Object) set53);
        experiment.util.Collection collection55 = hashMapTestDriver46.values();
        experiment.util.Collection collection56 = hashMapTestDriver46.values();
        experiment.util.Set set57 = hashMapTestDriver46.keySet();
        java.lang.Object obj58 = hashMapTestDriver4.remove((java.lang.Object) hashMapTestDriver46);
        int int59 = hashMapTestDriver4.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test117");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) ' ');
        experiment.util.Collection collection9 = hashMapTestDriver6.values();
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        int int11 = hashMapTestDriver6.size();
        experiment.util.Set set12 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMapTestDriver13.get(obj15);
        int int17 = hashMapTestDriver13.size();
        experiment.util.Set set18 = hashMapTestDriver13.keySet();
        experiment.util.Set set19 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        boolean boolean24 = hashMapTestDriver20.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection25 = hashMapTestDriver20.values();
        java.lang.Object obj26 = hashMapTestDriver13.remove((java.lang.Object) hashMapTestDriver20);
        boolean boolean27 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver20);
        boolean boolean28 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test118");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) true);
        boolean boolean10 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        int int12 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test119");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.Set set10 = hashMapTestDriver5.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        int int13 = hashMapTestDriver0.size();
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        boolean boolean21 = hashMapTestDriver18.containsKey((java.lang.Object) true);
        experiment.util.Set set22 = hashMapTestDriver18.entrySet();
        java.lang.Object obj23 = hashMapTestDriver15.remove((java.lang.Object) set22);
        java.lang.Object obj26 = hashMapTestDriver15.put((java.lang.Object) 10L, (java.lang.Object) (byte) 100);
        experiment.util.Set set27 = hashMapTestDriver15.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        boolean boolean31 = hashMapTestDriver28.containsKey((java.lang.Object) true);
        experiment.util.Set set32 = hashMapTestDriver28.entrySet();
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean37 = hashMapTestDriver34.containsKey((java.lang.Object) true);
        experiment.util.Set set38 = hashMapTestDriver34.entrySet();
        experiment.util.Set set39 = hashMapTestDriver34.entrySet();
        int int40 = hashMapTestDriver34.size();
        experiment.util.Set set41 = hashMapTestDriver34.entrySet();
        java.lang.Object obj42 = hashMapTestDriver15.put((java.lang.Object) collection33, (java.lang.Object) set41);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) collection33);
        java.lang.Class<?> wildcardClass44 = collection33.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test120");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) ' ');
        experiment.util.Collection collection10 = hashMapTestDriver7.values();
        experiment.util.Collection collection11 = hashMapTestDriver7.values();
        boolean boolean12 = hashMapTestDriver7.isEmpty();
        experiment.util.Collection collection13 = hashMapTestDriver7.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test121");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = hashMapTestDriver7.get(obj9);
        int int11 = hashMapTestDriver7.size();
        experiment.util.Set set12 = hashMapTestDriver7.keySet();
        int int13 = hashMapTestDriver7.size();
        experiment.util.Set set14 = hashMapTestDriver7.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) set14);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        boolean boolean19 = hashMapTestDriver16.containsKey((java.lang.Object) true);
        experiment.util.Set set20 = hashMapTestDriver16.entrySet();
        experiment.util.Set set21 = hashMapTestDriver16.entrySet();
        int int22 = hashMapTestDriver16.size();
        int int23 = hashMapTestDriver16.size();
        boolean boolean24 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.remove((java.lang.Object) ' ');
        experiment.util.Collection collection28 = hashMapTestDriver25.values();
        experiment.util.Collection collection29 = hashMapTestDriver25.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        experiment.util.Set set34 = hashMapTestDriver30.entrySet();
        experiment.util.Set set35 = hashMapTestDriver30.entrySet();
        boolean boolean36 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver30);
        boolean boolean37 = hashMapTestDriver16.containsKey((java.lang.Object) boolean36);
        java.lang.Object obj38 = hashMapTestDriver0.get((java.lang.Object) boolean36);
        experiment.util.Set set39 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test122");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) true);
        boolean boolean10 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        int int11 = hashMapTestDriver0.size();
        int int12 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test123");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.Set set19 = hashMapTestDriver14.entrySet();
        boolean boolean20 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        boolean boolean22 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) ' ');
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        experiment.util.Collection collection27 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        boolean boolean31 = hashMapTestDriver28.containsKey((java.lang.Object) true);
        experiment.util.Set set32 = hashMapTestDriver28.entrySet();
        experiment.util.Set set33 = hashMapTestDriver28.entrySet();
        boolean boolean34 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver28);
        experiment.util.Set set35 = hashMapTestDriver23.keySet();
        int int36 = hashMapTestDriver23.size();
        experiment.util.Set set37 = hashMapTestDriver23.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        boolean boolean44 = hashMapTestDriver41.containsKey((java.lang.Object) true);
        experiment.util.Set set45 = hashMapTestDriver41.entrySet();
        java.lang.Object obj46 = hashMapTestDriver38.remove((java.lang.Object) set45);
        experiment.util.Collection collection47 = hashMapTestDriver38.values();
        java.lang.Object obj48 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) collection47);
        hashMapTestDriver23.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test124");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj11 = hashMapTestDriver8.get(obj10);
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver8.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) true);
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        int int19 = hashMapTestDriver13.size();
        experiment.util.Set set20 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        boolean boolean24 = hashMapTestDriver21.containsKey((java.lang.Object) true);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.Set set26 = hashMapTestDriver21.entrySet();
        int int27 = hashMapTestDriver21.size();
        int int28 = hashMapTestDriver21.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver21, obj29);
        java.lang.Object obj31 = hashMapTestDriver0.put((java.lang.Object) wildcardClass12, (java.lang.Object) hashMapTestDriver13);
        boolean boolean33 = hashMapTestDriver13.containsKey((java.lang.Object) 10);
        hashMapTestDriver13.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        boolean boolean38 = hashMapTestDriver35.containsKey((java.lang.Object) true);
        experiment.util.Set set39 = hashMapTestDriver35.entrySet();
        java.lang.Object obj41 = hashMapTestDriver35.get((java.lang.Object) 1.0f);
        experiment.util.Set set42 = hashMapTestDriver35.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver43.remove((java.lang.Object) ' ');
        experiment.util.Collection collection46 = hashMapTestDriver43.values();
        experiment.util.Collection collection47 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) true);
        experiment.util.Set set52 = hashMapTestDriver48.entrySet();
        experiment.util.Set set53 = hashMapTestDriver48.entrySet();
        boolean boolean54 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver48);
        int int55 = hashMapTestDriver48.size();
        java.lang.Object obj56 = hashMapTestDriver35.get((java.lang.Object) hashMapTestDriver48);
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj59 = hashMapTestDriver57.remove((java.lang.Object) ' ');
        experiment.util.Collection collection60 = hashMapTestDriver57.values();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        boolean boolean63 = hashMapTestDriver57.containsKey((java.lang.Object) wildcardClass62);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj66 = hashMapTestDriver64.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection68 = hashMapTestDriver67.values();
        boolean boolean70 = hashMapTestDriver67.containsKey((java.lang.Object) true);
        experiment.util.Set set71 = hashMapTestDriver67.entrySet();
        java.lang.Object obj72 = hashMapTestDriver64.remove((java.lang.Object) set71);
        experiment.util.Collection collection73 = hashMapTestDriver64.values();
        experiment.util.Collection collection74 = hashMapTestDriver64.values();
        int int75 = hashMapTestDriver64.size();
        experiment.util.Collection collection76 = hashMapTestDriver64.values();
        java.lang.Object obj77 = hashMapTestDriver48.put((java.lang.Object) wildcardClass62, (java.lang.Object) hashMapTestDriver64);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = hashMapTestDriver13.containsKey(obj77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test125");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean9 = hashMapTestDriver6.containsKey((java.lang.Object) true);
        experiment.util.Set set10 = hashMapTestDriver6.entrySet();
        experiment.util.Set set11 = hashMapTestDriver6.entrySet();
        int int12 = hashMapTestDriver6.size();
        experiment.util.Set set13 = hashMapTestDriver6.entrySet();
        int int14 = hashMapTestDriver6.size();
        hashMapTestDriver6.clear();
        boolean boolean16 = hashMapTestDriver6.isEmpty();
        experiment.util.Set set17 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        boolean boolean21 = hashMapTestDriver18.containsKey((java.lang.Object) true);
        experiment.util.Set set22 = hashMapTestDriver18.entrySet();
        experiment.util.Set set23 = hashMapTestDriver18.entrySet();
        int int24 = hashMapTestDriver18.size();
        experiment.util.Set set25 = hashMapTestDriver18.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection27 = hashMapTestDriver26.values();
        boolean boolean29 = hashMapTestDriver26.containsKey((java.lang.Object) true);
        experiment.util.Set set30 = hashMapTestDriver26.entrySet();
        experiment.util.Set set31 = hashMapTestDriver26.entrySet();
        int int32 = hashMapTestDriver26.size();
        int int33 = hashMapTestDriver26.size();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Object obj35 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver26, obj34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) true);
        experiment.util.Set set40 = hashMapTestDriver36.keySet();
        java.lang.Object obj41 = hashMapTestDriver18.get((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) set17, (java.lang.Object) set40);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection44 = hashMapTestDriver43.values();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = hashMapTestDriver43.get(obj45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = hashMapTestDriver0.get(obj46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test126");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = hashMapTestDriver9.get(obj11);
        int int13 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) collection17, (java.lang.Object) 10);
        experiment.util.Set set20 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMapTestDriver21.get(obj23);
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMapTestDriver21.remove(obj26);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj26);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) ' ');
        experiment.util.Collection collection33 = hashMapTestDriver30.values();
        experiment.util.Collection collection34 = hashMapTestDriver30.values();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        boolean boolean38 = hashMapTestDriver35.containsKey((java.lang.Object) true);
        experiment.util.Set set39 = hashMapTestDriver35.entrySet();
        experiment.util.Set set40 = hashMapTestDriver35.entrySet();
        boolean boolean41 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set42 = hashMapTestDriver35.keySet();
        java.lang.Object obj43 = hashMapTestDriver9.get((java.lang.Object) set42);
        java.lang.Class<?> wildcardClass44 = set42.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10 + "'", obj43, 10);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test127");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = hashMapTestDriver0.remove(obj5);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) ' ');
        experiment.util.Collection collection14 = hashMapTestDriver11.values();
        experiment.util.Collection collection15 = hashMapTestDriver11.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        boolean boolean19 = hashMapTestDriver16.containsKey((java.lang.Object) true);
        experiment.util.Set set20 = hashMapTestDriver16.entrySet();
        experiment.util.Set set21 = hashMapTestDriver16.entrySet();
        boolean boolean22 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set23 = hashMapTestDriver16.keySet();
        boolean boolean24 = hashMapTestDriver16.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver0.get((java.lang.Object) boolean24);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_2070236138_1024_0.test128");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass6 = set5.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

}
